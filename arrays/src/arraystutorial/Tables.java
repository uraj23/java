package arraystutorial;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) 
	{

      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the start table ");
      int num=sc.nextInt();
      System.out.println("Enter the where you end table");
     int num1=sc.nextInt();
      
      for(int i=num;i<=num1;i++)
      {
    	  for(int j=1;j<=10;j++)
    	  {
    		  System.out.println(i+"*"+j+"="+(i*j));
    	  }
    	  System.out.println("============");
      }

	}

}
