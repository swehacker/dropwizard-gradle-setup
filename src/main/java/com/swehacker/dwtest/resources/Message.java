package com.swehacker.dwtest.resources;


import com.codahale.metrics.annotation.Timed;
import com.swehacker.dwtest.api.SimpleMessage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/message")
@Produces(MediaType.APPLICATION_JSON)
public class Message {
    private final AtomicLong counter;

    public Message() {
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public SimpleMessage message(@QueryParam("name") String name) {
        return new SimpleMessage(counter.incrementAndGet(), name);
    }
}
