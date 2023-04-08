package NumberPrograms;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sq=num*num;
		boolean flag=true;
		while(num>0)
		{
			//int last=num%10;
			//int last1=sq%10;
			
			if(num%10 == sq%10)
			{
				num/=10;
				sq/=10;
			}
			else
			{
				flag=false;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("Automarphic");
		}
		else
		{
			System.out.println("this is not a automarphic");
		}
	}

}
