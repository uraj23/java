package javaprograms2;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args)
	{
		//Find out the spynumber
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits");
		int spy=sc.nextInt();

		int prod=1;
		int sum=0;
		while(spy>0)
		{
		  int temp=spy%10;
		  sum+=temp;
		  prod*=temp;
		  spy=spy/10;
		}
		System.out.println("Sum of number "+sum);
		
		System.out.println("product of number "+prod);
		if(sum==prod)
		{
			System.out.println("This is Spy Number");
		}
		else
		{
			System.out.println("This is not Spy number");
		}
		
		
		
		

	}

}
