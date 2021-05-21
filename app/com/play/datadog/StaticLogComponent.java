package com.play.datadog;

import play.Logger;

import javax.inject.Singleton;

@Singleton
public class StaticLogComponent {

    private final Logger.ALogger log = Logger.of(this.getClass());
    // private static final Logger.ALogger log = Logger.of(StaticLogComponent.class);
    // OR
    private static final SomeObject SOME_OBJECT = new SomeObject();

    public void writeToLog() {
        log.warn("This is static logger message");
    }

    private static class SomeObject {
    }
}
