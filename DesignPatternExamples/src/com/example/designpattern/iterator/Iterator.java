package com.example.designpattern.iterator;

public interface Iterator<E> {

	boolean hasNext();
	E next();
	void remove();
	
}
