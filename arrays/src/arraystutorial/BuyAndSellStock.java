package arraystutorial;

public class BuyAndSellStock 
{
	public static void main(String[] args) {
		
		int [] a= {7,1,5,3,6,4 };
		
		int min=Integer.MAX_VALUE;
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]-min>max)
			{
				max=a[i]-min;
			}
		}
		System.out.println(max);
	}

}
