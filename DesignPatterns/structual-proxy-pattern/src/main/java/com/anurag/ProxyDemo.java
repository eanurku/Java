package com.anurag;

import com.anurag.models.CommandExecutorImpl;
import com.anurag.models.CommandExecutorProxy;

/**
 * Hello world!
 *
 */
public class ProxyDemo
{
    public static void main( String[] args ) {

        CommandExecutorImpl executor=new CommandExecutorImpl();


        CommandExecutorProxy executorProxy=new CommandExecutorProxy("anurag","pass",executor);
        try {
            executorProxy.runCommand("dir");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println( "running...." );
    }
}
