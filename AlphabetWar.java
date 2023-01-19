/* 7KYU CodeWars Alphabet War

Introduction

There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between 
left side letters and right side letters was too high and 
the war began.

Task

Write a function that accepts fight string consists of only 
small letters and return who wins the fight. When the left 
side wins return Left side wins!, when the right side wins 
return Right side wins!, in other case return Let's fight again!.

The left side letters and their power:

 w - 4
 p - 3
 b - 2
 s - 1

 The right side letters and their power:

 m - 4
 q - 3
 d - 2
 z - 1

 The other letters don't have power and are only victims.

Example

AlphabetWar("z");        //=> Right side wins!
AlphabetWar("zdqmwpbs"); //=> Let's fight again!
AlphabetWar("zzzzs");    //=> Right side wins!
AlphabetWar("wwwwwwz");  //=> Left side wins!

*/

public class Kata{
    public static String alphabetWar(String fight){
      int left = 0;
      int right = 0;
      for (int i = 0; i < fight.length(); i++) {
        if (fight.charAt(i) == 'w') {
          left += 4;
        }
        else if (fight.charAt(i) == 'p') {
          left += 3;
        }
        else if (fight.charAt(i) == 'b') {
          left += 2;
        }
        else if (fight.charAt(i) == 's') {
          left += 1;
        }
        else if (fight.charAt(i) == 'm') {
          right += 4;
        }
        else if (fight.charAt(i) == 'q') {
          right += 3;
        }
        else if (fight.charAt(i) == 'd') {
          right += 2;
        }
        else if (fight.charAt(i) == 'z') {
          right += 1;
        }
        else {
          left += 0;
          right += 0;
        }
      }  
      if (left == right) {
        return "Let's fight again!";
      } 
      return (left > right) ? "Left side wins!" : "Right side wins!";
    }
}
/*-------------------------------------------------------------------
public class Kata{
    public static String alphabetWar(String fight){
      int right = 0, left = 0;
      for (char c : fight.toCharArray()) {
        switch (c) {
          case 'w' : left += 4; break;
          case 'p' : left += 3; break;
          case 'b' : left += 2; break;
          case 's' : left += 1; break;
          
          case 'm' : right += 4; break;
          case 'q' : right += 3; break;
          case 'd' : right += 2; break;
          case 'z' : right += 1; break;
        }
      }
      if (left == right) return "Let's fight again!";
      return (left > right ? "Left" : "Right") + " side wins!";
    }
 }
---------------------------------------------------------------------
public class Kata{
    public static String alphabetWar(String fight){
        String lpower = "wpbs_zdqm";
        
        int result = fight.chars()
                          .reduce(0, (a, b) -> a + (lpower.indexOf(b)==-1 ? 0 : lpower.indexOf(b)-4));
                          
        return result == 0 ? "Let's fight again!" : (result < 0 ? "Left" : "Right") + " side wins!";
    }
}
------------------------------------------------------------------------
import java.util.HashMap;

public class Kata{
    public static String alphabetWar(String fight){
      HashMap<Character, Integer> letters = new HashMap<>();
      letters.put('w', 4);
      letters.put('p', 3);
      letters.put('b', 2);
      letters.put('s', 1);
      letters.put('m', -4);
      letters.put('q', -3);
      letters.put('d', -2);
      letters.put('z', -1);
      
      int total = 0;
      
      for (Character letter : fight.toCharArray()){
        if (letters.containsKey(letter)) 
          total += letters.get(letter);
      }
      
      if (total == 0) return "Let's fight again!";
      return total > 0 ? "Left side wins!" : "Right side wins!";
    }
}
-------------------------------------------------------------------
class Kata {
  static String alphabetWar(String fight) {
    int t = fight.chars().reduce(0, (a, b) -> (b = "wpbs0zdqm".indexOf(b)) < 0 ? a : a + b - 4);
    return t == 0 ? "Let's fight again!" : (t < 0 ? "Left" : "Right") + " side wins!";
  }
}
---------------------------------------------------------------------
public class Kata{
   public static String alphabetWar(String fight){
// declare a variable sum
    	int sum = 0;
// find if the string contains the letters above
    	for(int i=0;i<fight.length();i++) {
    		switch(fight.charAt(i)) {
// for each letter existing in the left add the value of the letter
    		case 'w':
    			sum = sum + 4;
    			break;
    		case 'p':
    			sum = sum + 3;
    			break;
    		case 'b':
    			sum = sum + 2;
    			break;
    		case 's':
    			sum = sum + 1;
    			break;
//  for each letter existing in the right decrease the value of the letter
    		case 'm':
    			sum = sum - 4;
    			break;
    		case 'q':
    			sum = sum - 3;
    			break;
    		case 'd':
    			sum = sum - 2;
    			break;
    		case 'z':
    			sum = sum - 1;
    			break;
    		default:
    			break;
    		}
    	}
 /* if sum = 0 return "Let's fight again"
 * if sum < 0 return "Right side wins!"
 * if sum > 0 return "Left side wins!"
String message ="";
if(sum==0) {
  message = "Let's fight again!";
}
if(sum<0) {
  message = "Right side wins!";
}
if(sum>0) {
  message = "Left side wins!";
}
return message;
}
}
--------------------------------------------------------------------
import java.util.*;

public class Kata{
    
    public static String LEFT_WIN = "Left side wins!";
    public static String RIGHT_WIN = "Right side wins!";
    public static String DRAW_GAME = "Let's fight again!";
    
    public static Map<String,Integer> leftMap = new HashMap<>();
    public static Map<String,Integer> rightMap = new HashMap<>();

    static{
      leftMap.put("w",4);
      leftMap.put("p",3);
      leftMap.put("b",2);
      leftMap.put("s",1);
      rightMap.put("m",4);
      rightMap.put("q",3);
      rightMap.put("d",2);
      rightMap.put("z",1);
    }

    public static String alphabetWar(String fight){
        long left = 0,right = 0;
        for(String str : fight.split("")){
            if(leftMap.containsKey(str)){
                left += leftMap.get(str);
            }
            else if(rightMap.containsKey(str)){
                right += rightMap.get(str);
            }
        }
        return left==right?DRAW_GAME:left>right?LEFT_WIN:RIGHT_WIN;

    }
    

}

*/