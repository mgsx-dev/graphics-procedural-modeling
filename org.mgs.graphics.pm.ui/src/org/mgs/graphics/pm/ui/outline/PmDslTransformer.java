/*
* generated by Xtext
*/
package org.mgs.graphics.pm.ui.outline;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;
import org.mgs.graphics.pm.pmDsl.ModuleDef;
import org.mgs.graphics.pm.pmDsl.Stage;

/**
 * customization of the default outline structure
 * 
 */
public class PmDslTransformer extends AbstractDeclarativeSemanticModelTransformer {
	
	List<EObject> getChildren(ModuleDef semanticNode) {
		// Don't display any children.
		return new BasicEList<EObject>();
	}
	
	List<EObject> getChildren(Stage semanticNode) {
		// Don't display any children.
		return new BasicEList<EObject>();
	}
	
}
