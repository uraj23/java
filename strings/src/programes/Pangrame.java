package programes;

import java.util.HashMap;
import java.util.Map;

public class Pangrame 
{
	public static void main(String[] args) 
	{
		//pangrame means given string alfabits contains a to z alfabits
		String s="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		s=s.replace(" ", "");
		char [] c=s.toCharArray();
		int [] a=new int[26];
		
		int i=0;
		
		while(i!=c.length)
		{
			int index=c[i]-65;
			a[index]=1;
			i++;
			
		}
		int j=0;
		while(j!=a.length)
		{
			if(a[j]==1)
			{
				j++;
			}
			else {
				System.out.println("not a pangrme");
				System.exit(i);
			}
		}
		System.out.println("Pangrme");
		
		
	}

}
