/* 7KYU CodeWars Ten Green Bottles

Who knows the nursery rhyme Ten Green Bottles?

Lyrics:

Ten green bottles hanging on the wall,
Ten green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be nine green bottles hanging on the wall.

Nine green bottles hanging on the wall,
Nine green bottles hanging on the wall,
And if one green bottle should accidentally fall,
There'll be eight green bottles hanging on the wall. 

Eight green bottles hanging on the wall...
Seven green bottles hanging on the wall...
...

One green bottle hanging on the wall,
One green bottle hanging on the wall,
If that one green bottle should accidentally fall,
There'll be no green bottles hanging on the wall.
Task
Write some amazing code to reproduce the above lyrics starting from n green bottles!


*/
public class Dinglemouse {

  public static String tenGreenBottles(int n) {
    StringBuilder sb = new StringBuilder();
    String[] num = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
    for (int i = n; i > 0; i--) {
      if (i == 1) {
        sb.append("One green bottle hanging on the wall,\n"+
        "One green bottle hanging on the wall,\n"+
        "If that one green bottle should accidentally fall,\n"+
        "There'll be no green bottles hanging on the wall.\n");
        break;
      }
      else if (i == 2) {
        sb.append("Two green bottles hanging on the wall,\n"+
        "Two green bottles hanging on the wall,\n"+
        "And if one green bottle should accidentally fall,\n"+
        "There'll be one green bottle hanging on the wall.\n"+
        "\n"+
        "One green bottle hanging on the wall,\n"+
        "One green bottle hanging on the wall,\n"+
        "If that one green bottle should accidentally fall,\n"+
        "There'll be no green bottles hanging on the wall.\n");
        break;
      }
      else {
      sb.append(num[i] + " green bottles hanging on the wall,\n"+
      num[i] + " green bottles hanging on the wall,\n"+
      "And if one green bottle should accidentally fall,\n"+
      "There'll be " + num[i - 1].toLowerCase() + " green bottles hanging on the wall.\n"+
      "\n");
      }
    }
    return sb.toString();
  }  
}
/*----------------------------------------------------------------------------
public class Dinglemouse {
  public static String phoneticNumber(int n, boolean toLower) {
    final String word = (new String[] {
        "No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"
        })[n];
    
    return (toLower ? word.toLowerCase() : word) + " green bottle" + (n == 1 ? "" : "s");
  }
  
  public static String tenGreenBottles(int n) {
    return
        phoneticNumber(n, false) + " hanging on the wall,\n" +
        phoneticNumber(n, false) + " hanging on the wall,\n" +
        (n == 1 ? "If that " : "And if ") + phoneticNumber(1, true) + " should accidentally fall,\n" +
        "There'll be " + phoneticNumber(n - 1, true) + " hanging on the wall.\n" +
        (n == 1 ? "" : "\n" + tenGreenBottles(n - 1));
  }
}
------------------------------------------------------------------------------
public class Dinglemouse {

  public static String tenGreenBottles(int n) {
    StringBuilder song = new StringBuilder();
    switch (n){
      case 10:
        song.append("Ten green bottles hanging on the wall,\nTen green bottles hanging on the wall,\n");
        song.append("And if one green bottle should accidentally fall,\nThere'll be nine green bottles hanging on the wall.\n\n");
      case 9:
        song.append("Nine green bottles hanging on the wall,\nNine green bottles hanging on the wall,\n");
        song.append("And if one green bottle should accidentally fall,\nThere'll be eight green bottles hanging on the wall.\n\n");
      case 8:
        song.append("Eight green bottles hanging on the wall,\nEight green bottles hanging on the wall,\n");
        song.append("And if one green bottle should accidentally fall,\nThere'll be seven green bottles hanging on the wall.\n\n");
      case 7:
        song.append("Seven green bottles hanging on the wall,\nSeven green bottles hanging on the wall,\n");
        song.append("And if one green bottle should accidentally fall,\nThere'll be six green bottles hanging on the wall.\n\n");
      case 6:
        song.append("Six green bottles hanging on the wall,\nSix green bottles hanging on the wall,\n");
        song.append("And if one green bottle should accidentally fall,\nThere'll be five green bottles hanging on the wall.\n\n");
      case 5:
        song.append("Five green bottles hanging on the wall,\nFive green bottles hanging on the wall,\n");
        song.append("And if one green bottle should accidentally fall,\nThere'll be four green bottles hanging on the wall.\n\n");
      case 4:
        song.append("Four green bottles hanging on the wall,\nFour green bottles hanging on the wall,\n");
        song.append("And if one green bottle should accidentally fall,\nThere'll be three green bottles hanging on the wall.\n\n");
      case 3:
        song.append("Three green bottles hanging on the wall,\nThree green bottles hanging on the wall,\n");
        song.append("And if one green bottle should accidentally fall,\nThere'll be two green bottles hanging on the wall.\n\n");
      case 2:
        song.append("Two green bottles hanging on the wall,\nTwo green bottles hanging on the wall,\n");
        song.append("And if one green bottle should accidentally fall,\nThere'll be one green bottle hanging on the wall.\n\n");
      case 1:
        song.append("One green bottle hanging on the wall,\nOne green bottle hanging on the wall,\n");
        song.append("If that one green bottle should accidentally fall,\nThere'll be no green bottles hanging on the wall.\n");
    }
    return song.toString();
  }

}
-------------------------------------------------------------------------------
class Dinglemouse {
  private static final String[] COUNT = {"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", " green bottle"};

  static String tenGreenBottles(int n) {
    var lyrics = new StringBuilder();
    while (n > 0) {
      lyrics.append(COUNT[n]).append(COUNT[11]).append(n > 1 ? "s" : "").append(" hanging on the wall,\n");
      lyrics.append(COUNT[n]).append(COUNT[11]).append(n > 1 ? "s" : "").append(" hanging on the wall,\n");
      lyrics.append(n > 1 ? "And if" : "If that").append(" one green bottle should accidentally fall,\n");
      lyrics.append("There'll be ").append(COUNT[n - 1].toLowerCase()).append(COUNT[11]).append(n == 2 ? "" : "s").append(" hanging on the wall.\n");
      lyrics.append(--n > 0 ? "\n" : "");
    }
    return lyrics.toString();
  }
}
-------------------------------------------------------------------------------
public class Dinglemouse {

  public static String tenGreenBottles(int n) {
  String print="";
 
      switch (n) {
      case 10: 
      {
      print+=
      "Ten green bottles hanging on the wall,\n" +
      "Ten green bottles hanging on the wall,\n"+
      "And if one green bottle should accidentally fall,\n"+
      "There'll be nine green bottles hanging on the wall.\n"+
      "\n";
      
      }
      case 9:
     {
     print+=
      "Nine green bottles hanging on the wall,\n" +
      "Nine green bottles hanging on the wall,\n"+
      "And if one green bottle should accidentally fall,\n"+
      "There'll be eight green bottles hanging on the wall.\n"+
      "\n";
      
     }
     case 8:
     {
     print+=
      "Eight green bottles hanging on the wall,\n" +
      "Eight green bottles hanging on the wall,\n"+
      "And if one green bottle should accidentally fall,\n"+
      "There'll be seven green bottles hanging on the wall.\n"+
      "\n";
     }
     case 7:
     {
     print+=
      "Seven green bottles hanging on the wall,\n" +
      "Seven green bottles hanging on the wall,\n"+
      "And if one green bottle should accidentally fall,\n"+
      "There'll be six green bottles hanging on the wall.\n"+
      "\n";
      
     }
     case 6: 
     {
      print+=
      "Six green bottles hanging on the wall,\n" +
      "Six green bottles hanging on the wall,\n"+
      "And if one green bottle should accidentally fall,\n"+
      "There'll be five green bottles hanging on the wall.\n"+
      "\n";
      
      }
      case 5:
      {
      print+=
      "Five green bottles hanging on the wall,\n" +
      "Five green bottles hanging on the wall,\n"+
      "And if one green bottle should accidentally fall,\n"+
      "There'll be four green bottles hanging on the wall.\n"+
      "\n";
      
      }
      case 4:
      {
      print+=
      "Four green bottles hanging on the wall,\n" +
      "Four green bottles hanging on the wall,\n"+
      "And if one green bottle should accidentally fall,\n"+
      "There'll be three green bottles hanging on the wall.\n"+
      "\n";
      
      }
      case 3:
      {
      print+=
      "Three green bottles hanging on the wall,\n" +
      "Three green bottles hanging on the wall,\n"+
      "And if one green bottle should accidentally fall,\n"+
      "There'll be two green bottles hanging on the wall.\n"+
      "\n";
      
      }
      case 2:
      {
      print+=
      "Two green bottles hanging on the wall,\n"+
	      "Two green bottles hanging on the wall,\n"+
	      "And if one green bottle should accidentally fall,\n"+
	      "There'll be one green bottle hanging on the wall.\n"+
	      "\n";
      
      }
      case 1:
      {
      print+=
      "One green bottle hanging on the wall,\n"+
      "One green bottle hanging on the wall,\n"+
      "If that one green bottle should accidentally fall,\n"+
      "There'll be no green bottles hanging on the wall.\n";
      return print;
       
      }
      }
    return "";
  }

}
------------------------------------------------------------------------------
class Dinglemouse {
  private static String[] COUNT = {"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

  static String tenGreenBottles(int n) {
    var lyrics = new StringBuilder();
    while (n > 0) {
      lyrics.append(COUNT[n] + " green bottle" + (n > 1 ? "s" : "") + " hanging on the wall,\n");
      lyrics.append(COUNT[n] + " green bottle" + (n > 1 ? "s" : "") + " hanging on the wall,\n");
      lyrics.append((n > 1 ? "And if" : "If that") + " one green bottle should accidentally fall,\n");
      lyrics.append("There'll be " + COUNT[n - 1].toLowerCase() + " green bottle" + (n == 2 ? "" : "s") + " hanging on the wall.\n");
      lyrics.append(--n > 0 ? "\n" : "");
    }
    return lyrics.toString();
  }
}
-------------------------------------------------------------------------------
public class Dinglemouse {
  
  private static String LINE12 = "%s green bottle%s hanging on the wall,\n";
  private static String LINE3  = "%s one green bottle should accidentally fall,\n";
  private static String LINE4  = "There'll be %s green bottle%s hanging on the wall.\n";
  
  private static String[] NUMS = {"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
  
  public static String tenGreenBottles(int n) {
    StringBuilder lyrics = new StringBuilder();
    for (; n != 0 ; n--) {
        lyrics.append( String.format(LINE12, NUMS[n],                 n == 1 ? "" : "s") );
        lyrics.append( String.format(LINE12, NUMS[n],                 n == 1 ? "" : "s") );
        lyrics.append( String.format(LINE3,                           n == 1 ? "If that" : "And if") );
        lyrics.append( String.format(LINE4,  NUMS[n-1].toLowerCase(), n == 2 ? "" : "s") );
        lyrics.append( n == 1 ? "" : "\n" );
    }
    return lyrics.toString();
  }  

}
-------------------------------------------------------------------------------
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class Dinglemouse {

    private static final String LINE4_PATTERN = "There''ll be {0} green bottle{1} hanging on the wall.\n";
    private static final String LINE3_FOR_ONE_BOTTLE = "If that one green bottle should accidentally fall,\n";
    private static final String LINE3 = "And if one green bottle should accidentally fall,\n";
    private static final String LINE1AND2_PATTERN = "{0} green bottle{1} hanging on the wall,\n";
    private static final Map<Integer, String> INT_TO_STR_MAP = new HashMap<>();

    static {
        INT_TO_STR_MAP.put(0, "No");
        INT_TO_STR_MAP.put(1, "One");
        INT_TO_STR_MAP.put(2, "Two");
        INT_TO_STR_MAP.put(3, "Three");
        INT_TO_STR_MAP.put(4, "Four");
        INT_TO_STR_MAP.put(5, "Five");
        INT_TO_STR_MAP.put(6, "Six");
        INT_TO_STR_MAP.put(7, "Seven");
        INT_TO_STR_MAP.put(8, "Eight");
        INT_TO_STR_MAP.put(9, "Nine");
        INT_TO_STR_MAP.put(10, "Ten");
    }

    public static String tenGreenBottles(int n) {
        StringBuilder sb = new StringBuilder();
        String line;
        while (n > 0) {
            line = MessageFormat.format(LINE1AND2_PATTERN, INT_TO_STR_MAP.get(n), n == 1 ? "" : "s");
            sb.append(line);
            sb.append(line);
            sb.append(n == 1 ? LINE3_FOR_ONE_BOTTLE : LINE3);
            n--;
            sb.append(MessageFormat.format(LINE4_PATTERN, INT_TO_STR_MAP.get(n).toLowerCase(), n == 1 ? "" : "s"));
            if (n > 0) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}
*/