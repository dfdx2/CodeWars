/* 6KYU CodeWars Delete Occurrences Of An Element if It Occurs More than N Times

Enough is enough!

Alice and Bob were on a holiday. Both of them took many pictures 
of the places they've been, and now they want to show Charlie their 
entire collection. However, Charlie doesn't like these sessions, 
since the motif usually repeats. He isn't fond of seeing the Eiffel 
tower 40 times.
He tells them that he will only sit for the session if they show the 
same motif at most N times. Luckily, Alice and Bob are able to encode 
the motif as a number. Can you help them to remove numbers such that 
their list contains each number only up to N times, without changing 
the order?

Task

Given a list and a number, create a new list that contains each number 
of list at most N times, without reordering.
For example if the input number is 2, and the input list is [1,2,3,1,2,1,2,3], 
you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 
being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
With list [20,37,20,21] and number 1, the result would be [20,37,21].

*/

import java.util.*;
import static java.util.stream.IntStream.of;
public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		Map<Integer, Integer> map = new HashMap<>();
    return of(elements).filter(e -> map.merge(e, 1, Integer::sum) <= maxOccurrences).toArray();
	}
}
/*----------------------------------------------------------------------------
import java.util.*;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int max) {
  
    if (max < 1) return new int[0];
    
    final HashMap<Integer,Integer> map = new HashMap<>();
    final List<Integer> list = new ArrayList<>();
    
    for (final Integer i : elements) {
      final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
      if (v == null || v < max) list.add(i);
    }
    
		return list.stream().mapToInt(i->i).toArray();
	}

}
------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class EnoughIsEnough {
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		Map<Integer, Integer> occurrence = new HashMap<>();
		return IntStream.of(elements)
			.filter(motif -> occurrence.merge(motif, 1, Integer::sum) <= maxOccurrences)
			.toArray();
	}
}
------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class EnoughIsEnough {
    private static boolean shouldAdd(final Map<Integer, Integer> counts, final int element, final int maxOcurrences) {
        if (counts.getOrDefault(element, 0) < maxOcurrences) {
            counts.merge(element, 1, Integer::sum);
            return true;
        }
        return false;
    }

    static int[] deleteNth(final int[] elements, final int maxOcurrences) {
		    final Map<Integer, Integer> counts = new HashMap<>();
        return Arrays.stream(elements)
            .filter(element -> shouldAdd(counts, element, maxOcurrences))
            .toArray();
	  }
}
-------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.HashMap;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOcurrences) {
		//Code here ;)
    HashMap<Integer, Integer> map = new HashMap<>();
		return Arrays.stream(elements)
      .filter(i -> {
          map.merge(i, 1, Integer::sum);
          return map.get(i) <= maxOcurrences;
        })
      .toArray();
	}

}
-------------------------------------------------------------------------------
public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
  java.util.List<Integer> list = new java.util.ArrayList<>();

        for (int element : elements) {
            int count = (int) list.stream()
                    .filter(i -> i == element)
                    .count();
            if (count < maxOccurrences) {
                list.add(element);
            }
        }

        return list.stream()
                .mapToInt(i -> i)
                .toArray();
	}

}
-------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements)
                .filter(element -> map.merge(element, 1, Integer::sum) <= maxOccurrences)
                .toArray();
	}

}
*/