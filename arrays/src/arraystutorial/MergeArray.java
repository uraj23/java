package arraystutorial;

import java.util.Scanner;

public class MergeArray
{
	//merging arrays two arrays to store in one array
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size");
	   int size=sc.nextInt();
	   
	   int [] a = new int[size];
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   System.out.println("Enter the second array size");
	   int size1=sc.nextInt();
	   int [] b = new int [size1];
	   for(int i=0;i<b.length;i++)
	   {
		   b[i]=sc.nextInt();
	   }

	   
	   int [] c = new int [a.length+b.length];
	   int count=0;
	  for(int i=0;i<c.length;i++)
	  {
		 
		  if(i<a.length)
		  {
			  c[i]=a[i];
		  }
		  else
		  {
			  c[i]=b[count++];
			  
		  }
        }
	  for(int i=0;i<c.length;i++)
	  {
		  System.out.print(c[i]+" ");
	  }
      
	}

}
