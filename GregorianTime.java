<<<<<<< HEAD
<<<<<<< HEAD
import java.util.*;
 
class GetCurrentDateAndTime
{
   public static void main(String args[])
   {
      int day, month, year;
      int second, minute, hour;
      Calendar date = Calendar.getInstance() ;
 
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
 
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
 
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
=======
import java.util.*;
 
class GetCurrentDateAndTime
{
   public static void main(String args[])
   {
      int day, month, year;
      int second, minute, hour;
      Calendar date = Calendar.getInstance() ;
 
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
 
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
 
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
import java.util.*;
 
class GetCurrentDateAndTime
{
   public static void main(String args[])
   {
      int day, month, year;
      int second, minute, hour;
      Calendar date = Calendar.getInstance() ;
 
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
 
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
 
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}	