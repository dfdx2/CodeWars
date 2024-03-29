/* 5KYU CodeWars RGB to Hex Conversion

The rgb function is incomplete. Complete it so that passing in 
RGB decimal values will result in a hexadecimal representation 
being returned. Valid decimal values for RGB are 0 - 255. Any 
values that fall out of that range must be rounded to the closest 
valid value.

Note: Your answer should always be 6 characters long, the shorthand 
with 3 will not work here.

Examples (input --> output):
255, 255, 255 --> "FFFFFF"
255, 255, 300 --> "FFFFFF"
0, 0, 0       --> "000000"
148, 0, 211   --> "9400D3"

*/

import java.util.function.IntUnaryOperator;
public class RgbToHex {

    public static String rgb(int r, int g, int b) {
      IntUnaryOperator result = i -> i > 0 ? Math.min(i, 255) : 0;
      return String.format("%02X%02X%02X", result.applyAsInt(r), result.applyAsInt(g), result.applyAsInt(b));
    }
}
/*---------------------------------------------------------------------
public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", verify(r), verify(g), verify(b));
    }

    private static int verify(int i) {
        return i > 0 ? Math.min(255, i) : 0;
    }
}
-----------------------------------------------------------------------
public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        if(r < 0) r = 0;
        if(g < 0) g = 0;
        if(b < 0) b = 0;
        if(r > 255) r = 255;
        if(g > 255) g = 255;
        if(b > 255) b = 255;

        return String.format("%02X%02X%02X", r, g, b);
    }
}
-----------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {

        return Stream.of(r, g, b)
                .map(i -> Math.max(0, i))
                .map(i -> Math.min(255, i))
                .map(i -> String.format("%02X", i))
                .collect(Collectors.joining());
    }
}
-----------------------------------------------------------------------
public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return String.format("%02X%02X%02X", 
                r >= 0 ? r <= 255 ? r : 255 : 0, 
                g >= 0 ? g <= 255 ? g : 255 : 0, 
                b >= 0 ? b <= 255 ? b : 255 : 0);
    }
}
-----------------------------------------------------------------------
public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return ByteToHexString(r) + ByteToHexString(g) + ByteToHexString(b);
    }
  
    public static String ByteToHexString(int colorByte){
      if (colorByte < 0) colorByte = 0;
      if (colorByte > 255) colorByte = 255;
      
      return digitToHexString(colorByte / 16) + digitToHexString(colorByte % 16);
    }
  
   public static String digitToHexString(int decimalDigit){
      if (decimalDigit < 10) return String.valueOf(decimalDigit);
      else if (decimalDigit == 10) return "A";
      else if (decimalDigit == 11) return "B";
      else if (decimalDigit == 12) return "C";
      else if (decimalDigit == 13) return "D";
      else if (decimalDigit == 14) return "E";
      else return "F";
    }
}
-----------------------------------------------------------------------
import java.util.function.IntFunction;

public class RgbToHex {

    private static final IntFunction<Integer> BOUNDS = i -> Math.max(0, Math.min(255, i));

    public static String rgb(int r, int g, int b) {
        return "%02X%02X%02X".formatted(BOUNDS.apply(r), BOUNDS.apply(g), BOUNDS.apply(b));
    }
}
-----------------------------------------------------------------------
public class RgbToHex {

    private static int fix(int number) {
        if (number < 0) return 0;
        return Math.min(number, 255);
    }
    public static String rgb(int r, int g, int b) {
        return (String.format("%02x", fix(r)) + String.format("%02x", fix(g)) + String.format("%02x", fix(b))).toUpperCase();
    }
}
*/