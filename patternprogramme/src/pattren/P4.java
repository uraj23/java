package pattren;
import java.util.Scanner;
public class P4 
{
  public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int num1=sc.nextInt();
		
		for(int r=num1;r>=1;r--)
		{
			for(int c=num1;c>=r;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
