package halogrampattren;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		char a='A';
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num;c++)
			{
				if(r==c)
				{
					System.out.print(a);
					a++;
				}
				else
				{
					System.out.print(r+c);
				}
					
			}
			System.out.println();
		}


	}

}
