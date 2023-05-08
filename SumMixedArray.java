/* 8KYU CodeWars Sum Mixed Array

Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.

*/

import java.util.List;

public class MixedSum {
  public int sum(List<?> mixed) {	
		return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
	}
}
/*------------------------------------------------------------------------------
import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  
  public int sum(List<?> mixed) {	
    int sum = 0;
  
    for (Object element : mixed)
    {
      if (element instanceof Integer)
      {
        sum += (Integer) element;
      }
      else if (element instanceof String){
      sum += Integer.parseInt( (String) element );
      }
    }
    return sum;
  }
}
------------------------------------------------------------------------------
import java.util.List;

public class MixedSum {

	public int sum(List<?> mixed) {	
    //Here, we create a new list to store all of the converted integers of the List called "mixed".
    int[] intList = new int[mixed.size()];
    //Here, we declare an integer we will be adding to. It is the sum of the converted numbers.
    int output = 0;
    //This iterates (steps) through the entirety of the mixed List.
    for(int i = 0; i < mixed.size(); i++) {
      //This converts all of the integers to strings and keeps the Strings as Strings, as adding an empty String to anything will convert it to a string,
      //and is inconsequential to an existing String. After that, parseInt turns the string into an Integer. Finally, this Integer is added to the list of
      //Integers. The reason why we must convert it to a string at all is that parseInt is not very friendly when given an Integer to convert to an Integer
      //and errors.
      intList[i] = Integer.parseInt(mixed.get(i) + "");
    } 
    //This iterates through the List of all of the converted-to-Integer values
    for(int i = 0; i < intList.length; i++) { 
      //This adds the number in the list corresponding to i (like we're asking it for the i'th number. The first number in an array is the 0'th place) in the
      //for loop to the sum we output later.
      output += intList[i];
    }
    //Here, we return the sum.
		return output;
	}
}
//I hope you found these notes helpful if you're new to coding, or even if you aren't.
//Have a wonderful day.
-----------------------------------------------------------------------------
import java.util.List;

public class MixedSum {

	public int sum(List<?> mixed) {	
  
    int x = 0;
		for(Object s: mixed){
            x+=Integer.parseInt(s.toString());
    }
    
  return x;  
	}
}
------------------------------------------------------------------------------
import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  
  public int sum(List<?> mixed) {	
  
    return mixed.stream()
              .map(Object::toString)
              .map(Integer::valueOf)
              .reduce(0, (a, b) -> a + b);
  }
}
------------------------------------------------------------------------------
import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  
  public int sum(List<?> mixed) {
    return mixed.stream().mapToInt(i -> Integer.parseInt(String.valueOf(i))).sum();
}
}
---------------------------------------------------------------------------
import java.util.List;

public class MixedSum {

	public int sum(List<?> mixed) {	
		if (mixed == null || mixed.isEmpty()) {
      return 0;
    }
    return mixed.stream()
        .map(o -> o instanceof String ? Integer.valueOf((String) o) : (Integer) o)
        .mapToInt(i -> i)
        .sum();
  }
}
----------------------------------------------------------------------------
import java.util.List;

public class MixedSum {

  public int sum(List<?> mixed) {	
    int sum = 0;
    for (Object o : mixed) sum += Integer.valueOf("" + o);
		return sum;
	}
  
}


*/