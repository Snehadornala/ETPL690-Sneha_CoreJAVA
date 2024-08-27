package com.evergent.corejava.arrays;

public class ArrayDemo8 {
	public static void main(String args[]) {
		int arr[][]=new int[5][5];
		for(int i=0;i<arr.length;i++) {
			System.out.println(" ");
			for(j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i][j]=7;
				}
				System.out.println(arr[i][j]);
			}
		}
	}

}
