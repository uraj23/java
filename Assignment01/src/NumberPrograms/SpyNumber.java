package NumberPrograms;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
//		int sum=0;
//		int prod=1;
//		while(num>0)
//		{
//			int last=num%10;
//			sum+=last;
//			prod*=last;
//			num=num/10;
//			
//		}
//		if(sum==prod)
//		{
//			System.out.println("given number is sunny number");
//		}
//		else
//		{
//			System.out.println("given number is not sunny number");
//		}

		
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second number");
		int num2=sc.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			int num=i;
		int sum=0;
		int prod=1;
		while(num>0)
		{
			int last=num%10;
			sum=sum+last;
			prod=prod*last;
			num=num/10;
			
		}
		if(sum==prod)
		{
			System.out.println(i+" Spynumber "+sum+" "+prod);
		}
		

	}
	}

}
