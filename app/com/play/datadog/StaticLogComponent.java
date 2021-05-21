package com.play.datadog;

import play.Logger;

import javax.inject.Singleton;

@Singleton
public class StaticLogComponent {

    private static final Logger.ALogger log = Logger.of(StaticLogComponent.class);

    public void writeToLog() {
        log.warn("This is static logger message");
    }

}
