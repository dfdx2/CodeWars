/* 8KYU CodeWars Filtering Even Numbers (Bug Fixes)

Fix the bug in Filtering method
The method is supposed to remove even numbers from the list and return 
a list that contains the odd numbers.

However, there is a bug in the method that needs to be resolved.

*/

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.List;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (Iterator<Integer> iterator = listOfNumbers.iterator(); iterator.hasNext();)
        {
          Integer number = iterator.next();  
          if (number % 2 == 0)
            {
                iterator.remove();
            }
        }
        return listOfNumbers;
    }
}
/*----------------------------------------------------------------------------
import java.util.*;
import java.lang.*;
import java.util.Collections.*;
import java.util.stream.Collectors;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        
        return listOfNumbers.stream().filter(l -> l%2 != 0).collect(Collectors.toList());
    }
}
-------------------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;
public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        List<Integer> res = new ArrayList(listOfNumbers);
        for (int i = 0; i < res.size(); i++)
        {
            if (res.get(i)%2 == 0)
            {
                res.remove(i);
                i--;
            }
        }
        return res;
    }
}
------------------------------------------------------------------------------
import java.util.List;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = listOfNumbers.size()-1; i >= 0; i--)
        {
            if (listOfNumbers.get(i)%2 == 0)
            {
                listOfNumbers.remove(i);
            }
        }
        return listOfNumbers;
    }
}
------------------------------------------------------------------------------
import java.util.List;
import java.util.ArrayList;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) 
    {
        List<Integer> listOfOddNumbers = new ArrayList<Integer>();
        
        for (Integer n : listOfNumbers)
        {
            if (n % 2 != 0)
            {
                listOfOddNumbers.add(n);
            }
        }
        return listOfOddNumbers;
    }
}
--------------------------------------------------------------------------
import static java.util.stream.Collectors.toList;

import java.util.List;

class Kata13December {
  static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
    return listOfNumbers.stream().filter(l -> l % 2 != 0).collect(toList());
  }
}
-------------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
      return listOfNumbers
        .stream()
        .filter(i -> i % 2 != 0)
        .collect(Collectors.toList());
    }
}
--------------------------------------------------------------------------
import java.util.List;
import static java.util.stream.Collectors.toList;

public class Kata13December {
    public static List<Integer> filterOddNumber(final List<Integer> listOfNumbers) {
        return listOfNumbers.stream()
            .filter(n -> n % 2 != 0)
            .collect(toList());
    }
}



*/