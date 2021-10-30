package com.anurag;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

//To DO what is global logger?
public class JavaLogging6_SetLogLevelByLogManager {
    public static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        LogManager.getLogManager().getLogger("").setLevel(Level.SEVERE);//log level set to SEVERE for rootLogger

        logger.setUseParentHandlers(true);//do not forward to parent in logger hierarchy
        //logger.addHandler(new ConsoleHandler());//set a handler to logger as by default no handler is set
        logger.setLevel(Level.INFO);//by default log level is inherited from parent which is INFO in jre lib/logging.properties

        System.out.println("logger name=" + logger.getName());
        System.out.println("logger parent=" + logger.getParent().getName());
        System.out.println("logger default level=" + logger.getLevel());
        System.out.println("logger parent level=" + logger.getParent().getLevel());
        Arrays.stream(logger.getHandlers()).forEach(handler-> System.out.println(handler));


        logger.log(Level.INFO,"test message will not be logged");
    }
}
