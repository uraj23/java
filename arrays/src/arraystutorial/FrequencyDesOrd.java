package arraystutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FrequencyDesOrd  
{

	public static void main(String[] args) 
	{

      String s="yuvaraj";
      s=s.toLowerCase();
      char [] ch=s.toCharArray();
      Map<Character,Integer> map=new TreeMap<>();
      
      for(int i=0;i<ch.length;i++)
      {
    	  if((map.containsKey(ch[i]))==false)
    	  {
    		  map.put(ch[i], 1);
    	  }
    	  else
    	  {
    		  int index=map.get(ch[i]);
    		  int newval=index+1;
    		  map.put(ch[i], newval);
    	  }
      }
     for(Entry<Character,Integer> ma : map.entrySet())
     {
    	 System.out.println(ma.getKey()+" "+ma.getValue());
     }
     
     
    	Set<Entry<Character,Integer>> set=map.entrySet();
     List<Entry<Character,Integer>> list=new ArrayList<Entry<Character,Integer>>(set);
      Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>(){

		@Override
		public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
			
			if(o1.getValue()<o2.getValue())
			{
				return -1;
			}
			else if(o1.getValue()==o2.getValue())
			{
				return 0;
			}
			else
			{
				return 1;
			}
			
			//return o1.getValue().compareTo(o2.getValue());
		}
		
    	  
    	  
      });
      System.out.println(list);
//      //System.out.println(map.size());
//      
//      for(int i=0;i<map.size();i++)
//      {
//    	  for(int j=i+1;j<map.size();j++)
//    	  {
//    		  if(map.get(ch[i])map.get(ch[j]))
//    		  {
//    			  System.out.println(map.get(ch[i]));
//    		  }
//    	  }
//      }
      

	}

	
	

	
}
