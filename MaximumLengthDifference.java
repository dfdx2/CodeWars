/* 7KYU CodeWars Maximum Length Difference

You are given two arrays a1 and a2 of strings. Each string is composed with 
letters from a to z. Let x be any string in the first array and y be any 
string in the second array.

Find max(abs(length(x) − length(y)))

If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) 
where you will return Nothing (None).

Example:
a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
mxdiflg(a1, a2) --> 13
Bash note:
input : 2 strings with substrings separated by ,
output: number as a string

*/

class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
      if (a1.length == 0 || a2.length == 0) {
        return -1;
      }
      int m1 = 0;
      int m2 = 0;
      for (String x : a1) {
        for (String y : a2) {
          m1 = Math.abs(x.length() - y.length());
          if (m1 > m2) {
            m2 = m1;
          }          
        }
      }
      return m2;
    }
}
/*---------------------------------------------------------------------
class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1.length==0||a2.length==0)
            return -1;

        int b1=0, b2=0;
        int l1=Integer.MAX_VALUE, l2=Integer.MAX_VALUE;

        for (String s : a1) {
            b1 = Math.max(b1, s.length());
            l1 = Math.min(l1, s.length());
        }
        for (String s : a2) {
            b2 = Math.max(b2, s.length());
            l2 = Math.min(l2, s.length());
        }

        return Math.max(Math.abs(b2-l1), Math.abs(b1-l2));
    }
}
-------------------------------------------------------------------------------
import java.util.Arrays;
class MaxDiffLength {
  public static int mxdiflg(String[] a1, String[] a2) {
    if(a1.length == 0 || a2.length == 0) return -1;
    return Math.max(Arrays.stream(a1).mapToInt(s -> s.length()).max().getAsInt() - Arrays.stream(a2).mapToInt(s -> s.length()).min().getAsInt(),
                    Arrays.stream(a2).mapToInt(s -> s.length()).max().getAsInt() - Arrays.stream(a1).mapToInt(s -> s.length()).min().getAsInt());
  }
}
----------------------------------------------------------------------------------
class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        int max = -1;
        for(int i = 0; i < a1.length; i++)
          for(int j = 0; j < a2.length; j++)
            max = Math.max(max,Math.abs(a1[i].length()-a2[j].length()));
        return max;
    }
}
-----------------------------------------------------------------------------
class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
		
    if(a1.length == 0 || a2.length == 0) return -1;
    
		int maxLength = 0;
		
		for(String a1String: a1) {
			
			for(String a2String: a2) {
      
				int difference = Math.abs(a1String.length() - a2String.length());
				if(difference > maxLength) maxLength = difference;
        
			}
			
		}
		
		return maxLength;
	
	}
}
--------------------------------------------------------------------------
class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
      int res = -1;
      for (String x : a1)
        for (String y : a2)
          res = Math.max(res, Math.abs(x.length() - y.length()));
      return res;
    }
}
---------------------------------------------------------------------------
import java.util.Arrays;

class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0)
            return -1;

        int min1 = Arrays.stream(a1).min((o1, o2) -> Integer.compare(o1.length(), o2.length())).get().length();
        int max1 = Arrays.stream(a1).max((o1, o2) -> Integer.compare(o1.length(), o2.length())).get().length();
        int min2 = Arrays.stream(a2).min((o1, o2) -> Integer.compare(o1.length(), o2.length())).get().length();
        int max2 = Arrays.stream(a2).max((o1, o2) -> Integer.compare(o1.length(), o2.length())).get().length();

        return Math.max(max2 - min1, max1 - min2);
    }
}


*/