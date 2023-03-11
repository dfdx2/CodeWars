/* 7KYU CodeWars  Last

Find the last element of the given argument(s).

Examples
last(Arrays.asList(1, 2, 3, 4)); // =>  4
last("xyz");                     // => "z"
last(1, 2, 3, 4);                // =>  4
last(new int[]{1, 2, 3, 4});     // =>  4
In javascript and CoffeeScript a list will be an array, a string or the list of arguments.

(courtesy of haskell.org)

*/

import java.util.List;

public class Solution {
    public static <T> T last(final List<T> list) {
        return list.get(list.size() - 1);
    }
    public static char last(final String string) {
        return string.charAt(string.length() - 1);
    }
    public static <T> T last(final T... list) {
      T lastitem = null;  
      for (T e : list) {
        lastitem = e;
      }
      return lastitem;
    }
}
/*-----------------------------------------------------------------------------------------
import java.util.List;

public class Solution {
    public static <T> T last(final List<T> list) {
        return list.get(list.size() - 1);
    }
    public static char last(final String string) {
        return string.charAt(string.length() - 1);
    }
    public static <T> T last(final T... list) {
        return list[list.length - 1];
    }
}
--------------------------------------------------------------------------------------------
import java.util.List;
import java.util.Arrays;

public class Solution {
    public static <T> T last(final List<T> list) {
        return list.stream()
            .reduce((a,b) -> b).orElse(null);
    }
    public static char last(final String string) {
        return string.chars().mapToObj(c -> (char) c)
            .reduce((a,b) -> b).orElse(null);
    }
    public static <T> T last(final T... list) {
        return Arrays.stream(list)
            .reduce((a,b) -> b).orElse(null);
    }
}
--------------------------------------------------------------------------------------------
import java.util.List;

public class Solution {
    public static <T> T last(final List<T> list) {
    	if(list == null || list.isEmpty()) {
    		return null;
    	} else {
    		return list.get(list.size()-1);
    	}
    }
    public static char last(final String string) {
    	if(string == null || string.isEmpty()) {
    		return 0;
    	} else {
    		return string.charAt(string.length()-1);
    	}
    }
    public static <T> T last(final T... list) {
    	if(list == null) {
    		return null;
    	} else {
    		return list[list.length-1];
    	}
    }
	
}
-----------------------------------------------------------------------------------------
import java.util.List;

public class Solution {
    public static <T> T last(final List<T> list) {
        return list.get(list.size()-1);
    }
    public static char last(final String string) {
        return string.charAt(string.length()-1);
    }
    public static int last(int ...array) {
      return array[array.length-1];
    }
    public static <T> T last(T[] array) {
      return array[array.length-1];
    }
}
--------------------------------------------------------------------------------------------
import java.util.List;

public class Solution {
    public static <T> T last(final List<T> list) {
        return list.get(list.size()-1);
    }

    public static char last(final String string) {
        return string.charAt(string.length()-1);
    }

    public static <T> T last(final T... list) {
        return list[list.length-1];
    }

    public static int last(int[] arr){
        return arr[arr.length-1];
    }
}



*/
