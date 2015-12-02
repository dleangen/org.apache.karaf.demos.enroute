package org.apache.karaf.demos.enroute.c.api;

import aQute.bnd.annotation.headers.RequireCapability;

@RequireCapability(
        ns = "namespace.custom", 
        filter = "(&(service=c)${frange;1.0.0})")
public @interface RequireC {
}
