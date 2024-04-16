/* 7KYU CodeWars Digital Cypher

Introduction
Digital Cypher assigns to each letter of the alphabet unique number. 
For example:

 a  b  c  d  e  f  g  h  i  j  k  l  m
 1  2  3  4  5  6  7  8  9 10 11 12 13
 n  o  p  q  r  s  t  u  v  w  x  y  z
14 15 16 17 18 19 20 21 22 23 24 25 26

Instead of letters in encrypted word we write the corresponding number, 
eg. The word scout:

 s  c  o  u  t
19  3 15 21 20

Then we add to each obtained digit consecutive digits from the key. 
For example. In case of key equal to 1939 :

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
Write a function that accepts str string and key number and returns 
an array of integers representing encoded str.

Input / Output
The str input string consists of lowercase characters only.
The key input number is a positive integer.

Example
Encode("scout",1939);  ==>  [ 20, 12, 18, 30, 21]
Encode("masterpiece",1939);  ==>  [ 14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8]

*/

import java.util.*;
public class Solution{
  public static int[] encode(String message, int key) {
    Map<Character, Integer> map = new HashMap<>();
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
    int[] result = new int[message.length()];
    int counter = 0;
    String test = String.valueOf(key);
    for (int i = 0; i < message.length(); i++) {
      if (counter == test.length() - 1) {
        int a = Integer.valueOf(test.charAt(counter) - '0');
        result[i] = map.get(message.charAt(i)) + a;
        counter = 0;
      }
      else {
        int b = Integer.valueOf(test.charAt(counter) - '0');
        result[i] = map.get(message.charAt(i)) + b;
        counter++;
      }
    }
    return result;
  }
}
/*------------------------------------------------------------------------
public class Solution{
  public static int[] encode(String s, int key){ 
       int n = s.length(); 
       int x [] = new int [n]; 
       char c [] = Integer.toString(key).toCharArray(); 
       for (int i = 0; i < n ; i++)
           x[i]=s.charAt(i)-'a' + c[i%c.length]-'0'+1; 
       return x;
    }
}
--------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

interface Solution {
  static int[] encode(String m, int k) {
    return range(0, m.length()).map(i -> m.charAt(i) + (k + "").charAt(i % ((int) Math.log10(k) + 1)) - 144).toArray();
  }
}
--------------------------------------------------------------------------
public class Solution{
  public static int[] encode(String message, int key) {
    // Put Code Here ฅ(≈>ܫ<≈)♥
    
        String str = "abcdefghijklmnopqrstuvwxyz";
        String strkey = String.valueOf(key);
        int lkey= strkey.length();
        int l= message.length()    ;  
        int repeatn= l/lkey;
        String strkeynumberof = strkey.repeat(repeatn+1);
        
        int[] outpt = new int[l];

        for (int i = 0; i <= l-1 ; i++) {
          char lettre  = message.charAt(i);
          int index = str.indexOf(lettre);
          int intKey = Character.getNumericValue(strkeynumberof.charAt(i)); 
          int indexpluskey= index + intKey;
          outpt[i] = indexpluskey+1;
          
          
        }  
        return outpt ;
    
      }
}
--------------------------------------------------------------------------
public class Solution{
  public static int[] encode(String message, int key) {
    char[] k = ("" + key).toCharArray(); 
    int[] ar = new int[message.length()];
    int index = 0;
    for(char c : message.toCharArray())
      ar[index] = c - 'a'+ k[index++ % k.length] - '0' + 1;
    return ar;
  }
}
--------------------------------------------------------------------------
public class Solution{
  public static int[] encode(String message, int key) {
        String stringKey = String.valueOf(key);

        int[] array = message.chars()
                .map(i -> i - 96).toArray();
        
        int k = 0;
        for (int i = 0; i < array.length; i++, k++) {
            if (k >= stringKey.length()) {
                k = 0;
            }
            int i1 = stringKey.charAt(k) - 48;

            array[i] += i1;
        }


        return array;
    }
}
---------------------------------------------------------------------------
public class Solution {
    public static int[] encode(String message, int key) {
        int[] encodedCharsCodes = new int[message.length()];
        
        char[] chars = message.toCharArray();
        
        char[] keyCodes = Integer.toString(key).toCharArray();
        
        int keyCodeOffset = 57;
        
        for(int i = 0; i < chars.length; i++) {
            int keyCodesIndex = i % keyCodes.length;
            encodedCharsCodes[i] = Character.getNumericValue(chars[i]) + keyCodes[keyCodesIndex] - keyCodeOffset;
        }
        
        return encodedCharsCodes;
    }
}
--------------------------------------------------------------------------
import java.util.*;

public class Solution{
    public static int[] encode(String message, int key) {
        List<Character> alphabet = new ArrayList<>();

        for (char ch = 'a'; ch <= 'z' ; ch++) {
            alphabet.add(ch);
        }

        char[] charArr = message.toCharArray();
        List<Integer> numericVal = new ArrayList<>();

        for (int i = 0; i < charArr.length; i++) {
            numericVal.add(alphabet.indexOf(charArr[i]) + 1);
        }

        char[] charKeyValues = Integer.toString(key).toCharArray();
        Queue<Integer> intKeyValues = new ArrayDeque<>();
        for (char keyVal : charKeyValues) {
            intKeyValues.offer(Character.getNumericValue(keyVal));
        }

        for (int i = 0; i < numericVal.size(); i++) {
            int currentVal = numericVal.get(i);
            int addedVal = intKeyValues.poll();
            currentVal += addedVal;
            numericVal.set(i, currentVal);
            intKeyValues.offer(addedVal);
        }
        
        return numericVal.stream().mapToInt(Integer::intValue).toArray();
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {
    private final static Map<Character, Integer> alphabetNumberMap = new HashMap<>() {{
        for (int i = 0, currentChar = 'a'; i < 26; i++) {
            put((char) currentChar, i + 1);
            currentChar++;
        }
    }};

    public static int[] encode(String message, int key) {
        int[] result = new int[message.length()];
        int[] keyChain = Arrays.stream(String.valueOf(key).split("")).mapToInt(Integer::valueOf).toArray();
        IntStream.range(0, result.length).forEach(index -> {
            result[index] = alphabetNumberMap.get(message.charAt(index)) + keyChain[index % keyChain.length];
        });
        return result;
    }
}
---------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Solution{
    private static final Map<Character, Integer> CODE = new HashMap<>();
  
    static {
        for (int i = 0; i < 26; i++) {
            CODE.put((char)('a' + i), i+1);
        }
    }
  
    public static int[] encode(String message, int key) {
        int[] numbers = Arrays.stream(String.valueOf(key).split("")).mapToInt(Integer::valueOf).toArray();
        int[] result = new int[message.length()];
        for (int i = 0, j = 0; i < result.length; i++, j++) {
            if (j >= numbers.length) {
                j = 0;
            }
            result[i] = CODE.get(message.charAt(i)) + numbers[j];
        } 
        return result;
    }
}
*/