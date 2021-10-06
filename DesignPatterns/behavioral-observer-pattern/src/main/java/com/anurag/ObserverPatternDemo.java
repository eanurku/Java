package com.anurag;

import com.anurag.models.Subject;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subject topic = new Topic();

        Subscriber firstSubscriber = new Subscriber();
        firstSubscriber.setSubject(topic);

        Subscriber secondSubscriber = new Subscriber();
        secondSubscriber.setSubject(topic);

        Subscriber thirdSubscriber = new Subscriber();
        thirdSubscriber.setSubject(topic);

        //register subscribers
        topic.register(firstSubscriber);
        topic.register(secondSubscriber);
        topic.register(thirdSubscriber);


        //publish message to topic
        topic.publish("first message");



        //unregister a subscriber
        topic.unregister(thirdSubscriber);

        //publish message to topic
        topic.publish("second message");


    }
}
