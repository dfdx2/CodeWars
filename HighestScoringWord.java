/* 6KYU CodeWars Highest Scoring Word

Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in 
the alphabet: a = 1, b = 2, c = 3 etc.

For example, the score of abad is 8 (1 + 2 + 1 + 4).

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest 
in the original string.

All letters will be lowercase and all inputs will be valid.

*/
import java.util.*;
public class HighestScoringWord {
  public static String high(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int score = 0;
    String result = "";
    s = s.toLowerCase();
    String[] rest = s.split(" ");
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
    for (String tmp : rest) {
      int temp = 0;
      for (int i = 0; i < tmp.length(); i++) {
        temp += map.get(tmp.charAt(i));
      }
      if (temp > score) {
        result = tmp;
        score = temp;
      }
    }
    return result;
  }
}
/*--------------------------------------------------------------------
public class Kata {

    public static String high(String s) {
      int result = 0;
      String topWord = "";
      for (String word : s.split(" ")) {
        int x = 0;
        for (char ch : word.toCharArray()) {
          x += ch - 'a' + 1;
        }
        if (x > result) {
          result = x;
          topWord = word;
        }
      }
      return topWord;
    }
}
-------------------------------------------------------------------------
public class Kata {

  public static String high(String s) {
    
    String winner = "";
    int highScore = 0;
    
    for (String word : s.split(" ")) {
        int score = 0;
        for (char c : word.toCharArray()) {
          score += c - 'a' + 1;
        }
        if (score > highScore) {          
          winner = word;
          highScore = score;
        }
    }
    
    return winner;
  }

}
---------------------------------------------------------------------------------
import java.util.*;

public class Kata {
  public static String high(String s) {
    return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(
                        a -> a.chars().map(i -> i - 96).sum()
                )).get(); 
  }
}
-----------------------------------------------------------------------------
public class Kata {


    public static String high(String str) {
        String[] words = str.split(" ");
        String max = words[0];
        for (String word : words) {
            if (getScore(word) > getScore(max)) {
                max = word;
            }
        }
        return max;
    }

    private static int getScore(String word) {
        char[] chars = word.toCharArray();
        int sum = 0;
        for (char symbol : chars) {
            sum += (int) symbol - 96;
        }
        return sum;
    }
}
--------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

public class Kata {

  public static String high(String s) {
    return Arrays.stream(s.split(" "))
            .sorted(Comparator.comparingInt(Kata::calculateWordScore).reversed())
            .findFirst().get();
  }

  private static int calculateWordScore(String word) {
    return word.chars().map(c -> c - (int)'a' + 1).sum();
  }
}
------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;

public class Kata {

  public static String high(String s) {
    return Arrays.stream(s.toLowerCase().split(" "))
        .max(Comparator.comparingInt((String w) -> w.chars().map(c -> c - 96).sum()))
        .get();
  }

}
--------------------------------------------------------------------------
public class Kata {

  public static String high(String s) {
    String hs_string = "";
    int hs = 0;
    String[] words = s.split(" ");
    
    for (String ss:words) {
      int current_hs = 0;
      for (int i = 0; i < ss.length(); i++) {
        switch (String.valueOf(ss.charAt(i))) {
          case "a":
            current_hs++;
            break;
          case "b":
            current_hs += 2;
            break;
          case "c":
            current_hs += 3;
            break;
          case "d":
            current_hs += 4;
            break;
          case "e":
            current_hs += 5;
            break;
          case "f":
            current_hs += 6;
            break;
          case "g":
            current_hs += 7;
            break;
          case "h":
            current_hs += 8;
            break;
          case "i":
            current_hs += 9;
            break;
          case "j":
            current_hs += 10;
            break;
          case "k":
            current_hs += 11;
            break;
          case "l":
            current_hs += 12;
            break;
          case "m":
            current_hs += 13;
            break;
          case "n":
            current_hs += 14;
            break;
          case "o":
            current_hs += 15;
            break;
          case "p":
            current_hs += 16;
            break;
          case "q":
            current_hs += 17;
            break;
          case "r":
            current_hs += 18;
            break;
          case "s":
            current_hs += 19;
            break;
          case "t":
            current_hs += 20;
            break;
          case "u":
            current_hs += 21;
            break;
          case "v":
            current_hs += 22;
            break;
          case "w":
            current_hs += 23;
            break;
          case "x":
            current_hs += 24;
            break;
          case "y":
            current_hs += 25;
            break;
          case "z":
            current_hs += 26;
        }
      }
      if (current_hs > hs) {
        hs = current_hs;
        hs_string = ss;
      }
    }
    
    return hs_string;
  }

}
----------------------------------------------------------------------------------
public class Kata {

    public static String high(String stringOfWords) {
        String highscoreWord = "";
        int maxTotal = 0;

        for (String word : stringOfWords.split(" ")) {
            int totalOfWord = 0;
            for (char c : word.toCharArray()) {
                totalOfWord += c - 96; // the int value of "a" is 97
            }
            if (totalOfWord > maxTotal) {
                maxTotal = totalOfWord;
                highscoreWord = word;
            }
        }
        return highscoreWord;
    }

}



*/