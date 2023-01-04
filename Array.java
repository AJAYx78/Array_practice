package com.array_practise;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args ) {
	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size= sc.nextInt();
		int a[]=new int[size];
		for (int i=0;i<a.length;i++)
		{
		  System.out.println(a[i]);
		}
	
	}
	
}

