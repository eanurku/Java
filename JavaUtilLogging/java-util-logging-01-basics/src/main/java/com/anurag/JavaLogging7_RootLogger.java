package com.anurag;

import java.util.logging.Logger;

public class JavaLogging7_RootLogger {

    public static Logger rootLogger   = Logger.getLogger("");//root logger
    public static Logger logger       = Logger.getLogger(JavaLogging7_RootLogger.class.getName());//this class level logger is also instance of root logger
    public static Logger globalLogger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);//global logger is child of root logger

    public static void main(String[] args) {

        System.out.println("root logger name="+rootLogger.getName());
        System.out.println("root looger parent="+rootLogger.getParent());
        System.out.println("logger parent name="+logger.getParent().getName());
        System.out.println("global logger parent name="+globalLogger.getParent().getName());

    }
}
