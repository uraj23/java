package javaprograms2;

import java.util.Scanner;

public class NeonNumber 
{

	public static void main(String[] args)
	{
		//WAJP to find neon number or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the neon number");
		int num=sc.nextInt();
		int sum=0;
		int squre=num*num;
		while(squre>0)
		{
			int temp=squre%10;
			sum+=temp;
			squre=squre/10;
			}
	  if(num==sum)
	  {
		  System.out.println("given number is Neon number");
	  }
	  else
	  {
       System.out.println("This is not aneon number");

	}

}
}
