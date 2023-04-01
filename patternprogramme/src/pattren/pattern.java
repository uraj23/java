package pattren;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			System.out.print(" "+"0"+" ");
			else
				System.out.print("1");
		}
		System.out.println();
        for(int i=1;i<=num;i++)
        {
        	System.out.print("*"+" ");
        }
        System.out.println();
        System.out.println("*");
        
        for(int i=1;i<=num;i++)
        {
        	System.out.print("4");
        }
	}

}
