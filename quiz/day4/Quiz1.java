package com.capgemini.quiz.day4;

public class Quiz1{
	public static void main(String[] args) {
		int num1=0;
		int num2=10;
		do {
			num2--;
			++num1;
		}
		while(num1<5);
		System.out.println(num1 +","+num2);
	}
	

}
