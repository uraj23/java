package programes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Programme {

	public static void main(String[] args) 
	{
		String s="programing language";
           s=s.replace(" ", "");
		char [] y=s.toCharArray();
		int size=y.length;
      Map<Character,Integer> ma=new LinkedHashMap();
      int i=0;
      while(i!=size) 
      {
    	  if(ma.containsKey(y[i]) == false)
    	  {
    		 ma.put(y[i], 1); 
    	  }
    	  else
    	  {
    		int oldval=ma.get(y[i]);
    		int newval=oldval+1;
    		ma.put(y[i], newval);
    	  }
    	  ++i;
    	}
      for(Entry<Character, Integer> i1 : ma.entrySet())
      {
    	 System.out.println(i1.getKey()+" "+i1.getValue()); 
      }
      System.out.println("=======================");
      Set<Map.Entry<Character,Integer>> lhmap=ma.entrySet();
      char maxkey=' ';
      int maxval=0;
      
      for(Map.Entry<Character, Integer> data : lhmap )
      {
    	  if(data.getValue()> maxval)
    	  {
    	  maxval=data.getValue();
    	  maxkey=data.getKey();
    	  }
      }
      System.out.println(maxkey);
      System.out.println(maxval);
      
	}

}
