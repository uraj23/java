package arraystutorial;

public class BinarySearch {

	public static void main(String[] args) 
	{
		
		int [] arr= {10,30,20,40,50,60};
		System.out.println(binarySearch(arr,0,arr.length-1,50));

	}

	private static int binarySearch(int[] arr, int low, int high, int search) 
	{
		if(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(search>arr[mid])
			{
				return binarySearch(arr,mid+1,high,search);
			}
			else if(search<arr[mid])
			{
				return binarySearch(arr,low,mid-1,search);
			}
		}
		return -1;
		
	}

}
