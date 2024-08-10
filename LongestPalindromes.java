/* 6KYU CodeWars Longest Palindrome

Longest Palindrome

Find the length of the longest substring in the given string s 
that is the same in reverse.

As an example, if the input was “I like racecars that go fast”, 
the substring (racecar) length would be 7.

If the length of the input string is 0, the return value must be 0.

Example:

"a" -> 1 
"aab" -> 2  
"abcde" -> 1
"zzbaabcd" -> 4
"" -> 0

*/

public class LongestPalindromes {
    public static int longestPalindrome(final String s) {
      int result = 0;
      for (int i = s.length(); i > result; i--) {
        for (int j = 0; j <= s.length() - i; j++) {
          String a = s.substring(j, j + i);
          if (new StringBuilder(a).reverse().toString().equals(a)) {
            result = i;
            break;
          }
        }
      }
      return result;
    }
}
/*--------------------------------------------------------------------
public class Palindromes {
  public static int longestPalindrome(final String s) {
    int max = 0, slen = s.length();
    for (int len = slen; len > max; len--) {
      for (int i = 0; i + len <= slen; i++) {
        String sub = s.substring(i,i+len);
        if (new StringBuilder(sub).reverse().toString().equals(sub)) { max = len; break; }
      }
    }    
    return max;
  }
}
----------------------------------------------------------------------
public class Palindromes {
    public static int longestPalindrome(final String s) {
        for (int length = s.length(); length > 0; length--)
            for (int index = 0; index < s.length() - length + 1; index++)
                if (isPalindrome(s.substring(index, index + length)))
                    return length;
        return 0;
    }
    
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
----------------------------------------------------------------------
public class Palindromes {
    public static int longestPalindrome(final String s) {
        // 从最长的子串开始找，若果满足正序和倒序相同，则返回该子串的长度
        int length = 0;
        for (int subLength = s.length(); subLength > 0; subLength--) {
            for (int startIndex = 0; startIndex+subLength <= s.length(); startIndex++) {
                String sub = s.substring(startIndex, startIndex+subLength);
                if(new StringBuilder(sub).reverse().toString().equals(sub)){
                   return sub.length();
                }
            }
        }
        return length;
    }
}
----------------------------------------------------------------------
public class Palindromes {
  public static int longestPalindrome(final String s) {
    int max = 0;
    for (int i=0; i<s.length(); i++) {
      for (int j=i+1; j<=s.length(); j++) {
          if (s.substring(i, j).equals(new String(new StringBuilder(s.substring(i, j)).reverse()))) {
              if (s.substring(i, j).length() > max)
                 max = s.substring(i, j).length();
         }
      }
    }
    return max;
  }
}
----------------------------------------------------------------------
public class Palindromes {
    public static int longestPalindrome(final String s) {
        int m = 0;
        for (int i = 0; i < s.length(); ++i) {
            for (int j = i + 1; j <= s.length(); ++j) {
                final String sub = s.substring(i, j);
                if (new StringBuilder(sub).reverse().toString().equals(sub) && j - i > m) m = j - i; 
            }
        }
        return m;
    }
}
----------------------------------------------------------------------
public class Palindromes {
    public static int longestPalindrome(final String s) {
        if(s == null || s.length() < 2) return s.length();
        int n = s.length(), left = 0, right = 0;
        boolean[][] dp = new boolean[n][n];
        // dp[i][j] -> s[i..j] is palindrome
        // if dp[i] == dp[j] and dp[i+1][j-1] = true 
        // bottom-up, right-left
        for(int j = 1; j < n; j++){
            for(int i = 0; i < j; i++){
                if((dp[i+1][j-1] == true || (j-i)<=2) && s.charAt(i) == s.charAt(j)){
                    dp[i][j] = true;
                    if(j-i > right-left){
                       left = i;
                       right = j;
                    }
                }
            }
        }
        return s.substring(left, right+1).length();
    }
}
----------------------------------------------------------------------
import java.util.*;

public class Palindromes {
  public static int longestPalindrome(final String s) {
    int maxi = s.isEmpty() ? 0 : 1;
    for (int i = 0; i < s.length() - 1; i++) {
      String simplePalindromeStart = reverse(s.substring(0, i)),
      simplePalindromeEnd = s.substring(i+1),
      doublePalindromeStart = reverse(s.substring(0, i+1)),
      doublePalindromeEnd = s.substring(i+1);
      maxi = Math.max(maxi,
                      Math.max(1 + longestPalindrome(simplePalindromeStart, simplePalindromeEnd),
                               longestPalindrome(doublePalindromeStart, doublePalindromeEnd)));
    }
    return maxi;
  }
  
  private static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }
  
  private static int longestPalindrome(String start, String end) {
    int maxi, size = Math.min(start.length(), end.length());
    for (maxi = 0; maxi < size; maxi++)
      if (start.charAt(maxi) != end.charAt(maxi))
        return 2 * maxi;
    return 2 * maxi;
  }
}
*/