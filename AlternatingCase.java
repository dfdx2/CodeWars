/* 8KYU CodeWars AlTeRnAtInG cAsE <=> aLtErNaTiNg cAsE

altERnaTIng cAsE <=> ALTerNAtiNG CaSe
Define String.prototype.toAlternatingCase 
(or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase 
in your selected language; see the initial solution for details) such that each 
lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:

StringUtils.toAlternativeString("hello world") == "HELLO WORLD"
StringUtils.toAlternativeString("HELLO WORLD") == "hello world"
StringUtils.toAlternativeString("hello WORLD") == "HELLO world"
StringUtils.toAlternativeString("HeLLo WoRLD") == "hEllO wOrld"
StringUtils.toAlternativeString("12345") == "12345" // Non-alphabetical characters are unaffected
StringUtils.toAlternativeString("1a2b3c4d5e") == "1A2B3C4D5E"
StringUtils.toAlternativeString("StringUtils.toAlternatingCase") == "sTRINGuTILS.TOaLTERNATINGcASE"

As usual, your function/method should be pure, i.e. it should not mutate the original string.

*/

public class StringUtils {
  
  public static String toAlternativeString(String string) {
    String result = "";
    for (char c : string.toCharArray()) {
        if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
        } 
        else {
              result += Character.toUpperCase(c);
        }
     }
     return result;
    }
}
/*-------------------------------------------------------------------------------------------

import static java.lang.Character.*;

public class StringUtils {
    public static String toAlternativeString(String string) {
        return string.chars()
                .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
----------------------------------------------------------------------------------------------

import java.util.*;
import java.util.stream.*;

public class StringUtils {
  
  public static String toAlternativeString(String string) {
    return Arrays.stream(string.split(""))
                 .map(s -> s.matches("[A-Z]") ? s.toLowerCase() : s.toUpperCase())
                 .collect(Collectors.joining(""));
  }
}
-----------------------------------------------------------------------------------------------
import java.util.*;

public class StringUtils {
  
  public static String toAlternativeString(String str){
    StringBuilder s = new StringBuilder();
    str.chars()
       .forEach( i -> {
            char c = (char) i;
            s.append( Character.isUpperCase(c) ? Character.toLowerCase(c)
                                               : Character.toUpperCase(c));
    });
    return s.toString();
  }
}
-----------------------------------------------------------------------------------------------
public class StringUtils {

    public static String toAlternativeString(String string) {
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i]  = Character.isUpperCase(chars[i]) ? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
-----------------------------------------------------------------------------------------------

*/