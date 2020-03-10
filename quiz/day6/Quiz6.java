package com.capgemini.quiz.day6;

public class Quiz6 {
	int num = 100;
}

class Quiz61 extends Quiz6 {
	int num = 110;

	void printNumber() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Quiz61 q = new Quiz61();
		q.printNumber();
	}
}
