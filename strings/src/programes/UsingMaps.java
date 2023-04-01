package programes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UsingMaps {

	public static void main(String[] args) 
	{

      String s="yuvaraj";
      char [] c=s.toCharArray();
      System.out.println("using linkedHasMap");
      Map<Character,Integer> m=new LinkedHashMap();
      int i=0;
      while(i!=c.length)
      {
    	  if(m.containsKey(c[i])==false)
    	  {
    		  m.put(c[i], 1);
    	  }
    	  else
    	  {
    		  int index=m.get(c[i]);
    		  int newval=index+1;
    		  m.put(c[i], newval);
    	  }
    	  i++;
      }
      
      for(Entry<Character, Integer> k : m.entrySet())
      {
    	 System.out.println(k.getKey()+" "+k.getValue()); 
      }
      
      System.out.println("Using HashMap");
      //Using in HashMap
      String s1="yuvaraj";
      char [] d=s1.toCharArray();
      Map<Character,Integer> m1=new HashMap();
      int j=0;
      while(j!=d.length)
      {
    	  if((m1.containsKey(d[j]))==false)
    	  {
    		  m1.put(d[j], 1);
    	  }
    	  else
    	  {
    		  int index=m1.get(d[j]);
    		  int newval=index+1;
    		  m1.put(d[j], newval);
    	  }
    	  j++;
      }
      
      for(Entry<Character,Integer> k1 : m1.entrySet())
      {
    	  System.out.println(k1.getKey()+" "+k1.getValue());
      }
      
      System.out.println("using TreeMap");
      
      char [] c2=s.toCharArray();
      Map<Character,Integer> m2=new TreeMap();
      int k=0;
      while(k!=c2.length)
      {
    	  if(m2.containsKey(c2[k])==false)
    	  {
    		  m2.put(c2[k], 1);
    	  }
    	  else
    	  {
    		  int index=m2.get(c2[k]);
    		  int newval=index+1;
    		  m2.put(c2[k],newval);
    	  }
    	  k++;
      }
      for(Entry<Character,Integer> k2 : m2.entrySet())
      {
    	  System.out.println(k2.getKey()+" "+k2.getValue());
      }

	}

}
