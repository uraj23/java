package halogrampattren;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args)
	{

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value");
    int n=sc.nextInt();
//    int star=1;
//    int space=n/2;
//    for(int r=1;r<=n;r++)
//    {
//    	for(int c=1;c<=space;c++)
//    	{
//    		System.out.print("  ");
//    	}
//    	for(int k=1;k<=star;k++)
//    	{
//    		System.out.print("* ");
//    	}
//    	System.out.println();
//    	
//    	if(r<n/2+1)
//    	{
//    		star=star+2;
//    		space--;
//    	}
//    	else
//    	{
//    		star=star-2;
//    		space++;
//    	}
//    }
    
    
    int star=1;
    int space=n/2;
    for(int r=1;r<=n;r++)
    {
    	for(int c=1;c<=space;c++)
    	{
    		System.out.print(" ");
    	}
    	for(int k=1;k<=star;k++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    
    	if(r<n/2+1)
    	{
    		 
    	star=star+2;
    	space--;
    	}
    	else
    	{
    		star=star-2;
    		space++;
    	}
    	
    }
    
    
    System.out.println("==========================");
    
    for(int r=n;r>=1;r--)
    {
    	for(int c=1;c<=r;c++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    for(int r=n;r>=1;r--)
    {
    	for(int c=1;c<=n-r+1;c++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    System.out.println("==========================");
    
    for(int r=1;r<=n;r++)
    {
    	for(int c=1;c<=r;c++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    for(int r=1;r<=n-1;r++)
    {
    	for(int c=1;c<=n-r;c++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    
    
    System.out.println("========================");
    
   

    for (int r = 1; r <= n; r++) {
      for (int c = 1; c <= n - r; c++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= r; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int r = 1; r <= n - 1; r++) {
      for (int j = 1; j <= r; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= n - r; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    
    
	}
}
