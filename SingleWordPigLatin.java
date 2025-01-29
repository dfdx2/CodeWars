/* 6KYU CodeWars Single Word Pig Latin

Pig Latin is an English language game where the goal is to hide the meaning of a word from people not aware of the rules.

So, the goal of this kata is to wite a function that encodes a single word string to pig latin.

The rules themselves are rather easy:

The word starts with a vowel(a,e,i,o,u) -> return the original string plus "way".

The word starts with a consonant -> move consonants from the beginning of the word to the end of the word until the first vowel, then return it plus "ay".

The result must be lowercase, regardless of the case of the input. If the input string has any non-alpha characters, the function must return None, null, Nothing (depending on the language).

The function must also handle simple random strings and not just English words.

The input string has no vowels -> return the original string plus "ay".

For example, the word "spaghetti" becomes "aghettispay" because the first two letters ("sp") are consonants, so they are moved to the end of the string and "ay" is appended.

*/

public class SingleWordPigLatin{
 
   public String translate(String str){
     str = str.toLowerCase();
     String temp = str.replaceAll("[A-Za-z]", "");
     if (temp.length() > 0) {
       return null;
     }
     String ball = str.replaceAll("[aeiou]", "");
     if (ball.length() == str.length()) {
       return str + "ay";
     }
     char ch = str.charAt(0);
     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
       return str + "way";
     }
     int counter = 0;
     for (int i = 0; i < str.length(); i++) {
       char ct = str.charAt(i);
       if (ct == 'a' || ct == 'e' || ct == 'i' || ct == 'o' || ct == 'u') {
         counter = i;
         break;
       }
     }
     String front = str.substring(0, counter);
     String back = str.substring(counter, str.length());
     return back + front + "ay";
     
   }
   
}
/*-----------------------------------------------------------------
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PigLatin{
 
  public String translate(String str){
    if (str == null) return null;
    
    str = str.toLowerCase();
    
    if (containsNonAlpha(str)) return null;
    if (startsWithVowel(str)) return str + "way";
    
    // Starts with consonant
    Matcher m = Pattern.compile("[^aeiou]+").matcher(str);
    m.find();
    String end = m.group();
    return str.substring(end.length(), str.length()) + end + "ay";
  }
  
  private boolean containsNonAlpha(String str) {
    return str.matches("[a-z]*[^a-z]+.*");
  }
  
  private boolean startsWithVowel(String str) {
    return str.matches("[aeiou].*");
  }
}
-------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;

public class PigLatin {

    private List<String> vowels = Arrays.asList(new String[]{"a", "e", "i", "0", "u"});

    public String translate(String str) {

        str = str.toLowerCase();

        if (hasNonAlphaChar(str)) {
            return null;
        }

        if(hasNoVowels(str)){
            return str + "ay";
        }

        if (startsWithAVowel(str)) {
            return str + "way";
        }

        do {
            str = moveFirstLetterToTheEnd(str);
        } while (startsWithAConsonant(str));

        return str + "ay";
    }

    private String moveFirstLetterToTheEnd(String str) {
        return str.substring(1) + str.substring(0, 1);
    }

    private boolean hasNoVowels(String str) {
        return str.chars().mapToObj(c -> Character.toString((char) c)).noneMatch(vowels::contains);
    }

    private boolean hasNonAlphaChar(String str) {
        return str.toLowerCase().chars().anyMatch(value -> value < 97 || value > 122);
    }

    private boolean startsWithAVowel(String str) {
        return vowels.contains(str.toLowerCase().substring(0, 1));
    }

    private boolean startsWithAConsonant(String str) {
        return !startsWithAVowel(str);
    }
}
-------------------------------------------------------------------
class PigLatin {
  static String translate(String s) {
    return (s = s.toLowerCase()).matches("[aeiou][a-z]*") ? s + "way" : s.matches("[a-z]*") ? s.replaceAll("^([^aeiou]*)(.*)","$2$1ay") : null;
  }
}

-------------------------------------------------------------------
public class PigLatin{
 
   public String translate(String str){
    int i;
		String result = "";
		str = str.toLowerCase();
		if(!str.matches("^[a-z]++$")){
			return null;
		}
		if(str.matches("^[aeiou].+$")){
			result = str + "way";
		}else if(str.matches("^[^aeiou].+$")){
			for(i=0; i<str.length(); i++){
				if(str.substring(0, i+1).matches("^[^aeiou]+[aeiou]$")){
					result = str.substring(i, str.length()) + str.substring(0, i) + "ay";
					break;
				}
			}
			if(i == str.length()){
				result = str + "ay";
			}
		}
		return result;
   }
   
 }
-------------------------------------------------------------------
 public class PigLatin{
 
   public String translate(String str){
     if (str == null || str.equals("") || str.contains("0") ||
         str.contains("1") ||  str.contains("2") || 
         str.contains("3") ||  str.contains("4") || 
         str.contains("5") ||  str.contains("6") || 
         str.contains("7") ||  str.contains("8") || 
         str.contains("9")){
       return null;
     }
     if (str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("u") || str.startsWith("o")){
       return (str + "way").toLowerCase();
     }
     else{
       var dupe = str.substring(1) + str.substring(0, 1).toLowerCase();
       for (var x = 0; x < dupe.length()+2; x++){
         if (dupe.startsWith("a") || dupe.startsWith("e") || dupe.startsWith("i") || dupe.startsWith("o") || dupe.startsWith("u")){
           return dupe + "ay";
         }
         dupe = dupe.substring(1) + dupe.substring(0, 1).toLowerCase();
       }
       return dupe+"ay";
     }
   }
   
 }

*/