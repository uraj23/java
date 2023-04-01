package javaprograms2;
import java.util.Scanner;
public class StrongNumber 
{
	public static void main(String[] args) 
	{
		//WAJP to find out strong number are not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		int sum=0;
		while(num>0)
		{
			int prod=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++)
			{
			 prod*=i;	
			}
			sum+=prod;
			num/=10;
         }
		if(sum==num1)
		{
			System.out.println("The number is Strong number");
		}
		else
		{
			System.out.println("Not a Strong number");
		}
		
		
	}

}
