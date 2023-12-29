/* 7KYU CodeWars Scrabble Score

Write a program that, given a word, computes the scrabble score for that word.

Letter Values
You'll need these:

Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
Examples
"cabbage" --> 14
"cabbage" should be scored as worth 14 points:

3 points for C
1 point for A, twice
3 points for B, twice
2 points for G
1 point for E
And to total:

3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 14

Empty string should return 0. The string can contain spaces and letters (upper and lower case), you should calculate the scrabble score only of the letters in that string.

""           --> 0
"STREET"    --> 6
"st re et"    --> 6
"ca bba g  e" --> 14


*/
import java.util.*;
public class Kata{
    public static int scrabbleScore(String word) {
      word = word.toLowerCase();
      Map<Character, Integer> map = new HashMap<>();
      map.put('a', 1);
      map.put('e', 1);
      map.put('i', 1);
      map.put('o', 1);
      map.put('u', 1);
      map.put('l', 1);
      map.put('n', 1);
      map.put('r', 1);
      map.put('s', 1);
      map.put('t', 1);
      map.put('d', 2);
      map.put('g', 2);
      map.put('b', 3);
      map.put('c', 3);
      map.put('m', 3);
      map.put('p', 3);
      map.put('f', 4);
      map.put('h', 4);
      map.put('v', 4);
      map.put('w', 4);
      map.put('y', 4);
      map.put('k', 5);
      map.put('j', 8);
      map.put('x', 8);
      map.put('q', 10);
      map.put('z', 10);
      int result = 0;
      for (int i = 0; i < word.length(); i++) {
        if (map.containsKey(word.charAt(i))) {
          result += map.get(word.charAt(i));
        }
        else {
          continue;
        }
      }
      return result;
    }
}
/*  if (word.length() < 1) {
        return 0;
      }
   int result = 0;
   for (int i = 0; i < word.length(); i++) {
   if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i') {
    result += 1;
   }
        else if (word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'l') {
          result += 1;
        }
        else if (word.charAt(i) == 'n' || word.charAt(i) == 'r' || word.charAt(i) == 's') {
          result += 1;
        }
        else if (word.charAt(i) == 't') {
          result += 1;
        }
        else if (word.charAt(i) == 'd' || word.charAt(i) == 'g') {
          result += 2;
        }
        else if (word.charAt(i) == 'b' || word.charAt(i) == 'c' || word.charAt(i) == 'm') {
          result += 3;
        }
        else if (word.charAt(i) == 'p') {
          result += 3;
        }
        else if (word.charAt(i) == 'f' || word.charAt(i) == 'h' || word.charAt(i) == 'v') {
          result += 4;
        } 
        else if (word.charAt(i) == 'w' || word.charAt(i) == 'y') {
          result += 4;
        }
        else if (word.charAt(i) == 'k') {
          result += 5;
        }
        else if (word.charAt(i) == 'j' || word.charAt(i) == 'x') {
          result += 8;
        }
        else if (word.charAt(i) == 'q' || word.charAt(i) == 'z') {
          result += 10;
        }
        else {
          continue;
        }
      }
      return result; 
------------------------------------------------------------------------------------------------
 import java.util.HashMap;

public class Kata{
    public static int scrabbleScore(String word) {
     if (word == null || word.isBlank()) return 0;
        HashMap<String, Integer> words = wordsMap();
        int score = 0;
        word = word.replace(" ", "").toUpperCase();

        for (int i = 0; i < word.length(); i++) {
            String w = Character.toString(word.charAt(i));
            if (words.containsKey(w)) score += words.get(w);
        }

        return score;
    }
  
  private static HashMap<String, Integer> wordsMap(){
        HashMap<String, Integer> words = new HashMap<>();
        words.put("A", 1); words.put("E", 1); words.put("I", 1); words.put("O", 1); words.put("U", 1);
        words.put("L", 1); words.put("N", 1); words.put("R", 1); words.put("S", 1); words.put("T", 1);
        words.put("D", 2); words.put("G", 2); words.put("B", 3); words.put("C", 3); words.put("M", 3);
        words.put("P", 3); words.put("F", 4); words.put("H", 4); words.put("V", 4); words.put("W", 4);
        words.put("Y", 4); words.put("K", 5); words.put("J", 8); words.put("X", 8); words.put("Q", 10);
        words.put("Z", 10);

        return words;
    }
}
-----------------------------------------------------------------------------------------------------
 public class Kata{
    public static int scrabbleScore(String word) {
      int score = 0;
      char[] arr = word.toUpperCase().toCharArray();
      for (int i = 0; i < arr.length; i++) {
        switch(arr[i]){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'R':
            case 'S':
            case 'T':
              score+=1;
              break;
            case 'D':
            case 'G':
              score+=2;
              break;
            case 'B':
            case 'C':
            case 'M':
            case 'P':
              score+=3;
              break;
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
              score+=4;
              break;
            case 'K':
              score+=5;
              break;
            case 'J':
            case 'X':
              score+=8;
              break;
            case 'Q':
            case 'Z':
              score+=10;
              break;
            default:
              score+=0;
        }
      }
      return score;
    }
}
--------------------------------------------------------------------------------------------
public class Kata{
    public static int scrabbleScore(String word) {
        return word.toUpperCase().replaceAll(" ", "").chars()
          .map(c -> ScoreBoard.getScore((char) c))
          .sum();
    }
}
---------------------------------------------------------------------------------------------
interface Kata {
  static int scrabbleScore(String word) {
    return word.replaceAll("\\W", "").toUpperCase().chars().map(c -> ScoreBoard.getScore((char) c)).sum();
  }
}
--------------------------------------------------------------------------------------------
public class Kata{
    public static int scrabbleScore(String word) {
      word = word.toUpperCase();
      int sum = 0;
      for(int i = 0; i < word.length(); i++){
        if(word.charAt(i) != ' '){
          sum += ScoreBoard.getScore(word.charAt(i));  
        }
      }
      return sum;
    }
}
-------------------------------------------------------------------------------------------
interface Kata {
  static int scrabbleScore(String word) {
    int[] score = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    return word.replaceAll("\\W", "").toUpperCase().chars().map(c -> score[c - 65]).sum();
  }
}
-------------------------------------------------------------------------------------------
public class Kata{
    public static int scrabbleScore(String word) {
      return word.toUpperCase().chars().map(ch -> switch ((char) ch) {
            case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1;
            case 'D', 'G' -> 2;
            case 'B', 'C', 'M', 'P' -> 3;
            case 'F', 'H', 'V', 'W', 'Y' -> 4;
            case 'K' -> 5;
            case 'J', 'X' -> 8;
            case 'Q', 'Z' -> 10;
            default -> 0;
        }).sum();
    }
}
---------------------------------------------------------------------------------------------
public class Kata{
    public static int scrabbleScore(String word) {
      int score=0;
      word=word.toLowerCase();
      word.replaceAll(" ","");
      int all=word.length();
      score=score+(1*(all-word.replaceAll("[aeioulnrst]","").length()));
      score=score+(2*(all-word.replaceAll("[dg]","").length()));
      score=score+(3*(all-word.replaceAll("[bcmp]","").length()));
      score=score+(4*(all-word.replaceAll("[fhvwy]","").length()));
      score=score+(5*(all-word.replaceAll("[k]","").length()));
      score=score+(8*(all-word.replaceAll("[jx]","").length()));
      score=score+(10*(all-word.replaceAll("[qz]","").length()));
      return score;
    }
}
*/