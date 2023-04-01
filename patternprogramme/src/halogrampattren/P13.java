package halogrampattren;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num-r;c++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*r-1;k++)
			{
				if(k%2==0)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
		
	}

}
