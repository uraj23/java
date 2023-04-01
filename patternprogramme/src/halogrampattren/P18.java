package halogrampattren;

import java.util.Scanner;

public class P18 {

	public static void main(String[] args) 
	{

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value");
			int n=sc.nextInt();
			
			for(int r=1;r<=n;r++)
			{
				for(int c=1;c<=n-r;c++)
				{
					System.out.print(" ");
				}
				int count=1;
				for(int k=1;k<=2*r-1;k++)
				{
					if(k<r) {
						System.out.print(count);
						count++;
					}
					else {
						
						System.out.print(count);
						count--;
					}
				}
				System.out.println();
			}

	}

}
