package javaprograms2;
import java.util.Scanner;
public class XylemAndPhlome 
{
public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits");
		int num=sc.nextInt();
		int rest=0;
		int last=num%10;
		num/=10;
		while(num>9)
		{
			int last1=num%10; 
			rest+=last1;
			num=num/10;
		}
		int sum=num+last;
		
		if(sum==rest)
			System.out.println("Xylem frist and last sum="+sum+" rest of digits sum="+rest);
		else
			System.out.println("Phlome "+sum+" "+rest);
		
		

	}

}
