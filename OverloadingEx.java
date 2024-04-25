package com.odigos.demo.oops;

public class OverloadingEx {

	public void add(int a, int b, int c) {
		System.out.println("add of three numbers :" + (a + b + c));
	}

	public void add(int a, int b) {
		System.out.println("add of two numbers :" + (a + b));
	}

	public void add(float a, float b) {
		System.out.println("add of two numbers :" + (a + b));
	}

	public void add(int a, float b) {
		System.out.println("add of two numbers :" + (a + b));
	}

	public void add(float a, int b) {
		System.out.println("add of two numbers :" + (a + b));
	}

	public static void main(String[] args) {
		OverloadingEx obj = new OverloadingEx();
		obj.add(12.32f, 32.11f);
		obj.add(12.12f, 321);
		obj.add(90, 80);
		obj.add('a','b');
	}

}
