/* 7KYU CodeWars Kooka-Counter

A family of kookaburras are in my backyard.

I can't see them all, but I can hear them!

How many kookaburras are there?

Hint
The trick to counting kookaburras is to listen carefully

The males sound like HaHaHa...

The females sound like hahaha...

And they always alternate male/female

Examples

ha = female => 1
Ha = male => 1
Haha = male + female => 2
haHa = female + male => 2
hahahahaha = female => 1
hahahahahaHaHaHa = female + male => 2
HaHaHahahaHaHa = male + female + male => 3

^ Kata Note : No validation is necessary; only valid input will be passed :-)

*/
public class KookaCounter {
  public static int kookaCounter(final String laughing) {
    String result = laughing;
    return result.replace("a", "").replaceAll("h+", "1").replaceAll("H+", "1").length();
  }
}
/*--------------------------------------------------------------------
public class Dinglemouse {

  public static int kookaCounter(final String laughing) {
   return laughing.isEmpty() ? 0 : laughing.split("haH|Hah").length;
  
  }
  
}

-----------------------------------------------------------------------
public class Dinglemouse {
  public static int kookaCounter(final String laughing) {
    int kookaburras = laughing.isEmpty() ? 0 : 1;
    for (int i = 0; i < laughing.length() - 2; i += 2) {
      if (laughing.charAt(i) != laughing.charAt(i + 2)) {
        kookaburras++;
      }
    }
    return kookaburras;
  } 
}
------------------------------------------------------------------------
public class Dinglemouse {
  public static int kookaCounter(final String laughing) {
    return laughing.replaceAll("(Ha)+", "m")
                   .replaceAll("(ha)+", "f")
                   .length();
  }  
}
------------------------------------------------------------------------
public class Dinglemouse {

  public static int kookaCounter(final String laughing) {
    if (laughing.equals("") || laughing == null){
      return 0;
    }
    else{
      int result = 0;
      String[] arr = laughing.split("");
      String prev = arr[0] + arr[1];
      for (int i = 0; i < arr.length; i += 2){
        if (!((arr[i] + arr[i + 1]).equals(prev))){
          result ++;
        }
        prev = arr[i] + arr[i + 1];
      }
      return result + 1;
    }
  }
}
------------------------------------------------------------------------
public class Dinglemouse {
  public static int kookaCounter(final String laughing) {
    return laughing.isEmpty() ? 0 : laughing.replaceAll("(Ha)+|(ha)+", "_").length();
  }  
}
-------------------------------------------------------------------------
class Dinglemouse {
  static int kookaCounter(String laughing) {
    return laughing.replace("a", "").replaceAll("h+", "1").replaceAll("H+", "1").length();
  }
}
--------------------------------------------------------------------------
public class Dinglemouse {

  public static int kookaCounter(final String laughing) {
    return laughing
      .replaceAll("(ha)+", "X")
      .replaceAll("(Ha)+", "Y")
      .replaceAll("X+", "X")
      .replaceAll("Y+", "Y")
      .length();
  }
}
--------------------------------------------------------------------------
public class Dinglemouse {

  public static int kookaCounter(final String s) {
  return s.replaceAll("Ha", "m").replaceAll("ha", "f").replaceAll("m{2,}", "m").replaceAll("f{2,}", "f").length();
  }
  
}
*/