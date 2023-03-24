package java12;
import java.util.Scanner;
public class Anagrame 
{
	public static boolean ChekAnagram(String s , String s1)
	{
		if(s.length()!=s1.length())
		{
			return false;
		}
		else
		{
			s=Anagrame.toUpperCase(s);
			s1=Anagrame.toUpperCase(s1);
			
			char [] c1=s.toCharArray();
			char [] c2=s1.toCharArray();
			Anagrame.sort(c1);
			Anagrame.sort(c2);
			
			return Anagrame.compare(c1,c2);
		}
		
	}

	private static boolean compare(char[] c1, char[] c2) 
	{
		boolean flag=true;
		
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static char[] sort(char[] c1) 
	{
		for(int i=0;i<c1.length;i++)
		{
			for(int j=i+1;j<c1.length;j++)
			{
			   if(c1[i]>c1[j])
			   {
				   c1[i]=(char) (c1[j]-c1[i]+(c1[j]=c1[i]));
			   }
			}
		}
		return c1;
		
	}

	public static String toUpperCase(String s1) 
	{
		String s="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				int x=(int)s.charAt(i);
				x=x-32;
				char c =(char)x;
				s=s+c;
			}
			else
			{
				s=s+s.charAt(i);
			}
		}
		return s;
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the frist word");
		String s=sc.next();
		System.out.println("Enter the second word");
		String s1=sc.next();
		
		System.out.println(ChekAnagram(s,s1));
		

	}

}
