package javaprograms2;
import java.util.Scanner;
public class SqureRootOfNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	    int num=sc.nextInt();
	    boolean flag=false;
	    for(int i=1;i<=num/2;i++)
	    {
	    	if(i*i==num)
	    	{
	    		System.out.println("squre root is "+num+" "+i);
	    		flag=true;
	    		break;
	    	}
	    }
	    if(flag==true)
	    {
	    	System.out.println();
	    }
	}

}
