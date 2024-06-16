/* 7KYU CodeWars Form The Minimum

Task

Given a list of digits, return the smallest number that could 
be formed from these digits, using the digits only once 
(ignore duplicates).


Notes:

Only positive integers will be passed to the function (> 0 ), 
no negatives or zeros.

Input >> Output Examples

minValue ({1, 3, 1})  ==> return (13)

Explanation:

(13) is the minimum number could be formed from {1, 3, 1} , Without duplications

minValue({5, 7, 5, 9, 7})  ==> return (579)

Explanation:

(579) is the minimum number could be formed from {5, 7, 5, 9, 7}, 
Without duplications

minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)

Explanation:

(134679) is the minimum number could be formed from {1, 9, 3, 1, 7, 4, 6, 6, 7} , Without duplications

*/
import static java.util.Arrays.stream;
public class FormtheMinimum{
	public static int minValue(int[] values){
		return stream(values).distinct().sorted().reduce(0, (a, b) -> 10 * a + b);
	}
}
/*------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.*;
public class Minimum{

	public static int minValue(int[] values){
		 String s = Arrays.stream(values)
                .sorted()
                .distinct()
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(""));
        return Integer.valueOf(s);
	}

}
--------------------------------------------------------------------
import java.util.Arrays;

public class Minimum{

	public static int minValue(int[] values) {
		return Arrays.stream(values)
    	.distinct()
      .sorted()
      .reduce(0, (a, b) -> 10 * a + b);
	}
}
--------------------------------------------------------------------
import java.util.HashSet;
import java.util.Set;

public class Minimum{

	public static int minValue(int[] values){
	      Set<Integer> list = new HashSet<>();
        for (int number : values) {
            list.add(number);
        
        }
        StringBuilder sb = new StringBuilder();
        for (Integer number : list) {
            sb.append(number);
        }
        return Integer.valueOf(sb.toString());
  }
}
--------------------------------------------------------------------
import java.util.Arrays;

public class Minimum{

	public static int minValue(int[] values){
  	return Arrays.stream(values)
          .distinct()
          .sorted()
          .mapToObj(String::valueOf)
          .reduce(String::concat)
          .map(Integer::valueOf)
          .orElseThrow(UnsupportedOperationException::new);
	}

}
--------------------------------------------------------------------
import java.util.TreeSet;
public class Minimum{

	public static int minValue(int[] values){
    TreeSet set = new TreeSet();
    for(int i:values){
      set.add(i);
    }
    return Integer.valueOf(set.toString().replaceAll("\\[|\\]|,|\\s", ""));	}

}
--------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Minimum{

	public static int minValue(int[] values){
	
		 return  Integer.parseInt(Arrays.stream(Arrays.stream(values).distinct().sorted().toArray())
                .mapToObj(String::valueOf)
                .collect(Collectors.joining()));
	}

}
--------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

import java.util.HashSet;

public class Minimum {
    public static int minValue(int[] values) {
        List<Integer> list = stream(values)
                .boxed()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (Integer item : list) {
            sb.append(item);
        }

        return Integer.parseInt(sb.toString());
    }
}
*/