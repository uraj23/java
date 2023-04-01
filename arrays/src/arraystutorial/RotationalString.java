package arraystutorial;

public class RotationalString {

	public static void main(String[] args) 
	{
      String s1="abcd";
      String s2="cdab";
          System.out.println(isRotating(s1,s2));
		

	}

	private static boolean isRotating(String s1, String s2) 
	{
       
       if((s1.equals(null)) || (s2.equals(null)))
       {
    	  return false;
       }
       if(s1.length()!=s2.length())
	   {
		   return false; 
	   }
       else
       {
    	   String concat=s1+s1;
    	   return concat.contains(s2);
       }
		
	}

}
