package arraystutorial;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatingElements {

	public static void main(String[] args)
	{
		//To find Repeating element in array?
		
		int [] arr= {1,2,3,10,23,4,2,3,2,3,4};
		
		
		Map<Integer,Integer> map=new LinkedHashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i])==false)
			{
				map.put(arr[i], 1);
			}
			else
			{
				int value=map.get(arr[i]);
				int newval=value+1;
				map.put(arr[i], newval);
			}
		}
		
		for(Entry<Integer,Integer> m : map.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey());
			}
		}
		System.out.println("==================");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] )
				{
				
					System.out.println(arr[i]);
					
				}
				
			}
		}
	}

}
