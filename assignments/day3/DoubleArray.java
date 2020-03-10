package com.capgemini.assignments.day3;

public class DoubleArray {
	public static void main(String[] args) {

		double[] d = new double[4];
		d[0] = 1.2;
		d[1] = 2.0;
		d[2] = 3.6;
		d[3] = 4.8;
		printArrayData(d);
		double[] a = getArrayData();
		printArrayData(a);
	}

	static void printArrayData(double[] d) {
		for (int i = 0; i < d.length; i++)
			System.out.println(d[i]);

		System.out.println("*************");
	}

	static double[] getArrayData() {

		double[] values = { 1.0, 2.5, 7.6, 4.6, 6.3 };
		return values;
	}

}
