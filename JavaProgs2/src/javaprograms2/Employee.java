package javaprograms2;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the gender");
		String gen=sc.next();
		System.out.println("Enter the maritual status");
		String mari=sc.next();
		
		if(gen.equals("f"))
		{
			System.out.println("she works only urban areas");
		}
		else if(gen.equals("m") && (age>=20 && age<=40))
		{
			System.out.println("he works anywhere");
		}
		else if(gen.equals("m") &&(age>=40 && age<=60))
		{
			System.out.println("he works only urban areas");
		}
		else
		{
			System.out.println("ERROR");
		}
		

	}

}
