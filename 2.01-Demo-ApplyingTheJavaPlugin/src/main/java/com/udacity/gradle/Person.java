package com.udacity.gradle;

import java.text.MessageFormat;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args){
        System.out.println("Hello from Java");
		if (args.length > 0) {
			System.out.println(MessageFormat.format("Hello {1}", args[0]));
		}
    }
}
