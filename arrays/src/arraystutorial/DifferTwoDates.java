
package arraystutorial;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DifferTwoDates {

	public static void main(String[] args)
	{

      Date d1=new Date();
      System.out.println(d1);
      System.out.println(d1.getYear());
      System.out.println(d1.getMonth());
      
      System.out.println(d1.getDate());
      System.out.println(d1.getHours());
      System.out.println(d1.getSeconds());
      System.out.println(d1.getTimezoneOffset());
      System.out.println(d1.toLocaleString());
      System.out.println(d1.clone());
          

      
     

	}

}
