package javaprograms2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		//WAJP to find out sum of prime numbers in range of 40 to 50
		
		int num=40;
		int num1=50;
		int sum=0;
		
	       for(int i=num;i<=num1;i++)
	       {
	    	   boolean flag=true;
	    	   for(int j=2;j<i;j++)
	    	   {
	    		   if(i%j==0)
	    		   {
                      flag=false;
	    			 break;
	    		   }
	    		   
	    	   }
	    	   if(flag)
    		   {
    			 sum=sum+i;  
    		   }
	       }
	       System.out.println(sum);
					
		
	}

}
