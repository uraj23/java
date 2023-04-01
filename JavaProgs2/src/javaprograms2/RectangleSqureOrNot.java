package javaprograms2;

import java.util.Scanner;

public class RectangleSqureOrNot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		System.out.println("Enter the breath");
		int breath=sc.nextInt();
		
		if(length==breath)
		{
			System.out.println("it is rectangle squre");
		}
		else
		{
			System.out.println("it is not a squre of rectangle");
		}

	}

}
