/* 8KYU CodeWars My Head Is At The Wrong End!

You're at the zoo... all the meerkats look weird. Something 
has gone terribly wrong - someone has gone and switched their 
heads and tails around!

Save the animals by switching them back. You will be given an 
array which will have three values (tail, body, head). It is 
your job to re-arrange the array so that the animal is the 
right way round (head, body, tail).

Same goes for all the other arrays/lists that you will get in 
the tests: you have to change the element positions with the 
same exact logics

Simples!

*/
public class MyHeadIsAtTheWrongEnd {
  public static String[] fixTheMeerkat(String[] arr) {
    return new String[] {arr[2], arr[1], arr[0]};
  }
}
/*---------------------------------------------------------------
public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    String[] result = {arr[2], arr[1], arr[0]};
    return result;
  }
}
/*---------------------------------------------------------------
public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    return new String[] {arr[2], arr[1], arr[0]};
  }
}
-----------------------------------------------------------------
import java.util.Collections;
import java.util.Arrays;

public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    String[] copy = arr.clone();
    Collections.reverse(Arrays.asList(copy));
    return copy;
  }
}
-----------------------------------------------------------------
public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
        String p = arr[0];
        arr[0] = arr[2];
        arr[2] = p;
        
        return arr;
    }
}
-----------------------------------------------------------------
public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    String[] fix = new String[arr.length];
    int count=0;
    for (int i=arr.length;i>0;i--) {
      fix[count]=arr[i-1];
      count++;
    }
    return fix;
  }
}
------------------------------------------------------------------
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    List<String> list = Arrays.asList(arr);
    Collections.reverse(list);
    return list.stream().toArray(String[]::new);
  }
}
-----------------------------------------------------------------
import java.util.*;
public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr)
    {
        Queue<String> correctOrder = new LinkedList<String>();
        for(int i = 0; i < arr.length; i++)
        {
            ((LinkedList<String>) correctOrder).push(arr[i]);
        }
        
        String[] newArr = correctOrder.toArray(arr);

        return newArr;
    }
}
-------------------------------------------------------------------
import org.apache.commons.lang3.ArrayUtils;
public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] n) {
    ArrayUtils.reverse(n);
    return n;
  }
}




*/