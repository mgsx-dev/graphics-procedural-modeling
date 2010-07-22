
package org.mgs.graphics.pm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PmDslStandaloneSetup extends PmDslStandaloneSetupGenerated{

	public static void doSetup() {
		new PmDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

