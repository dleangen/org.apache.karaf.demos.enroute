package org.apache.karaf.enroute.demos.bc.provider;

import org.apache.karaf.demos.enroute.a.api.AService;
import org.apache.karaf.demos.enroute.b.api.BService;
import org.apache.karaf.demos.enroute.c.api.CService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(name = "org.apache.karaf.enroute.c")
public class CServiceImpl implements CService {

    @Reference private AService a;
    @Reference private BService b;

    @Override
    public String canadianBuzz(String sentence) {
        return a.sayIt(b.buzzzz(sentence));
    }
}
