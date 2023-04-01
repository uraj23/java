package arraystutorial;

public class CommonElements 
{
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {3,4,2,6};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
			
		}
	}

}
