/*  8KYU  CodeWars   Century From Year

Introduction
The first century spans from the year 1 up to and including 
the year 100, the second century - from the year 101 up to 
and including the year 200, etc.

Task
Given a year, return the century it is in.

Examples
1705 --> 18
1900 --> 19
1601 --> 17
2000 --> 20

*/

public class CenturyFromYear {
  public static int century(int number) {
    // got a working solution will have to go back and optimize 
   // Went from 90 lines of code at the bottom down to just 1  the line below
    return (number + 99) / 100;
   
   
   /*---------------------------------------------------------------
   if (number <= 100) {
      return 1;
      }
    else if ((number >= 101) && (number <= 200)) {
      return 2;
      }
    else if ((number >= 201) && (number <= 300)) {
      return 3;
      }
    else if ((number >= 301) && (number <= 400)) {
      return 4;
      }
    else if ((number >= 401) && (number <= 500)) {
      return 5;
      }
    else if ((number >= 501) && (number <= 600)) {
      return 6;
      }
    else if ((number >= 601) && (number <= 700)) {
      return 7;
      }
    else if ((number >= 701) && (number <=800)) {
      return 8;
      }
    else if ((number >= 801) && (number <= 900)) {
      return 9;
      }
    else if ((number >= 901) && (number <= 1000)) {
      return 10;
      }
    else if ((number >= 1001) && (number <= 1100)) {
      return 11;
      }
    else if ((number >= 1101) && (number <= 1200)) {
      return 12;
      }
    else if ((number >= 1201) && (number <= 1300)) {
      return 13;
      }
    else if ((number >= 1301) && (number <= 1400)) {
      return 14;
      }
    else if ((number >= 1401) && (number <= 1500)) {
      return 15;
      }
    else if ((number >= 1501) && (number <= 1600)) {
      return 16;
      }
    else if ((number >= 1601) && (number <= 1700)) {
      return 17;
      }
    else if ((number >= 1701) && (number <= 1800)) {
      return 18;
      }
    else if ((number >= 1801) && (number <= 1900)) {
      return 19;
      }
    else if ((number >= 1901) && (number <= 2000)) {
      return 20;
      }
    else if ((number >= 2001) && (number <= 2100)) {
      return 21;
      }
    else if ((number >= 2101) && (number <= 2200)) {
      return 22;
      }
    else if ((number >= 2201) && (number <= 2300)) {
      return 23;
      }
    else if ((number >= 2301) && (number <= 2400)) {
      return 24;
      }
    else if ((number >= 2401) && (number <= 2500)) {
      return 25;
      }
    else if ((number >= 2501) && (number <= 2600)) {
      return 26;
      }
    else if ((number >= 2601) && (number <= 2700)) {
      return 27;
      }
    else if ((number >= 2701) && (number <= 2800)) {
      return 28;
      }
    else if ((number >= 2801) && (number <= 2900)) {
      return 29;
      }
    else if ((number >= 2901) && (number <= 3000)) {
      return 30;
      }
    else {
      return (number / 100) + 1;
    }   
    
    }  
}
------------------------------------------------------------------
public class Solution {
  public static int century(int number) {
    return number % 100 == 0? number / 100 : (number / 100) + 1;
  }
}
------------------------------------------------------------------
import java.lang.Math;

public class Solution {
    public static int century(int number) {
        return (int)Math.ceil((double)number/100);
    }
}
-------------------------------------------------------------------
public class Solution {
  public static int century(int number) {
    return (int)Math.ceil(number*0.01);
  }
}
------------------------------------------------------------------



*/

