/*
Return true if on employed and on vacation else return false

*/

public class Alarm {
  
  public static boolean setAlarm(boolean employed, boolean vacation) {
    
    if ((employed == true) && (vacation == false)) {
      return true;
    }
    else {
      return false;
    }
  }

}
