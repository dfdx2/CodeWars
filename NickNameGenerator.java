/*   Nickname Generator

Write a function, nicknameGenerator that takes a string name as an argument
and returns the first 3 or 4 letters as a nickname.

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
Input will always have the first letter capitalised and the rest lowercase (e.g. Sam).
The input can be modified
*/


class NickNameGenerator {
      public static String nickname (String name) {
      

        if (name.length() < 4) {
          return ("Error: Name too short");
        }
        else if(name.charAt(2) == 'a'|| name.charAt(2) == 'e'|| name.charAt(2) == 'i' || name.charAt(2) == 'o' || name.charAt(2) == 'u') {
          return name.substring(0,4);
        }
        else {
          return name.substring(0,3);
        }
      }
}
/*______________________________________________________________________________________
 * class Generator {
    private static final String VOWELS = "aeiou";

    static String nickname(final String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        return VOWELS.indexOf(name.charAt(2)) != -1 ?
            name.substring(0, 4) : name.substring(0, 3);
    }
}
 *_______________________________________________________________________________________ 
 * 
 * class Generator {
    public static String nickname (String name) {
      if(name.length() < 4) return "Error: Name too short";
      return name.matches("^.{2}[euoai].+$") ? name.substring(0, 4) : name.substring(0, 3);
    }
}
 * ___________________________________________________________________________________________
 * 
 * class Generator {
  public static String nickname (String s) {
    return s.length() < 4 ? "Error: Name too short" : s.substring(0,  (""+s.charAt(2)).matches("[aeiou]") ? 4 : 3);
  }
}
 *  
 */