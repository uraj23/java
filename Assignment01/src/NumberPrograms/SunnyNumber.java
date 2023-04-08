package NumberPrograms;

public class SunnyNumber {

	public static void main(String[] args) 
	{
		int num=15;
		int num1=num+1;
		
		for(int i=1;i<num/2;i++)
		{
			if(i*i==num1)
			{
				System.out.println("Sunny number");
				System.exit(0);
			}
			
		}
		System.out.println("not sunny number");
		

	}

}
