package halogramAssign;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value");
      int n=sc.nextInt();
      for(int r=1;r<=n;r++)
      {
    	  for(int c=1;c<=n;c++)
    	  {
    		  if(c==1 || r==n ||c==n)
    		  {
    			  System.out.print("*");
    		  }
    		  else
    		  {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }
      System.out.println("==============================");
      for(int r=1;r<=n;r++)
      {
    	  for(int c=1;c<=n;c++)
    	  {
    		  if( r+c==n+1 ||  (r==c) &&(r+c<=n))
    		  {
    			System.out.print("*");  
    		  }
    		  else
    		  {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }
      System.out.println("=====================");
     
      for(int r=1;r<=n;r++)
      {
    	  for(int c=1;c<=n;c++)
    	  {
    		  if(c==1 || r==n ||c==n)
    		  {
    			  System.out.print("*");
    		  }
    		  else
    		  {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }
      
      System.out.println("==========================");
     
      for(int r=1;r<=n;r++)
      {
    	  for(int c=1;c<=n;c++)
    	  {
    		  if(r==1 || c==1||c==n ||r==n/2+1)
    		  {
    			  System.out.print("*");
    		  }
    		  else
    		  {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }
      
      System.out.println("============================");
      for(int r=1;r<=n;r++)
      {
    	  for(int c=1;c<=n;c++)
    	  {
    		  if(c==1 || r==1 || (r+c==n+1)&&(r==c))
    		  {
    			  System.out.print("*");
    		  }
    		  else
    		  {
    			  System.out.print(" ");
    		  }
    	  }
    	  System.out.println();
      }


	}

}
