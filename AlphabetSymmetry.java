/* 7KYU CodeWars Alphabet Symmetry

Consider the word "abode". We can see that the letter a is 
in position 1 and b is in position 2. In the alphabet, a and 
b are also in positions 1 and 2. Notice also that d and e in 
abode occupy the positions they would occupy in the alphabet, 
which are positions 4 and 5.

Given an array of words, return an array of the number of 
letters that occupy their positions in the alphabet for each 
word. For example,

solve(["abode","ABc","xyzD"]) = [4, 3, 1]
See test cases for more examples.

Input will consist of alphabet characters, both uppercase and 
lowercase. No spaces.

Good luck!


*/
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;

public class AlphabetSymmetry {
  public static int[] solve(String[] arr) {
    return of(arr).mapToInt(s -> (int) range(0, s.length()).filter(i -> i == s.toUpperCase().charAt(i) - 65).count()).toArray();
  }
}

/*----------------------------------------------------------------
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution{
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static int countLetters(String str) {
        return IntStream.range(0, str.length()).filter(i -> alphabet.indexOf(str.charAt(i)) == i).toArray().length;
    }

    public static int[] solve(String[] arr){
        return Stream.of(arr).map(String::toLowerCase).mapToInt(Solution::countLetters).toArray();
    }
}
------------------------------------------------------------------
public class Solution{
    public static int[] solve(String[] arr){
        int[] numbers = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            String aux = arr[i].toLowerCase();
            int cont = 0;
            for (int j = 0; j < aux.length(); j++) {
                if ((aux.charAt(j) - 97) == j) {
                    cont++;
                }
            }
            numbers[i] = cont;
        }
        return numbers;
    }
}
------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
  public static int[] solve(String[] arr){
    return Arrays.stream(arr)
                 .mapToInt(Solution::numAlphabetPositionMatches)
                 .toArray();
  }
  
  private static int numAlphabetPositionMatches(String str) {
    return (int)IntStream.range(0, Math.min(str.length(), 26))
                         .filter(i -> (i + 'a') == Character.toLowerCase(str.charAt(i)))
                         .count();
  }
}
------------------------------------------------------------------
import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;

class Solution {
  static int[] solve(String[] arr) {
    return of(arr).mapToInt(s -> (int) range(0, s.length()).filter(i -> i == s.toUpperCase().charAt(i) - 65).count()).toArray();
  }
}
------------------------------------------------------------------
public class Solution {
  
  public static int[] solve(String[] arr) {
    int ret[] = new int[arr.length], r = 0;
    for (String word : arr) {
      word = word.toLowerCase();
      int n = 0, i = 0;
      for (char c : word.toCharArray()) if (c == 'a' + i++) n++;
      ret[r++] = n;
    }
    return ret;
  }
  
}
-------------------------------------------------------------------
public class Solution{
    public static int[] solve(String[] arr){
      int[] intarr = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
          for(int j=0; j<arr[i].length();j++)
          {
            if(Character.getNumericValue(arr[i].charAt(j))-10==j)
              intarr[i]++;
          }
        }
        return intarr;
    }
}

-------------------------------------------------------------------
public class Solution{
    public static int[] solve(String[] arr){
        // do your thing
        return java.util.Arrays.stream(arr).mapToInt(s -> (int)java.util.stream.IntStream.range(0, s.length()).filter(i -> Character.toLowerCase(s.charAt(i)) - 'a' == i).count()
        ).toArray();
    }
}
*/