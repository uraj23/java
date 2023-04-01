package halogrampattren;

import java.util.Scanner;

public class P17 {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		int count=1;
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num-r;c++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*r-1;k++)
			{
				System.out.print(count%2);
				count++;
			}
			System.out.println();
		}
	}

}
