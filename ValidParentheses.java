/* 7KYU CodeWars Valid Parentheses

Write a function that takes a string of parentheses, and determines if 
the order of the parentheses is valid. The function should return true 
if the string is valid, and false if it's invalid.

Examples
"()"              =>  true
")(()))"          =>  false
"("               =>  false
"(())((()())())"  =>  true
Constraints
0 <= length of input <= 100

All inputs will be strings, consisting only of characters ( and ).
Empty strings are considered balanced (and therefore valid), and will be tested.
For languages with mutable strings, the inputs should not be mutated.

Protip: If you are trying to figure out why a string of parentheses is invalid, 
paste the parentheses into the code editor, and let the code highlighting 
show you!

*/

public class Kata {
  
  public static boolean validParentheses(String parenStr) {
    if (parenStr.length() < 1) {
      return true;
    }
    if (parenStr.charAt(0) == ')' || parenStr.charAt(parenStr.length() - 1) == '(') {
      return false;
    }
    int left = 0;
    int right = 0;
    if (parenStr.length() < 2) {
      return false;
    }    
    if (parenStr.charAt(0) == ')') {
        return false;
      }
    for (int i = 0; i < parenStr.length(); i++) {
      if (parenStr.charAt(i) == '(') {
        left++;
      }
      else if (parenStr.charAt(i) == ')') {
        right++;
        if (right > left) {
          return false;
        }
      }
    }
    return (left == right);
  }
}
/*------------------------------------------------------------------------
interface Kata {
  static boolean validParentheses(String p) {
    return p.chars().reduce(0, (s, c) -> s < 0 ? s : c == '(' ? ++s : --s) == 0;
  }
}
--------------------------------------------------------------------------
public class Kata {
  public static boolean validParentheses(String parenStr) {
    int counter = 0;
    for (char c: parenStr.toCharArray()) {
      if (c == '(') {
        counter++;
      } else {
        counter--;
        if (counter < 0) {
          return false;
        }
      }
    }
    return counter == 0;
  }
}
---------------------------------------------------------------------------
public class Kata {
  
  public static boolean validParentheses(String parenStr) {
    int open = 0;
    for(int i=0; i<parenStr.length(); i++) {
      open += parenStr.charAt(i) == '(' ? 1 : -1;
      if(open < 0) {
        return false;
      }
    }
    return open == 0;
  }
}
----------------------------------------------------------------------------
public class Kata {
  
  public static boolean validParentheses(String parenStr) {
    if (parenStr.isEmpty()) return true;
   char[] s = parenStr.toCharArray();
    if(s[0] == ')'){return false;}
    int counter = 0;
    for(char c : s ){
      if(counter < 0){return false;}
      if(c == '('){
       counter++;
        } else if (c == ')'){
        counter--;
        } 
       }
    return (counter == 0) ? true : false;
  }
}
-------------------------------------------------------------------------
public class Kata {
    public static boolean validParentheses(String parenStr) {
        while (parenStr.contains("()"))
            parenStr = parenStr.replace("()", "");
        return parenStr == "";
    }
}




*/