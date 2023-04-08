package NumberPrograms;

import java.util.Scanner;

public class EvenNumberRange 
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the FRist number");
		int num1=sc.nextInt();
		System.out.println("Enter the end number");
		int num2=sc.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
