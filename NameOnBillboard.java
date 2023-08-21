/* 8KYU CodeWars Name On Billboard

You can print your name on a billboard ad. Find out how much it 
 cost you. Each character has a default price of £30, but that can 
be different if you are given 2 parameters instead of 1 (allways 2 for Java).

You can not use multiplier "*" operator.

If your name would be Jeong-Ho Aristotelis, ad would cost £600. 
20 leters * 30 = 600 (Space counts as a character).

*/
public class Billboard {	
    public static int billboard(String name, int price) {
        int result = 0;
        int i = 0; 
        while (i < name.length()) {
          result += price;
          i++;
        }
        return result;
   }
}
/*----------------------------------------------------------------------------------
public class Billboard {
	
	public static int billboard(String name, int price) {
    if(name == null) return 0;
    return name.chars().map(i -> i = price).sum();
  }
}
-----------------------------------------------------------------------------------
public class Billboard {
	
	public static int billboard(String name, int price) {
    int a = price;
    for(int i = 0; i< name.length();i++){
      price+= a;
    }
    return price-a;
  }
}
-----------------------------------------------------------------------------------
public class Billboard {
	
	public static int billboard(String name, int price) {
    int sum = 0;
    for(int i = 0; i < name.length(); i++){
      sum += price;
    }
    return sum;
  }
}
-----------------------------------------------------------------------------------
import java.util.Arrays;

public class Billboard {
	
	public static int billboard(String name, int price) {
		return Arrays.stream(name.split(""))
				.filter(s -> !s.isEmpty())
				.map(s -> price)
				.mapToInt(Integer::intValue)
				.sum();
	}
}
-----------------------------------------------------------------------------
public class Billboard {
	
	public static int billboard(String name, int price) {
    return Math.multiplyExact(name.length(), price);
  }
}
*/