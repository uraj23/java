package arraystutorial;

public class SumOfArrayElementsUsingRecyrsion {
    //sum of array using recursion solving
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5};
		
		int res=sumOfArray(arr,arr.length-1);
		System.out.println(res);
	}

	private static int sumOfArray(int[] arr, int length) 
	{
           if(length<0)
     {
    	 return 0;
     }
     
     return arr[length]+sumOfArray(arr,length-1);
		
	}

}
