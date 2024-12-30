/* 7KYU CodeWars Hungarian Vowel Harmony 

Vowel harmony is a phenomenon in some languages. It means that "A vowel or vowels in a word are changed to sound the same (thus "in harmony.")" (wikipedia). This kata is based on vowel harmony in Hungarian.

Task:
Your goal is to create a function dative() (Dative() in C#) which returns the valid form of a valid Hungarian word w in dative case i. e. append the correct suffix nek or nak to the word w based on vowel harmony rules.

Vowel Harmony Rules (simplified)
When the last vowel in the word is

a front vowel (e, é, i, í, ö, ő, ü, ű) the suffix is -nek
a back vowel (a, á, o, ó, u, ú) the suffix is -nak
Examples:
Kata.dative("ablak") == "ablaknak"
Kata.dative("szék") == "széknek"
Kata.dative("otthon") == "otthonnak"
Preconditions:
To keep it simple: All words end with a consonant :)
All strings are unicode strings.
There are no grammatical exceptions in the tests.



*/
public class HungarianVowelHarmony {
    public static String dative(String word) {
      String a = "nek";
      String b = "nak";
      for (int i = word.length() - 1; i >= 0; i--) {
        char ch = word.charAt(i);
        if (ch == 'e' || ch == 'é' || ch == 'i' || ch == 'í' || ch == 'ö' || ch == 'ő' || ch == 'ü' || ch == 'ű') {
          return word + a;
        }
        if (ch == 'a' || ch == 'á' || ch == 'o' || ch == 'ó' || ch == 'u' || ch == 'ú') {
          return word + b;
        }
      }
      return word;
    }
}
/*------------------------------------------------------------------------------
public class Kata {
    public static String dative(String word) {
        String w1 = word.replaceAll("[eéiíöőüű]","1");
        String w2 = word.replaceAll("[aáoóuú]","2");
        return w1.lastIndexOf("1")>w2.lastIndexOf("2")? word+"nek":word+"nak";
    }
}
--------------------------------------------------------------------------------
public class Kata {
    public static String dative(String word) {
        for (int i = word.length() - 1; i >= 0; i--)
        {
            if ("eéiíöőüű".indexOf(word.charAt(i)) > -1)
            {
                return word + "nek";
            }
            if ("aáoóuú".indexOf(word.charAt(i)) > -1)
            {
                return word + "nak";
            }
        }
        return word;
    }
}
--------------------------------------------------------------------------------
public class Kata {
    public static String dative(String word) {
        return word + (word.replaceAll("[^aáoóuúeéiíöőüű]", "").replaceAll("[aáoóuú]", ">").replaceAll("[eéiíöőüű]", "<").matches(".*>$") ? "nak" : "nek");
    }
}
--------------------------------------------------------------------------------
public class Kata {
    static final String w1 = "eéiíöőüű";
    static final String w2 = "aáoóuú";
    
    public static String dative(String word) {
      for (int i = word.length() - 1; i >= 0; i--)
      {
        if (w1.indexOf(word.charAt(i)) >= 0) return word + "nek";
        if (w2.indexOf(word.charAt(i)) >= 0) return word + "nak";
      }
      return word;
    }
}
--------------------------------------------------------------------------------
public class Kata {
  
  private static String frontVowel = "eéiíöőüű";
  private static String backVowel = "aáoóuú";

    public static String dative(String word) {
        for(int i=word.length()-1; i>=0;i--){
          if(frontVowel.contains(""+word.charAt(i)))return word + "nek";
          if(backVowel.contains(""+word.charAt(i)))return word + "nak";
        }
        return word;
    }
}
----------------------------------------------------------------------------------
public class Kata {
    public static String dative(String word) {
        String suffix = "";
        for (int i = word.length() - 1; i > -1; i--) {
            if ((suffix = getSuffix(word.charAt(i))) != null) { break; }
        }
        return String.join("", word, suffix);
    }
    private static String getSuffix(char c) {
        return switch (c) {
            case 'e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű'-> "nek";
            case 'a', 'á', 'o', 'ó', 'u', 'ú' -> "nak";
            default -> null;
        };
    }
}    
*/
