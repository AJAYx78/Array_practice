package parac1;

import java.util.Scanner;

public class ArrayMArk {

	
		// TODO Auto-generated method stub

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int tot=0, avg;
			Scanner sc= new Scanner(System.in);
			System.out.println("Size of Array");
			int sz= sc.nextInt();
			
			int a[] = new int[sz];
			System.out.println("Enter Marks");
			
			for(int i:a)
			{
				i=sc.nextInt();
				tot= tot+i;
			}
			sc.close();
			
			avg=tot/sz;
			System.out.println("Total----> " + tot + " Average---> " + avg);
	}

}
