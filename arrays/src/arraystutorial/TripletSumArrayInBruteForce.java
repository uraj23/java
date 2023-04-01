package arraystutorial;
public class TripletSumArrayInBruteForce 
{
	public static void main(String[] args) {
		
		int [] a= {2,3,1,4,2,4,2};
		int sum=10;
		
		for(int i=0;i<a.length-2;i++)
		{
			for (int j = i+1; j < a.length-1; j++) {
				for (int j2 = j+1; j2 < a.length; j2++) {
					if(a[i]+a[j]+a[j2]==sum)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[j2]+" == "+sum);
					}
				}
			}
		}
	}

}
