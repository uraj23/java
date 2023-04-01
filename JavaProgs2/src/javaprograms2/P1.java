package javaprograms2;

public class P1 
{
	 public static boolean isPalindrome(String s) 
	    {
//	        boolean flag=true;
//	       
//	         String s1="";
//	        for(int i=0;i<s.length();i++)
//	        {
//	            if(s.charAt(i)>='a' && s.charAt(i)<='z')
//	            {
//	                s1+=""+s;
//	            }
//	        }
//	         s1.toLowerCase();
//	          String s2="";
//	        for(int i=s1.length();i>0;i++)
//	        {
//	           s2+=""+s1;
//	        }
//	        if(s1.equals(s2))
//	        {
//	            flag=true;
//	        }
//	        else{
//	            flag=false;
//	        }
//
//	        return flag;
	
		 
		 String newStr="";
	        String revStr="";
	        for(int i=0; i<s.length(); i++){
	            char ch= s.charAt(i);
	            if((ch>=48 && ch<=57) || (ch>=65 && ch<=90) || (ch>=97 && ch <=122)){
	                if(ch>=65 && ch<=90) ch= (char) (ch+32);
	                newStr += ch;
	                revStr = ch+revStr;
	            }
	        }
	        return (revStr.equals(newStr)) ? true: false;
	    }
	 public static void main(String[] args)
	 {
		 String s="A man, a plan, a canal: Panama";
		System.out.println( isPalindrome(s));
		
		System.out.println((char)48);
	}
	}


