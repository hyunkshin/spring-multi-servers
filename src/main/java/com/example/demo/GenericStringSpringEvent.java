package com.example.demo;

public class GenericStringSpringEvent extends GenericSpringEvent<String>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenericStringSpringEvent(String what, boolean success) {
		super(what, success);
	}

}
