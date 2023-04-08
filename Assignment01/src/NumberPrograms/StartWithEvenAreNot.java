package NumberPrograms;

import java.util.Scanner;

public class StartWithEvenAreNot 
{
	public static void main(String[] args) 
	{
		
		
		int num=25679;
		//int res=num%1000;
		int re=num/10000;
		//System.out.println(res);
		System.out.println(re);
		if(re%2==0)
		{
			System.out.println("Start with even");
		}
		else
		{
			System.out.println("not start with even");
		}
		
	}

}
