package com.anurag.models;

import java.io.IOException;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String passwd, CommandExecutor executor) {
        if (user.equals("anurag")) {
            this.isAdmin = true;
        }
        this.executor = executor;
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            executor.runCommand(cmd);
        }else{
            throw new Exception("non admin not allowed");
        }
        System.out.println("command completed ....");
    }
}
