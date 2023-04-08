package NumberPrograms;

import java.util.Scanner;

public class FibanacciNthTerm 
{
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Nth Term");
	int num=sc.nextInt();
	int a=0;
	int b=1;
	for(int i=1;i<=num;i++)
	{
		int c=a+b;
	  System.out.print(a+" ");
	  a=b;
	  b=c;
	}
}
	
	

}
