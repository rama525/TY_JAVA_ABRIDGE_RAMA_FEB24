package com.capgemini.quiz.day5;

public class Quiz61  extends Quiz6{
	public void method() {
		//protected void method() {*********in case of using this the inherited 
		//methods visibility can't be reduced
		//by using public in the  parent class the visibility is good and we can't reduce
		//it by using protected
		System.out.println("child class");
	}

}
