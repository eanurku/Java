package com.anurag.jmock.gettingstarted;

import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.ArrayList;
import java.util.List;

interface Subscriber {

    void receive(String mesg);
}

class Publisher {

    List<Subscriber> subscriberList = new ArrayList<>();

    public void addSubscriber(Subscriber sub) {
        this.subscriberList.add(sub);
    }

    public void publish(String mesg) {
        for (Subscriber sub : this.subscriberList) {
            sub.receive(mesg);
        }
    }
}

public class PublisherTest extends TestCase {

    public void testAsubscriber() {
        Publisher publisher = new Publisher();
        String mesg = "a sample message";

        Mockery mockery = new Mockery();
        Subscriber mockSubscriber = mockery.mock(Subscriber.class);

        mockery.checking(new Expectations() {{
            oneOf(mockSubscriber).receive(mesg);
        }});

        publisher.addSubscriber(mockSubscriber);
        publisher.publish(mesg);

        mockery.assertIsSatisfied();

    }

    public void testIfSubscriberReceiveMethodCalledorNot() {
        Publisher publisher = new Publisher();
        String mesg = "sample message 2";

        Mockery mockery = new Mockery();
        Subscriber mockSubscriber = mockery.mock(Subscriber.class);

        mockery.checking(new Expectations() {{
            oneOf(mockSubscriber).receive(mesg);
        }});

        publisher.addSubscriber(mockSubscriber);
        //publisher.publish(mesg);

        mockery.assertIsSatisfied();//Fails the test if there are any expectations that have not been met.

    }
}

class MockTestRunner {

    public static void main(String[] args) {

        Result res = JUnitCore.runClasses(PublisherTest.class);

        System.out.println(res.getFailures());
        System.out.println(res.getRunCount());
        System.out.println(res.wasSuccessful());

    }
}