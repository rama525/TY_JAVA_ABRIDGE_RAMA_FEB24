package com.capgemini.quiz.day5;

public class Quiz41 extends Quiz4 {
	public void eat() {
		System.out.println("man is eating");
	}

	public static void main(String[] args) {
		Quiz41 q = new Quiz41();// sub class obj must be created in case of overriding to get only sub class
								// info
		q.eat();
	}

}
