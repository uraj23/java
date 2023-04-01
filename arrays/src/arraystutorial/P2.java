package arraystutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P2 
{
	//check element is present in atleast two arrays
	public static void main(String[] args) {
		
	
	Integer [] a1= {1,2,3,9,8,7};
	Integer [] a2= {4,1,2,10,15};
	Integer [] a3= {5,1,2,4,10};
	
	HashSet<Integer> h=new HashSet();
//	h.add(a1);
//	for(Object i:h)
//	{
//		System.out.println(i);
//	}
	List l1=Arrays.asList(a1);
	List l2=Arrays.asList(a2);
	List l3=Arrays.asList(a3);
	h.addAll(l1);
	h.addAll(l2);
	h.addAll(l3);
	System.out.println(h);
	
	List<Integer> fin=new ArrayList();
	
	for(Integer i : h) 
	{
		//how many possibilities we are checking in three arrays
		if((l1.contains(i) && l2.contains(i))
				||(l1.contains(i) && l3.contains(i))
				||(l2.contains(i) && l3.contains(i)))
		{
			fin.add(i);
		}
	}
	System.out.println(fin);
	
	
	String a ="999" , b ="999";
    int c=Integer.parseInt(a)+Integer.parseInt(b);
    System.out.println(c);
    //just checking 
    int ab=6129 ;
    char ch=(char)ab;
    System.out.println(ch);
    
     
	
	
	
	
	
	}
}
