package com.capgemini.assignments.day3;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		Employee e1 = new Employee(10, "sweety", 90000);
		Employee e2 = new Employee(12, "smiley", 65000);
		Employee e3 = new Employee(14, "muni", 91200);
		Employee e4 = new Employee(16, "kranthi", 34600);

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;

		printEmployeeDetails(emp);
		Employee[] e = getEmp();
		printEmployeeDetails(e);
	}

	static void printEmployeeDetails(Employee[] e) {
		for (int i = 0; i < e.length; i++) {
			System.out.println("Id -" + e[i].id);
			System.out.println("name -" + e[i].name);
			System.out.println("salary -" + e[i].salary);
			System.out.println("*****************************");

		}
	}

	static Employee[] getEmp() {
		Employee[] emp = new Employee[4];

		Employee e1 = new Employee(20, "shanthi", 54500);
		Employee e2 = new Employee(21, "kathya", 65000);
		Employee e3 = new Employee(22, "ramya", 75640);
		Employee e4 = new Employee(23, "kanya", 85450);

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;

		return emp;

	}

}
