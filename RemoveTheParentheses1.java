/* 6KYU CodeWars Remove The Parenthesis

DESCRIPTION:
Remove the parentheses
In this kata you are given a string for example:

"example(unwanted thing)example"
Your task is to remove everything inside the parentheses as well as 
the parentheses themselves.

The example above would return:

"exampleexample"

Notes

Other than parentheses only letters and spaces can occur in the string. 
Don't worry about other brackets like "[]" and "{}" as these will never appear.
There can be multiple parentheses.
The parentheses can be nested.

*/
public class Kata {
    public static String removeParentheses(final String str) {
        String result = str;
      result = result.replaceAll("\\([^()]*\\)", "");
      if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
      
           if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
           if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
            if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
                 if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
                 if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
                 if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
                 if (result.contains("(")) {
        result = result.replaceAll("\\([^()]*\\)", "");
      }
      
      
      
      
      return result;
    }
}
/*------------------------------------------------------------------------
public class Kata {
    public static String removeParentheses(final String str) {
        String updated = str.replaceAll("\\([^()]*\\)", "");
        if (updated.contains("(")) updated = removeParentheses(updated);     
        return updated;  
      
      
    }
}
---------------------------------------------------------------------------
public class Kata {
    public static String removeParentheses(final String str) {
        
    String res = "";
    int count = 0;
    for (int l = 0; l < str.length(); l++) {
        char c = str.charAt(l);
        if (c == '(') count += 1;
        if (count == 0) res += str.charAt(l);
        if (c == ')') count -= 1;
    }
    return res;
    }
}
-------------------------------------------------------------------------
public class Kata {
    public static String removeParentheses( String str) {
        while(str.contains("(")){
            str = str.replaceAll("\\([^()]*\\)","");
        }
        return str;
    }
}
-------------------------------------------------------------------------
public class Kata {
    public static String removeParentheses(final String str) {
      String s=str;
      while(s.contains("("))
        s=s.replaceAll("\\([\\w\\s]*?\\)","");
      return s;
    }
}
--------------------------------------------------------------------------



*/