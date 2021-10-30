package com.anurag;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogging1_ClassLoggerInstance {

    public static Logger logger = Logger.getLogger(JavaLogging1_ClassLoggerInstance.class.getName());

    public static void main(String[] args) {


        logger.setUseParentHandlers(false);//do not forward to parent in logger hierarchy
        logger.addHandler(new ConsoleHandler());//set a handler to logger as by default no handler is set
        logger.setLevel(Level.INFO);//by default log level is inherited from parent which is INFO in jre lib/logging.properties

        System.out.println("logger name="+logger.getName());
        System.out.println("logger parent="+logger.getParent().getName());
        System.out.println("logger default level="+logger.getLevel());
        System.out.println("logger parent level="+logger.getParent().getLevel());
        Arrays.stream(logger.getHandlers()).forEach(handler-> System.out.println(handler));

        logger.log(Level.CONFIG,"this is config");
        logger.log(Level.INFO,"this is info");
        logger.log(Level.WARNING,"this is warning");
        logger.log(Level.SEVERE,"this is severe");

    }
}
