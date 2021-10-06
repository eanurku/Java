package com.anurag.models;

public interface Observer {

    void update();
    public String getMessage();
    void setSubject(Subject subject);
}
