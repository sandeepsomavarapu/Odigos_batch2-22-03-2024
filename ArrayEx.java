package com.odigos.demo;

public class ArrayEx {

	public static void main(String[] args) {
		int nums[]= {12,21,33,54,67,65,11};
		System.out.println(nums[1]);
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		
		int arr[]=new int[8];
		int j=1;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=j;
			j++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int array[][]= {{12,23,34},{13,12,43},{21,43,11}};
		
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				System.out.print(array[i][k]+" ");
			}
			System.out.println();
		}
		
	}

}
