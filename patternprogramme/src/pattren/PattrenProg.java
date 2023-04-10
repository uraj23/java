package pattren;

public class PattrenProg {

	public static void main(String[] args) 
	{
		//Pattern programs
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * * 
		int n=5;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===========");
		
//		1 2 3 4 5
//		1 2 3 4 5
//		1 2 3 4 5
//		1 2 3 4 5
		
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println("===========");
//		1 1 1 1 1
//		2 2 2 2 2
//		3 3 3 3 3
//		4 4 4 4 4
//		5 5 5 5 5
		
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		System.out.println("===========");

//		1 0 1 0 1
//		1 0 1 0 1
//		1 0 1 0 1
//		1 0 1 0 1
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				if(col%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
		}
		System.out.println("===========");

//		1  2  3  4  5
//		6  7  8  9  10
//		11 12 13 14 15
//		16 17 18 19 20
//		21 22 23 24 25
		int num=1;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		System.out.println("===========");
		
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("===========");
		
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
		System.out.println("===========");
		
//		1
//		2 2
//		3 3 3
//		4 4 4 4
//		5 5 5 5 5
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		System.out.println("===========");
		
//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14 15
		int num1=1;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(num1++ +" ");
			}
			System.out.println();
		}
		System.out.println("===========");
		
//		1
//		1 0
//		1 0 1
//		1 0 1 0
//		1 0 1 0 1
       
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				if(col%2==0)
			    {
					System.out.print("0 ");	
				}
				else
				{
					System.out.print("1 ");
				}
				
					}
			System.out.println();
		}
		System.out.println("===========");
		
//		5
//		2 2
//		5 5 5
//		4 4 4 4
//		5 5 5 5 5
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				if(row%2==0)
			    {
					System.out.print(row+" ");	
				}
				else
				{
					System.out.print("5 ");
				}
				
					}
			System.out.println();
		}
		System.out.println("===========");
		
//		A
//		B B
//		C C C
//		D D D D
//		E E E E E
		char ch='A';
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
		System.out.println("===========");
       
//		A
//		A B
//		A B C
//		A B C D
//		A B C D E
		
		
		for(int row=1;row<=n;row++)
		{
			char ch1='A';
			for(int col=1;col<=row;col++)
			{
				System.out.print(ch1+" ");
				ch1++;
			}
			System.out.println();
			
		}
		System.out.println("===========");
		
//		A
//		B C
//		D E F
//		G H I J
//		K L M N O
		char ch1='A';
		for(int row=1;row<=n;row++)
		{
			
			for(int col=1;col<=row;col++)
			{
				System.out.print(ch1+" ");
				ch1++;
			}
			System.out.println();
			
		}
		System.out.println("===========");


//		Z
//		Z Y
//		Z Y X
//		Z Y X W
//		Z Y X W V
		
		for(int row=1;row<=n;row++)
		{
			char ch2='Z';
			for(int col=1;col<=row;col++)
			{
				System.out.print(ch2+" ");
				ch2--;
			}
			System.out.println();
			
		}
		System.out.println("===========");
		
//		Z
//		Y Y
//		X X X
//		W W W W
//		V V V V V
		char ch2='Z';
		for(int row=1;row<=n;row++)
		{
			
			for(int col=1;col<=row;col++)
			{
				System.out.print(ch2+" ");
				
			}
			System.out.println();
			ch2--;
			
		}
		System.out.println("===========");
		
//		5
//		4 4
//		3 3 3
//		2 2 2 2
//		1 1 1 1 1
		int n1=5;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(n1 +" ");
			}
			n1--;
			System.out.println();
			
		}
		System.out.println("===========");
		
//		5
//		5 4
//		5 4 3
//		5 4 3 2
//		5 4 3 2 1
		
		for(int row=1;row<=n;row++)
		{
			int n2=5;
			for(int col=1;col<=row;col++)
			{
				System.out.print(n2 +" ");
				n2--;
			}
			
			System.out.println();
			
		}
		System.out.println("============");
		
//		* * * * *
//		* * * *
//		* * *
//		* *
//		*
		
		for (int row = 1; row <= n; row++) 
		{
			for (int col = 1; col <= n; col++) 
			{
				if(row+col<=n+1)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
			
		}
	}


