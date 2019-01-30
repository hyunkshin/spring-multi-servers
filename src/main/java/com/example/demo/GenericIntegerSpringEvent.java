package com.example.demo;

public class GenericIntegerSpringEvent extends GenericSpringEvent<Integer>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenericIntegerSpringEvent(Integer what, boolean success) {
		super(what, success);
	}

}
