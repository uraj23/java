package arraystutorial;

public class SegregateArrayIs0sAnd1s {

	public static void main(String[] args)
	{

			int a[]= {0,1,0,1,0,1,0,0,1,1};
			
			int j=0;
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==0)
				{
					a[j++]=a[i];
				}
			}
			
			while(j<a.length)
			{
				a[j++]=1;
			}
			
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}

	}

}
