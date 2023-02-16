/* 7KYU CodeWars Get The Middle Character

You are going to be given a word. Your job is to return the middle character 
of the word. If the word's length is odd, return the middle character. If the 
word's length is even, return the middle 2 characters.

#Examples:

Kata.getMiddle("test") should return "es"

Kata.getMiddle("testing") should return "t"

Kata.getMiddle("middle") should return "dd"

Kata.getMiddle("A") should return "A"
#Input

A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 
1000 in some test cases due to an error in the test cases). You do not need to test for 
this. This is only here to tell you that you do not need to worry about your solution 
timing out.

#Output

The middle character(s) of the word represented as a string.

*/

class Kata {
  public static String getMiddle(String word) {
    //Code goes here!
    if (word.length() < 2) {
      return word;
    }
    else if (word.length() % 2 == 0) {
      int x = word.length() / 2;
      int y = (word.length() / 2) + 1;
      return word.substring(x - 1,y);
     
    }
    else {
      int x = word.length() / 2;
      return word.substring(x,word.length() - x);
    }
  }
}
/*------------------------------------------------------------------------------------------
class Kata {
  public static String getMiddle(String word) {
    String s = "";
    int length = word.length();
    int half = length/2;

    if (length % 2 == 0) {
      
      s = word.substring(half - 1, half + 1);
      
    } else {
      
      s = word.substring(half, half + 1);
    
    }
    
    return s;
  }
}
---------------------------------------------------------------------------------------------
class Kata {
    public static String getMiddle(String word) {
        int length = word.length();
        return (length % 2 != 0) ?  String.valueOf(word.charAt(length / 2)) : word.substring(length / 2 - 1, length / 2 + 1);
    }
}
----------------------------------------------------------------------------------------------
class Kata {
  public static String getMiddle(String word) {
        int l = word.length();
        return word.substring(l / 2 - (1 - l % 2), l / 2 + 1);
  }
}
----------------------------------------------------------------------------------------------
class Kata {
  public static String getMiddle(String word) {
        int length = word.length();
        int mid = length / 2;
        boolean isEven = length % 2 == 0;
        return isEven ? word.substring(mid - 1, mid + 1) : 
                        String.valueOf(word.charAt(mid));
  }
}
----------------------------------------------------------------------------------------
class Kata {
  public static String getMiddle(String word) {
    int mi = word.length() / 2;
    return word.substring(mi - (word.length() % 2 == 0 ? 1 : 0), mi + 1);
  }
}

*/