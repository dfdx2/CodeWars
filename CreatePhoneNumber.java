/*            6KYU  Create Phone Number
Write a function that accepts an array of 10 integers (between 0 and 9), that returns a 
string of those numbers in the form of a phone number.

Example
Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.
Don't forget the space after the closing parentheses!



public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder builder = new StringBuilder(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            int phonenumber = numbers[i];
            switch (builder.length()) {
                case 0:
                    builder.append('(');
                    break;
                case 4:
                    builder.append(") ");
                    break;
                case 9:
                    builder.append('-');
                    break;
            }

            builder.append(phonenumber);
        }

        return builder.toString();
    }
}
_______________________________________________________________________________
public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
  }
}
________________________________________________________________________________

public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    String phoneNumber = new String("(xxx) xxx-xxxx");
    
    for (int i : numbers) {
      phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
    }
    
    return phoneNumber;
  }
}
*/