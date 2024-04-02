package com.odigos.fundamentals;

class Variables_Ex {
	short marks = 234;// global variable-->instance and static
static int countryCode=91;// global variable-->static
	public static void main(String args[]) {
		System.out.println(Variables_Ex.countryCode);//static variable accessing
		//classname objname=new classname();
		Variables_Ex obj=new Variables_Ex();//object creation
		
		System.out.println(obj.marks);//instance variable accessing
		System.out.println();
		System.out.println("welcome to java");
		//local variables comments
		int salary = 12345;
		float result = 23.54391279126112f;// size 4 bytes
		double value = 23.54391279126112;//
		long contact = 9494949494l;
		char gender = 'M';
		boolean test = true;

		System.out.println(salary);
		System.out.println(result);
		System.out.println(value);
		System.out.println(contact);
		System.out.println(gender);
		System.out.println(test);
	}

}

//jdk  compaliation-->JRE-->  JVM--0's 1's-->compiler

//user lang-->machine lang
//source code to byte code 
//.java file-->.class

//javac filename.java
