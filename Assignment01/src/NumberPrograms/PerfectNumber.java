package NumberPrograms;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		for(int i=1;i<=200;i++)
		{
		int num=i;
		int res=perfectNumber(num);
		if(num==res)
		{
			System.out.println("given number is perfect number "+num+" "+res);
		}
//		else
//		{
//			System.out.println("given number is not a perfect number "+num+" "+res);
//		}
		}
	}

	private static int perfectNumber(int num) 
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

}
