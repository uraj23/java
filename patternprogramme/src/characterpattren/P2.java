package characterpattren;

public class P2 {

	public static void main(String[] args)
	{
		
		for(int r=1;r<=4;r++)
		{
			char ch='z';
			for(int c=1;c<=r;c++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
		System.out.println("=================");
		
		
		char ch='z';
		for(int r=1;r<=4;r++)
		{

			for(int c=1;c<=r;c++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
		System.out.println("=======================");
		
		char ch1='z';
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(ch1+" ");
			}
			ch1--;
			System.out.println();
		}
		
		

	}

}
