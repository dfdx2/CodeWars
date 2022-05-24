public class Bob {
  public static int enough(int cap, int on, int wait){
  // your code here
    if (on + wait <= cap) {
      return(0);
    }
    else {
      return(wait + on - cap);
    }
  }
}