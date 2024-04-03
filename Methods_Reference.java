package com.india.hyd.methods;

public class Methods_Reference {
	public static void main(String[] args) {
		int result = Methods_Reference.subOfTwo(12, 23);
		System.out.println("subtraction :" + result);
		Methods_Reference obj = new Methods_Reference();
		obj.addOfTwo();
		System.out.println(obj.displayMsg());
	}

	public static int subOfTwo(int a, int b) {

		return a - b;
	}

	public String displayMsg() {
		return "please leave us given appointment to GF/BF";

	}

	public void addOfTwo() {
		int firstNo = 123;
		int secondNo = 234;
		int result = firstNo + secondNo;
		System.out.println("Add Of Two Numbers " + result);
	}

}
