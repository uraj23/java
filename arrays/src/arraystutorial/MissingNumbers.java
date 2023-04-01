package arraystutorial;

import java.util.TreeSet;

public class MissingNumbers 
{
	
	public static void main(String[] args) 
	{
		int [] a= {1,2,3,0,9};
		TreeSet<Integer> tl=new TreeSet<>();
		
		for(int i: a)
		{
			tl.add(i);
		}
		System.out.println(tl);
		int small=tl.first();
		int large=tl.last();
		for(int i=small;i<large;i++)
		{
			if(!(tl.contains(i)))
			{
				System.out.println(i);
			}
		}
		
	}
/*public static void main(String args[]) {
		Integer arr[] = {12,4,0,7,1,8,5};
		missingNos(arr);
	}
	
	public static void missingNos(Integer a[]) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for(int n : a) {
			set.add(n);
		}
		int small = set.first();
		int large = set.last();
		
		for(int i=small ; i<= large; i++) {
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
		
		}*/

}
