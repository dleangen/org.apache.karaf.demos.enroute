package org.apache.karaf.demos.enroute.a.provider;

import org.apache.karaf.demos.enroute.a.api.AService;
import org.junit.Assert;
import org.junit.Test;

public class AServiceTest {

    @Test
    public void testA()
    {
        AService a = new AServiceImpl();
        Assert.assertEquals("Nothing to say, eh?", a.sayIt(null));
        Assert.assertEquals("Not null, eh?", a.sayIt("Not null."));
    }
}
