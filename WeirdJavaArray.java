/* 8KYU Weird Java Array

I want to create an array of Lists of Integers, like so:

import java.util.*;

class Codewarrior {
    public static List<Integer>[] arrayOfLists = new List<Integer>[] {
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9),
    };
}
However, this code does not compile :(

Can you fix the code ?

arrayOfLists should hold the 3 lists shown above, (1, 2, 3), (4, 5, 6), (7, 8, 9).

*/
import java.util.*;

class WeirdJavaArray {
    public static List<Integer>[] arrayOfLists = new List[] {
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9),
    };
}
/*--------------------------------------------------------------------
import java.util.List;

final class Codewarrior {
  static final List<?>[] arrayOfLists = new List[]{
      List.of(1, 2, 3),
      List.of(4, 5, 6),
      List.of(7, 8, 9)
  };

  private Codewarrior() {}
}
----------------------------------------------------------------------
import java.util.List;

interface Codewarrior {
  List<Integer>[] arrayOfLists = new List[]{
      List.of(1, 2, 3),
      List.of(4, 5, 6),
      List.of(7, 8, 9)
  };
}
----------------------------------------------------------------------
import java.util.*;

class Codewarrior {
    public static List<Integer>[] arrayOfLists = new List[] {
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9),
    };
}
----------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

class Codewarrior {
    public static List<Integer>[] arrayOfLists = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(4, 5, 6),
        Arrays.asList(7, 8, 9)
    ).stream().map(ArrayList::new).toArray(ArrayList[]::new);
}
---------------------------------------------------------------------
import java.util.*;

class Codewarrior {
    public static List<Integer>[] arrayOfLists = new List[] {
        new ArrayList<>(Arrays.asList(1, 2, 3)),
        new ArrayList<>(Arrays.asList(4, 5, 6)),
        new ArrayList<>(Arrays.asList(7, 8, 9)),
    };
}
----------------------------------------------------------------------
import java.util.*;

class Codewarrior {
    public static List<Integer>[] arrayOfLists;

    static {
        // Create the array of Lists
        arrayOfLists = new List[3]; // Create an array of size 3
        arrayOfLists[0] = Arrays.asList(1, 2, 3); // First list
        arrayOfLists[1] = Arrays.asList(4, 5, 6); // Second list
        arrayOfLists[2] = Arrays.asList(7, 8, 9); // Third list
        System.out.println(arrayOfLists[0]);
        System.out.println(arrayOfLists[1]);
        System.out.println(arrayOfLists[2]);
   }
}
----------------------------------------------------------------------
import java.util.*;

class Codewarrior {
    public static List<Integer>[] arrayOfLists;

    static {
        @SuppressWarnings("unchecked")
        List<Integer>[] temp = new ArrayList[3];
        temp[0] = new ArrayList<>(List.of(1, 2, 3));
        temp[1] = new ArrayList<>(List.of(4, 5, 6));
        temp[2] = new ArrayList<>(List.of(7, 8, 9));
        arrayOfLists = temp;
    }
}
*/