package programes;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String s1="silent";
		String s2="listen";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean result=Arrays.equals(c1, c2);
		System.out.println(result);
	

	}

}
