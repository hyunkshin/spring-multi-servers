package com.example.serv1;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.lang.NonNull;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.example.demo.GenericIntegerSpringEvent;
import com.example.demo.GenericSpringEvent;
import com.example.demo.GenericSpringEvent2;

@Component
public class GenericSpringEventListener {

	@EventListener
	@Async
	@Order(10)
	public void onApplicationEvent01(@NonNull GenericSpringEvent<Integer> event) {

		System.out.println("10:Received spring generic Integer event - " + event.getWhat());
	}

	@EventListener
	@Async
	@Order(9)
	public void onApplicationEvent01(@NonNull GenericSpringEvent2<String> event) {

		System.out.println("9:Received spring generic2<String> event - " + event.getWhat());
	}

	@EventListener
	@Async
	@Order(11)
	public GenericIntegerSpringEvent onApplicationEvent(@NonNull GenericSpringEvent<String> event) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("11:Received spring generic event - " + event.getWhat());
		return new GenericIntegerSpringEvent(1000, true);
	}
}