package halogrampattren;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args)
	{

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value");
			int n=sc.nextInt();
			char ch='a';
			for(int r=1;r<=n;r++)
			{
				for(int c=1;c<=n-r;c++)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=2*r-1;k++)
				{
					System.out.print(ch);
					ch++;
				}
				System.out.println();
			}

	}

}
