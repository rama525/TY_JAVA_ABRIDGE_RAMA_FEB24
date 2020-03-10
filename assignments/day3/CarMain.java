package com.capgemini.assignments.day3;

public class CarMain {
	public static void main(String[] args) {
		Car[] c = new Car[4];
		Car c1 = new Car("BMW", "blue", 9000000);
		Car c2 = new Car("AUDI", "white", 100000000);
		Car c3 = new Car("ferrori", "red", 850000000);
		Car c4 = new Car("toyata", "black", 30000000);

		c[0] = c1;
		c[1] = c2;
		c[2] = c3;
		c[3] = c4;

		printCarDetails(c);
		Car[] car = getCarDetails();
		printCarDetails(car);
	}

	static void printCarDetails(Car[] car) {
		for (int i = 0; i < car.length; i++) {
			System.out.println("brand -" + car[i].brand);
			System.out.println("colour -" + car[i].colour);
			System.out.println("cost -" + car[i].cost);
			System.out.println("*****************************");

		}
	}

	static Car[] getCarDetails() {
		Car[] c = new Car[4];

		Car c1 = new Car("benz", "white", 54005000);
		Car c2 = new Car("nano", "black", 90867560);
		Car c3 = new Car("jaguar", "red", 986754540);
		Car c4 = new Car("suzuki", "white", 645456600);

		c[0] = c1;
		c[1] = c2;
		c[2] = c3;
		c[3] = c4;

		return c;

	}

}
