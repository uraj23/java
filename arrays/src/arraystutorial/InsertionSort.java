package arraystutorial;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args)
	{
		
		int a[]= {6,4,3,8,1,8,7};
		
		for(int i=1;i<a.length;i++)
		{
			int j=0;
			j=i-1;
			while(a[i]<a[j] && j<a.length)
			{
				//a[i]=a[j]-a[i]+(a[j]=a[i]);
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
        System.out.println(Arrays.toString(a));
	}

}
