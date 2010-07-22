package org.mgs.graphics.pm.render;

import org.eclipse.emf.ecore.EObject;

public class UnhandledExpression extends Exception {

	private static final long serialVersionUID = 1L;

	public UnhandledExpression(EObject expression) {
		super("Unhandled expression " + expression.getClass().getSimpleName());
	}
}
