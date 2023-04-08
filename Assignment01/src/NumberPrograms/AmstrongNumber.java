package NumberPrograms;

import java.util.Scanner;

public class AmstrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		int num2=num;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		int amg=0;
		while(num1>0)
		{
	      int last=num1%10;
	      int prod=1;
		for(int i=1;i<=count;i++)
		{
		 prod=prod*last;
		 }
		amg+=prod;
		num1=num1/10;
	}
		if(num2==amg)
		{
			System.out.println("It's a Amstrong Number");
		}
		else
		{
			System.out.println("It's not a amstrong Number");
		}

}


}
