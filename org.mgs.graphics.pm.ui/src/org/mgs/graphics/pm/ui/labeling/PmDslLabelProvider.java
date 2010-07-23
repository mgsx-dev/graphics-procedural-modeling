/*
* generated by Xtext
*/
package org.mgs.graphics.pm.ui.labeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.mgs.graphics.pm.pmDsl.BuiltInCall;
import org.mgs.graphics.pm.pmDsl.ColorDef;
import org.mgs.graphics.pm.pmDsl.Expression;
import org.mgs.graphics.pm.pmDsl.INV;
import org.mgs.graphics.pm.pmDsl.ModuleDef;
import org.mgs.graphics.pm.pmDsl.OperationDef;
import org.mgs.graphics.pm.pmDsl.Stage;
import org.mgs.graphics.pm.pmDsl.Variant;
import org.mgs.graphics.pm.pmDsl.VariantExpression;

import com.google.inject.Inject;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class PmDslLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public PmDslLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	String image(Stage e){
		return "defaulttarget_obj.gif";
	}
	
	String image(ModuleDef e){
		if(e instanceof OperationDef){
			return "targetpublic_obj.gif";
		}
		return "targetinternal_obj.gif";
	}
	
	String image(EObject e){
		return "public_co.gif";
	}
	
	private String getClassName(EObject object){
		return object.eClass().getName();
	}
	
	private StyledString getTextForObject(EObject object, String name){
		StyledString str = new StyledString();
		String qualifier = getClassName(object);
		if(qualifier.endsWith("Def")){
			qualifier = qualifier.substring(0, qualifier.length() - 3);
		}
		str.append(qualifier, StyledString.QUALIFIER_STYLER);
		str.append(" " + name);
		return str;
	}
	
	StyledString text(ModuleDef element) {
		return getTextForObject(element, element.getName());
	}
	
	StyledString text(Stage element) {
		return getTextForObject(element, element.getName());
	}
	
}