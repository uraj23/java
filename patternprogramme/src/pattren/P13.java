package pattren;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args)
	{

     Scanner sc=new Scanner(System.in);
     System.err.println("Enter the value");
     int n=sc.nextInt();
     
//     for(int r=n;r>=1;r--)
//     {
//    	 for(int c=1;c<=n-r;c++)
//    	 {
//    		System.out.print(" ");
//    	 }
//    	 for(int k=1;k<=2*r-1;k++)
//    	 {
//    		 System.out.print("*");
//    	 }
//    	 System.out.println();
//     }

     
     
     
//     for(int r=1;r<=n;r++)
//     {
//    	 for(int c=1;c<=n;c++)
//    	 {
//
//         if(r==1||c==1||r==n||c==n)
//         {
//        	 System.out.print("*");
//         }
//         else
//         {
//        	 System.out.print(" ");
//         }
//    	 }
//    	 System.out.println();
//     }
     
//     for(int r=1;r<=n;r++)
//     {
//    	 for(int c=1;c<=n;c++)
//    	 {
//
//         if(r==1||c==1||r==n||c==n)
//         {
//        	 System.out.print("*");
//         }
//         else
//         {
//        	 System.out.print(" ");
//         }
//    	 }
//    	 System.out.println();
//     }
//     
//     int count=1;
//     for(int r=1;r<=n;r++)
//     {
//    	 for(int c=1;c<=r;c++)
//    	 {
//
//         System.out.print(count%2);
//         count++;
//    	 }
//    	 System.out.println();
//     }
     
     for(int r=1;r<=n;r++)
     {
    	 for(int c=1;c<=r;c++)
    	 {
    		 System.out.print(c);
    	 }
    	 System.out.println();
     }
     
	}

}
