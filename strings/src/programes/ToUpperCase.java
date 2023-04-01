package programes;

public class ToUpperCase {

	public static void main(String[] args) 
	{

      String s="Yuvaraj";
      char [] c=s.toCharArray();
      int i=0;
      while(i!=c.length)
      {
    	  if(c[i]>='a' && c[i]<='z')
    	  {
    	  c[i]=(char) (c[i]-32);
    	  i++;
    	 }
    	  else
    	  {
    		  c[i]=c[i];
    		  i++;
    	  }
      }
      
      for(int j=0;j<c.length;j++)
      {
    	 System.out.print(c[j]); 
      }
      
	}

}
