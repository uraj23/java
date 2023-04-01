package arraystutorial;

public class CommonElementsInThreeArrays 
{
	public static void main(String[] args) 
	{
		int arr1[]= {1,30,40,50,60};
		int arr2[]= {5,9,10,20,30,40};
		int arr3[]= {3,10,30,40,35,36};
		System.out.println("using while loop to print common elements in three arrays");
		int x=0,y=0,z=0;
		while(x<arr1.length && y<arr2.length && z<arr3.length)
		{
			if(arr1[x]==arr2[y] && arr2[y]==arr3[z])
			{
				System.out.println(arr1[x]);
				x++;y++;z++;
			}
			else if(arr1[x]>arr2[y])
			{
				y++;
			}
			else if(arr2[y]>arr3[z])
			{
				z++;
			}
			else
			{
				x++;
			}
		}
		System.out.println("using for loops to print common elements in three arrays");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
				{
					for(int k=0;k<arr3.length;k++)
					{
						if(arr1[i]==arr3[k])
						{
							System.out.println(arr1[i]);
						}
					}
				}
			 }
		}
			
		}
		
		
	}


