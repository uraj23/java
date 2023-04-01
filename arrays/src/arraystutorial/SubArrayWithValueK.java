package arraystutorial;

public class SubArrayWithValueK
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,2,4,3,10};
		//find the maximum sum of sub Array with using value of k size?
		int k=4;
		int max=0;
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<(i+k) && j<a.length;j++)
			{
				sum+=a[j];
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);
		int start=0;
		int sum1=0;
		int maxSum=0;
		for(int i=0;i<a.length;i++)
		{
			sum1+=a[i];
			if(i>=k-1)
			{
				maxSum=Math.max(sum1,maxSum);
				sum1=sum1-a[start++];
			}
		}
		System.out.println(maxSum);
		
	}

}
