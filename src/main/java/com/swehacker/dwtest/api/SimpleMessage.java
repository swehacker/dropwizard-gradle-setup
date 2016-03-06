package com.swehacker.dwtest.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleMessage {
    private long id;

    private String content;

    public SimpleMessage() {
        // Jackson deserialization
    }

    public SimpleMessage(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}
