package arraystutorial;

public class LargestAndSmallest {

	public static void main(String[] args) 
	{
		
		int [] arr= {10,2,3,4,32,3,5,220};
		
		int largest=Integer.MIN_VALUE;
		System.out.println(largest);
		int smallest=Integer.MAX_VALUE;
		System.out.println(smallest);
		
		for(int i : arr)
		{
			if(i>largest)
			{
				largest=i;
			}
		}
		System.out.println("Greatest element in array "+ largest);
		
		for(int i : arr)
		{
			if(i<smallest)
			{
				smallest=i;
			}
		}
		System.out.println("Smallest element in array "+smallest);
	}

}
