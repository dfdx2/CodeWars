/* 7KYU CodeWars Remove Duplicate Words

Your task is to remove all duplicate words from a string, 
leaving only single (first) words entries.

Example:

Input:

'alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta'

Output:

'alpha beta gamma delta'

*/

import java.util.Arrays;
import java.util.stream.Collectors;


class Solution{
    public static String removeDuplicateWords(String s){
        return Arrays.stream(s.split(" "))
                .distinct()
                .collect(Collectors.joining(" "));
    }
}
/*---------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

class Solution{
    public static String removeDuplicateWords(String s){
        return Arrays.stream( s.split("\\s+")).distinct().collect(Collectors.joining(" ") );
    }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Solution {

    public static String removeDuplicateWords(String s) {

        return String.join(" ", new LinkedHashSet<>(Arrays.asList(s.split(" "))));
    }
}
----------------------------------------------------------------------------
class Solution{
    public static String removeDuplicateWords(String s){
        StringBuilder sb = new StringBuilder();
        for(String str : s.split(" ")){
            if (!sb.toString().contains(str)) {
               sb.append(str).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
----------------------------------------------------------------------------
class Solution{
    public static String removeDuplicateWords(String s){
        String str = "";
        for (String i : s.split("(\\s)+")) {
            if (!str.contains(i)) {
                str += i + " ";
            }
        }
        return str.substring(0, str.length() - 1);
    }
}
------------------------------------------------------------------------------
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Solution {
    public static String removeDuplicateWords(final String s) {
        return 
          Stream.of(s.split(" "))
                .distinct()
                .collect(joining(" "));
    }
}
-----------------------------------------------------------------------------
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution{
    public static String removeDuplicateWords(String s){
        Set<String> list = new LinkedHashSet<>(Arrays.asList(s.split(" ")));
        StringBuilder sb = new StringBuilder();
        for (String str : list){
            sb.append(str).append(" ");
        }
        return sb.toString().trim();
    }
}
*/