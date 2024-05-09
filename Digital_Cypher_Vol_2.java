/* 7KYU CodeWars Digital Cypher Vol 2

Introduction
Digital Cypher assigns to each letter of the alphabet unique number. For example:

 a  b  c  d  e  f  g  h  i  j  k  l  m
 1  2  3  4  5  6  7  8  9 10 11 12 13
 n  o  p  q  r  s  t  u  v  w  x  y  z
14 15 16 17 18 19 20 21 22 23 24 25 26

Instead of letters in encrypted word we write the corresponding number, eg. 
The word scout:

 s  c  o  u  t
19  3 15 21 20

Then we add to each obtained digit consecutive digits from the key. For example. In case of key equal to 1939 :

   s  c  o  u  t
  19  3 15 21 20
 + 1  9  3  9  1
 ---------------
  20 12 18 30 21
  
   m  a  s  t  e  r  p  i  e  c  e
  13  1 19 20  5 18 16  9  5  3  5
+  1  9  3  9  1  9  3  9  1  9  3
  --------------------------------
  14 10 22 29  6 27 19 18  6  12 8

Task
Write a function that accepts an array of integers code and a key number. As the result, it should return string containg a decoded message from the code.

Input / Output
The code is a array of positive integers.
The key input is a nonnegative integer.

Example
decode([ 20, 12, 18, 30, 21],1939);  ==> "scout"
decode([ 14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8],1939);  ==

*/

import static java.util.stream.Collectors.*;
import static java.util.stream.IntStream.*;
public class Solution {
  public static String decode(int[] code, int key) {
    String result = "" + key;
    return range(0, code.length).mapToObj(i -> "" + (char) (code[i] - result.charAt(i % result.length()) + 144)).collect(joining());
  }
}
/*----------------------------------------------------------------------------
public class Solution {
  public static String decode(int[] code, int key) {
    String tmp = Integer.toString(key);
    int v = 0;
    String str="abcdefghijklmnopqrstuvwxyz";
    String s1="";
    
    for(int i=0; i<code.length;i++){
      int val = code[i] - Character.getNumericValue(tmp.charAt(v));
      s1= s1+str.charAt(val-1);
      v++;
      if(v>tmp.length()-1){
        v=0;
      }
    }
    return s1;
  }
}
------------------------------------------------------------------------------
public class Solution {
  private static final int MAGICNUMBER = 96;
  public static String decode(int[] code, int key) {
    String keys = String.valueOf(key);
    StringBuilder result = new StringBuilder();
    
    for (int i = 0; i < code.length; i++) {
      int salt = keys.charAt(i % keys.length()) - '0';
      char c = (char) (code[i] + MAGICNUMBER - salt);
      result.append(c);
    }
    
    return result.toString();
  }
}
------------------------------------------------------------------------------
public class Solution {
  public static String decode(int[] code, int key) {
    StringBuilder decoded = new StringBuilder();
    String keyStr = String.valueOf(key);
    int keyIndex = 0;
    for (int i = 0; i < code.length; i++) {
      int digit = Character.getNumericValue(keyStr.charAt(keyIndex));
      char decodedChar = (char) (code[i] - digit + 'a' - 1);
      decoded.append(decodedChar);
      keyIndex = (keyIndex + 1) % keyStr.length();
    }
    return decoded.toString();
  }
}
------------------------------------------------------------------------------
import java.util.*;
public class Solution {
  public static String decode(int[] code, int key) {
    
    char[] alpha = new char[26];
    for(int i=0;i<26;i++){
      alpha[i] = (char)(i+97);
    }
    String answer="";
    
    char[] keys = String.valueOf(key).toCharArray();
    
  
    for(int i=0,j=0;i<code.length;i++,j++){
       
      int index = code[i]-(Character.getNumericValue(keys[j]));
      System.out.println(code[i]+" "+index+" "+keys[j]);
      answer = answer+ String.valueOf(alpha[index-1]);
      if(j==keys.length-1){
         j=-1;
       }
    }

    return answer;
  }
}
------------------------------------------------------------------------------
import java.util.*;

public class Solution {
  public static String decode(int[] code, int key) {
    char[] alphabet = new char[27];
    for (int i = 0; i < 27; i++) {
      alphabet[i] = (char)('a' + i);
    }
    
    char[] keyArray = Integer.toString(key).toCharArray();
    int[] keyNumeric = new int[keyArray.length];
    for (int i = 0; i < keyArray.length; i++) {
      keyNumeric[i] = Character.getNumericValue(keyArray[i]);
    }
    
    int[] lastArray = new int[code.length];
    for (int i = 0; i < code.length; i++) {
      lastArray[i] = code[i] - keyNumeric[i % keyNumeric.length];
    }
    
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < lastArray.length; i++) {
      for (int j = 0; j < alphabet.length; j++) {
        
        if (lastArray[i] == j) {
          s.append(alphabet[j - 1]);
        } 
      }
    }
    return s.toString();
  }
}
------------------------------------------------------------------------------
import java.util.Arrays;

public class Solution {
  public static String decode(int[] code, int key) {
    String[] alphabet = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
    int[] keySplitted = Arrays.stream(String.valueOf(key).split("")).mapToInt(i -> Integer.parseInt(i)).toArray();

    for (int i = 0; i < code.length; i++) {
			code[i] -= keySplitted[i % keySplitted.length];
		}
    
    String[] codeMapped = Arrays.stream(code).mapToObj(number -> alphabet[number - 1].toString()).toArray(String[]::new);

    return String.join("", codeMapped);
  }
}
------------------------------------------------------------------------------
public class Solution {
  public static String decode(int[] code, int key) {
        String numberStr = Integer.toString(Math.abs(key));
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }
        
        for (int i = 0; i < code.length; i++) {
            code[i] -= digits[i % digits.length];
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num : code) {
            sb.append(getCharacterFromPosition(num));
        }
        return sb.toString();
  }
      public static char getCharacterFromPosition(int position) {
        return switch (position) {
            case 1 -> 'a';
            case 2 -> 'b';
            case 3 -> 'c';
            case 4 -> 'd';
            case 5 -> 'e';
            case 6 -> 'f';
            case 7 -> 'g';
            case 8 -> 'h';
            case 9 -> 'i';
            case 10 -> 'j';
            case 11 -> 'k';
            case 12 -> 'l';
            case 13 -> 'm';
            case 14 -> 'n';
            case 15 -> 'o';
            case 16 -> 'p';
            case 17 -> 'q';
            case 18 -> 'r';
            case 19 -> 's';
            case 20 -> 't';
            case 21 -> 'u';
            case 22 -> 'v';
            case 23 -> 'w';
            case 24 -> 'x';
            case 25 -> 'y';
            case 26 -> 'z';
            default ->
                    throw new IllegalArgumentException("Invalid position: " + position + ". Position must be between 1 and 26.");
        };
    }
  
}
------------------------------------------------------------------------------
public class Solution {
  public static String decode(int[] code, int key) {  
    int appender = 96;
        String keyStr = String.valueOf(key);
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        for (int j : code) {
            if (counter == keyStr.length()) {
                counter = 0;
            }
            String strValueAt = keyStr.substring(counter++, counter);
            int character = j + appender - Integer.parseInt(strValueAt);

            sb.append((char) character);
        }

        return sb.toString();
  }
}
*/