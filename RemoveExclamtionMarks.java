/*  8KYU CodeWars Remove Exclamation Marks

Write function RemoveExclamationMarks which removes 
all exclamation marks from a given string.

*/

class RemoveExclamtionMarks {
    static String removeExclamationMarks(String s) {
      return s.replaceAll("!","");
    }
}
/*-------------------------------------------------------
class Solution {
    static String removeExclamationMarks(String s) {
        return (s == null) ? null : s.replace("!", "");
    }
}
-----------------------------------------------------------
class Solution {
     static String removeExclamationMarks(String s) {
        char[] arr = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '!') {
                builder.append(arr[i]);
            }
        }

        return builder.toString();
    }
}
------------------------------------------------------------
import java.util.stream.*;
class Solution {
    static String removeExclamationMarks(String s) {
        return Stream.of(s.split(""))
                 .filter(l -> !l.equals("!"))
                 .collect(Collectors.joining(""));
    }
}
-------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;


class Solution {
    static String removeExclamationMarks(String s) { 
        
    return IntStream.range(0, s.length()).filter(i -> s.charAt(i) != '!').mapToObj(i -> "" + s.charAt(i))
        .collect(Collectors.joining(""));
    }
}
---------------------------------------------------------------
class Solution {
    static String removeExclamationMarks(String s) {
        String [] sen = s.split("!");
        return String.join("", sen);
    }
}

*/