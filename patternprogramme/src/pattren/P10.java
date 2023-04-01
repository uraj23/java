package pattren;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		
		for(int r=num;r>=1;r--)
		{
			for(int i=1;i<=num-r;i++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=r;j++)
			{
				System.out.print("* ");
				}
			System.out.println();
		}
		
		
		System.out.println("====================");
		
		for(int r=1;r<=num;r++)
		{
			for(int i=1;i<=num-r;i++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=r;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//		for(int r=1;r<=num;r++)
//		{
//			for(int c=1;c<=num;c++)
//			{
//				if(r+c<=num)
//				{
//					System.out.print("* ");
//				}
//				else{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

	}

}
