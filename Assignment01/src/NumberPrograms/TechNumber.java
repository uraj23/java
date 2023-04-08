package NumberPrograms;

public class TechNumber 
{
	public static void main(String[] args) 
	{
		int num=2025;
		int num1=num;
		
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		if(count%2==0)
		{
			int d=1;
			for(int i=1;i<=count/2;i++)
			{
				d=d*10;
			}
			int last=num1%d;
			int frist=num1/d;
			int sum=last+frist;
			int sq=sum*sum;
			if(num1==sq)
			{
				System.out.println("Tech number");
			}
			else
			{
				System.out.println("not a tech number");
			}
		}
		else
		{
			System.out.println("not a tech number");
		}
		
	}

}
