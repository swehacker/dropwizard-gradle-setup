package com.swehacker.dwtest;

import com.swehacker.dwtest.health.SimpleHealthCheck;
import com.swehacker.dwtest.resources.Message;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ServiceApplication extends Application<ServiceConfiguration> {
    public static void main(String[] args) throws Exception {
        new ServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "Jarvis";
    }

    @Override
    public void initialize(Bootstrap<ServiceConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(ServiceConfiguration configuration,
                    Environment environment) {

        environment.jersey().register(new Message());
        environment.healthChecks().register("simple", new SimpleHealthCheck());
    }
}
