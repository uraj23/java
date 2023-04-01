package javaprograms2;
import java.util.Scanner;
public class PerfectSqure {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int prod=1;
		boolean flag=false;
		for(int i=1;i<=num/2;i++)
		{
		  	int squre=i*i;
		  	if(squre==num)
		  	{
		  	flag=true;
		  	break;
		  	}
		}
		if(flag==true)
		System.out.println("Perfect squre");
		else
			System.out.println("not a perfect squre");
	}

}
