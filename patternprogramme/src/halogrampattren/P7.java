package halogrampattren;

import java.util.Scanner;

public class P7 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num;c++)
			{
				if(r==1 || c==1 ||r+c==num+1 ||r==c)
				{
				System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
