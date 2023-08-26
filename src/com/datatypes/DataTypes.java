package com.datatypes;

public class DataTypes {
	private void data() {
		byte age = 30;
		System.out.println("My Age is "+age);
		
		short rollNo = 32767;
		System.out.println("My Roll No is "+rollNo);
		
		int regNo = 2147483647;
		System.out.println("My Reg No is "+regNo);
		
		long ph = 9940476661l;
		System.out.println("My Phone No is "+ph);
		
		float mark = 87.3249876f;
		System.out.println("My Mark is "+mark);
		
		double sal = 45000.324987698765;
		System.out.println("My Salary is "+sal);
		
		char gender = 'm';
		System.out.println("My gender is "+gender);
		
		String name = "Madhan";
		System.out.println("My name is "+name);
		
		boolean maritalStatus = true;
		System.out.println("My Marital Status is "+maritalStatus);
		
	}

public static void main(String[] args) {
	
	DataTypes d = new DataTypes();
	d.data();
}

}
