package org.slf4j.impl;

import org.slf4j.LoggerFactory;

public class StaticLoggerBinder {
    private static final StaticLoggerBinder INSTANCE = new StaticLoggerBinder();

    public synchronized static StaticLoggerBinder getSingleton() {
        return INSTANCE;
    }

    public org.slf4j.ILoggerFactory getLoggerFactory() {
        return LoggerFactory.getILoggerFactory();
    }

}
