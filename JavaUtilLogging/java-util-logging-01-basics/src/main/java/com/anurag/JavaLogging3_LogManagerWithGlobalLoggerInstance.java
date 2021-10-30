package com.anurag;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JavaLogging3_LogManagerWithGlobalLoggerInstance {

    public static void main(String[] args) {

        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger(Logger.GLOBAL_LOGGER_NAME);

        System.out.println("logger name="+logger.getName());
        System.out.println("logger parent="+logger.getParent().getName());
        System.out.println("logger default level="+logger.getLevel());
        System.out.println("logger parent level="+logger.getParent().getLevel());

        logger.log(Level.INFO,"this is info message");
        logger.log(Level.CONFIG,"this is config message");



    }
}
