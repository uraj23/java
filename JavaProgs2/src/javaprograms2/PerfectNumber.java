package javaprograms2;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		//int temp=num;
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		
		if(sum==num)
		{
			System.out.println("This is a perfect Number");
		}
		else {
			System.out.println("This is not a perfect Number");
		}
		

	}

}
