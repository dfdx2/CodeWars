/* 6KYU CodeWars Count The Smiley Faces!

Given an array (arr) as an argument complete the function 
countSmileys that should return the total number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can 
be marked as : or ;

A smiley face can have a nose but it does not have to. Valid 
characters for a nose are - or ~

Every smiling face must have a smiling mouth that should be 
marked with either ) or D

No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
Note
In case of an empty array return 0. You will not be tested with 
invalid input (input will always be an array). Order of the face 
(eyes, nose, mouth) elements will always be the same.

*/

import java.util.*;
public class SmileFaces {
  public static int countSmileys(List<String> arr) {
    return (int) arr.stream().filter(x -> x.matches("[:;][-~]?[)D]")).count();
  }
}
/*-------------------------------------------------------------------
import java.util.*;

public class SmileFaces {

 static String validSmilyFaces =  ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";

  
  public static int countSmileys(List<String> arr) {
      int counter = 0;
      
      for (int i =0; i < arr.size(); i++){
      
        if (validSmilyFaces.contains(arr.get(i))){
            counter++;
        }
      }
      return counter;
  }
}
----------------------------------------------------------------------
import java.util.*;
import java.util.regex.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      return (int) arr.stream()
        .filter(e -> e.matches("[:;][-~]?[\\)D]"))
        .count();
  }
}
-----------------------------------------------------------------------
import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      return (int) arr.stream().filter(s -> s.matches("^[:;][-~]?[)D]$")).count();
  }
}
----------------------------------------------------------------------
import java.util.*;

public class SmileFaces {

  public static final List<Character> EYES = getEyesList();
  public static final List<Character> NOSES = getNoseList();
  public static final List<Character> MOUTHS = getMouthList();
  
  public static int countSmileys(List<String> arr) {
      return (int)arr.stream().filter(smiley -> isSmiley(smiley)).count();
  }
  
  private static Boolean isSmiley(String smiley) {
    if (isEyes(smiley.charAt(0)) && isMouth(smiley.charAt(smiley.length()-1))) {
      if (smiley.length() == 2) return true;
      if (smiley.length() == 3 && isNose(smiley.charAt(1))) return true;
    }
    return false;     
  }
  
  private static Boolean isEyes(Character character) {
    return EYES.contains(character);  
  }
  
  private static Boolean isNose(Character character) {
    return NOSES.contains(character);  
  }
  
  private static Boolean isMouth(Character character) {
    return MOUTHS.contains(character);  
  }
  
  private static final List<Character> getEyesList() {
    List<Character> eyesList = new ArrayList();
    eyesList.add(':');
    eyesList.add(';');
    return eyesList;
  }
  
  private static final List<Character> getNoseList() {
    List<Character> noseList = new ArrayList();
    noseList.add('-');
    noseList.add('~');
    return noseList;
  }
  
  private static final List<Character> getMouthList() {
    List<Character> mouthList = new ArrayList();
    mouthList.add(')');
    mouthList.add('D');
    return mouthList;
  }
}
*/