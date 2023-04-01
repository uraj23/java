package javaprograms2;
import java.util.Scanner;
public class TechNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits");
		int num=sc.nextInt();
		int num1=num;
		int num2=num;
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		if(count%2==0)
		{
			int pow=count/2;
			int d=1;
			for(int i=1;i<=pow;i++)
			{
				d*=10;
			}
			int last=num1%d;
			int frist=num1/d;
			
			int sum=frist+last;
			int sq=sum*sum;
			if(num2==sq)
			{
				System.out.println("Given number is Tech number");
			}
			else
			{
				System.out.println("Given number is not Tech number");
			}
		
		}
		else
		{
			System.out.println(" not a Tech Number");
		}
	}

}
