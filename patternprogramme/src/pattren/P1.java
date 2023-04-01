package pattren;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the loop number");
		int num=sc.nextInt();
		//12345
        //12345
        //12345
        //12345
        //12345
		
		for(int r=1;r<=num;r++)

		{
			for(int c=1;c<=num;c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println("====================");
		
		
		for(int r=1;r<=num;r++)          //*****
		{                                //*****
			for(int c=1;c<=num;c++)      //*****
			{                            //*****
				System.out.print("*");   //*****
			}
			System.out.println();
		}
		System.out.println("====================");
		
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num;c++)         //10101
			{                               //10101
				if(c%2==0)                  //10101
				System.out.print("0");      //10101
				else                        //10101
					System.out.print("1");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		for(int r=1;r<=num;r++)
		{                                        //11111
			for(int c=1;c<=num;c++)              //22222
			{                                    //33333
				System.out.print(r);             //44444
			}                                    //55555
			System.out.println();
		}
		
	System.out.println("====================");
	int count=1;
		for(int r=1;r<=num;r++)
		{
			                                    //12345
			for(int c=1;c<=num;c++)             //678910
			{                                   //11 12 13 14 15
			                                    //16 17 18 19 20
			  System.out.print(count+" ");      //21 22 23 24 25 
			  count++;
			}
			System.out.println();
		}

	}

}
