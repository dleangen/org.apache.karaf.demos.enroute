package org.apache.karaf.enroute.demos.bc.provider;

import org.apache.karaf.demos.enroute.b.api.BService;
import org.osgi.service.component.annotations.Component;

@Component(name = "org.apache.karaf.enroute.b")
public class BServiceImpl implements BService {

    @Override
    public String buzzzz(String sentence) {
        if (sentence == null || sentence.isEmpty())
            return "........";

        return sentence + " Buzzzzzzz";
    }
}
