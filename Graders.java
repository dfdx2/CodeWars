/* 8KYU CodeWars Graders

Create a function that takes a number as an argument 
and returns a grade based on that number.

Score	                                   Grade

Anything greater than 1 or less than 0.6	"F"
0.9 or greater	                            "A"
0.8 or greater	                            "B"
0.7 or greater	                            "C"
0.6 or greater	                            "D"

Examples:

grader(0)   should be "F"
grader(1.1) should be "F"
grader(0.9) should be "A"
grader(0.8) should be "B"
grader(0.7) should be "C"
grader(0.6) should be "D"

*/
public class Graders{
  public static String grader(double score){
    return score > 1 ? "F" : score >= 0.9 ? "A" : score >= 0.8 ? "B" : score >= 0.7 ? "C" : score >= 0.6 ? "D" : "F";
  }
}
/*--------------------------------------------------------------------------
public class Grader{
  public static String grader(double score){
    
    if (score > 1d || score < 0.6d) {
      return "F";
      
    } else if (score >= 0.9d) {
      return "A";
      
    } else if (score >= 0.8d) {
      return "B";
      
    } else if (score >= 0.7d) {
      return "C";
      
    } else if (score >= 0.6d) {
      return "D";
      
    } else {
      
    return "F";
      
    }
  }
}
----------------------------------------------------------------------------
public class Grader{
  public static String grader(double score){
    
    
    return score > 1.00 || score < 0.6 ? "F": score >= 0.6 && score < 0.7 ? "D":score >= 0.7 && score < 0.8 ? "C": score >= 0.8 && score < 0.9 ? "B": "A";
  }
}
----------------------------------------------------------------------------
public class Grader{
  public static String grader(double score) {
    return score > 1 ? "F" : "FFFFFFDCBAA".charAt((int)(score * 10)) + "";
  }
}
----------------------------------------------------------------------------
public class Grader{
  public static String grader(double s){
    return s >= .6 ? s >= .7 ? s >= .8 ? s >= .9 ? s > 1 ? "F" : "A" : "B" : "C" : "D" : "F" ;
  }
}
----------------------------------------------------------------------------
public class Grader{
  public static String grader(double score){
     if(score>=0.9 && score<=1){
            return "A";
        }
        else if(score>=0.8 && score<1){
            return "B";
        }
        else if(score>=0.7 && score<1){
            return "C";
        }
        else if(score>=0.6 && score<1){
            return "D";
        }
        else{
            return "F";
        }    
  }
}
----------------------------------------------------------------------------
public class Grader{
  public static String grader(double score){
    //Put your lovely code here ^_^
    return score > 1 || score < 0.6 ? "F" : score >= 0.9 ? "A" : score >= 0.8 ? "B"
      : score >= 0.7 ? "C" : "D";
  }
}
----------------------------------------------------------------------------
public class Grader{
  public static String grader(double score){
    String grade = null;
    if(score<0.6D)
      return "F";
    else if(score<0.7D)
      return "D";
    else if(score<0.8D)
      return "C";
    else if(score<0.9D)
      return "B";
    else if(score<=1.0D)
      return "A";
    return "F";  
  }
}
----------------------------------------------------------------------------
public class Grader{
  public static String grader(double score){
    if (score<0.6||score>1) return "F";
    if (score>=0.6 && score<0.7) return "D";
    if (score>=0.7 && score<0.8) return "C";
    if (score>=0.8 && score<0.9) return "B";
    if (score>=0.9 && score<=1) return "A";
    return "";
  }
}
*/
