package arraystutorial;

public class ToPrintArrayEleInRecursion 
{
	//
	public static void main(String[] args) 
	{
		int res[]= {1,2,3,4,5};
		
		printElement(res,0);
	
	}

	private static int[] printElement(int[] res, int length) 
	{
		int i=length;
		if(i>=res.length)
		{
			return res;
		}
	      
	      System.out.println(res[i]);
		return printElement(res,i+1);
		
		
		
	}

}
