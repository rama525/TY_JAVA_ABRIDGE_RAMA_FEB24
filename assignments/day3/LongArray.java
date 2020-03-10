package com.capgemini.assignments.day3;

public class LongArray {
	public static void main(String[] args) {

		long[] l = new long[4];
		l[0] = 24000l;
		l[1] = 266752l;
		l[2] = 3654537l;
		l[3] = 7865454l;
		printArrayData(l);
		long[] a= getArrayData();
		printArrayData(a);
	}

	static void printArrayData(long[] l) {
		for (int i = 0; i < l.length; i++)
			System.out.println(l[i]);

		System.out.println("*************");
	}

	static long[] getArrayData() {

		long[] values = { 655344l, 257545l, 7776765l, 4343264l};
		return values;
	}

}
