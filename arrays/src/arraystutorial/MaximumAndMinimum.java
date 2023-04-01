package arraystutorial;

public class MaximumAndMinimum 
{
	//to find out the minimum element and maximum element and 
	//difference of maximum and minimum element

	public static void main(String[] args) 
	{

		int [] arr= {10,20,30,40,50};
		maxAndMin(arr);

	}

	private static void maxAndMin(int[] arr) 
	{
		int min=arr[0],max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("minimum "+min);
		System.out.println("maximum "+max);
		System.out.println("difference is "+(max-min));
		
	}

}
