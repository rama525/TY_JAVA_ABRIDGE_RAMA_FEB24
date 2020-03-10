package com.capgemini.quiz.day2;

public class Quiz7Main extends Quiz7{
	void showme()
	{
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		Quiz7Main obj=new Quiz7Main();
		obj.showme();
	}

}
