package arraystutorial;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayFristOccurence 
{
	//find out the Frist Occurence of array element
	public static void main(String[] args)
	{
		// Creating a String array
        String[] arr = { "Geeks", "for", "Geeks" };
 
        // Using Arrays.stream() to convert
        // array into Stream
        Stream<String> stream = Arrays.stream(arr);
 
        // Displaying elements in Stream
        stream.forEach(str ->System.out.print(str + " "));
        System.out.println();
        System.out.println("===================");
		  int [] a= {50,2,3,3,2,1,3,20,45,50};
		  for(int i=0;i<a.length;i++)
		  {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					
				}
			}
		  }
		  
	}

}
