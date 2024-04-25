package com.odigos.demo.oops;

interface SuperParent {
//by default interface methods are public abstract
	public abstract void displayDate();

	void displayMsg();// public abstract void displayMsg()
}

abstract class Calci_App {

	public void add_Of_Two(int a, int b) {// concrete method
		System.out.println("add of two numbers :" + (a + b));
	}

	public abstract void sub_Of_Two(int a, int b); // abstract method
}

public class AbstractionTest extends Calci_App {

	public static void main(String[] args) {
		AbstractionTest obj = new AbstractionTest();
		obj.sub_Of_Two(12, 9);
		obj.add_Of_Two(1, 2);
	}

	@Override
	public void sub_Of_Two(int a, int b) {
		System.out.println("sub of two numbers :" + (a - b));
	}

}
