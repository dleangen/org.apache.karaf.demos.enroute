package org.apache.karaf.demos.enroute.c.api;

import aQute.bnd.annotation.headers.ProvideCapability;

@ProvideCapability(
        ns = "namespace.custom", 
        value = "service=c;version:Version=1.0.0"
)
public interface CService {
	
	/**
	 * A bee that says "eh".
	 */
	String canadianBuzz( String sentence );
}
