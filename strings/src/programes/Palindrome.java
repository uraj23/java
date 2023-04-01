package programes;

public class Palindrome {

	public static void main(String[] args) 
	{

		String s="Malayalam";
		s=s.replace(" ", "");
		s=s.toLowerCase();
		char[] ch=s.toCharArray();
		int size=ch.length;
		
		char [] y=new char[size];
		int i=0;
		while(i!=size)
		{
			
		y[size-1-i]=ch[i];
		
		
		i++;
		}
		for(int j=0;j<y.length;j++)
		{
			System.out.print(y[j]+" ");
		}
		System.out.println();
		System.out.println("==============");
		i=0;
		while(i!=size)
		{
			if(ch[i]!=y[i]) 
			{
				System.out.println("not a palindrome");
				System.exit(0);
			}
			else
			{
				++i;
			}
		}
		System.out.println("Palindrome");
		  
		
	}

}
