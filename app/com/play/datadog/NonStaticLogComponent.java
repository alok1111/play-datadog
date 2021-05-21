package com.play.datadog;

import play.Logger;

import javax.inject.Singleton;

@Singleton
public class NonStaticLogComponent {

    private final Logger.ALogger log = Logger.of(this.getClass());

    public void writeToLog() {
        log.warn("This is non-static logger message");
    }

}
