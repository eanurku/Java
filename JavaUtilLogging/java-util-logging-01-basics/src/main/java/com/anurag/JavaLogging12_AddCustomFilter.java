package com.anurag;

import java.io.IOException;
import java.util.logging.*;

public class JavaLogging12_AddCustomFilter {

    public static Logger logger = Logger.getLogger(JavaLogging12_AddCustomFilter.class.getName());

    public static void main(String[] args) throws IOException {

        logger.setUseParentHandlers(false);//do not forward to parent in logger hierarchy
        //logger.addHandler(new ConsoleHandler());//set a handler to logger as by default no handler is set
        logger.setLevel(Level.INFO);//by default log level is inherited from parent which is INFO in jre lib/logging.properties

        System.out.println("logger name=" + logger.getName());
        System.out.println("logger parent=" + logger.getParent().getName());
        System.out.println("logger default level=" + logger.getLevel());
        System.out.println("logger parent level=" + logger.getParent().getLevel());

        FileHandler filehandler = new FileHandler("log.txt");
        filehandler.setFormatter(new SimpleFormatter());

        filehandler.setFilter(new MyFilter());
        logger.addHandler(filehandler);

        logger.setLevel(Level.FINE);

        logger.log(Level.INFO, "log the mesg");
        logger.log(Level.CONFIG, "config message");
        logger.log(Level.FINE, "Fine message");

    }
}

class MyFilter implements Filter {

    @Override
    public boolean isLoggable(LogRecord logRecord) {

        if (logRecord.getLevel() == Level.CONFIG)
            return false;
        return true;
    }
}
