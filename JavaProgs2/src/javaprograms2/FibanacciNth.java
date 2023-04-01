package javaprograms2;

import java.util.Scanner;

public class FibanacciNth {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1=0;
		int n2=1;
		
		System.out.println("Enter the number");
		int n3=sc.nextInt();
		
		int n4=0;
		
		for(int i=1;i<n3;i++)
		{
		
			 n4=n1+n2;
			 System.out.print(n1+" ");
		
		n1=n2;
		n2=n4;
		}
//		System.out.print(" "+n4);
		

	}

}
