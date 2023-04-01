package arraystutorial;

import java.util.Map;
import java.util.TreeMap;

public class VowelWordsCharacterFrequency 
{
	public static void main(String[] args) 
	{
		String s="Java Is a programing language";
		VowelWordsCharacterFrequency vc=new VowelWordsCharacterFrequency ();
		vc.countVWF(s);
		vc.frqency(s);
		
		
		
	}

	private void frqency(String s) 
	{

		TreeMap<Character,Integer> t1=new TreeMap();
		for(int i=0;i<s.length();i++)
		{
			if(t1.containsKey(s.charAt(i))==false)
			{
			t1.put(s.charAt(i),1);
			}
			else
			{
				int index=t1.get(s.charAt(i));
				int newval=index+1;
				t1.put(s.charAt(i), newval);
			}
		}
		for(Map.Entry<Character, Integer> a:t1.entrySet())
		{
			System.out.println(a.getKey()+" "+a.getValue());
		}
		
	}

	private void countVWF(String s) 
	{
		int vowelCount=0,wordCout=0,upperCaseCount=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			switch(c)
			{
			case ' ':
			case '.':
				wordCout++;
			
			}
			switch(c) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowelCount++;
			}
			if(c>=65 && c<=90)
			{
				upperCaseCount++;
			}
		}
		System.out.println("Vowel count is "+vowelCount);
		System.out.println("Word count is "+wordCout);
		System.out.println("uppercase count is "+upperCaseCount);
		
		
		
	}

}
