package arraystutorial;

public class ProductOfArrayExceptSelf 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		int b[] = new int[a.length];
		int prod=1;
		
		for(int i=0;i<a.length;i++)
		{
			prod=prod*a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			b[i]=prod/a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		
	}

}
