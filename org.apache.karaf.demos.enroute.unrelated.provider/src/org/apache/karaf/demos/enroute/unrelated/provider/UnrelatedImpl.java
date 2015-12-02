package org.apache.karaf.demos.enroute.unrelated.provider;

import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

import aQute.bnd.annotation.headers.ProvideCapability;

@ProvideCapability(
        ns = "namespace.custom", 
        value = "service=unrelated;version:Version=1.0.0"
)
@Component(
        name = "org.apache.karaf.demos.enroute.unrelated",
        immediate = true,
        property = {"duration=5000"}
)
public class UnrelatedImpl {

    @Activate
    void activate( Map<String, Object> properties )
    {
        String durationString = (String)properties.get("duration");
        int duration = Integer.valueOf(durationString);
        Executor executor = Executors.newSingleThreadExecutor();
        executor.execute(()-> {
            while(true) {
                try
                {
                    Thread.sleep(duration);
                    System.err.println("Are we there yet?");
                }
                catch ( Exception e )
                {
                    System.err.println("Oh, dear... something messed up.");
                    e.printStackTrace();
                }
            }
        });
    }
}
