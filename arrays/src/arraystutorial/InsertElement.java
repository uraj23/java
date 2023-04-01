package arraystutorial;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement 
{
	public static void main(String[] args) {
		//insert element into array
		Scanner sc=new Scanner(System.in);
		int [] arr = new int[5];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("print elements in array");
		for(int i : arr)
		{
			System.out.println(i);
		}
		System.out.println("Enter the index "+(arr.length-1)+" below the this index");
		int index=sc.nextInt();
		System.out.println("Enter the element ");
		int value=sc.nextInt();
		
		for(int i=arr.length-1; i >index;i--)
		{
			arr[i]=arr[i-1];
			
		}
		arr[index]=value;
		
		
		 System.out.println(Arrays.toString(arr));
	}
   

}
