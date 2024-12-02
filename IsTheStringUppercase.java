/* 8KYU CodeWars Is The String Uppercase?

Task
Create a method to see whether the string is ALL CAPS.

Examples (input -> output)

"c" -> False

"C" -> True

"hello I AM DONALD" -> False

"HELLO I AM DONALD" -> True

"ACSKLDFJSgSKLDFJSKLDFJ" -> False

"ACSKLDFJSGSKLDFJSKLDFJ" -> True

In this Kata, a string is said to be in ALL CAPS whenever it does 
not contain any lowercase letter so any string containing no letters 
at all is trivially considered to be in ALL CAPS.

*/

public class IsTheStringUppercase {
    public static boolean isUpperCase(String s) {
      String j = s.replaceAll("[a-z]", "");
      return j.length() == s.length();
    }
}
/*------------------------------------------------------------------
public class Kata {
    public static boolean isUpperCase(String s) {
        return s.toUpperCase() == s;
    }
}
--------------------------------------------------------------------
interface Kata {
  static boolean isUpperCase(String s) {
    return s.toUpperCase().equals(s);
  }
}
--------------------------------------------------------------------
interface Kata {
  static boolean isUpperCase(String s) {
    return s.matches("[^a-z]*");
  }
}
--------------------------------------------------------------------
public class Kata {
    public static boolean isUpperCase(String s) {
      return (s.equals(s.toUpperCase()))?true:false;
    }
  }
--------------------------------------------------------------------
public class Kata {
  public static boolean isUpperCase(String s) {
    for (char character: s.toCharArray()) {
      if (character != ' ' && Character.isLowerCase(character)) {
        return false;
      }
    }
    return true;
  }
}
---------------------------------------------------------------------
public class Kata {
    public static boolean isUpperCase(String s)
    {
      int i = 0;
        int taille = s.length();
        boolean reponse = true;

        while (reponse == true && i<taille)
        {
            if (Character.isLetter(s.charAt(i)))
            {
                if(Character.isUpperCase(s.charAt(i)))
                {
                    i = i + 1;
                }
                else
                {
                    reponse = false;
                }
            }
            else
            {
                i = i + 1;
            }
        }
        return reponse;
    }
    
        
}
---------------------------------------------------------------------
public class Kata {

    public static boolean isUpperCase(String s) {
        // your code here
        Boolean isTrue = true;
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                isTrue = false;
            }
        }
        return isTrue;
    }
}
---------------------------------------------------------------------
public class Kata {
    public static boolean isUpperCase(String s) {
      return !s.chars()
        .mapToObj(c -> (char) c)
        .anyMatch(c -> Character.isLowerCase(c));
    }
}
---------------------------------------------------------------------
public class Kata {
    public static boolean isUpperCase(String s) {
        for(char c: s.toCharArray()){
          if(c != ' ' && Character.isLetter(c)){
            if(!Character.isUpperCase(c)){
              return false;
            }  
          }
        }
      return true;
    }
}
*/