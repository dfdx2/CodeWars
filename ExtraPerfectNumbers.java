/* 7KYU CodeWars Extra Perfect Numbers

Extra perfect number is the number that first and 
last bits are set bits.

Task

Given a positive integer N , Return the extra perfect 
numbers in range from 1 to N .

*/
public class ExtraPerfectNumbers {
    public static int[] extraPerfect(int number) {
      int a = number % 2 == 0 ? number / 2 : (number / 2) + 1;
      int[] result = new int[a];
      int counter = 0;
      for (int i = 0; i <= number; i++) {
        if (i % 2 != 0) {
          result[counter] = i;
          counter++;
        }
        else {
          continue;
        }
      }
      return result;
    }
}
/*---------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution {
  public static int[] extraPerfect(final int number) {
    return IntStream.rangeClosed(1, number).filter(i -> i % 2 == 1).toArray();
  }
}
-----------------------------------------------------------------------------------
public class Solution {

    public static int[] extraPerfect(int n) {
      final int[] ary = new int[(n+1)/2];
      for (int i = 0, j = 1; i < ary.length; i++, j += 2) ary[i] = j;
      return ary;
    }
    
}
-----------------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Solution {
  public static int[] extraPerfect(int number) {
    int range = ((number & 1) == 0) ? number / 2 : number / 2 + 1;
    return IntStream.rangeClosed(1, range).map(i -> i * 2 - 1).toArray();
  }
}
-----------------------------------------------------------------------------------
public class Solution
{
    public static int[] extraPerfect(int number)
    {
        int[] r = new int[(number+1)/2];
        for(int i=0; i<r.length; i++) r[i]=1+i*2;
        return r;
    }
}
-----------------------------------------------------------------------------------
public class Solution
{
    public static int[] extraPerfect(int number)
    {
    int [] arr;
    if(number%2==0){
     arr = new int[number/2];
    }else{
     arr = new int[(number/2)+1];
    }
    for(int i =1,j=0; j<arr.length;i+=2,j++){
        arr[j]=i;
    }
        return arr; // Do your magic!
    }
}
-----------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
public class Solution
{
    public static int[] extraPerfect(int number) {
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (isExtra(i)) {
                l.add(i);
            }
        }
        return l.stream().mapToInt(i->i).toArray();
    }

    public static boolean isExtra(int number) {
        char[] s = Integer.toBinaryString(number).toCharArray();
        return s[0] == s[s.length - 1];
    }
}
-----------------------------------------------------------------------------------
import java.util.*;
public class Solution
{
    public static int[] extraPerfect(int n)
    {
    ArrayList<Integer> a=new ArrayList<Integer>();

				for(Integer i=0;i<=n;i++){
					
	String m=Integer.toBinaryString(i);
	
	if(m.charAt(0)=='1'&&m.charAt(m.length()-1)=='1')
	a.add(i);

	}
    int [] l=new int[a.size()];
    for(int k=0;k<l.length;k++)
    l[k]=a.get(k);
    return l;
       
    }
}
-----------------------------------------------------------------------------------
import static java.util.stream.IntStream.range;

class Solution {
  static int[] extraPerfect(int number) {
    return range(0, ++number).filter(i -> i % 2 != 0).toArray();
  }
}
-----------------------------------------------------------------------------------
public class Solution {
    public static int[] extraPerfect(final int number) {
        final var oneOrZero = (number & 1) == 0 ? 0 : 1;
        final var resultList = new int[(number + oneOrZero) / 2];
        var indexCounter = 0;
        for (var i = 1; i <= number; i += 2) {
            resultList[indexCounter++] = i;
        }
        return resultList;
    }
}  
*/