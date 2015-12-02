package org.apache.karaf.demos.enroute.application;

import org.apache.karaf.demos.enroute.c.api.RequireC;
import org.osgi.service.component.annotations.Component;

import aQute.bnd.annotation.headers.RequireCapability;
import osgi.enroute.configurer.api.RequireConfigurerExtender;

@RequireC
@RequireConfigurerExtender
@RequireCapability(
        ns = "namespace.custom", 
        filter = "(&(service=unrelated)${frange;1.0.0})")
@KarafFeature(
        name = "enroute-demo",
        description = "Demo to show how to deploy an enRoute application with Karaf"
)
@Component(name="org.apache.karaf.demos.enroute")
public class EnrouteApplication {

    void doWhatever() {
    }
}
