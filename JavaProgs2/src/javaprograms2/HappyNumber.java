package javaprograms2;

import java.util.Scanner;

public class HappyNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		while(num!=4 && num!=1)//checking number is not equals to 1 & 4
		{
		   int sum=0;
		   while(num>0)
		   {
			   int last=num%10;
			   sum+=(last*last);
			   num/=10;
		   }
		    num=sum;//re-insilation
		   }
		System.out.println(num);
		if(num==1)
			   System.out.println("Happy Number "+num);
		   else
			   System.out.println("sad Number "+num);
		   
		   
		
	}

}
