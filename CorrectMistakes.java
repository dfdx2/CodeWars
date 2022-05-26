public class CorrectMistakes {
  public static String correct(String string) {
    string = string.replaceAll("5","S");
    string = string.replaceAll("0","O");
    string = string.replaceAll("1","I");
    return string;
  }
}