package NumberPrograms;

import java.util.Scanner;

public class NPowerP 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number");
		int base=sc.nextInt();
		System.out.println("Enter the power number");
		int pow=sc.nextInt();
		int squre=1;
		for(int i=1;i<=pow;i++)
		{
			squre=squre*base;
		}
		System.out.println("base is "+base+" power is "+pow+" = "+squre);
	}

}
