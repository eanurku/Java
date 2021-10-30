package com.anurag;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JavaLogging15_LogManagerSetupLogggingPropertiesInFile {

    public static Logger logger = Logger.getLogger(JavaLogging15_LogManagerSetupLogggingPropertiesInFile.class.getName());

    public static void main(String[] args) throws IOException, URISyntaxException {

        LogManager.getLogManager().readConfiguration(JavaLogging15_LogManagerSetupLogggingPropertiesInFile.class.getClassLoader()
                .getResourceAsStream("logging2.properties"));

        System.out.println("logger name=" + logger.getName());
        System.out.println("logger parent=" + logger.getParent().getName());
        System.out.println("logger default level=" + logger.getLevel());
        System.out.println("logger parent level=" + logger.getParent().getLevel());
        Arrays.stream(logger.getHandlers()).forEach(handler-> System.out.println(handler));

        logger.setLevel(Level.FINE);
        logger.log(Level.INFO, "log the mesg");
        logger.log(Level.CONFIG, "config message");
        logger.log(Level.FINE, "Fine message");

    }
}

