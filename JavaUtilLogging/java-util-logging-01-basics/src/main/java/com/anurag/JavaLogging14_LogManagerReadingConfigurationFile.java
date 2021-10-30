package com.anurag;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JavaLogging14_LogManagerReadingConfigurationFile {

    public static Logger logger = Logger.getLogger(JavaLogging14_LogManagerReadingConfigurationFile.class.getName());

    public static void main(String[] args) throws IOException, URISyntaxException {

        LogManager.getLogManager().readConfiguration(
                JavaLogging14_LogManagerReadingConfigurationFile.class.getClassLoader().getResourceAsStream("logging.properties"));


        System.out.println("logger name=" + logger.getName());
        System.out.println("logger parent=" + logger.getParent().getName());
        System.out.println("logger default level=" + logger.getLevel());
        System.out.println("logger parent level=" + logger.getParent().getLevel());
        Arrays.stream(logger.getHandlers()).forEach(handler-> System.out.println(handler));//TO Do


        logger.setLevel(Level.FINE);

        logger.log(Level.INFO, "this is info!");
        logger.log(Level.CONFIG, "this is config!");
        logger.log(Level.FINE, "this is fine!");

    }
}

