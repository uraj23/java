package arraystutorial;

import java.util.Arrays;

public class MoveElementNegative 
{
	public static void main(String[] args) 
	{
		//To move all negative numbers starts array and fix it positive ends 
		int [] arr= {-1,-2,3,10,20,-9};
		
		int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0) {
			temp[j]=arr[i];
			j++;
			}
		}
		for(int i=0;i<temp.length;i++)
		{
			if(arr[i]>0)
			{
				temp[j++]=arr[i];
			}
		}
		
		for(int i : temp)
		{
			System.out.println(i);
		}
		
	}

}
