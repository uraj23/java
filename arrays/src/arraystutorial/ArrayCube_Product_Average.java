package arraystutorial;

import java.util.Scanner;

public class ArrayCube_Product_Average 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//product of array elements
		int prod=1;
		for(int i=0;i<a.length;i++)
		{
			prod*=a[i];
		}
		System.out.println("product of array elements");
		System.out.println(prod);
		
		//average elements in array
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
		double avg=sum/size;
		System.out.println("Average of array elements");
		
		System.out.println(avg);
		
		System.out.println("cube of array element ");
		
		for(int i=0;i<a.length;i++)
		{
			int cube=1;
			for(int j=0;j<size;j++)
			{
				cube*=a[i];
			}
			System.out.println("array element^3 =>"+cube);
		}
		
	}


}
