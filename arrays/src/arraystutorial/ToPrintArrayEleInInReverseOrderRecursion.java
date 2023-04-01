package arraystutorial;

public class ToPrintArrayEleInInReverseOrderRecursion
{

	public static void main(String[] args) 
	{

      int arr[]= {1,2,3,4,5};
      reversePrint(arr,arr.length-1);
	}

	private static int[] reversePrint(int[] arr, int length) 
	{
		int i=length;
		if(length<0)
		{
			return arr;
		}
		
		System.out.print(arr[i++]+" ");
		return reversePrint(arr,length-1);
		
	}

}
