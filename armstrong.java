package com.array_practise;

public class armstrong {

	public static int countNumber(int n)
	{   
		int count =0;
		do
		{
			count ++;
			n=n/10;
			
		}
		while(n>0);
		
		return count;
	}
	
	
	public static int pow(int m , int n)
	{
		int p =1;
		while(n>0)
		{
		p=p*m;
				n--;
		}
		return p;
	}
	
	
	public static boolean isArmstrong(int n)
	{
		int sum =0;
		int temp=n;
		int dc=countNumber(n);
		while(n>0)
			{int d=n%10;
			
			int p=pow(d,dc);
			sum=sum*p;
			
			
			n=n/10;
		
			}
		return sum== temp;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n=153
				;
		if(isArmstrong(n))
		{
			System.out.println("is armstrong no.");
		}
		
		}

	}


