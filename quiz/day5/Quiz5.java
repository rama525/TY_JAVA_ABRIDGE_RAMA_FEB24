package com.capgemini.quiz.day5;

public class Quiz5 {
	public void method1() {
		System.out.println("mathod1 is the parent class");
	}

}

class Quiz52 extends Quiz5 {
	public void method1() {
		System.out.println("method1 is now a child class");
	}

	public void newMethod() {
		System.out.println("new method of child class");
	}
}
