/* 7KYU CodeWars Love vs Friendship

If　a = 1, b = 2, c = 3 ... z = 26

Then l + o + v + e = 54

and f + r + i + e + n + d + s + h + i + p = 108

So friendship is twice as strong as love :-)

Your task is to write a function which calculates the 
value of a word based off the sum of the alphabet 
positions of its characters.

The input will always be made of only lowercase letters 
and will never be empty.

*/

public class LoveVsFriendship {
  public static int wordsToMarks (String text) {
    String map = " abcdefghijklmnopqrstuvwxyz";
    int result = 0;
    for (char ch : text.toCharArray()) {
      result += map.indexOf(ch);
    }
    return result;
  }
}
/*---------------------------------------------------
interface LoveVsFriendship {
  static int wordsToMarks (String text) {
    return text.chars().reduce(0, (s, c) -> s + c - 96);
  }
}
-----------------------------------------------------
public class LoveVsFriendship {
  public static int wordsToMarks (String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return text.chars().map(c -> alphabet.indexOf(c) + 1).sum();
    }
}
-----------------------------------------------------
public class LoveVsFriendship {
    public static int wordsToMarks (String text) {
        return text.chars().map(c -> c - 'a' + 1).sum();
    }
}
-----------------------------------------------------
public class LoveVsFriendship {
  public static int wordsToMarks (String text) { 
    int res=text.length();
    for(char c :text.toCharArray()){  
      res+=c-'a';
    }
    return res;
  }
}
*/