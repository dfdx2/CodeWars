/* 6KYU CodeWars Two Sets Of Equal Sum

Task

If possible, divide the integers 1,2,…,n into two sets of equal sum.

Input

A positive integer n <= 1,000,000.

Output

If it's not possible, return [ ] (Python, Javascript, Swift, Ruby) 
or ( ) (Python) or [ [],[] ] (Java, C#, C++, Kotlin) or None (Scala).
If it's possible, return two disjoint sets. Each integer from 1 to n 
must be in one of them. The integers in the first set must sum up to 
the same value as the integers in the second set. The sets can be 
returned in a tuple, list, or array, depending on language.

Examples:

For n = 8, valid answers include:

[1, 3, 6, 8], [2, 4, 5, 7] (or [[1, 3, 6, 8], [2, 4, 5, 7]])

[8, 1, 3, 2, 4], [5, 7, 6]

[7, 8, 3], [6, 1, 5, 4, 2], and others.

For n = 9 it is not possible. For example, try [6, 8, 9] and [1, 2, 3, 4, 5, 7], 
but the first sums to 23 and the second to 22. No other sets work either.

Source: CSES

*/

import java.util.ArrayList;
import java.util.List;

public class CreateTwoSetsOfEqualSum {
    
    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
      // Divide the numbers 1,2,…,n into two sets of equal sum.
      
      // NOTE: If it's not possible, return an List of two empty Lists, i.e. [ [ ], [ ] ].
      // The code below does not do this, because it returns [ ].
      // You need to create the two sets/lists yourself, even if they are empty.
      
      List<List<Integer>> sets = List.of(new ArrayList<>(), new ArrayList<>());
      if (n % 4 == 1 || n % 4 == 2) {
        return sets;
      }
      long[] g = new long[2];
      for (int i = n; i > 0; i--) {
        int a = g[0] > g[1] ? 1 : 0;
        sets.get(a).add(i);
        g[a] += i;
      }
      
