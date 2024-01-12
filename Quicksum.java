/* 7KYU CodeWars Quicksum

A checksum is an algorithm that scans a packet of data and returns a single number. The idea is that if the packet is changed, the checksum will also change, so checksums are often used for detecting transmission errors, validating document contents, and in many other situations where it is necessary to detect undesirable changes in data.

For this problem, you will implement a checksum algorithm called Quicksum. A Quicksum packet allows only uppercase letters and spaces. It always begins and ends with an uppercase letter.

Otherwise, spaces and uppercase letters can occur in any combination, including consecutive spaces.

A Quicksum is the sum of the products of each character’s position in the packet times the character’s value. A space has a value of zero, while letters have a value equal to their position in the alphabet.

So, A = 1, B = 2, etc., through Z = 26. Here are example Quicksum calculations for the packets "ACM" and "A C M":

ACM
1 × 1 + 2 × 3 + 3 × 13 = 46 

A C M
1 x 1 + 3 x 3 + 5 * 13 = 75
When the packet doesn't have only uppercase letters and spaces or just spaces the result to quicksum have to be zero (0).

AbqTH #5 = 0



*/
import java.util.*;
public class Quicksum {
    public int quicksum(String packet) {
      Map<Character,Integer> map = new HashMap<>();
      map.put('A', 1);
      map.put('B', 2);
      map.put('C', 3);
      map.put('D', 4);
      map.put('E', 5);
      map.put('F', 6);
      map.put('G', 7);
      map.put('H', 8);
      map.put('I', 9);
      map.put('J', 10);
      map.put('K', 11);
      map.put('L', 12);
      map.put('M', 13);
      map.put('N', 14);
      map.put('O', 15);
      map.put('P', 16);
      map.put('Q', 17);
      map.put('R', 18);
      map.put('S', 19);
      map.put('T', 20);
      map.put('U', 21);
      map.put('V', 22);
      map.put('W', 23);
      map.put('X', 24);
      map.put('Y', 25);
      map.put('Z', 26);
      map.put(' ', 0);
      int result = 0;
      if (packet.contains("[a-z]") || packet.contains("?")) {
        return 0;
      }
      for (int i = 0; i < packet.length(); i++) {
        if (map.get(packet.charAt(i)) == null) {
          return 0;
        }
        result += (i + 1) * map.get(packet.charAt(i));
      }     
      return result;
    }
}
/*----------------------------------------------------------------------
import static java.util.stream.IntStream.range;

class Quicksum {
  static int quicksum(String packet) {
    return packet.matches("[A-Z\\s]+") ? range(0, packet.length())
            .map(i -> packet.charAt(i) == 32 ? 0 : (packet.charAt(i++) - 64) * i).sum() : 0;
  }
}
-------------------------------------------------------------------------
public class Quicksum {
    public int quicksum(String packet){
        int sum = 0;
        //This line starts a for loop that iterates over the characters in the packet string.
        //For example, if the packet string is equal to "ABC", then the value of packet.length() would be 3.
        for (int i = 0; i < packet.length(); i++) {
            //This line checks if the character at index i is a space. If it is, the continue statement skips the rest of the loop and goes to the next iteration.
            if (packet.charAt(i) == ' ') {
                continue;
            }
            //This line checks if the character at index i is not an uppercase letter. If it is not, the method returns 0.
            if (packet.charAt(i) < 'A' || packet.charAt(i) > 'Z') {
                return 0;
            }
            //This line adds the product of the character’s position in the packet times the character’s value to the sum variable.
            sum += (i + 1) * (packet.charAt(i) - 'A' + 1);
            //For example, if the packet string is equal to "ABC" and the current character is 'B', then the quicksum of the current character would be calculated as follows:
            //sum = (i + 1) * (packet.charAt(i) - 'A' + 1)
            //sum = 2 * (66 - 65 + 1)
            //sum = 2 * 2
            //sum = 4
        }
        return sum;
    }
}
--------------------------------------------------------------------------
public class Quicksum {
    public int quicksum(String packet){
        if (!packet.trim().matches("[A-Z]([A-Z ]*[A-Z])?")) {
            return 0;
        }
        
        int result = 0;
        for (int i = 0; i < packet.length(); i++) {
            char c = packet.charAt(i);
            if (Character.isUpperCase(c)) {
                result += (i + 1) * (c - 'A' + 1);
            }
        }

        return result;
    }
}
---------------------------------------------------------------------------
import java.util.stream.IntStream;

public class Quicksum {
  public int quicksum(String packet){
    if (packet.length() != packet.replaceAll("[^A-Z ]", "").length()) return 0;
    String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    return IntStream.rangeClosed(1, packet.length()).map(i -> i * alphabet.indexOf(packet.charAt(i - 1))).sum();
  }
}
-------------------------------------------------------------------------
public class Quicksum {
    public int quicksum(String packet){
      
      int sum = 0;
      
      for(int i = 0; i < packet.length(); i++){
        if(packet.charAt(i) == ' ') continue;
        if((int)packet.charAt(i) < 65 || (int)packet.charAt(i) > 90) return 0;
        sum += (i + 1) * ((int)packet.charAt(i) - 64);
      }
      
      return sum;
      
    }
}
--------------------------------------------------------------------------
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Quicksum {

    public int quicksum(String packet) {
        return Pattern.compile("[^(A-Z )]").matcher(packet).find() ? 0 :
            IntStream.range(0, packet.length())
                .map(e -> packet.charAt(e) == ' ' ? 0 : (e + 1) * (packet.charAt(e) - 64))
                .sum();
    }
}
-------------------------------------------------------------------------
public class Quicksum {
  public int quicksum(String packet){
    int total = 0;
    
    for (int x = 0; x < packet.length(); x++) {
      char next = packet.charAt(x);
      
      if (next == ' ') {
        continue;
      } else if (next >= 'A' && next <= 'Z') {
        int value = (next - 'A') + 1;
        int position = x + 1;
        total += value * position;
      } else {
        return 0;
      }
    }
    
    return total;
  }
}
--------------------------------------------------------------------------
public class Quicksum {
    public int quicksum(String packet){
        int sum = 0;
        for (int i = 0; i < packet.length(); i++) {
            sum += packet.charAt(i) == ' ' ? 0 : (packet.charAt(i) - 'A' + 1) * (i + 1);
            if (packet.charAt(i) != ' ' && (packet.charAt(i) < 'A' || packet.charAt(i) > 'Z')) {
                return 0;
            }
        }
        return sum;
    }
}
---------------------------------------------------------------------------
public class Quicksum {
    public int quicksum(String packet){
      //Code time :)
      int result = 0;
      int ascii;
      packet = packet.trim();
      if(packet.matches("[A-Z ]+")){
          for(int i = 0; i<packet.length(); i++){
            if(packet.charAt(i) == ' ') continue;
            ascii = packet.charAt(i)-64;
            result = result + (ascii*(i+1));
          }
        return result;
      }else{
        return result;
      }
    }
}
---------------------------------------------------------------------------
import java.util.regex.Pattern;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Quicksum {  
  private static final Predicate<String> ONLY_UPPER_AND_SPACE = 
    Pattern.compile("\\s*(\\p{Upper}*\\s*)*\\p{Upper}\\s*").asMatchPredicate();
  
  public int quicksum(String packet) {
    if (!ONLY_UPPER_AND_SPACE.test(packet)) return 0;
    return IntStream.range(0, packet.length())
                    .filter(i -> packet.charAt(i) != ' ')
                    .map(i -> (i + 1) * (packet.charAt(i) + 1 - 'A'))
                    .sum();
  }
}
*/