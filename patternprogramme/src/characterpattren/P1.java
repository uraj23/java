package characterpattren;

public class P1 {

	public static void main(String[] args) 
	{
//		for(char ch='A';ch<='D';ch++)
//		{
//			for(char ch1='A';ch1<=ch;ch1++)
//			{
//				System.out.print(ch1);
//			}
//			System.out.println();
//		}
		
		for(int r=1;r<=5;r++)
		{
			char ch='A';
			for(int c=1;c<=r;c++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
		char ch1='A';
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(ch1);
			}
			ch1++;
			System.out.println();
			
		}
	}

}
