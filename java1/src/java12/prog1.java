package java12;

public class prog1 
{
	public static void main(String[] args) {
		String s="   hello   world   ";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((i==0 && s.charAt(i)!=' ')|| (s.charAt(i)!=' ' && s.charAt(i-1)==' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
