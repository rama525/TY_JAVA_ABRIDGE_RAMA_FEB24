package com.capgemini.assignments.day1;

public class Palindrome {
		public static void main(String[] args) {
			int val=pal(143);
			System.out.println(val);
		}
		static int pal(int i) {
			int rev=0,rem;
			while(i!=0) {
				rem=i%10;
				rev=rev*10+rem;
				i=i/10;
			}
			return rev;
		}

	}


