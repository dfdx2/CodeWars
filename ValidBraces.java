/* 6KYU CodeWars Valid Braces

Write a function that takes a string of braces, and determines if the order 
of the braces is valid. It should return true if the string is valid, and 
false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces new 
characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, 
brackets and curly braces: ()[]{}.

What is considered Valid?
A string of braces is considered valid if all braces are matched with the 
correct brace.

Examples
"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False

*/
import java.util.*;
public class BraceChecker {

  public boolean isValid(String braces) {
    Map<Character, Character> result = new HashMap<>();
    result.put('(',')');
    result.put('[',']');
    result.put('{','}');
    
    Stack<Character> bucket = new Stack<>();
    
    for (int i = 0; i < braces.length(); i++) {
      char c = braces.charAt(i);
      if (result.keySet().contains(c)) {
        bucket.push(c);
      }
      else if (result.values().contains(c)) {
        if (!bucket.empty() && result.get(bucket.peek()) == c) {
          bucket.pop();
        }
        else {
          return false;
        }
      }
    }
    return bucket.empty();
  }

}
/*--------------------------------------------------------------------
import java.util.Stack;

public class BraceChecker {
	
  public boolean isValid(String braces) {
		Stack<Character> s = new Stack<>();
		for (char c : braces.toCharArray()) 
			if (s.size() > 0 && isClosing(s.peek(), c)) s.pop(); 
			else s.push(c);
		return s.size() == 0;
	}
  
	public boolean isClosing(char x, char c) {
		return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
	}
  
}
----------------------------------------------------------------------------
public class BraceChecker {

  public boolean isValid(String braces) { 
    String b = braces;
    System.out.println(braces);   
    for(int i=0;i<braces.length()/2;i++)
    {
      b = b.replaceAll("\\(\\)", "");
      b = b.replaceAll("\\[\\]", "");
      b = b.replaceAll("\\{\\}", "");
      if(b.length() == 0)
        return true;
    }
    return false;
  }
}
--------------------------------------------------------------------------------
public class BraceChecker {

  public boolean isValid(String s) {
    String lastIteration = s;
    String currentIteration = s;
    do {
        lastIteration = currentIteration;
        currentIteration = lastIteration.replace("[]" , "").replace("{}", "").replace("()" , "");
    } while(currentIteration.length() < lastIteration.length());
    return currentIteration.equals("");
  }

}
---------------------------------------------------------------------------------
public class BraceChecker {

  public boolean isValid(String braces) {
    int lengthOfBraces = braces.length();
    for(int i = 0; i < lengthOfBraces; i++){
      braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
    }
    return braces.isEmpty();
  }

}
--------------------------------------------------------------------------------
public class BraceChecker {

  public boolean isValid(String braces) {
    String prev = "";
    while (!prev.equals(braces)) {
      prev = braces;
      braces = braces.replace("()", "");
      braces = braces.replace("[]", "");
      braces = braces.replace("{}", "");
    }
    return braces.isEmpty();
  }

}



*/