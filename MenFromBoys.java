/* 7KYU CodeWars Sort Out The Men From Boys

Scenario

Now that the competition gets tough it will Sort out 
the men from the boys .

Men are the Even numbers and Boys are the odd!alt!alt

Task

Given an array/list [] of n integers , Separate The even 
numbers from the odds , or Separate the men from the 
boys!alt!alt

Notes

Return an array/list where Even numbers come first then odds

Since , Men are stronger than Boys , Then Even numbers in 
ascending order While odds in descending .

Array/list size is at least 4 .

Array/list numbers could be a mixture of positives , negatives .

Have no fear , It is guaranteed that no Zeroes will exists .!alt

Repetition of numbers in the array/list could occur , So (duplications 
are not included when separating).

Input >> Output Examples:

menFromBoys ({7, 3 , 14 , 17}) ==> return ({14, 17, 7, 3}) 

Explanation:

Since , { 14 } is the even number here , So it came first , then the 
odds in descending order {17 , 7 , 3} .

menFromBoys ({-94, -99 , -100 , -99 , -96 , -99 }) ==> return ({-100 , -96 , -94 , -99})

Explanation:

Since , { -100, -96 , -94 } is the even numbers here , So it came first 
in *ascending order *, then the odds in descending order { -99 }

Since , (Duplications are not included when separating) , then you can see 
only one (-99) was appeared in the final array/list .

menFromBoys ({49 , 818 , -282 , 900 , 928 , 281 , -282 , -1 }) ==> return ({-282 , 818 , 900 , 928 , 281 , 49 , -1})

Explanation:

Since , {-282 , 818 , 900 , 928 } is the even numbers here , So it came first 
in ascending order , then the odds in descending order { 281 , 49 , -1 }

Since , (Duplications are not included when separating) , then you can see 
only one (-282) was appeared in the final array/list .

*/
import static java.util.Comparator.comparing;
import static java.util.stream.IntStream.of;

public class MenFromBoys {
    public static int[] menFromBoys(final int[] values) {
        return of(values).distinct().boxed()
          .sorted(comparing(i -> i % 2 == 0 ? i : -i))
          .sorted(comparing(i -> Math.abs(i % 2)))
          .mapToInt(i -> i).toArray();
    }
}
/*------------------------------------------------------------------------
import java.util.*;


public class Kata {
    public static int[] menFromBoys(final int[] values) {
		int[] result;
		Set<Integer> evenSet = new TreeSet<>();
		Set<Integer> oddSet = new TreeSet<>();

		for (int value : values) {
			if (value % 2 == 0) {
				evenSet.add(value);
			} else {
				oddSet.add(value);
			}
		}
		List<Integer> list = new ArrayList<>(oddSet);
		Collections.reverse(list);
		result = new int[evenSet.size() + oddSet.size()];
		int counter = 0;

		for (Integer elem : evenSet) {
			result[counter++] = elem;
		}
		
		for(Integer elem : list) {
			result[counter++] = elem;
		}
		
		return result;
    }
}
--------------------------------------------------------------------------
import java.util.*;

public class Kata {

  public static int[] menFromBoys(final int[] values) {
    return Arrays.stream(values)
      .distinct()
      .boxed()
      .sorted(Comparator.comparing(i -> i % 2 == 0 ? i : -i))
      .sorted(Comparator.comparing(i -> Math.abs(i % 2)))
      .mapToInt(i -> i)
      .toArray();
  }

}
--------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.IntStream;
public class Kata {
    public static int[] menFromBoys(final int[] values) {
        int arrEven [] = Arrays.stream(values).filter(a->a%2==0).distinct().sorted().toArray();
        int arrOdd [] = Arrays.stream(values).filter(a->a%2!=0).distinct().map(a->a*(-1)).sorted().map(a->a*(-1)).toArray();

        return IntStream.concat(IntStream.of(arrEven),IntStream.of(arrOdd)).toArray();
    }
}
--------------------------------------------------------------------------
import java.util.stream.*;
public class Kata {
    public static int[] menFromBoys(final int[] values) {
        
        return IntStream.concat(IntStream.of(values).filter(x->x%2==0).distinct().sorted(),IntStream.of(values).filter(x->x%2!=0).distinct().map(i->-i).sorted().map(i->-i)).toArray();
    }
}
--------------------------------------------------------------------------
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Collection;

import java.util.Arrays;

public class Kata {
    public static int[] menFromBoys(final int[] values) {
        List<Integer> mens = IntStream.of(values)
                .boxed()
                .filter(number -> number % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        List<Integer> boys = IntStream.of(values)
                .boxed()
                .filter(number -> number % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return List.of(mens, boys).stream()
                .flatMap(Collection::stream)
                .distinct()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

--------------------------------------------------------------------------
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Kata {
	public static int[] menFromBoys(final int[] values) {
		TreeSet<Integer> evenNumbers = new TreeSet<Integer>();
		TreeSet<Integer> oddNumbers = new TreeSet<Integer>(Collections.reverseOrder());
		for (Integer number : values) {
			if (number % 2 == 0)
				evenNumbers.add(number);
			else // number % 2 == 1
				oddNumbers.add(number);
		}

		int[] result = new int[evenNumbers.size() + oddNumbers.size()];
		Iterator<Integer> iEven = evenNumbers.iterator();
		Iterator<Integer> iOdd = oddNumbers.iterator();

		for (int i = 0; i < result.length; i++) {
			result[i] = iEven.hasNext() ? iEven.next() : iOdd.next();
		}

		return result;
	}
}
--------------------------------------------------------------------------
import java.util.*;
public class Kata {
  public static int[] menFromBoys(final int[] values) {
    // Your Code is Here .. Enjoy !! , Don't Forget To Vote :wink: :wink👉 : 👈 missing a the end
    List<Integer> men = new ArrayList();
    List<Integer> boys = new ArrayList();
    for (var x : values){
      if (x % 2 == 0 && !men.contains(x)){
        men.add(x);
      }
      else if (x % 2 != 0 && !boys.contains(x)){
        boys.add(x);
      }
    }
    Collections.sort(men);
    Collections.sort(boys);
    Collections.reverse(boys);
    men.addAll(boys);
    int[] result = new int[men.size()];
    for (var x = 0; x < men.size(); x++){
      result[x] = men.get(x);
    }
    return result;
  }
}

*/