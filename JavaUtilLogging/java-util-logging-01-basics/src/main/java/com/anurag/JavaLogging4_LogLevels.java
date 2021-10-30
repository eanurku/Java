package com.anurag;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogging4_LogLevels {
    public  static Logger logger = Logger.getLogger(JavaLogging4_LogLevels.class.getName());

    public static void main(String[] args) {


        logger.setUseParentHandlers(false);//do not forward to parent in logger hierarchy
        logger.addHandler(new ConsoleHandler());//set a handler to logger as by default no handler is set
        logger.setLevel(Level.INFO);//by default log level is inherited from parent which is INFO in jre lib/logging.properties

        System.out.println("logger name="+logger.getName());
        System.out.println("logger parent="+logger.getParent().getName());
        System.out.println("logger default level="+logger.getLevel());
        System.out.println("logger parent level="+logger.getParent().getLevel());

        logger.setLevel(Level.SEVERE);
        logger.log(Level.WARNING,"this is warning 1");
        logger.log(Level.INFO,"this is info 1");
        logger.log(Level.CONFIG,"this is config 1");


        logger.setLevel(Level.INFO);
        logger.log(Level.WARNING,"this is warning 2");
        logger.log(Level.INFO,"this is info 2");
        logger.log(Level.CONFIG,"this is config 2");

    }
}
