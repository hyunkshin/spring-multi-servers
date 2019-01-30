package com.example.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

public class GenericSpringEvent2<T> extends ApplicationEvent implements ResolvableTypeProvider {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private T what;
	protected boolean success;

	public GenericSpringEvent2(T what, boolean success) {
		super(what);
		this.what = what;
		this.success = success;
	}

	public T getWhat() {
		return what;
	}

	@Override
	public ResolvableType getResolvableType() {
		return ResolvableType.forClassWithGenerics(getClass(), ResolvableType.forInstance(getSource()));
	}
}