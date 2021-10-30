package com.anurag;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class JavaLogging11_AddCustomFormatter {

    public static Logger logger = Logger.getLogger(JavaLogging11_AddCustomFormatter.class.getName());

    public static void main(String[] args) throws IOException {

        logger.setUseParentHandlers(false);//do not forward to parent in logger hierarchy
        //logger.addHandler(new ConsoleHandler());//set a handler to logger as by default no handler is set
        logger.setLevel(Level.INFO);//by default log level is inherited from parent which is INFO in jre lib/logging.properties

        System.out.println("logger name=" + logger.getName());
        System.out.println("logger parent=" + logger.getParent().getName());
        System.out.println("logger default level=" + logger.getLevel());
        System.out.println("logger parent level=" + logger.getParent().getLevel());

        FileHandler filehandler = new FileHandler("log.txt");

        filehandler.setFormatter(new MyFormatter());
        logger.addHandler(filehandler);


        logger.log(Level.INFO, "this is info ");

    }
}

class MyFormatter extends Formatter {

    @Override
    public String format(LogRecord logRecord) {
        return new Date(logRecord.getMillis()) + "::" + logRecord.getThreadID() + "::" + logRecord.getSourceClassName() +
                "::" + logRecord.getSourceMethodName() + "::" + logRecord.getMessage() + "\n";
    }
}
