package programes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Non_repeted {

	public static void main(String[] args) 
	{
		String s="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		s=s.replace(" ", "");
		
		char [] ch=s.toCharArray();
		int size=ch.length;
	    Map<Character,Integer> ma=new TreeMap();
		
		int i=0;
		while(i!=size)
		{
			if(ma.containsKey(ch[i])==false)
			{
				ma.put(ch[i], 1);
			}
			else
			{
				int index=ma.get(ch[i]);
				int newval=index+1;
				ma.put(ch[i], newval);
			}
			i++;
		}
		
		for(Entry<Character,Integer> k : ma.entrySet())
		{
		System.out.println(k.getKey()+" "+k.getValue());
			
		}

		
		
	}

}
