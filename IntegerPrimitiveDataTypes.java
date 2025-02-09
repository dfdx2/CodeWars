/* 7KYU CodeWars Integer Primitive Data Types

Java supports different integer primitive data types. Each type has an individual range:

byte: 8-bit signed two's complement integer
short: 16-bit signed two's complement integer
int: 32-bit signed two's complement integer
long: 64-bit signed two's complement integer
We have got a huge list of integer-strings and we want to categorize all of them. 
Find the smallest possible data type of the enumeration for a given integer.

To solve it, complete the following method:

determineType(x)
input: string
output: your chosen primitive type
all inputs are valid
return "none" if no type fits

*/
import java.math.*;
public class IntegerPrimitiveDataTypes {
    public String determineType(String number) {
      try {
        long num = Long.parseLong(number);
        return num > -129 && num < 128 ? "byte" : num > -32769 && num < 32768 ? "short" : num > -2147483649L && num < 2147483648L ? "int" : "long";
      }
      catch (Exception e) {
        return "none";
      }
    }
}
/*--------------------------------------------------------------------
import java.math.*;

public class Primitive {

    public String determineType(String number) {
        try { Byte.parseByte(number); return "byte"; } catch (NumberFormatException e) {}
        try { Short.parseShort(number); return "short"; } catch (NumberFormatException e) {}
        try { Integer.parseInt(number); return "int"; } catch (NumberFormatException e) {}
        try { Long.parseLong(number); return "long"; } catch (NumberFormatException e) {}
        return "none";
    }
}
-----------------------------------------------------------------------
import java.math.*;

public class Primitive {

    public String determineType(String number) {
   try{
            long n = Long.parseLong(number);
            
            if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                return "byte";

            if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                return "short";
            if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                return "int";
            
            if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                return "long";
            }catch(Exception ex){}
                        
            
            

            return "none";
           
    }
}
-----------------------------------------------------------------------
import java.math.*;

public class Primitive 
{
    public String determineType(String number) 
    {
        BigInteger bigint = new BigInteger(number, 10);
        int bytes = bigint.toByteArray().length;

        switch(bytes)
        {
            case 1:
                return "byte";
            case 2:
                return "short";
            case 3:
            case 4:
                return "int";
            case 5:
            case 6:
            case 7:
            case 8:
                return "long";
            default:
                return "none";
        }
    }
}
-----------------------------------------------------------------------
import java.math.*;

public class Primitive {
  public String determineType(String s) {
    try { if (s.equals(Byte.valueOf(s).toString())) return "byte"; }catch (Exception e) {}
    try { if (s.equals(Short.valueOf(s).toString())) return "short"; }catch (Exception e) {}
    try { if (s.equals(Integer.valueOf(s).toString())) return "int"; }catch (Exception e) {}
    try { if (s.equals(Long.valueOf(s).toString())) return "long"; }catch (Exception e) {}
    return "none";
  }
}
-----------------------------------------------------------------------
import java.math.*;
public class Primitive {
    public String determineType(String number) {
        int bites = new BigInteger(number).bitLength() + 1;
        return (bites < 9)  ? "byte" : 
               (bites < 17) ? "short" : 
               (bites < 33) ? "int" : 
               (bites < 65) ? "long" : "none";
    }
}

*/