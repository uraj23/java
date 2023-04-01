package pattren;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		
//		for(int r=1;r<=n;r++)
//		{
//			for(int c=1;c<=r;c++)
//			{
//				System.out.print(n);
//			
//			}
//			n--;
//			
//			System.out.println();
//		}
		
		System.out.println("Enter the rows");
		int num=sc.nextInt();
		
		for(int r=num;r>=1;r--)
		{
			for(int c=num;c>=r;c--)
			{
				System.out.print(r);
			}
			System.out.println();
		}
		
		
		
		
	}

}
