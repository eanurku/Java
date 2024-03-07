package com.anurag;

import com.anurag.models.Observer;
import com.anurag.models.Subject;

public class Subscriber extends Observer {

    public Subscriber(Subject subject) {
        super(subject);
    }

    public void update() {
        System.out.println("got update from topic : " + subject.getMessage());
    }

}
