package com.capgemini.quiz.day6;

public class Quiz51  implements Quiz5,Quiz52{
	public static void main(String[] args) {
		//System.out.println(x);//reference of x is ambiguous bcz both variables are x
		//so we r using interface name to resolve variable
		System.out.println(Quiz52.x);
		System.out.println(Quiz5.x);
	}
	

}
