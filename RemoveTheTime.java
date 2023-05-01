/* 8KYU CodeWars Remove The Time

Task Description
You're re-designing a blog, and the blog's posts have the Weekday Month Day, 
time format for showing the date and time when a post was made, e.g., Friday 
May 2, 7pm.

You're running out of screen real estate, and on some pages you want to display 
a shorter format, Weekday Month Day that omits the time.

Write a function that takes the website date/time in its original string format 
and returns the shortened format.

Input
Input will always be a string, e.g., "Friday May 2, 7pm". 

Output
Output will be the shortened string, e.g., "Friday May 2".

*/

public class Solution {
  public static String shortenToDate(String longDate) {
    
    String x = "";
    for (int i = 0; i < longDate.length(); i++) {
      if (longDate.charAt(i) == ',') {
        break;
      }
      else {
        x += longDate.charAt(i);
      }
    }
    return x;
  }
}
/*------------------------------------------------------------------------
public class Solution {
  public static String shortenToDate(String longDate) {
    return longDate.substring(0, longDate.indexOf(','));
  }
}
----------------------------------------------------------------------------
public class Solution {
  public static String shortenToDate(String longDate) {
    return longDate.split(",")[0];
  }
}
-----------------------------------------------------------------------------
public class Solution {
    public static String shortenToDate(String longDate) {
        //Put your code here ^_^
        int endOfString = longDate.indexOf(",");
        return longDate.substring(0, endOfString);

        
      }
}
------------------------------------------------------------------------------
public class Solution {
  public static String shortenToDate(String longDate) {
    //Put your code here ^_^
        String[] strings = longDate.split(",");
        return strings[0];
  }
}
-------------------------------------------------------------------------------
public class Solution {
  public static String shortenToDate(String longDate) {
    //Put your code here ^_^
    String result = "";
    String [] str = longDate.split(",");
    for (int i = 0; i<str.length-1; i++){
      result += str[i];
    }
    return result;
  }
}



*/