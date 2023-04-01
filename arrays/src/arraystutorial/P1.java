package arraystutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P1 
{
	public static void main(String[] args) {
		String [] col= {"red","green","blue"};
		int [][] a= {{1,2,3,4,5},{2,3,4,5,6}};
		System.out.println("Frist way");
		//using asList 
		List li=Arrays.asList(a);
		System.out.println(li);
		
		
		System.out.println("second way");
		//using arrayList and collection.addAll() method
		List<String> l=new ArrayList();
		Collections.addAll(l,col);
		System.out.println(l);
		
		List<String> l1=new LinkedList();
		System.out.println("Third way");
		//using for each loop
		for(String s : col)
		{
			l1.add(s);
		}
		System.out.println(l1);
		
		System.out.println("Fourth way");
		//using traditional for loop
		for(int i=0;i<col.length;i++)
		{
			System.out.println(col[i]);
		}
		//using inbult method Arrays.toString() method
		System.out.println("Fifth way to print");
		System.out.println(Arrays.toString(col));
		//Using inbulit method Arrays.deepToString() method we can print twod arrays also
		System.out.println("sixth way to print");
		System.out.println(Arrays.deepToString(col));
		System.out.println(Arrays.deepToString(a));
		System.out.println("seventh way to print arrays");
		//using Streams 
		
	}

	
}
