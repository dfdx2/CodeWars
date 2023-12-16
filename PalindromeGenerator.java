/* CodeWars Palindrome-Generator

Definition: "A palindrome is a word, phrase, number, or other sequence 
of characters which reads the same backward or forward." - 
en.wikipedia.org/wiki/Palindrome

Task: Check if the given word is a palindrome. If it's not, generate a 
palindrome from the given word by adding its reverse as a suffix.

When checking if a word is a palindrome, ignore case, but when generating 
a palindrome, them preserver case.

Don't worry about the inputs, they will always be valid.

Example 1: "otto":

  PalindromeGenerator.isPalindrome("otto") -> true
  PalindromeGenerator.generateString("otto") -> "otto"

Example 2: "Otto":

  PalindromeGenerator.isPalindrome("Otto") -> true
  PalindromeGenerator.generateString("Otto") -> "Otto"

Example 3: "noob"
  PalindromeGenerator.isPalindrome("noob") -> false
  PalindromeGenerator.generateString("noob") -> "noobboon"

Example 4: "Bump"

  PalindromeGenerator.isPalindrome("Bump") -> false
  PalindromeGenerator.generateString("Bump") -> "BumppmuB"

Example 3: aba stays also aba

Good Luck!

*/

public class PalindromeGenerator {
	
	public boolean isPalindrome(String word) {
		String words = word.toLowerCase();
    int i = 0;
    int j = words.length() - 1;
    while (i < j) {
      if (words.charAt(i) == words.charAt(j)) {
        i++;
        j--;
      }
      else if (i == j) {
        break;
      }
      else {
        return false;
      }
    }
    return true;
	}
	
	public String generateString(String word) {
		if (isPalindrome(word) == false) {
      StringBuilder sb = new StringBuilder(word);
      sb.reverse();
      String x = sb.toString();
      return word + x;
    }
    return word;
	}
}
/*----------------------------------------------------------------------------
public class PalindromeGenerator {
  
  public boolean isPalindrome(String word) {
   return word.toLowerCase().equals(new StringBuffer(word.toLowerCase()).reverse().toString());
  }
  
  public String generateString(String word) {
    if (isPalindrome(word))
      return word;
    return word + new StringBuffer(word).reverse().toString();
  }
}
------------------------------------------------------------------------------
public class PalindromeGenerator {
	
	public boolean isPalindrome(String w)  { return w.equalsIgnoreCase(getRev(w)); }
	
	public String generateString(String w) { return isPalindrome(w) ? w : w+getRev(w); }
  
  private String getRev(String w)        { return new StringBuilder(w).reverse().toString(); }
}
------------------------------------------------------------------------------
public class PalindromeGenerator {
	  public static boolean isPalindrome(String word) {
        return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
    }
    public static String generateString(String word) {
        for(int i = 0; i < word.length(); i++){
            String tempString = word + word.substring(0, i);
            if (isPalindrome(tempString)) return tempString;
        }
        return word + new StringBuilder(word).reverse();
    }
}
------------------------------------------------------------------------------
class PalindromeGenerator {
  static boolean isPalindrome(String word) {
    return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
  }

  static String generateString(String word) {
    return word + new StringBuilder(isPalindrome(word) ? "" : word).reverse().toString();
  }
}
-------------------------------------------------------------------------------
public class PalindromeGenerator {
	
	public boolean isPalindrome(String word) {
    int wordLength = word.length();
    int halfOfLength = wordLength / 2;
    word = word.toLowerCase();
    
    label1: 
    for(int i = 0; i <= halfOfLength; i++){
      if(word.charAt(i) == word.charAt(wordLength - 1 - i)){
        continue label1;
      }else return false;
    }
		return true;
	}
	
	public String generateString(String word) {
		if(isPalindrome(word)){
      return word;
    } else {
      String s = "";
      int wordLength = word.length();
      for(int i = 0; i < wordLength; i++){
        char c = word.charAt(wordLength - 1 - i);
        s = s.concat(String.valueOf(c));
      }
      word += s;
    }
    return word;
    
	}

}
-------------------------------------------------------------------------------
public class PalindromeGenerator {
	
	  public boolean isPalindrome(String word) {
			return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
		}
		
		public String generateString(String word) {
			if(isPalindrome(word)) return word;
			else return word + new StringBuilder(word).reverse().toString();
		}

}
*/