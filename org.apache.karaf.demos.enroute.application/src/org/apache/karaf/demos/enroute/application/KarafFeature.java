package org.apache.karaf.demos.enroute.application;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import aQute.bnd.annotation.headers.ProvideCapability;

@ProvideCapability(
        ns = "karaf.identity",
        value = "type=karaf.feature;version:Version=1.0.0"
)
@Retention(RetentionPolicy.RUNTIME)
public @interface KarafFeature
{
    String name();
    String description();
}
