/* 7KYU CodeWars Last Survivor

You are given a string of letters and an array of numbers.
The numbers indicate positions of letters that must be removed, 
in order, starting from the beginning of the array.
After each removal the size of the string decreases (there is no empty space).
Return the only letter left.

Example:

    str = "zbk", arr = {0, 1}
    str = "bk", arr = {1}
    str = "b", arr = {}
    return "b"

Notes

The given string will never be empty.
The length of the array is always one less than the length of the string.
All numbers are valid.
There can be duplicate letters and numbers.

*/
public class LastSurvivor {
  public static String lastSurvivor(String letters, int[] coords) {
    StringBuilder sb = new StringBuilder(letters);
    for (int i = 0; i < coords.length; i++) {
      sb.deleteCharAt(coords[i]);
    }
    return sb.toString();
  }
}
/*----------------------------------------------------------------------
public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder sb = new StringBuilder(letters);
        for (int i : coords) {
          sb.deleteCharAt(i);
        }
        return sb.toString();
    }
}
------------------------------------------------------------------------
public class Kata {

	public static String lastSurvivor(String letters, int[] coords) {
		for (int index : coords) {
			letters = letters.substring(0, index) + letters.substring(index + 1);
		}
		return letters;
	}

}
------------------------------------------------------------------------
public class Kata {
  
  public static String lastSurvivor(String s, int[] arr) {
    for (int a : arr) s = s.substring(0, a) + s.substring(a+1);
    return s;
  } 
}
------------------------------------------------------------------------
import java.util.*;

public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
      StringBuilder result = new StringBuilder(letters);
      Arrays.stream(coords).forEach(result::deleteCharAt);
      return result.toString();
    }
}
------------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {

        List<Character> lettersCharacterList = letters
                .chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toList());

        for (int coord : coords) {
            lettersCharacterList.remove(coord);
        }

        return lettersCharacterList.stream().map(Object::toString).collect(Collectors.joining());
    }
}
------------------------------------------------------------------------
import java.util.*;

public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
        for(int i = 0; i < coords.length; i++) {
            letters = letters.substring(0, coords[i]) + letters.substring(coords[i] + 1);
        }
        return letters;
    }
}
*/
