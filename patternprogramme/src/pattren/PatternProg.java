package pattren;

import java.util.Scanner;

public class PatternProg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		/*for(int r=1;r<=num;r++)
		{
			for(int c=r;c<=num;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		for(int r=1;r<=num;r++)
		{
			for(int c=r;c<=num;c++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
		}
		
		System.out.println("====================");*/
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num;c++)
			{
				if(r+c<=num+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
