/* 8KYU CodeWars Unfinished Loop - Bug Fixing #1

Unfinished Loop - Bug Fixing #1
Oh no, Timmy's created an infinite loop! Help Timmy find 
and fix the bug in his unfinished for loop!

*/
import java.util.*;
class UnfinishedLoopBugFixing {
    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<>(number);

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }
}

/*-------------------------------------------------------------
import java.util.*;

class Kata {
  public static List CreateList(int number)
  {
    List list = new ArrayList();
    
    for(int count = 1; count <= number; count++)
    {
      list.add(count);
    }
    
    return list;
  }
}
--------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Kata {
    public static List CreateList(int number)
    {
        return IntStream.range(1, number + 1).boxed().collect(Collectors.toList());
    }
}
------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;

class Kata {
  	 public static List<Integer> CreateList(int number)
	  {
	    return IntStream.rangeClosed(1, number).boxed().collect(Collectors.toList());
	  }
}
------------------------------------------------------------------
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

import java.util.List;

class Kata {
  static List<Integer> CreateList(int number) {
    return range(1, ++number).boxed().collect(toList());
  }
}
------------------------------------------------------------------
import java.util.List;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.rangeClosed;
class Kata {
 public static List CreateList(int number) {
        return rangeClosed(1, number).boxed().collect(toList());
    }
}

*/