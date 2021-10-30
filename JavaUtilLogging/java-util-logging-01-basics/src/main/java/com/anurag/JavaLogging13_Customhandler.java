package com.anurag;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.*;

public class JavaLogging13_Customhandler {

    public static Logger logger = Logger.getLogger(JavaLogging13_Customhandler.class.getName());

    public static void main(String[] args) throws IOException {

        logger.setUseParentHandlers(false);//do not forward to parent in logger hierarchy
        //logger.addHandler(new ConsoleHandler());//set a handler to logger as by default no handler is set
        logger.setLevel(Level.INFO);//by default log level is inherited from parent which is INFO in jre lib/logging.properties

        System.out.println("logger name=" + logger.getName());
        System.out.println("logger parent=" + logger.getParent().getName());
        System.out.println("logger default level=" + logger.getLevel());
        System.out.println("logger parent level=" + logger.getParent().getLevel());


        FileOutputStream outputStream = new FileOutputStream("file.txt");
        logger.addHandler(new MyHandler(outputStream,new SimpleFormatter()));

        logger.log(Level.INFO, "this is info");
        logger.log(Level.WARNING, "this is warning");

    }
}

//simpleFormatter is used by default
class MyHandler extends StreamHandler {

    public MyHandler(OutputStream out, Formatter formatter) {
        super(out, formatter);
    }

    @Override
    public void publish(LogRecord logRecord) {

       // add logic
//        if(logRecord.getLevel()==Level.WARNING)
//        return;

        super.publish(logRecord);

    }

    @Override
    public void flush() {
        super.flush();

    }

    @Override
    public void close() throws SecurityException {

        super.close();
    }
}