public class InvertValues {
  public static int[] invert(int[] input) {
    for(int i = 0; i < input.length; i ++) {
        input[i] = - input[i];
    }
    return input;
  }
}