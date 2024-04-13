/* 6KYU CodeWars Baby Magpies

It is a little known fact^ that the black & white colours of baby 
magpies differ by at least one place and at most two places from 
the colours of the mother magpie.

So now you can work out if any two magpies may be related.

...and Quardle oodle ardle wardle doodle the magpies said

Kata Task
Given the colours of two magpies, determine if one is a possible 
child or grand-child of the other.

Notes
Each pair of birds being compared will have same number of colour areas
B = Black
W = White
Example
Given these three magpies

You can see:

Magpie 2 may be a child of Magpie 1 because there is only one difference
Magpie 3 may be child of Magpie 2 because there are two differences
So Magpie 3 may be a grand-child of Magpie 1
On the other hand, Magpie 3 cannot be a child of Magpie 1 because there are 
three differences

*/
public class Dinglemouse {

  public static boolean child(final String bird1, final String bird2) {
    int result = 0;
    for (int i = 0; i < bird1.length(); i++) {
      if (bird1.charAt(i) != bird2.charAt(i)) {
        result++;
      }
    }
    return result > 0 && result < 3;
  }
  
  public static boolean grandchild(final String bird1, final String bird2) {
    int result = 0;
    for (int i = 0; i < bird1.length(); i++) {
      if (bird1.charAt(i) != bird2.charAt(i)) {
        result++;
      }
    }
    return bird1.length() > 1 && result < 5 || result == 0;
  }
}
/*----------------------------------------------------------------------------
public class Dinglemouse {

 	public static boolean child(final String bird1, final String bird2) {
		int dif = getDiferences(bird1, bird2);
		return dif >= 1 && dif <= 2;
	}

	public static boolean grandchild(final String bird1, final String bird2) {
		int dif = getDiferences(bird1, bird2);
		return ((dif >= 0 && dif <= 4) && bird1.length() > 1) || (dif == 0 && bird1.length() == 1);
	}

	public static int getDiferences(final String bird1, final String bird2) {
		int diferences = 0;
		for (int i = 0; i < bird1.length(); i++)
			if (bird1.charAt(i) != bird2.charAt(i))
				diferences++;
		return diferences;
	}

}
------------------------------------------------------------------------------
public class Dinglemouse {

  public static boolean child(final String bird1, final String bird2) {
    final int d = distance(bird1, bird2);
    return 1 <= d && d <= 2;
  }
  
  public static boolean grandchild(final String bird1, final String bird2) {
    final int d = distance(bird1, bird2);
    return bird1.length() == 1 ? d == 0 : d <= 4;
  }
  
  static int distance(final String s1, final String s2) {
    assert(s1.length() == s2.length());
    int d = 0;
    for (int i = 0; i < s1.length(); i++)
      if (s1.charAt(i) != s2.charAt(i))
        d++;
    return d;
  }

}
-------------------------------------------------------------------------------
public class Dinglemouse {

  public static boolean child(String bird1, String bird2) {
    int differs = 0;
    var splt1 = bird1.split("");
    var splt2 = bird2.split("");
    for (var x = 0; x < splt1.length; x++){
      if (!splt1[x].equals(splt2[x])){
        differs ++;
      }
    }
    if (differs >= 1 && differs <= 2){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean grandchild(String bird1, String bird2) {
    if (bird1.length() == 1 && !bird1.equals(bird2)){
      return false;
    }
    int differs = 0;
    var splt1 = bird1.split("");
    var splt2 = bird2.split("");
    for (var x = 0; x < splt1.length; x++){
      if (!splt1[x].equals(splt2[x])){
        differs ++;
      }
    }
    if (differs >= 0 && differs <= 4){
      return true;
    }
    else{
      return false;
    }
  }
}
-------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

interface Dinglemouse {
  static boolean child(String bird1, String bird2) {
    long diff = range(0, bird1.length()).filter(i -> bird1.charAt(i) != bird2.charAt(i)).count();
    return diff > 0 && diff < 3;
  }

  static boolean grandchild(String bird1, String bird2) {
    long diff = range(0, bird1.length()).filter(i -> bird1.charAt(i) != bird2.charAt(i)).count();
    return diff == 0 || bird1.length() > 1 && diff < 5;
  }
}
-------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Dinglemouse {

  public static boolean child(final String bird1, final String bird2) {
        if (bird1.length() != bird2.length()) {
            return false;
        }
        int counter = compareCount(bird1, bird2);
        return counter > 0 && counter < 3;
    }

    public static boolean grandchild(final String bird1, final String bird2) {
        if (bird1.length() != bird2.length()) {
            return false;
        }
        int counter = compareCount(bird1, bird2);
        return (bird1.length() == 1 && counter == 0 || bird1.length() > 1 && counter >= 0) && counter < 5;
    }

    private static int compareCount(final String bird1, final String bird2) {
        return (int) IntStream.range(0, bird1.length()).filter(n -> bird1.charAt(n) != bird2.charAt(n)).count();
    }

}
-------------------------------------------------------------------------------
public class Dinglemouse {

    public static boolean child(final String bird1, final String bird2) {
        int total = 0;
        for (int i = 0; i < bird1.length(); i++) {
            if (bird1.charAt(i) != bird2.charAt(i)) {
                total++;
            }
        }
        return total >= 1 && total < 3;
    }

    public static boolean grandchild(final String bird1, final String bird2) {
        int total = 0;
        for (int i = 0; i < bird1.length(); i++) {
            if (bird1.charAt(i) != bird2.charAt(i)) {
                total++;
            }
        }
        if (bird1.length() == 1 && total == 1) {
            return false;
        }
        if (total >=0 && total <= 4) {
            return true;
        }
        return false;
    }

}
--------------------------------------------------------------------------------
public class Dinglemouse {

  public static boolean child     (final String bird1, final String bird2) { return countDiff(bird1, bird2, 1, 2, false); }
  public static boolean grandchild(final String bird1, final String bird2) { return countDiff(bird1, bird2, 0, 4, true); }
  
  private static boolean countDiff(final String bird1, final String bird2, final int low, final int high, final boolean isGC) {
      int diff = 0, i = -1;
    for (char c: bird1.toCharArray()) {i++;
        if (c != bird2.charAt(i)) diff += 1;
    }
    return diff >= low && diff <= high && (!isGC || bird1.length() != 1 || diff != 1);
  }
}
--------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Dinglemouse {

  public static boolean child(final String bird1, final String bird2) {
  	int changes = getDifferences(bird1, bird2);
  	return changes > 0 && changes < 3;
  }
  
  private static int getDifferences(String s1, String s2){
  	return (int)IntStream.range(0, s1.length()).filter(i->s1.charAt(i)!=s2.charAt(i)).count();
	}

	public static boolean grandchild(final String bird1, final String bird2) {
		int changes = getDifferences(bird1, bird2);
		return bird1.length() == 1 ? changes == 0 : changes <= 4;
  }

}
--------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Dinglemouse {

  public static boolean child(final String bird1, final String bird2) {
    final int nDiff = countDiff(bird1, bird2);
    return 0 < nDiff && nDiff < 3;
  }

  public static boolean grandchild(final String bird1, final String bird2) {
    if (bird1.length() == 1) return bird1.equals(bird2);
    final int nDiff = countDiff(bird1, bird2);
    return -1 < nDiff && nDiff < 5;
  }
  
  private static int countDiff(final String bird1, final String bird2) {
    return (int) IntStream.range(0, bird1.length()).filter(i -> (bird1.charAt(i) != bird2.charAt(i))).count();
  }
}
*/