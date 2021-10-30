package com.anurag;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLogging9_AddFilehandler {

    public  static Logger logger = Logger.getLogger(JavaLogging9_AddFilehandler.class.getName());

    public static void main(String[] args) throws IOException {

        logger.setUseParentHandlers(false);//do not forward to parent in logger hierarchy
        //logger.addHandler(new ConsoleHandler());//set a handler to logger as by default no handler is set
        logger.setLevel(Level.INFO);//by default log level is inherited from parent which is INFO in jre lib/logging.properties

        System.out.println("logger name="+logger.getName());
        System.out.println("logger parent="+logger.getParent().getName());
        System.out.println("logger default level="+logger.getLevel());
        System.out.println("logger parent level="+logger.getParent().getLevel());

        FileHandler filehandler = new FileHandler("log.txt");
        logger.addHandler(filehandler);
        
        logger.log(Level.INFO,"log the mesg");
    }
}
