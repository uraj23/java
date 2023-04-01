package javaprograms2;
import java.util.Scanner;
public class FactorialInRange {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the frist number");
	int m=sc.nextInt();
	System.out.println("Enter the second number");
	int n=sc.nextInt();
	
	
	for(int i=m;i<=n;i++)
	{
		int fact=1;
		for(int j=1;j<=i;j++)
		{
			 
			fact*=j;
		}
		System.out.println(fact+" ");
	}

	}

}
