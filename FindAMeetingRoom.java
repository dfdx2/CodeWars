/* 7KYU CodeWars The Office IV - Find A Meeting Room

Your job at E-Corp is both boring and difficult. It isn't made any easier by the fact that everyone constantly wants to have a meeting with you, and that the meeting rooms are always taken!

In this kata, you will be given an array. Each value represents a meeting room. Your job? Find the first empty one and return its index (N.B. There may be more than one empty room in some test cases).

'X' --> busy
'O' --> empty
If all rooms are busy, return "None available!"

More in this series:




*/

public class TheOffice {
  public static Object meeting(char[] x) {
    char ch = 'o';
    char cd = 'O';
    int result = 0;
    for (char y : x) {
      if (y == ch || y == cd) {
        return result;
      }
      else {
        result++;
      }
    }
    return result == x.length - 1 ? result : "None available!";
  }
}
/*-----------------------------------------------------------------------
public class TheOffice {

  public static Object meeting(char[] x) {
    int i = new String(x).indexOf('O');
    return i < 0 ? "None available!" : i;
  }

}
------------------------------------------------------------------------
public class TheOffice {
  public static Object meeting(char[] x) {
    int room = new String(x).indexOf("O");
    if (room == -1) {
      return "None available!";
    }
    else {
      return room;
    }
  }
}
-------------------------------------------------------------------------
class TheOffice {
  static Object meeting(char[] x) {
    for (int i = 0; i < x.length; i++) {
      if (x[i] == 'O') return i;
    }
    return "None available!";
  }
}
------------------------------------------------------------------------
import java.util.stream.*;

public class TheOffice {
  public static Object meeting(char[] rooms) {
    int roomId = getFirstAvailable(rooms) ;
    return roomId != -1 ? roomId : "None available!";
  }
  
  private static int getFirstAvailable(char[] rooms) {
    return IntStream.range(0, rooms.length)
                    .filter(i -> rooms[i] == 'O')
                    .findFirst()
                    .orElse(-1);
  }
}
------------------------------------------------------------------------
public class TheOffice {
  public static Object meeting(char[] x) {
		int result = String.copyValueOf(x).indexOf("O");
    return result == -1 ? "None available!" : result;
  }
}




*/