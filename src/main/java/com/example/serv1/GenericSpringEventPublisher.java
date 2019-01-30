package com.example.serv1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.example.demo.GenericSpringEvent2;
import com.example.demo.GenericStringSpringEvent;

@Component
public class GenericSpringEventPublisher {

	@Autowired
    private ApplicationEventPublisher applicationEventPublisher;
 
    public void doStuffAndPublishAnEvent(final String message) {
        System.out.println("Publishing Generic event. ");
//        GenericSpringEvent<String> customSpringEvent = new GenericSpringEvent<String>(message, true);
        GenericStringSpringEvent customSpringEvent = new GenericStringSpringEvent(message, true);
        applicationEventPublisher.publishEvent(customSpringEvent);
        GenericSpringEvent2<String> ev = new GenericSpringEvent2<String>(message, true);
        applicationEventPublisher.publishEvent(ev);
        System.out.println("Publishing Generic event completed. ");
    }
}