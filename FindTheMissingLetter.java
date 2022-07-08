/*
#Find the missing letter
Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.
Example:
['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'
*/

import java.util.*;
import java.util.stream.*;
public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    int[] nums = new String(array).chars().sorted().toArray();
    int pos = IntStream.range(1, nums.length).filter(index -> (nums[index] - nums[index-1] != 1)).findFirst().getAsInt();
    return (char) (nums[pos]-1);
  }
}
/*________________________________________________________________________________________
public class Kata
{
  public static char findMissingLetter(char[] array){
    char expectableLetter = array[0];
    for(char letter : array){
      if(letter != expectableLetter) break;
      expectableLetter++;
    }
    return expectableLetter;
}
}
___________________________________________________________________________________________

public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    boolean stop = false;
    int i;
    for(i = 1; i < array.length && !stop; i++)
    {
      if (array[i] - array[i-1] != 1)
        stop = true;
    }
    return (char) (array[i-1]-1);
  }
}
____________________________________________________________________________________________

public class Kata {

  public static char findMissingLetter(char[] array) {
    for (int i=1; i<array.length; i++) {
      if (array[i]-array[i-1]!=1) return (char)(array[i]-1);
    }
    return '?';
  }
  
}
___________________________________________________________________________________________
public class Kata
{
  public static char findMissingLetter(char[] array)
  {
    for (int i = 1; i < array.length ; i++){
      if(array[i] - array[i-1] != 1){
        return (char)(array[i-1]+1); 
      }
    }
    throw new IllegalArgumentException("Should not happen!");
  }
}
___________________________________________________________________________________________
*/
