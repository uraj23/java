package arraystutorial;

import java.util.Random;

public class CheckPowOf2 
{
	//to check given number is power of 2 are not

	public static void main(String[] args) 
	{
		Random r=new Random();
		int n=r.nextInt(100);
		System.out.println(n);
		if(n<=0)
		{
			System.out.println("not power of 2 ");
		}
		while(n%2==0)
		{
			n=n/2;
		}
		if(n==1)
		{
			System.out.println("power of 2");
		}
		else
		{
			System.out.println("not a power of 2");
		}
	}

}
