package arraystutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchElememtInArray 
{
	public static void main(String[] args) throws IOException 
	{
		int [] a= {10,20,40,30,90};
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the element");
		String input= br.readLine();
		
		int number=Integer.valueOf(input);
		//System.out.println(number);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==number)
			{
				System.out.println("Found element");
				System.exit(i);
			}
		}
		System.out.println("element not found");
	}

}
