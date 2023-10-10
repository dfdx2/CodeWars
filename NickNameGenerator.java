/* 7KYU Nickname Generator

Nickname Generator

Write a function, nicknameGenerator that takes a string name as an 
argument and returns the first 3 or 4 letters as a nickname.

If the 3rd letter is a consonant, return the first 3 letters.

nickname("Robert") //=> "Rob"
nickname("Kimberly") //=> "Kim"
nickname("Samantha") //=> "Sam"
If the 3rd letter is a vowel, return the first 4 letters.

nickname("Jeannie") //=> "Jean"
nickname("Douglas") //=> "Doug"
nickname("Gregory") //=> "Greg"
If the string is less than 4 characters, return "Error: Name too short".

Notes:

Vowels are "aeiou", so discount the letter "y".
Input will always be a string.
Input will always have the first letter capitalised and the rest 
lowercase (e.g. Sam).
The input can be modified

*/
class Generator {
      public static String nickname (String name) {
        if (name.length() < 4) {
          return "Error: Name too short";
        }
        String x = name.substring(0,3);
        String y = name.substring(0,4);
        char ch = name.charAt(2);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          return y;
        }
        else {
          return x;
        }
      }
}
/*--------------------------------------------------------------------------
class Generator {
    private static final String VOWELS = "aeiou";

    static String nickname(final String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        return VOWELS.indexOf(name.charAt(2)) != -1 ?
            name.substring(0, 4) : name.substring(0, 3);
    }
}
----------------------------------------------------------------------------
class Generator 
{
      public static String nickname (String name) 
      {
          char word_char[] = name.toCharArray();
          String result = "";
        
          if(word_char.length >= 4)
          {
            switch(word_char[2])
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    result = name.substring(0, 4);
                break;
                default:
                    result = name.substring(0, 3);
                break;
            }
          }
          else
          {
              result = "Error: Name too short";
          }
        
          return result;
      }
}
---------------------------------------------------------------------------
class Generator {
    public static String nickname (String name) {
      if(name.length() < 4) return "Error: Name too short";
      return name.matches("^.{2}[euoai].+$") ? name.substring(0, 4) : name.substring(0, 3);
    }
}
-----------------------------------------------------------------------------
class Generator {
  public static String nickname (String s) {
    return s.length() < 4 ? "Error: Name too short" : s.substring(0,  (""+s.charAt(2)).matches("[aeiou]") ? 4 : 3);
  }
}
-------------------------------------------------------------------------------
class Generator {
      public static String nickname (String name) {
      // your code goes here
        if(name.length() < 4){
          return "Error: Name too short";
        }else if(name.charAt(2)=='a'||name.charAt(2)=='e'||name.charAt(2)=='i'||name.charAt(2)=='o'||name.charAt(2)=='u'){
          return name.substring(0,4);
        }else{
          return name.substring(0,3);
        }
      }
}
------------------------------------------------------------------------------
import java.util.Optional;

class Generator {
  public static String nickname (String name) {
    return Optional.ofNullable(name)
                   .filter(n -> n.length() >= 4)
                   .map(n -> "aeiou".contains(n.substring(2, 3)) ? n.substring(0, 4) : n.substring(0, 3))
                   .orElse("Error: Name too short");
  }
}
------------------------------------------------------------------------------
class Generator {
      public static String nickname (String name) {
      
      
      if(name.length() < 4){
            return "Error: Name too short";
        }

        return String.valueOf(name.charAt(2))
                .matches("[aeiou]") ?
                name.substring(0,4) :
                name.substring(0,3);
      
      }
}



*/