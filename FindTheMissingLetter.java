/* 6KYU Find The Missing Letter

Write a method that takes an array of consecutive (increasing) letters 
as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one 
letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'
(Use the English alphabet with 26 letters!)

Have fun coding it and please don't forget to vote and rank this kata! :-)

I have also created other katas. Take a look if you enjoyed this kata!


*/

public class Kata {
  
    public static char findMissingLetter(char[] array) {
      String letters = "abcdefghijklmnopqrstuvwxyz";
      letters = letters + letters.toUpperCase();
      int x = letters.indexOf(array[0]);
      for (int i = 0; i < array.length; i++) {
        if (letters.charAt(x + i) != array[i]) {
          return (char) ((int) array[i] - 1);
        }
      }
      return ' ';
    }
  }
/*-----------------------------------------------------------------------------
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
-------------------------------------------------------------------------------
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
---------------------------------------------------------------------------------
public class Kata {

  public static char findMissingLetter(char[] array) {
    for (int i=1; i<array.length; i++) {
      if (array[i]-array[i-1]!=1) return (char)(array[i]-1);
    }
    return '?';
  }
  
}
-----------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Kata
{
  public static char findMissingLetter(char[] array)
  {
      int index = IntStream.range(0, array.length-1).filter(i -> array[i] != array[i+1]-1).findFirst().getAsInt();
      return (char)(array[index] + 1);
  }
}
-----------------------------------------------------------------------------
public class Kata
{
  public static char findMissingLetter(char[] array) {
  
    char start = array[0];
    for (char c: array) {
      if (start != c) return start;
      start++;
    }
    return ' ';
  }
}






*/