package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

	private static final String MESSAGE = "Hello World!";

	public App() {
		// this constructor is empty
	}

	public static void main(String[] args) {
		System.out.println(MESSAGE);
	}

	public String getMessage() {
		return MESSAGE;
	}
}
