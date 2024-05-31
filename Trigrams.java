/* 7KYU CodeWars Trigrams

Trigrams are a special case of the n-gram, where n is 3. 
One trigram is a continous sequence of 3 chars in phrase. Wikipedia

return all trigrams for the given phrase
replace spaces with underscore (_)
return an empty string for phrases shorter than 3
Example:

"the quick red" --> "the he_ e_q _qu qui uic ick ck_ k_r _re red"

*/

public class Trigrams {
	public static String trigrams(String phrase) {
    StringBuilder sb = new StringBuilder();
    phrase = phrase.replace(" ", "_");
    for (int i = 0; i < phrase.length() - 2; i++) {
      sb.append(phrase, i, i + 3).append(" ");
    }
    return sb.toString().trim();
  }
}
/*------------------------------------------------------
public class Trigrams {
	public static String trigrams( String phrase ) {
		 String ans = "";
     phrase = phrase.replace(" ","_");
     for (int i = 0; i < phrase.length() - 2; i++) ans += phrase.substring(i,i+3) + " ";
     return ans.trim();
	}
}
--------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Trigrams {
	public static String trigrams(String phrase) {
		 return nGrams(phrase, 3);
	}
  
  public static String nGrams(String phrase, int n) {
    if(phrase.length() < n) {
      return "";
    }
    
    return IntStream.range(0, phrase.length() - n + 1)
                    .mapToObj(i -> phrase.substring(i, i + n))
                    .map(s -> s.replace(" ", "_"))
                    .collect(Collectors.joining(" "));
  }
}
--------------------------------------------------------
public class Trigrams {
	public static String trigrams( String phrase ) {
		 if(phrase.length() < 3) {
       return "";
     }
     StringBuilder sb = new StringBuilder();
     for(int i = 0; i < phrase.length()-2; i++) {
       sb.append(phrase.substring(i, i+3).replaceAll(" ", "_") + " ");
     }
     return sb.toString().trim();
	}
}
--------------------------------------------------------
public class Trigrams {
	public static String trigrams( String phrase ) {
		 phrase = phrase.replace(" ", "_");
     String trigrams = "";
     
     for (int i = 0; i < phrase.length() - 2; i++){
       if (i != 0){
         trigrams += " ";
       }
       trigrams += phrase.substring(i, i + 3);
     }
     
     return trigrams;
	}
}
*/