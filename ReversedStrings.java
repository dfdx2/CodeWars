public class ReversedStrings {

  public static String solution(String str) {
    // Your code here...
    String reversed = "";
    String[] array = str.split("");
    
    for (int i = array.length -1; i > -1; i --) {
      reversed = reversed + array[i];
      
    }
    
    return reversed;
  }

}