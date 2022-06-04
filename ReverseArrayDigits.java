public class ReverseArrayDigits {
  public static int[] digitize(long n) {
    // Code here
    return new StringBuilder().append(n)
                                  .reverse()
                                  .chars()
                                  .map(Character::getNumericValue)
                                  .toArray();
  
  }
}