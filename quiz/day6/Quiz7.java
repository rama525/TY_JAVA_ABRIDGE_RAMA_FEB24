package com.capgemini.quiz.day6;

public class Quiz7 {
	Quiz7() {
		System.out.println("no arguments constructor");
	}

	Quiz7(String s) {
		System.out.println("parameters constructor");
	}
}

class SubClass extends Quiz7 {
	SubClass() {
		super("HAHAHA");
		System.out.println("constructor of Quiz7 with arguments");
	}

	void display() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		SubClass q = new SubClass();
		q.display();
	}
}
