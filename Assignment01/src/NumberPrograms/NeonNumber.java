package NumberPrograms;

import java.util.Scanner;

public class NeonNumber 
{

	public static void main(String[] args)
	{
		//neon number means suppose my number is 9
		//9*9=81=>8+1=>9 
		//compare given number and result number 
		//if it is same then print neon number :
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user input ");
		int num=sc.nextInt();
		
		int squre=num*num;
		int sum=0;
		while(squre>0)
		{
			int last=squre%10;
			sum+=last;
			squre/=10;
			
		}
		if(num==sum)
		{
			System.out.println("neon number "+sum);
		}
		else
		{
			System.out.println("not a neon number "+sum);
		}
	}

}
