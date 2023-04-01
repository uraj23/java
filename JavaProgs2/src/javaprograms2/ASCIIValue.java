package javaprograms2;

import java.util.Scanner;

public class ASCIIValue 
{
   public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character start");
		char ch=sc.next().charAt(0);
		System.out.println("Enter the character second");
		char ch1=sc.next().charAt(0);
		
		for(int i=ch;i<=ch1;i++)
		{
			
				System.out.print(" "+(int)i);
		
			
		}
		
		
		

	}

}