      return sets;
    }
}
/*---------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class CreateTwoSetsOfEqualSum {
  public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
    
    final List<List<Integer>> res = new ArrayList<>();
    res.add(new ArrayList<Integer>());
    res.add(new ArrayList<Integer>());
    if (n % 4 == 1 || n % 4 == 2) return res;
    
    final long[] m = new long[2];
    for (int a = n; a > 0; a--) {
      int i = m[0] > m[1] ? 1 : 0;
      res.get(i).add(a);
      m[i] += a;
    }
    
    return res;
  }
}
-----------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class CreateTwoSetsOfEqualSum {
    
    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
      
      final List<Integer> leftBucket = new ArrayList<>();
      final List<Integer> rightBucket = new ArrayList<>();
      final List<List<Integer>> sets = new ArrayList<>();
      sets.add(leftBucket);
      sets.add(rightBucket);
      
      // Put everything in a bucket.
      long sumOfBucket = 0;
      final List<Integer> bucket = new ArrayList<>();
      for( int i = 1; i <= n; i++ ) {
          bucket.add(i);
          sumOfBucket += i;
      }
      
      if( sumOfBucket % 2 == 1 ) {
          return sets;
      }
      
      // Remove numbers from bucket and put into either left or right bucket.
      long sumOfRightBucket = 0;
      for( int i = bucket.size() - 1; i >= 0; i-- ) {
          int num = bucket.get(i);
          if( num + sumOfRightBucket <= sumOfBucket - num ) {
              rightBucket.add(num);
              bucket.remove(i);
              sumOfRightBucket += num;
              sumOfBucket -= num;
          } 
      }
      
      // Add everything remaining to the left bucket.
      leftBucket.addAll(bucket);
      
      return sets;
    }
}
-----------------------------------------------------------------
import java.util.*;

public class CreateTwoSetsOfEqualSum {
    
    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
        
        List<Integer> summa = new ArrayList<>();
        List<Integer> summb = new ArrayList<>();
        long summax = 0;
        long summbx = 0;
        for (int i = n; i >= 1; i--) {
            if (summax < summbx) {
                summa.add(i);
                summax += i;
            } else {
                summb.add(i);
                summbx += i;
            }
        }
        if (summax != summbx) {
            summa.clear();
            summb.clear();
        }
        final List<List<Integer>> sets = new ArrayList<>();
        sets.add(summa);
        sets.add(summb);
        return sets;
    }
}
-----------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

interface CreateTwoSetsOfEqualSum {
  static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
    List<List<Integer>> groups = List.of(new ArrayList<>(), new ArrayList<>());
    if (n % 4 == 1 || n % 4 == 2) {
      return groups;
    }

    long[] sums = new long[2];
    for (int i = n; i > 0; i--) {
      int group = sums[0] > sums[1] ? 1 : 0;
      groups.get(group).add(i);
      sums[group] += i;
    }
    return groups;
  }
}
-----------------------------------------------------------------
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class CreateTwoSetsOfEqualSum {
    
    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
        final List<List<Integer>> sets = new ArrayList<>();
        BigInteger sum = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n + 1)).divide(BigInteger.TWO);
        if (sum.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
            sets.add(new ArrayList<>());
            sets.add(new ArrayList<>());
        } else {
            List<Integer> firstSet = new ArrayList<>();
            List<Integer> secondSet = new ArrayList<>();
            if (n % 2  == 0) {
                for (int i = 1; i <= n / 2; i++) {
                    if (i <= n / 4) {
                        firstSet.add(i);
                        firstSet.add(n + 1 - i);
                    } else {
                        secondSet.add(i);
                        secondSet.add(n + 1 - i);
                    }
                }

            } else {
                BigInteger half = sum.divide(BigInteger.TWO);
                BigInteger firstSum = BigInteger.ZERO;
                int k = n, j = 0;
                for (int i = n; i >= 0; i--) {
                    BigInteger temp = firstSum.add(BigInteger.valueOf(i));
                    if (temp.compareTo(half) <= 0) {
                        firstSum = temp;
                        firstSet.add(i);
                    } else {
                        k = i;
                        break;
                    }
                }
                if (firstSum.compareTo(half) < 0) {
                    j = half.subtract(firstSum).intValue();
                    firstSet.add(j);
                }
                for (int i = 1; i <= k; i++) {
                    if (i != j) {
                        secondSet.add(i);
                    }
                }
            }
            sets.add(firstSet);
            sets.add(secondSet);
        }
        return sets;
    }
}
-----------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class CreateTwoSetsOfEqualSum {
    
    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
      long total = (long)n*(n+1)/2;
      System.out.println("total = "+total);
      
      ArrayList<Integer> left = new ArrayList<>();
      ArrayList<Integer> right = new ArrayList<>();
      List<List<Integer>> sets = new ArrayList<>();
      
      if (total%2 != 0){
        System.out.println("Not possible");
        sets.add(left);
        sets.add(right);
        return sets;
      }
      
      long target = total / 2;
      System.out.println("Target: " + target);
      long sum = 0;
      
      for (int i = n; i >= 1; i--){
        if (sum+i <= target){
          sum += i;
          left.add(i);
        } else {
          right.add(i);
        }
      }
      
      sets.add(left);
      sets.add(right);
      return sets;
    }
}
-----------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class CreateTwoSetsOfEqualSum {

    public static List<List<Integer>> createTwoSetsOfEqualSum(int n) {
        List<List<Integer>> sets = new ArrayList<>();
        List<Integer> set1 = new ArrayList<>();
        List<Integer> set2 = new ArrayList<>();

        // Calculate the sum of the first n natural numbers
        long sum = (long) n * (n + 1) / 2;

        // If the sum is odd, it's not possible to divide into two equal sets
        if (sum % 2 != 0) {
            sets.add(new ArrayList<>());
            sets.add(new ArrayList<>());
            return sets;
        }

        // Target sum for each set
        long target = sum / 2;

        // Initialize a boolean array to mark the numbers included in set1
        boolean[] included = new boolean[n + 1];

        // We will use a greedy approach to fill the sets
        for (int i = n; i > 0; i--) {
            if (target >= i) {
                set1.add(i);
                target -= i;
                included[i] = true;
            }
        }

        // Fill set2 with the remaining numbers
        for (int i = 1; i <= n; i++) {
            if (!included[i]) {
                set2.add(i);
            }
        }

        sets.add(set1);
        sets.add(set2);
        return sets;
    }


    private static boolean validateSets(List<List<Integer>> sets) {
        if (sets.size() != 2) return false;
        long sum1 = sets.get(0).stream().mapToLong(Integer::intValue).sum();
        long sum2 = sets.get(1).stream().mapToLong(Integer::intValue).sum();
        return sum1 == sum2;
    }
}
*/