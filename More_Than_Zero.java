/* 7KYU CodeWars More Than Zero

Correct this code so that it takes one argument, x, 
and returns "x is more than zero" if x is positive 
(and nonzero), and otherwise, returns "x is equal to 
or less than zero." In both cases, replace x with the 
actual value of x.

*/

class MoreThanZero {
  public static String corrections(int x) {
    if (x > 0) {
      return String.valueOf(x) + " is more than zero.";
    }
    return String.valueOf(x) + " is equal to or less than zero.";
  }
}
/*------------------------------------------------------------------
class MoreThanZero {
  public static String corrections(int x) {
    return String.format("%d is %s than zero.", x, (x > 0 ? "more" : "equal to or less"));
  }
}
---------------------------------------------------------------------
class MoreThanZero {
  public static String corrections(int x) {
  if(x > 0) {
    return String.valueOf(x) + " is more than zero.";
  }
  
      return String.valueOf(x)  + " is equal to or less than zero.";
  
}
  }
---------------------------------------------------------------------
class MoreThanZero {
     public static String corrections(int x) {
        String answer = " ";
        if (x > 0) {
            answer = x + " is more than zero.";
        } else {
            answer = x + " is equal to or less than zero.";
        }
        return answer;
    }
}
----------------------------------------------------------------------
class MoreThanZero {
  public static String corrections(int x) {
    if(x > 0){
      return (x + " is more than zero.");
    }else{
      return (x + " is equal to or less than zero.");
    }
      
  }
}
----------------------------------------------------------------------
class MoreThanZero {
  public static String corrections(int x) {
    return x > 0 ? x+" is more than zero." : x+" is equal to or less than zero.";
  }
}
-----------------------------------------------------------------------
class MoreThanZero {
  public static String corrections(int x) {
    if (x <= 0) {
      return x + " is equal to or less than zero.";
    }
    else {
      return x + " is more than zero.";
    }        
  }
}
----------------------------------------------------------------------

*/