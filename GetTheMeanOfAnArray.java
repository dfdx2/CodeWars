/* 8KYU CodeWars Get The Mean Of An Array

It's the academic year's end, fateful moment of 
your school report. The averages must be calculated. 
All the students come to you and entreat you to 
calculate their average for them. Easy ! You just need 
to write a script.

Return the average of the given array rounded down to 
its nearest integer.

The array will never be empty.

*/

public class School{
 	public static int getAverage(int[] marks){
		int result = 0;
    for (int i = 0; i < marks.length; i++) {
      result += marks[i];
    }
    result = result / marks.length;
    return result;
	}
}
/*--------------------------------------------------------------
public class School{

 	public static int getAverage(int[] marks){
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }
   
    return sum / marks.length;
	}

}
--------------------------------------------------------------------
import java.util.*;
public class School{

 	public static int getAverage(int[] marks){
		return (int) Arrays.stream(marks).average().orElse(Double.NaN);
	}

}
---------------------------------------------------------------------
import java.util.stream.*;

public class School{

 	public static int getAverage(int[] marks){
		return (IntStream.of(marks).sum())/marks.length;
	}

}
---------------------------------------------------------------------
*/