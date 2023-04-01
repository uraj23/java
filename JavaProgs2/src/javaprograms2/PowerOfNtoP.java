package javaprograms2;
import java.util.Scanner;
public class PowerOfNtoP {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value ");
		int num=sc.nextInt();
		System.out.println("Enter the power of value");
		int pow=sc.nextInt();
		int temp=1;
		for(int i=1;i<=pow;i++)
		{
			temp*=num;
		}
		System.out.println(temp);

	}

}
