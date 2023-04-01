package javaprograms2;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the frist number");
		int m=sc.nextInt();
		System.out.println("Enter the second number");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
			{
				System.out.print(" "+i);
			}
			
			
		}

	}

}
