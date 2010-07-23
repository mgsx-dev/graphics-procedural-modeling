package org.mgs.graphics.pm.render.views;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.IXtextModelListener;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.mgs.graphics.pm.pmDsl.Model;
import org.mgs.graphics.pm.render.StageRenderer;
import org.mgs.graphics.pm.render.UnhandledExpression;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class SampleView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.mgs.graphics.pm.render.views.SampleView";

	private Canvas renderingZone;
	private Image image;
	private IXtextDocument document;
	
	/**
	 * The constructor.
	 */
	public SampleView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		
		parent.setLayout(new FillLayout());
		renderingZone = new Canvas(parent, SWT.BORDER);

		refreshPicture();
		
		renderingZone.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				if(image != null){
					e.gc.drawImage(image, 
							(e.width - image.getBounds().width) / 2, 
							(e.height - image.getBounds().height) / 2);
				}
			}
		});
		
		renderingZone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				refreshPicture();
			}
		});
	}
	
	IXtextModelListener modelListener;
	
	private IXtextModelListener getModelListener(){
		if(modelListener == null){
			modelListener = new IXtextModelListener() {
				@Override
				public void modelChanged(XtextResource resource) {
					if(resource.getParseResult().getParseErrors().size() == 0 &&
							resource.getErrors().size() == 0 &&
							resource.getWarnings().size() == 0){
						refreshPicture();
					}
				}
			};
		}
		return modelListener;
	}
	
	private void refreshPicture(){
		
		// TODO thread unique like
		
		IEditorPart editor = getSite().getWorkbenchWindow().getActivePage().getActiveEditor();
		if(editor instanceof XtextEditor){
			XtextEditor xte = (XtextEditor)editor;
			document = xte.getDocument();
			
			document.addModelListener(getModelListener());
			
			new Thread(new Runnable() {
				@Override
				public void run() {
					document.readOnly(new IUnitOfWork<Boolean, XtextResource>(){
						@Override
						public Boolean exec(XtextResource resource) throws Exception {
							Model model = (Model)resource.getContents().get(0);
							renderingZone.getDisplay().asyncExec(new Runnable() {
								@Override
								public void run() {
									MessageConsole console = ConsoleUtil.getConsole(ID);
									console.clearConsole();
									console.activate();
									MessageConsoleStream stream = console.newMessageStream();
									stream.setColor(new Color(null, new RGB(0, 0, 255)));
									stream.println("Rendering");
								}
							});
							try{
								final Image img = new StageRenderer().render(model);
								renderingZone.getDisplay().asyncExec(new Runnable() {
									@Override
									public void run() {
										image = img;
										renderingZone.redraw();
									}
								});
								renderingZone.getDisplay().asyncExec(new Runnable() {
									@Override
									public void run() {
										MessageConsole console = ConsoleUtil.getConsole(ID);
										console.activate();
										MessageConsoleStream stream = console.newMessageStream();
										stream.setColor(new Color(null, new RGB(0, 0, 255)));
										stream.println("Done");
									}
								});
							}catch(UnhandledExpression e){
								final String message = e.getMessage() + "\n" +
									e.getStackTrace()[0].toString();
								renderingZone.getDisplay().asyncExec(new Runnable() {
									@Override
									public void run() {
										MessageConsole console = ConsoleUtil.getConsole(ID);
										console.activate();
										MessageConsoleStream stream = console.newMessageStream();
										stream.setColor(new Color(null, new RGB(255, 0, 0)));
										stream.println(message);
									}
								});
							}
							
							return Boolean.TRUE;
						}});
				}
			}).start();
		}
		
	}

	@Override
	public void setFocus() {
	}
	
	@Override
	public void dispose() {
		super.dispose();
		document.removeModelListener(getModelListener());
	}
	

}