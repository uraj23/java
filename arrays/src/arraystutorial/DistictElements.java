package arraystutorial;

public class DistictElements 
{
	public static void main(String[] args) 
	{
     
		
		

//		for(int i=0;i<=b.length-1;i++)
//		{
//			boolean flag=false;
//			for(int j=0;j<=a.length-1;j++)
//			{
//				if(b[i]==a[j])
//				{
//					flag=true;
//				}
//			}
//			if(!flag)
//			{
//				System.out.println(b[i]);
//			}
//
	
		int a[]= {10,20,30,40,40};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
		}

	
	
	
	}

}
