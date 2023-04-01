package arraystutorial;

import java.util.Scanner;

public class InsertingIntoElement
{
	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter the size");
//       int size=sc.nextInt();
//       
//       int []a = new int [size];
//       for(int i=0;i<a.length;i++)
//       {
//    	   a[i]=sc.nextInt();
//       }
//       for(int i:a)
//       {
//    	   System.out.print(i+" ");
//       }
//       System.out.println();
       
       
       int [] a = {1,2,3,4,5};
       System.out.println("Enter the index");
       int index=sc.nextInt();
       System.out.println("Enter the value you want");
       int value=sc.nextInt();
       
       int [] b = new int[a.length+1];
       int j=0;
      for(int i=0;i<a.length;i++)
      {
    	  if(i==index)
    	  {
    		  b[j]=value;
    		  j++;
    	  }
    	 
    	 
    		  b[j]=a[i];
    		  j++;
    	  
      }
      
      for(int i : b)
      {
    	  System.out.print(i+" ");
      }
       
      
       
	}


}
