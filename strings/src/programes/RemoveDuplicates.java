package programes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicates 
{

	public static void main(String[] args)
	{

      String s="yuvaraj";
      char [] c=s.toCharArray();
      Map<Character,Integer> ma=new LinkedHashMap();
      int i=0;
      while(i!=c.length)
      {
    	  if(ma.containsKey(c[i])==false)
    	  {
    	  ma.put(c[i], 1);
    	  }
    	  else
    	  {
    		  int index=ma.get(c[i]);
    		  int newval=index+1;
    		  ma.put(c[i], newval);
    	  }
    	  i++;
      }
      
      for(Entry<Character,Integer> k : ma.entrySet())
      {
    	  if(k.getValue()==1)
    	  {
    		  System.out.println(k.getKey()+" "+k.getValue());
    	  }
      }
	}

}
