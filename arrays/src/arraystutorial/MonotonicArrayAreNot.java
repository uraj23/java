package arraystutorial;

public class MonotonicArrayAreNot 
{
	public static void main(String[] args) 
	{
		int []a= {1,24,35,78,89};
		if(isIncreasingArray(a))
		{
			System.out.println("is increasing order");
		}
		else
		{
			System.out.println("not a incrasing order");
		}
		if(isDecresingArray(a))
		{
			System.out.println("is decreasing order");
		}
		else
		{
			System.out.println("not a desending order");
		}
		
	}

	private static boolean isDecresingArray(int[] a) 
	{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]<a[i+1])
				{
				return false;
				}
			}
			return true;
	}

	private static boolean isIncreasingArray(int[] a) 
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				return false;
			}
		}
		return true;
		
	}

}
