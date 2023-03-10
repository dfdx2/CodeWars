/* 8KYU CodeWars Bin To Decimal

Complete the function which converts a binary number 
(given as a string) to a decimal number.

*/

public class BinToDecimal{
  public static int binToDecimal(String inp){
    // your code here
    int decimal = (Integer.parseInt(inp,2));
    return decimal;
  }
}
/*-------------------------------------------------------------------------------
public class Converter{
  public static int binToDecimal(String inp){
    return Integer.parseInt(inp, 2);
  }
}
---------------------------------------------------------------------------------
public class Converter{
  public static int binToDecimal(String inp){
   
    // Convert a string to an array of strings
    String[] strArr = inp.split("");
    
    // Converting an array of strings to an array of numbers
    int[] arr = new int[strArr.length];      
    for(int i = 0; i < strArr.length; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }
  
    // Reverses an array of numbers
    for(int j = 0; j < arr.length/2; j++) {
      int temp = arr[j];
      arr[j] = arr[arr.length - 1 - j];
      arr[arr.length - 1 - j] = temp;
    }
    
    // convert a binary number to a decimal number
    int decm = 0;
    for(int k = 0; k < arr.length; k++) {
      decm += (arr[k]*Math.pow(2,k));
    }
    
    return decm;
  }
  
}
-----------------------------------------------------------------------------
public class Converter{
  public static int binToDecimal(String binary){
    String[] arr = binary.split("");
    
    int result = 0;
    int n = binary.length() - 1;
    
    for (String str: arr){
      result += Integer.parseInt(str) * Math.pow(2,n--);
    }
    
    return result;
  }
}
----------------------------------------------------------------------------


*/