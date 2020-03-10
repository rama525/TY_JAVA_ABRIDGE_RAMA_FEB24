package com.capgemini.assignments.day1;

public class Factorial {
		static int fact(int j) {
			int f=1;
			for(int i=1;i<=j;i++) {
				f=f*i;
			}
			return f;
		}
		public static void main(String[] args) {
			int value=fact(5);
			System.out.println(value);
		}

	}

