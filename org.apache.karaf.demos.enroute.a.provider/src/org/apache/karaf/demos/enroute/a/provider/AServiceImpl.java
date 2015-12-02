package org.apache.karaf.demos.enroute.a.provider;

import org.apache.karaf.demos.enroute.a.api.AService;
import org.osgi.service.component.annotations.Component;

@Component(name = "org.apache.karaf.demos.enroute.a")
public class AServiceImpl implements AService {

    @Override
    public String sayIt( String sentence ) {
        if(sentence == null || sentence.isEmpty())
            return "Nothing to say, eh?";

        if (sentence.endsWith( "." ))
            sentence = sentence.substring(0, sentence.length() - 1);

        return sentence + ", eh?";
    }
}
