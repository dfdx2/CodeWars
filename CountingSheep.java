import java.util.*;

public class CountingSheep {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    return (int)Arrays.stream(arrayOfSheeps)
                  .filter(c -> c!=null && c==true)
                  .count();
    }
  }