package javaprograms2;

public class FindChar {

	public static void main(String[] args) 
	{
//		char ch='6';
//		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
//		{
//			System.out.println("character "+ch);
//		}
//		else
//		{
//			System.out.println("not a character "+ch);
//		}
		//num%4==0 &&(num%400==0 ||num%100!=0)
		
		
		int num=4000;
		if(num%4==0 &&( num%400==0 || num%4000==0))
		{
			System.out.println("leap year "+num);
		}
		else
		{
			System.out.println("not a leap year "+num);
		}

	}

}
