/* 6KYU CodeWars Consonant Value

Given a lowercase string that has alphabetic characters only and no spaces, 
return the highest value of consonant substrings. Consonants are any letters 
of the alphabet except "aeiou".

We shall assign the following values: a = 1, b = 2, c = 3, .... z = 26.

For example, for the word "zodiacs", let's cross out the vowels. 
We get: "z o d ia c"

"zodiac" -> 26
The consonant substrings are: "z", "d" and "c" with values "z" = 26, "di" = 4 and "c" = 3. 
The highest is 26.

"strength" -> 57
The consonant substrings are: "str" and "ngth" with values "str" = 19 + 20 + 18 = 57 and
"ngth" = 14 + 7 + 20 + 8 = 49. The highest is 57.

For C: do not mutate input.

More examples in test cases. Good luck!

If you like this Kata, please try:

*/
import java.util.*;
public class ConsonantValue {
    public static int solve(String s) {
      s = s.replaceAll("a", " ");
      s = s.replaceAll("e", " ");
      s = s.replaceAll("i", " ");
      s = s.replaceAll("o", " ");
      s = s.replaceAll("u", " ");
      String[] words = s.split(" ");
      int result = Integer.MIN_VALUE;
      int temp = 0;
      HashMap<Character, Integer> map = new HashMap<>();
      map.put('b', 2);
      map.put('c', 3);
      map.put('d', 4);
      map.put('f', 6);
      map.put('g', 7);
      map.put('h', 8);
      map.put('j', 10);
      map.put('k', 11);
      map.put('l', 12);
      map.put('m', 13);
      map.put('n', 14);
      map.put('p', 16);
      map.put('q', 17);
      map.put('r', 18);
      map.put('s', 19);
      map.put('t', 20);
      map.put('v', 21);
      map.put('w', 22);
      map.put('x', 24);
      map.put('y', 25);
      map.put('z', 26);
      for (int i = 0; i < words.length; i++) {
        String bad = words[i];
        for (int l = 0; l < bad.length(); l++) {
          temp += map.get(bad.charAt(l));
        }
        if (temp > result) {
          result = temp;
          temp = 0;
        }
        temp = 0;
      }
      return result;
    }
}
/*--------------------------------------------------------------------------------
import static java.util.stream.Stream.of;
public class ConsonantValue {
    public static int solve(String s) {
        return of(s.split("[aeiou]")).mapToInt(result -> result.chars().map(ch -> ch - 96).sum()).max().orElse(0);
    }
}
----------------------------------------------------------------------------------
import java.util.stream.*;
import java.util.*;

public class ConsonantValue {
    public static int solve(final String s) {
        return  Arrays.stream(s.split("[aeiou]+"))
                .mapToInt(t->t.chars().sum()-t.length()*96)
                .max()
                .getAsInt();
    }
}
----------------------------------------------------------------------------------
public class ConsonantValue {
    public static int solve(final String s) {
        String s2 ="aeiou";
        int sum=0,x=0;
        for (int i = 0; i<s.length();i++){
            if(s2.contains(""+s.charAt(i))){
                sum=Math.max(sum,x);
                x=0;
            }
            else {
                x+=(int)s.charAt(i)-96;
            }
        }
        sum=Math.max(sum,x);
        return sum;
    }
}
----------------------------------------------------------------------------------
public class ConsonantValue {
  public static int solve(final String s) {
    String[] arr = s.split("[aeiou]");
    int max = 0;
    for (String s1 : arr) {
        int temp = getNumber(s1);
        if (temp > max) max = temp;
    }
    return max;
  }
  
  public static int getNumber(String str){
    if (str.equals("")) return 0;
    String line = "abcdefghijklmnopqrstuvwxyz";
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
        sum += line.indexOf(str.charAt(i)) + 1;
    }
    return sum;
  }
}
-----------------------------------------------------------------------------------
public class ConsonantValue {
    public static int solve(final String s) {
        int sum = 0, maxsum = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if ("aeiou".indexOf(c)>=0) sum = 0;
            else {
                sum += c-'a'+1;
                maxsum = Math.max(sum, maxsum);
            }
        }
        return maxsum;
    }
}
-----------------------------------------------------------------------------------
public class ConsonantValue {

    private static final String ALFA = " abcdefghijklmnopqrstuvwxyz";

    public static int solve(final String s) {
        int highestSubstringValue = 0;
        String[] subStringsOfConsonants = s.split("[aeiou]");

        for (String subString : subStringsOfConsonants) {
            int value = 0;

            for (char c : subString.toCharArray()) {
                value += ALFA.indexOf(c);
            }

            if (value > highestSubstringValue) {
                highestSubstringValue = value;
            }
        }

        return highestSubstringValue;
    }
}
-----------------------------------------------------------------------------------
import java.util.HashMap;

public class ConsonantValue {
  
  
   *
   * @param s is String
   * return int 
   
  public static int solve(final String s) {
    int highest = 0;
    
    // hashmap with corresponding numeric values for each English alphabet.
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('a', 1);
    map.put('b', 2);
    map.put('c', 3);
    map.put('d', 4);
    map.put('e', 5);
    map.put('f', 6);
    map.put('g', 7);
    map.put('h', 8);
    map.put('i', 9);
    map.put('j', 10);
    map.put('k', 11);
    map.put('l', 12);
    map.put('m', 13);
    map.put('n', 14);
    map.put('o', 15);
    map.put('p', 16);
    map.put('q', 17);
    map.put('r', 18);
    map.put('s', 19);
    map.put('t', 20);
    map.put('u', 21);
    map.put('v', 22);
    map.put('w', 23);
    map.put('x', 24);
    map.put('y', 25);
    map.put('z', 26);
    
    // splitting the string on vowels. 
    String[] consonantsArray = s.split("[aeiou]");
    
    // consonantsArray will only have a single consonants 
    // or consecutive multiple consonants based on iput string.
    for (String consonants : consonantsArray) {
      
      // intermediary will store the numeric sum of each string in consonantsArray.
      int intermediary = 0;
      
      for (int i = 0; i < consonants.length(); i++) {
        intermediary += map.get(consonants.charAt(i));
      }
      
      // update the highest value as per the intermediary.
      if (highest < intermediary) {
        highest = intermediary;
      }
      
    }
    return highest;
  }
}
-----------------------------------------------------------------------------------
import java.util.*;

public class ConsonantValue {
    public static int solve(final String s) {
        return Arrays.stream(s.split("[aeiou]")).mapToInt(str -> str.chars().map(x -> x - 'a' + 1).sum()).max().orElse(0);
    }
}
-----------------------------------------------------------------------------------
public class ConsonantValue {
    public static int solve(final String s){ 
       int max = 0; int sum = 0; 
       for (char c :s.toCharArray()){  
           int kotak = "aeiou".indexOf(c)==-1?1:0;
           sum=(sum+c-'a'+1)*kotak; 
           max=Math.max(max,sum);
       }
      return max;
    }
}
*/