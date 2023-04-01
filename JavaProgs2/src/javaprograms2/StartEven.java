package javaprograms2;

import java.util.Scanner;

public class StartEven {

	public static void main(String[] args) 
	{
		//WAJP to find out number start with even or not
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
		if(last%2==0)
		{
			System.out.println("This is starts with even number");
			break;
		}
		else
		{
			System.out.println("not start with even number");
			break;
		}
	}
	

	}

}
