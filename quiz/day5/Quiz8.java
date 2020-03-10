package com.capgemini.quiz.day5;

public class Quiz8 {
	public static int[] sum(int ...x) {
		System.out.println(x);
		return x;
	}
 public static void main(String[] args) {
	sum(10);
	sum(10,20);
	sum(10,20,30);
}
}
