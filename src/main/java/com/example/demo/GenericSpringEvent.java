package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class GenericSpringEvent<T> extends ApplicationEvent {
	private T what;
	protected boolean success;

	public GenericSpringEvent(T what, boolean success) {
		super(what);
		this.what = what;
		this.success = success;
	}

	public T getWhat() {
		return what;
	}
}