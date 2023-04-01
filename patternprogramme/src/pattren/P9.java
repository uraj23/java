package pattren;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		for(int r=num;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(r);
			}
			System.out.println();
		}
	}

}
