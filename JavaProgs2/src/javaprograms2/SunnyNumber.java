package javaprograms2;
import java.util.Scanner;
public class SunnyNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num+1;
		boolean flag=false;
		for(int i=0;i<=num1/2;i++)
		{
			int sq=i*i;
			
			if(sq==num1)
			{
				flag=true;
				break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("The Number is Sunny Number");
		}
		else
		{
			System.out.println("The number is not Sunny number");
		}

	}

}
