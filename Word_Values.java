/* 7KYU CodeWars Word Values

Given a string "abc" and assuming that each letter in the 
string has a value equal to its position in the alphabet, 
our string will have a value of 1 + 2 + 3 = 6. This means 
that: a = 1, b = 2, c = 3 ....z = 26.

You will be given a list of strings and your task will be 
to return the values of the strings as explained above 
multiplied by the position of that string in the list. 
For our purpose, position begins with 1.

nameValue ["abc","abc abc"] should return [6,24] because 
of [ 6 * 1, 12 * 2 ]. Note how spaces are ignored.

"abc" has a value of 6, while "abc abc" has a value of 12. 
Now, the value at position 1 is multiplied by 1 while the 
value at position 2 is multiplied by 2.

Input will only contain lowercase characters and spaces.

Good luck!

*/

import java.util.*;
class Solution{
    public static int [] nameValue(String [] arr){
      int[] result = new int[arr.length];
      Map<Character, Integer> map = new HashMap<>();
      map.put('a', 1);
      map.put('b', 2);
      map.put('c', 3);
      map.put('d', 4);
      map.put('e', 5);
      map.put('f', 6);
      map.put('g', 7);
      map.put('h', 8);
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
      map.put(' ', 0);
      for (int i = 0; i < arr.length; i++) {
        String word = arr[i];
        int count = 0;
        for (int j = 0; j < word.length(); j++) {
          count += map.get(word.charAt(j));
        }
        result[i] = count * (i + 1);
      }
      return result;
    }
}
/*----------------------------------------------------------------
class Solution{
    public static int [] nameValue(String [] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            result[i] = arr[i].chars().filter(e -> e != ' ').map(e -> e - 96).sum() * (i+1);
        }
        return result;
    }
}
------------------------------------------------------------------
class Solution {
    public static int[] nameValue(String[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (char letter : arr[i].toCharArray()) {
                if (!Character.isWhitespace(letter)) {
                    answer[i] += letter - 96;
                }
            }

            answer[i] *= i + 1;
        }

        return answer;
    }
}
-------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    private static final char asciiAlphabetOffset = 96;
  
    public static int [] nameValue(String [] arr){
        return IntStream.range(0, arr.length)
          .map(index -> arr[index].chars().filter(c -> c != ' ').map(i -> (i - asciiAlphabetOffset) * (index + 1)).sum())
          .toArray();
    }
}
-------------------------------------------------------------------
class Solution{
    public static int [] nameValue(String [] str){
       int [] values = new int[str.length];
       for(int i = 0; i < str.length; i++){
         int total = 0;
         for(int j = 0; j < str[i].length(); j++){
           if(str[i].charAt(j) == ' '){
             continue;
           }else{
             total += (((int) str[i].charAt(j)) - 96);
           }
         }
         values[i] = total * (i + 1);
       }
      return values;
    }
}
*/