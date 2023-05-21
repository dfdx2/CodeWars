/*  7KYU CodeWars Running Out Of Space

Kevin is noticing his space run out! Write a function that 
removes the spaces from the values and returns an array 
showing the space decreasing.
For example, running this function on the array ['i', 'have','no','space'] 
would produce ['i','ihave','ihaveno','ihavenospace']

*/

public class OutOfSpace {
  
  public static String[] spacey(String[] array) {
    String[] result = new String[array.length];
    int i = 0;
    String y = "";
    for (String x : array) {
      y = y + array[i];
      result[i] = y; 
      i++;
    }
    return result;
  }  
}
/*----------------------------------------------------------------------------
public class OutOfSpace {
  
  public static String[] spacey(String[] F) {  
      for (int i=1;i<F.length;i++) 
           F[i]=F[i-1]+F[i];
      return F;
    }
}
------------------------------------------------------------------------------
public class OutOfSpace {
  
  public static String[] spacey(String[] array) {
    String[] result = new String[array.length];
    result[0] = array[0];
    for (int i = 1; i < result.length; i++) {
      result[i] = array[i].startsWith(array[i-1]) ? array[i] : result[i-1] + array[i];
    }
    return result;
  }
  
}
------------------------------------------------------------------------------
interface OutOfSpace {
  static String[] spacey(String[] array) {
    for (int i = 1; i < array.length; i++) {
      array[i] = array[i - 1] + array[i];
    }
    return array;
  }
}
-----------------------------------------------------------------------------
import java.util.Arrays;

public class OutOfSpace {

    public static String[] spacey(String[] array) {
        System.out.println(Arrays.toString(array));
        String[] ans = new String[array.length];
        ans[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            ans[i] = array[i].startsWith(ans[i-1]) ? array[i] : ans[i-1].concat(array[i]);
        }
        return ans;
    }

}


*/