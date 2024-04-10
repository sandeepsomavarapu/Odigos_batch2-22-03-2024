package com.odigos.demo;

import java.util.Scanner;

//ctrl+shift+O
public class ScannerEx {
	public static void main(String[] args) {
		//Scanner 
		Scanner scan=new Scanner(System.in);//java.util
		System.out.println("Enter Your Name:");		
		String name=scan.next();
		System.out.println("Enter Your Salary:");		
		float salary=scan.nextFloat();
		System.out.println("Enter Your Id:");		
		int eid=scan.nextInt();
		System.out.println("Enter Your Contact:");		
		long contact=scan.nextLong();
		
		System.out.println(name+" "+salary+" "+contact+" "+eid);
		
		scan.close();
		
		
	}
}
