package com.capgemini.quiz.day7;

public class Quiz8 {
	public static void main(String[] args) {
		byte[] b = new byte[0];
		b[0] = 10;
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;

		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);

		System.out.println("*************");
		System.out.println("size of b " + b.length);

	}
}

//ArrayIndexOutOfBoundsException
