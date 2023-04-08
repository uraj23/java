package NumberPrograms;

import java.util.Scanner;

public class FindSqureRoot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int low=1;
		int high=num/2;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(mid*mid==num)
			{
				System.out.println("Perfect Squre");
				System.exit(0);
			}
			else if(mid*mid>num)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		System.out.println("not a perfect number");
		
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
//		
//		for(int i=0;i<=num/2;i++)
//		{
//			if(i*i==num)
//			{
//				System.out.println(i+" given number is perfect squre");
//			}
//		}
		
	}

}
