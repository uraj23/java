package NumberPrograms;

public class DuckNumber 
{
	public static void main(String[] args) 
	{
		int num=01203;
		boolean flag=false;
		while(num>9)
		{
			int last=num%10;
			if(last==0)
			{
				flag=true;
				break;
			}
			num=num/10;
		}
		if(flag==true)
		{
			System.out.println("Duck number");
		}
		else
		{
			System.out.println("Not a duck number");
		}
		
		
	}

}
