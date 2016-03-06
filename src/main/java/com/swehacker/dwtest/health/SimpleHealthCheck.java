package com.swehacker.dwtest.health;

import com.codahale.metrics.health.HealthCheck;

public class SimpleHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }

}
