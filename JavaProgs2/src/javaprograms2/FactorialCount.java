package javaprograms2;

import java.util.Scanner;

public class FactorialCount {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener the number");
		int num=sc.nextInt();
		
		int fact=1;
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
		 count++; 
			fact*=i;
			
		}
		System.out.println("count number "+count);
		System.out.println("range of the number factorial "+fact);

	}

}
