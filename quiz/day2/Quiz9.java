package com.capgemini.quiz.day2;

public class Quiz9 {
	public void m1(int i,float f) {
		System.out.println("int float method");
	}
	public void m1(float f,int i){
		System.out.println("float int method");
	}
	public static void main(String[] args) {
		Quiz9  q=new Quiz9();
		q.m1(28, 1.3f);
		q.m1(6.3f, 34);
	}

}