package programes;

public class CountWords 
{
	public static void main(String[] args) {
		
	
	String s="   hello    java    programing    language  ";
	int count=0;
	String str="";
	for(int i=0;i<s.length();i++)
	{
		if((i==0 && s.charAt(i)!=' ')||(s.charAt(i)!=' ' && s.charAt(i-1)==' ') )
		{
			count++;
			
			char c=(char)(s.charAt(i)-32);
			str=str+c;
			//System.out.println(c);
		}
		else
		{
			str+=s.charAt(i);
		}
		
	}
	System.out.println(count);
	System.out.println(str);
}
}
