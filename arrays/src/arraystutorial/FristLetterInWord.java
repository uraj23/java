package arraystutorial;

public class FristLetterInWord {

	public static void main(String[] args)
	{
		// WAP to print first letter in a each word
		String s="   print    first   letter   in   a   each   word    ";
		
		//isSplit(s);
		
		for(int i=0;i<s.length();i++)
		{
			if((i==0 && s.charAt(i)!=' ')|| (s.charAt(i)!=' ' && s.charAt(i-1)==' '))
			{
				System.out.println(s.charAt(i));
			}
		}

	}

	private static void isSplit(String s) 
	{

      String [] word=s.split(" ");
      for(int i=0;i<word.length;i++)
      {
    	  String str=word[i];
    	  System.out.println(str.charAt(0));
      }
		
	}

}
