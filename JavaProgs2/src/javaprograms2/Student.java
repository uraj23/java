package javaprograms2;

import java.util.Scanner;

public class Student {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the classes");
		int cls=sc.nextInt();
		System.out.println("Enter the attended classes");
		int atte=sc.nextInt();
		
		double div=atte/cls;
		System.out.println(div);
		double percentage=div*100;
		System.out.println(percentage);
		
	}

}
