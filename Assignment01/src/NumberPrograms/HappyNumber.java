package NumberPrograms;

import java.util.Scanner;

public class HappyNumber 
{
	public static void main(String[] args) 
	{
		//happy number=1 and sad number = 4;
		//print given number is happy are not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user input ");
		int num=sc.nextInt();
		
		while(num!=4 && num!=1)
		{
			int sum=0;
			
			while(num>0)
			{
              int last=num%10;
              int sq=last*last;
              sum+=sq;
              num=num/10;
			}
			num=sum;
		}
		if(num==1)
		{
			System.out.println("happy number "+num);
		}
		else
		{
			System.out.println("not happy number "+num);
		}
		
	}

}
