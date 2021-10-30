package com.anurag;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JavaLogging2_LogManager {
    public static Logger localLogger = Logger.getLogger(JavaLogging2_LogManager.class.getName());

    public static void main(String[] args) {

        localLogger.setUseParentHandlers(false);//do not forward to parent in logger hierarchy
        localLogger.addHandler(new ConsoleHandler());//set a handler to logger as by default no handler is set
        localLogger.setLevel(Level.INFO);//by default log level is inherited from parent which is INFO in jre lib/logging.properties

        System.out.println("----------before--------");
        System.out.println("logger name="+localLogger.getName());
        System.out.println("logger parent="+localLogger.getParent().getName());
        System.out.println("logger default level="+localLogger.getLevel());
        System.out.println("logger parent level="+localLogger.getParent().getLevel());

        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger(localLogger.getName());

        System.out.println("----------after--------");
        System.out.println("logger name="+localLogger.getName());
        System.out.println("logger parent="+localLogger.getParent().getName());
        System.out.println("logger default level="+localLogger.getLevel());
        System.out.println("logger parent level="+localLogger.getParent().getLevel());

        System.out.println("------------------------------------------------");
        logger.log(Level.INFO,"this is info message");




    }
}
