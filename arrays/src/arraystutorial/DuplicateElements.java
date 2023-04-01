package arraystutorial;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements
{
	//WAP to print duplicates elements in an array
	
	public static void main(String[] args) {
		
		String [] s= {"java","c","c++","Devops","java"};
		
		List li=Arrays.asList(s);
		System.out.println(li);
		Set s1=new HashSet(li);
		System.out.println(s1);
		
		if(li.size()!=s1.size())
		{
			System.out.println("The array contains duplicates");
		}
		else
		{
			System.out.println("The array not contains duplicates");
		}
		
		
		
		Set snd=new HashSet<>();
		Set dupli=new HashSet<>();
		
		for(String str : s)
		{
			if(!(snd.contains(str))) 
			{
				snd.add(str);
			}
			else
			{
				dupli.add(str);
			}
		}
		System.out.println(dupli);
		System.out.println(snd);
	}

}
