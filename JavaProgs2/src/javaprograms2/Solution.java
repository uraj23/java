package javaprograms2;

import java.util.Scanner;

public class Solution 
{
	public static  int[] removeDuplicates(int[] nums)
    {
		
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
               {
                 if(nums[i]==nums[j] && nums[j]!='_')
                 {
                     nums[j]='_';
                 }  
               }
        }

        
          int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!='_')
            {
                nums[k++]=nums[i];
            }
            if(nums[i]=='_')
            {
                nums[k++]=nums[i];
            }
           
        }

   
      return nums; 
   }
   

public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	
	int [] nums=new int[size];
	System.out.println("Enter the elements");
	
	for(int i=0;i<nums.length;i++)
	{
		nums[i]=sc.nextInt();
	}
	int[] res=removeDuplicates(nums);
	for(int i : res)
	{
		if(i!='_')
		{
		System.out.print(i+" ");
		}
		else
		{
			System.out.print((char)i+" ");	
		}
	}

}
}
