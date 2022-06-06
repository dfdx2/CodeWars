public class DoubleChar {
  public static String doubleChar(String s){
    //enter your code here 
    String c = s.replaceAll(".", "$0$0");
    return c;
  }
}