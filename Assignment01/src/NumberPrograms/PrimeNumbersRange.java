package NumberPrograms;

import java.util.Scanner;

public class PrimeNumbersRange {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number");
		int num1=sc.nextInt();
		System.out.println("Enter the end number");
		int num2=sc.nextInt();
		
		for(int i=num1;i<=num2;i++)
		{
			int num=i;
			int count=0;
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
				count++;
				}
			}
			if(count==2)
			{
				System.out.print(num+" ");
			}
		}
	}

}
