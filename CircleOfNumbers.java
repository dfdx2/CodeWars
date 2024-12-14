/* 7KYU CodeWars Simple Fun #2 Circle of Numbers

Task

Consider integer numbers from 0 to n - 1 written down along the 
circle in such a way that the distance between any two neighbouring 
numbers is equal (note that 0 and n - 1 are neighbouring, too).

Given n and firstNumber/first_number/first-number, find the number 
which is written in the radially opposite position to firstNumber.

Example

For n = 10 and firstNumber = 2, the output should be 7


Input/Output
[input] integer n

A positive even integer.

Constraints: 4 ≤ n ≤ 1000.

[input] integer firstNumber/first_number/first-number

Constraints: 0 ≤ firstNumber ≤ n - 1

[output] an integer

*/
public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
      return (n / 2 + firstNumber) % n;
    }
}
/*------------------------------------------------------------------
import java.util.Hashtable;
public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
		// your code here
		int mid = (int) Math.floor(n / 2);

		Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();

		for (int i = 0; i < mid; i++) {

			int curVal = i;
			int oppositeVal = i + mid;

			map.put(curVal, oppositeVal);
			map.put(oppositeVal, curVal);
		}

		return map.get(firstNumber);
	}
}
--------------------------------------------------------------------
public class CircleOfNumbers 
{
    public static int circleOfNumbers(int n, int firstNumber) 
    {
      int middle = n / 2;
      int move = firstNumber;
      int result = middle + move;
      if (result < n)
      {
        return result;
      }     
      int laps = (result / n);
      int position = result - (laps * n);
      return position;
    }
}
--------------------------------------------------------------------
public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int startingNumber) {
		if(inputIsCorrect(n, startingNumber)) {
			return findOppositeNumber(n, startingNumber);
		}
		return 0;
	}

	private static boolean inputIsCorrect(int n, int startingNumber) {
		return(n % 2 == 0 && n >= 4 && n <= 1000 && startingNumber >= 0 && startingNumber <= n);
	}

	private static int findOppositeNumber(int n, int startingNumber) {
		int endingNumber = startingNumber + n / 2;
		return endingNumber > n - 1 ? endingNumber - n : endingNumber;
	}
}
--------------------------------------------------------------------
public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
       return firstNumber < (n/2) ? firstNumber + n/2 : firstNumber - n/2;
    }
}
--------------------------------------------------------------------
public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
      int midNumber = n / 2;
       return (midNumber + firstNumber) % n;
    }
}
--------------------------------------------------------------------
public class CircleOfNumbers {
  public static int circleOfNumbers(int n, int fst) {
    return fst*2 < n ? n/2 + fst : fst - n/2;
  }
}
*/