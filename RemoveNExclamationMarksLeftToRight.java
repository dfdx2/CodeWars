/* 8KYU Exclamation Marks Series 6 Remove n Exclamation Marks in the sentence  from left to right

Description:
Remove n exclamation marks in the sentence from left to right.
 n is positive integer.

Examples
remove("Hi!",1) === "Hi"
remove("Hi!",100) === "Hi"
remove("Hi!!!",1) === "Hi!!"
remove("Hi!!!",100) === "Hi"
remove("!Hi",1) === "Hi"
remove("!Hi!",1) === "Hi!"
remove("!Hi!",100) === "Hi"
remove("!!!Hi !!hi!!! !hi",1) === "!!Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",3) === "Hi !!hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",5) === "Hi hi!!! !hi"
remove("!!!Hi !!hi!!! !hi",100) === "Hi hi hi"

*/
public class Kata {

    public static String remove(String s, int n){
      for (int i = n; i > 0; i--) {
        s = s.replaceFirst("!", "");
      }
      return s;
    }
}
/*-------------------------------------------------------------
public class Kata {

  public static String remove(String s, int n){
  
    while(n-->0)
      s  = s.replaceFirst("!","");   
    return s;    
  }
  
}
---------------------------------------------------------------
class Kata {
  static String remove(String s, int n) {
    while (n-- > 0) s = s.replaceFirst("!", "");
    return s;
  }
}

*/