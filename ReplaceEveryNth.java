/* 7KYU CodeWars Replace Every Nth

Task
Write a method, that replaces every nth char oldValue with char newValue.

Inputs
text: the string to modify
n: change the target letter every nth occurrencies
old_value (or similar): the targetted character
new_value (or similar): the character to use as replacement
Note for untyped languages: all inputs are always valid and of their expected type.

Rules
Your method has to be case sensitive!
If n is 0 or negative or if it is larger than the count of the oldValue, return the original text without a change.
Example:
n:         2
old_value: 'a'
new_value: 'o'
"Vader said: No, I am your father!"
  1     2          3        4       -> 2nd and 4th occurence are replaced
"Vader soid: No, I am your fother!"
As you can see in the example: The first changed is the 2nd 'a'. So the start is always at the nth suitable char and not at the first!





*/

public class Kata
{
  public static String replaceNth(String text, int n, char oldValue, char newValue)
  {
    int count = 1;
    String x = "";
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == oldValue && count == n) {
        x += newValue;
        count = 1;
      }
      else if (text.charAt(i) == oldValue && count != n) {
        x += text.charAt(i);
        count++;
      }
      else {
        x += text.charAt(i);
      }
    }
    return x;
  }
}
/*----------------------------------------------------------------------------
public class Kata
{
  public static String replaceNth(String text, int n, char oldValue, char newValue)
  {
    int copy = n;
    char[] c = text.toCharArray();
    for (int i = 0; i < c.length; i++) {
      if (copy == 1 && c[i] == oldValue) {
        c[i] = newValue;
        copy = n;
      }
      else if(c[i] == oldValue) copy--;
    }
    return new String(c);
  }
}
--------------------------------------------------------------------------------
public class Kata
{
  public static String replaceNth(String text, int n, char oldValue, char newValue)
  {
        int count = 0;
        StringBuilder str = new StringBuilder(text);
        
          if(n==0)
            return text;
            
          for(int i = 0; i < text.length();i++)          
              if( (text.charAt(i) == oldValue) && ( ++count == n) )                           
              {  
                 str.setCharAt(i, newValue);            
                 count = 0;                 
              }  
        return str.toString();            
  }
}
----------------------------------------------------------------------------
public class Kata
{
  public static String replaceNth(String text, int n, char oldValue, char newValue)
  {
    if (n < 1) return text;
    return text.replaceAll("(" + (oldValue + ".*?").repeat(n-1) + ")" + oldValue, "$1" + newValue);
  }
}
-----------------------------------------------------------------------------
interface Kata {
  static String replaceNth(String text, int n, char oldValue, char newValue) {
    var result = new StringBuilder();
    int c = 0;
    for (int i = 0; n > 0 && i < text.length(); i++) {
      result.append(text.charAt(i) == oldValue && ++c % n == 0 ? newValue : text.charAt(i));
    }
    return !result.isEmpty() ? result.toString() : text;
  }
}






*/