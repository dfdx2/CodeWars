/* 8KYU Convert a String to a Number!

We need a function that can transform a string 
into a number. What ways of achieving this do 
you know?

Note: Don't worry, all inputs will be strings, 
and every string is a perfectly valid representation 
of an integral number.

Examples
"1234" --> 1234
"605"  --> 605
"1405" --> 1405
"-7" --> -7

*/
public class StringToNumber {
  public static int stringToNumber(String str) {
    //TODO: Convert str into a number
    return Integer.parseInt(str);
  }
}



/*------------------------------------------------------------
  Old Solution

public class StringToNumber {
  public static int stringToNumber(String str) {
    //TODO: Convert str into a number
    int i = Integer.parseInt(str);
    return i;
  }
}
-------------------------------------------------------------------
public class StringToNumber {
  public static int stringToNumber(String str) {
    return Integer.valueOf(str);
  }
}
-------------------------------------------------------------------

public class StringToNumber {
  public static int stringToNumber(String str) {
    int i = 0;
    int num = 0;
    boolean isNeg = false;

    if (str.charAt(0) == '-') {
        isNeg = true;
        i = 1;
    }

    while( i < str.length()) {
        num *= 10;
        num += str.charAt(i++) - '0'; 
    }

    if (isNeg) {
        num = -num;
    }
    
    return num;
  }
}
--------------------------------------------------------------------
public class StringToNumber {
  public static int stringToNumber(String str) {
    boolean negative = false;
    if (str.charAt(0) == '-')
    {
      str = str.substring(1);
      negative = true;
    }
    int number = 0;
    int length;
    char character;
    length = str.length();
    int tenLength = length;
    for (int i = 0; i < length; i++)
    {
      tenLength -= 1;
      int tens = 1;
      character = str.charAt(i);
      for (int j = tenLength; j > 0; j--)
      {
        tens *= 10;
      }
      switch (character)
      {
      case '1':
        number += 1 * tens;
        break;
      case '2':
        number += 2 * tens;
        break;
      case '3':
        number += 3 * tens;
        break;
      case '4':
        number += 4 * tens;
        break;
      case '5':
        number += 5 * tens;
        break;
      case '6':
        number += 6 * tens;
        break;
      case '7':
        number += 7 * tens;
        break;
      case '8':
        number += 8 * tens;
        break;
      case '9':
        number += 9 * tens;
        break;
      case '0':
        number += 0 * tens;
        break;
      }
    }
    if (negative == true)
      number *= -1;
    //System.out.println(number);
    return number;
  }
 }
--------------------------------------------------------------------
public class StringToNumber {
  public static int stringToNumber(String str) {
    int num = 0;
    boolean negative = false;
    if (str.charAt(0) == '-') {
        str = str.substring(1);
        negative = true;
      }
    for (char c : str.toCharArray()) {
      
      num= num * 10 + c - 48;
    }
    return negative ? -num : num;
  }
}

*/