/* 7KYU CodeWars Very Even Numbers

Task
Write a function that returns true if the number is a "Very Even" number.

If a number is a single digit, then it is simply "Very Even" if it itself is even.

If it has 2 or more digits, it is "Very Even" if the sum of its digits is "Very Even".

Examples
number = 88 => returns false -> 8 + 8 = 16 -> 1 + 6 = 7 => 7 is odd 

number = 222 => returns true -> 2 + 2 + 2 = 6 => 6 is even

number = 5 => returns false

number = 841 => returns true -> 8 + 4 + 1 = 13 -> 1 + 3 => 4 is even
Note: The numbers will always be 0 or positive integers!

*/
public class VeryEvenNumbers {
  public static boolean isVeryEvenNumber(int number) {
     return (number - 1) % 9 % 2 > 0 || number == 0;
  }
}
/*----------------------------------------------------------------------
public class Kata {
    public static boolean isVeryEvenNumber(int n) {
        while (n > 9) {
            int a = 0;
            for (char c : String.valueOf(n).toCharArray()) {
                a += Character.getNumericValue(c);
            }
            n = a;
        }
        return n % 2 == 0;
    }
}
------------------------------------------------------------------------
public class Kata {
  public static boolean isVeryEvenNumber(int number) {
    if (number % 2 != 0 && number < 10) {
      return false;
    }
    int sum = 0;
    String newnum = number + "";
    while (newnum.length() >= 2) {
      String[] arr = newnum.split("");
      for (String i: arr) {
        sum += Integer.parseInt(i);
      }
      if (sum % 2 != 0 && sum < 10) {
        return false;
      }
      newnum = sum + "";
      sum = 0;
    }
    return true;
  }
}
------------------------------------------------------------------------
public class Kata {
    public static boolean isVeryEvenNumber(int number) {

        if ((number) < 10) {
            return number % 2 == 0;
        }

        while (number >= 10) {
            String[] arrNumbers = String.valueOf(number).split("");
            number = 0;
            for (String num : arrNumbers) {
                number = number + Integer.parseInt(num);
            }
        }
        return number % 2 == 0;
    }
}
------------------------------------------------------------------------
public class Kata {
  public static boolean isVeryEvenNumber(int number) {
    while(number > 9) {
      number = Integer.toString(number).chars().map(c -> c - 48).sum();
    }
    return number % 2 == 0; 
  }
}
------------------------------------------------------------------------
public class Kata {
  public static boolean isVeryEvenNumber(int number) {
    int sumOfDigits = 0;
    while(number > 0) {
      sumOfDigits += number % 10;
      number = number / 10;
      if (number == 0) {
        if (sumOfDigits < 10) {
          return sumOfDigits % 2 == 0;
        } else {
          number = sumOfDigits;
          sumOfDigits = 0;
        }
      }
    }
    return true;
  }
}
*/