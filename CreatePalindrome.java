/* 7KYU CodeWars Create Palindrome

Consider the string "adfa" and the following rules:

a) each character MUST be changed either to the one before 
or the one after in alphabet. 

b) "a" can only be changed to "b" and "z" to "y". 

From our string, we get:

"adfa" -> ["begb","beeb","bcgb","bceb"]

Here is another example: 

"bd" -> ["ae","ac","ce","cc"]

--We see that in each example, one of the outcomes is a palindrome. 
That is, "beeb" and "cc".

You will be given a lowercase string and your task is to return True 
if at least one of the outcomes is a palindrome or False otherwise.

*/
import static java.util.stream.IntStream.range;
class CreatePalindrome{
    public static boolean solve(String st) {
      return range(0, st.length() / 2).map(i -> Math.abs(st.charAt(i) - st.charAt(st.length() - 1 - i))).allMatch(d -> d < 1 || d == 2);
    }
}
/*-------------------------------------------------------------
class Solution{
    public static boolean solve(String st) {
        for (int i = 0; i < st.length() / 2; i++) {
            int x = (int) st.charAt(i) - (int) st.charAt(st.length() - 1 - i);
            if (x != 0 && Math.abs(x) != 2) 
                return false;            
        }
        return true;
    }
}
--------------------------------------------------------------
import java.util.ArrayList;

class Solution{
    public static boolean solve(String st) {
      return isPalindrome(st);
    };
  
    private static ArrayList<Integer> returnIndexArray(char character){
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      
      int initialCharIndex = alphabet.indexOf(character);
      ArrayList<Integer> indexArray = new ArrayList<Integer>();
      
      if (initialCharIndex == 0){
        indexArray.add(1);
      } else if (initialCharIndex == 25) {
        indexArray.add(24);
      } else {
        indexArray.add(initialCharIndex + 1);
        indexArray.add(initialCharIndex - 1);
      } 
      
      return indexArray;
    }
    
    private static boolean isPalindrome(String st){  
      for(int i = 0; i < st.length() / 2; i++){
        ArrayList<Integer> firstIndexArray = returnIndexArray(st.charAt(i));  
        ArrayList<Integer> lastIndexArray = returnIndexArray(st.charAt(st.length() - 1 - i));
        
        boolean result = false;
        for(int j = 0; j < firstIndexArray.size(); j++){
          if (lastIndexArray.contains(firstIndexArray.get(j))){
            result = true;
            break;
          }          
        } //closes inner for loop
        if (!result) {return false;};
      } //closes outer for loop
      return true;
    }
}
---------------------------------------------------------------
import java.util.stream.IntStream;

interface Solution {
  static boolean solve(String st) {
    int stLength = st.length();
    return IntStream.range(0, stLength / 2)
      .map(i -> Math.abs(st.charAt(i) - st.charAt(stLength - 1 - i)))
      .allMatch(d -> d == 0 || d == 2);
  }
}
---------------------------------------------------------------
class Solution {
  public static boolean solve(String s) {
    for (int i = 0, j = s.length() - 1, d; i < j; i++, j--)
      if ((d = Math.abs(s.charAt(i) - s.charAt(j))) != 0 && d != 2) return false;
    return true;
  }
}
---------------------------------------------------------------
class Solution{
    public static boolean solve(String st) {
        int strLength = st.length() ;
      
        for (int i =0; i< strLength/2; i++) {
            if (st.charAt(i)==st.charAt(strLength-1-i) 
                || st.charAt(i)-st.charAt(strLength-1-i)==2 || st.charAt(i)-st.charAt(strLength-1-i)==-2) {
                continue ;
            } else return false ;
        }
      return true ;
    }
}
---------------------------------------------------------------
class Solution {
  public static boolean solve(String st) {
    char arr[] = st.toCharArray();
    for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
      int diff = Math.abs(arr[i] - arr[j]);
      if (diff != 0 && diff != 2) return false;
    }
    return true;
  }
}
--------------------------------------------------------------
class Solution{
    	public static boolean solve(String st) {
		char chrStart = ' ', chrFin = ' ';

		for (int i = 0; i < st.length() / 2; i++) {
			chrStart = st.charAt(i);
			chrFin = st.charAt(st.length() - i - 1);

			if (chrStart != chrFin && !comprobe(chrStart, chrFin))
				return false;
		}

		return true;
	}

	public static boolean comprobe(char chrStart, char chrFin) {
		char[] chrFirst = transformChr(chrStart);
		char[] chrLast = transformChr(chrFin);

		for (int i = 0; i < chrFirst.length; i++)
			for (int j = 0; j < chrLast.length; j++)
				if (chrFirst[i] == chrLast[j])
					return true;

		return false;
	}

	public static char[] transformChr(char chrLetter) {
		switch (chrLetter) {
		case 'a' -> {
			return new char[] { 'b' };
		}
		case 'z' -> {
			return new char[] { 'y' };
		}
		default -> {
			return new char[] { (char) (chrLetter + 1), (char) (chrLetter - 1) };
		}
		}
	}
}
--------------------------------------------------------------
class Solution{
    public static boolean solve(String st) {
        int stLength = st.length();
        for (int i = 0; i < stLength / 2; i++) {
          char iChar = st.charAt(i);
          char iCharFromEnd = st.charAt(stLength - 1 - i);
            if (iChar != iCharFromEnd
                && iChar != iCharFromEnd - 2
                && iChar != iCharFromEnd + 2) {
              return false;
            }
        }
        return true;
    }
}
*/
