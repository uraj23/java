package pattren;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args)
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the rows");
//		int row=sc.nextInt();
//		System.out.println("Enter the colums");
//		int col=sc.nextInt();
		
//		for(int i=0;i<=row;i++)
//		{
//			for(int j=0;j<=col;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for(int r=1;r<=row;r++)
//		{
//			for(int c=1;c<=col;c++)
//			{
//				if(r==1 || r==row ||c==1 ||c==col)
//					System.out.print("* ");
//				else
//					System.out.print("  ");
//				
//			}
//			System.out.println();
//		}
		
//		char ch='a';
//		for(int r=1;r<=4;r++)
//		{
//			for(int c=1;c<=4;c++)
//			{
//				if(r==1||r==4||c==1||c==4) {
//					System.out.print(ch+" ");
//				ch++;
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		int i=1;
//		for(int r=1;r<=4;r++)
//		{
//			for(int c=1;c<=4;c++)
//			{
//				if(r==1 || r==4 ||c==1||c==4)
//				{
//					System.out.print(i+" ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			i++;
//			System.out.println();
//		}
		int n=5;
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if(r==1||r==n||r+c==n+1||c==1||c==n||r==c)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

	}

}
