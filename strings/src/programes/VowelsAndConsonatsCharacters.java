package programes;

public class VowelsAndConsonatsCharacters {

	public static void main(String[] args)
	{

      String s="yuvaraj vowelpuyo837964837e^%$%^&^*&&*%^$#s consonats special characters";
      
      //s=s.replace(" ", "");
       int vowel=0;
       int cons=0;
       int number=0;
       int spesymbol=0;
      int i=0;
      while(i!=s.length())
      {
    	  if((s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='A' && s.charAt(i)<='Z'))
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||
						s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
				{
					vowel++;
					i++;
				
				}
				else
				{
					cons++;
					i++;
				}
			}
    	  else if(s.charAt(i)>='0' && s.charAt(i)<='9') 
    	  {
    		 number++;
    		 i++;
    	  }
    	  else {
    		  spesymbol++;
    		  i++;
    	  }
      }
      System.out.println("vowels is "+vowel);
      System.out.println("constants is "+cons);
      System.out.println("number is "+number);
      System.out.println("Special symbool is "+spesymbol);

	}

}
