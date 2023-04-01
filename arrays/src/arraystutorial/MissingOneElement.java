package arraystutorial;

public class MissingOneElement {

	public static void main(String[] args) 
	{
		int [] arr= {4,5,6,7,9};
		int n=arr[arr.length-1];
		System.out.println(n);
		int sum=n*(n+1)/2;
		int sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1+=arr[i];
		}
		System.out.println(sum);
		System.out.println(sum1);
		int missing = sum-sum1;
		System.out.println(missing);
		

	}

}
