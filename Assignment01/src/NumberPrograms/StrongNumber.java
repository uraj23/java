package NumberPrograms;

public class StrongNumber {

	public static void main(String[] args) 
	{
		int num=145;
		int num1=num;
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			int fact=1;
			for(int i=1;i<=last;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==num1)
		{
			System.out.println("Strong number "+sum+" == "+num1);
		}
		else
		{
			System.out.println("not a strong number "+sum+" == "+num1);
		}
	}

}
