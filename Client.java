package com.odigos.demo.oops;

class Super_Parent {
	public void m2() {
		System.out.println("am from m2 method");
	}

}

class Calci extends Super_Parent {
	public void m1() {
		System.out.println("am from m1 method");
	}

}

public class Client extends Super_Parent {

	public void add(int a, int b) {
		System.out.println("add of a,b is :" + (a + b));
	}

	public static void main(String[] args) {
		Client obj = new Client();
		obj.add(12, 13);
		//obj.m1();hirarchie
		obj.m2();
	}

}
