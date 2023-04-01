package Pyramid;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value");
		int num=sc.nextInt();
		
		for(int r=1;r<=num;r++)
		{
			for(int s=1;s<=num-r;s++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*r-1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
//		System.out.println("=====================");
		for(int r=num;r>=1;r--)
		{
			for(int s=1;s<=num-r;s++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*r-1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
