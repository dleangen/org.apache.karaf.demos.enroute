package org.apache.karaf.enroute.demos.bc.provider;

import org.apache.karaf.demos.enroute.b.api.BService;
import org.junit.Test;

import org.junit.Assert;

public class BServiceTest {

    @Test
    public void testB() {
        BService b = new BServiceImpl();
        Assert.assertEquals("........", b.buzzzz(null));
        Assert.assertEquals("Won't my mama be so proud of me! Buzzzzzzz", b.buzzzz("Won't my mama be so proud of me!"));
    }
}
