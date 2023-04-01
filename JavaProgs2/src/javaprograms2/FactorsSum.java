package javaprograms2;
import java.util.Scanner;
public class FactorsSum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the factor");
		int num=sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				sum+=i;
			}
		}
		System.out.println("count factors "+count);
		System.out.println("sum of factor "+sum);

	}

}
