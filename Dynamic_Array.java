package parac1;

import java.util.Scanner;

public class Dynamic_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size ,i;
		Scanner r= new Scanner(System.in);
		System.out.println("Enter Size of array");
		size= r.nextInt();
		int a[] = new int [size];
		
		for(i=0;i<size;i++)
		{
			a[i]= r.nextInt();
		}
		
		System.out.println("Printed Array Eelments");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]+ " ");
		}
	}

}
