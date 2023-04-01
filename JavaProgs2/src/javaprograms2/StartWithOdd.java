package javaprograms2;
import java.util.Scanner;
public class StartWithOdd {

	public static void main(String[] args) 
	{
		//Easy	Write a program to print odd numbers in a range of 20 to 50.	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0;
		while(num>0)
		{
			int last=num%10;
			rev=(rev*10)+last;
			num=num/10;
		}
		while(rev>0)
		{
			int last=rev%10;
			if(rev%2==1)
			{
				System.out.println("start with odd one");
				break;
			}
			else
			{
				System.out.println("ERROR");
			}
			
		}
	}

}
