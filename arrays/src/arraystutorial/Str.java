package arraystutorial;

public class Str {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,0,0,0,0};
		int sum=0;
		int key=9;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==0)
			sum=sum+1;
		}
		System.out.println(sum);
			
		}
	}
		
	

