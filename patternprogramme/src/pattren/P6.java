package pattren;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		 
	/*	int i=1;
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num;c++)
			{
				if(r+c>num)
				{
					System.out.print(i);
					
				}
				else
				{
					System.out.print(" ");
				}
			
				
			}
			i++;
			System.out.println();
			
		}*/
		
		
		for(int r=1;r<=num;r++)
		{
			for(int c=num-r;c>0;c--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=r;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
