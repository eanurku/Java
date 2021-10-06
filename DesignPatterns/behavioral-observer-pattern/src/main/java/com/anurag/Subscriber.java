package com.anurag;

import com.anurag.models.Observer;
import com.anurag.models.Subject;

public class Subscriber implements Observer {

    private Subject topic;

    @Override
    public void update() {
        System.out.println("got update from topic : "+getMessage());
    }

    @Override
    public void setSubject(Subject topic) {

        this.topic = topic;
    }

    @Override
    public String getMessage() {
        return topic.getMessage();
    }
}
