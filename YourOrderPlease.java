/* 6KYU CodeWars Your Order, Please

Your task is to sort a given string. Each word in the string will contain a 
single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input 
String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""

*/
public class Order {
  public static String order(String words) {
    if (words.isEmpty()) {
      return "";
    }
    String[] b = words.split(" ");
    String[] result = new String[b.length];
    for (String word : b) {
      int i = Integer.parseInt(word.replaceAll("\\D", "")) - 1;
      result[i] = word;
    }
    return String.join(" ", result);
  }
}
/*------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;

public class Order {
  public static String order(String words) {
    return Arrays.stream(words.split(" "))
      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
      .reduce((a, b) -> a + " " + b).get();
  }
}
-----------------------------------------------------------------------------------
public class Order {
   public static String order(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }
}
-------------------------------------------------------------------------
import java.util.Arrays;
public class Order {
  public static String order(String words) {
        String[] strs = words.split(" ");
        Arrays.sort(strs, (String s1, String s2) -> s1.replaceAll("[a-zA-Z]","").compareTo(s2.replaceAll("[a-zA-Z]",""))  );
        String f = "";
        for(String st:strs) f+=st + " ";
        return f.substring(0,f.length()-1);
    }
}
------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Order {

	public static String order(String words) {
		return Arrays.stream(words.split(" "))
                 .sorted((a, b) -> {
			              return a.replaceAll("\\D+", "").compareTo(b.replaceAll("\\D+", ""));
		             }).collect(Collectors.joining(" "));
	}
}
---------------------------------------------------------------------------------
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Order {
  public static String order(String words) {
    return Pattern.compile(" ")
    							.splitAsStream(words)
    							.sorted(Comparator.comparingInt(Order::intExtractor))
    							.collect(Collectors.joining(" "));
  }
  public static int intExtractor(String candidate){
  	return new Scanner(candidate).useDelimiter("\\D+").nextInt();
  }
}


*/