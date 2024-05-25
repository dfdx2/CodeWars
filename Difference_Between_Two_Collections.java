/* 7KYU CodeWars Difference Between Two Collections

Find the difference between two collections. The difference 
means that either the character is present in one collection 
or it is present in other, but not in both. Return a sorted 
list with the difference.

The collections can contain any character and can contain 
duplicates.

Example
A = [a, a, t, e, f, i, j]

B = [t, g, g, i, k, f]

difference = [a, e, g, j, k]

*/
import java.util.Collection;
import java.util.List;
import static java.util.stream.Stream.concat;

public class Kata {
  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    return concat(a.stream(), b.stream()).distinct().filter(c -> !a.contains(c) || !b.contains(c)).sorted().toList();
  }
}
/*----------------------------------------------------------------
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    return Stream.of(a, b).flatMap(Collection::stream).distinct().filter(c -> !a.contains(c) || !b.contains(c))
      .sorted().collect(Collectors.toList());
  }
}
------------------------------------------------------------------
import java.util.*;

public class Kata {
  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    TreeSet<Character> ts = new TreeSet<>();
    
    for (char c : a)
      if (!b.contains(c))
        ts.add(c);
        
    for (char c : b)
      if (!a.contains(c))
        ts.add(c);
    
    return new ArrayList<Character>(ts);
  }
}
------------------------------------------------------------------
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

class Kata {
    static List<Character> diff(final Collection<Character> aa, final Collection<Character> bb) {
        Set<Character> a = new HashSet<>(aa);
        Set<Character> b = new HashSet<>(bb);
        
        Set<Character> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        
        Set<Character> union = new HashSet<>(a);
        union.addAll(b);

        // union minus intersection equals symmetric-difference
        Set<Character> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);
        
        List<Character> result = new ArrayList<>(symmetricDifference);
        result.sort(Character::compareTo);
        
        return result;
    }
}
------------------------------------------------------------------
import java.util.*;

public class Kata {
  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    Set s1 = new TreeSet(a), s2 = new HashSet(b);
    s1.removeAll(s2);
    s2.removeAll(new HashSet(a));
    s1.addAll(s2);
    return new ArrayList(s1);
  }
}
------------------------------------------------------------------
import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.concat;

import java.util.Collection;
import java.util.List;

class Kata {
  static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    return concat(a.stream(), b.stream()).distinct().filter(c -> !a.contains(c) || !b.contains(c)).sorted().collect(toList());
  }
}
------------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    return Stream.concat(a.stream(), b.stream())
      .distinct()
      .filter(x -> !(a.contains(x) && b.contains(x)))
      .sorted()
      .collect(Collectors.toList());
  }
}
------------------------------------------------------------------
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Kata {
  public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
    SortedSet<Character> set1 = new TreeSet<>(a);
    set1.removeAll(b); // Difference of A - B
    SortedSet<Character> set2 = new TreeSet<>(b);
    set2.removeAll(a); // Difference of B - A
    set1.addAll(set2); // Union of the two differences
    // (A - B) U (B - A)
    return new ArrayList<>(set1);
  }
}
*/