package com.example.designpattern.adapter;

public class ClassCAdapter extends ClassA {
	private ClassC classC; 

	public ClassCAdapter() {
		classC = new ClassC();
		}

	public void request() {
		// ...

		classC.anotherSpecificRequest();

		// ...
		}
	}
