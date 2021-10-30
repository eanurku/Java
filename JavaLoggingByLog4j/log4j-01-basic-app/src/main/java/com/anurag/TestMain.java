package com.anurag;


import org.apache.log4j.Logger;

public class TestMain {


    final static Logger logger = Logger.getLogger(TestMain.class);
    public static void main(String[] args) {

        if(logger.isInfoEnabled())
        logger.info("inside main"+logger.isInfoEnabled());
        int a=1;
        int b=2;
        int c;
        c=a+b;


        logger.warn("This is warn : " );
        logger.error("This is error : " );
        logger.fatal("This is fatal : "  );

        if(logger.isDebugEnabled())
        logger.debug("end of  main"+logger.isDebugEnabled());

    }
}
