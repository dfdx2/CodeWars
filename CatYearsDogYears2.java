/* 7KYU CodeWars Cat Years, Dog Years (2)

Kata Task

I have a cat and a dog which I got as kitten / puppy.

I forget when that was, but I do know their current ages as catYears and dogYears.

Find how long I have owned each of my pets and return as a list [ownedCat, ownedDog]

NOTES:

Results are truncated whole numbers of "human" years

Cat Years
15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that

Dog Years
15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that

References
http://www.catster.com/cats-101/calculate-cat-age-in-cat-years
http://www.slate.com/articles/news_and_politics/explainer/2009/05/a_dogs_life.html

*/

public class Dinglemouse {

  public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
    // Your code here!
    int[] result = new int[2];
    int c = 0;
    int d = 0;
    if (catYears < 15) {
      c = 0;
    }
    if (dogYears < 15) {
      d = 0;
    }
    if (catYears >= 15 && catYears < 24) {
      c = 1;
    }
    if (dogYears >= 15 && dogYears < 24) {
      d = 1;
    }
    if (catYears == 24) {
      c = 2;
    }
    if (dogYears == 24) {
      d = 2;
    }
    
    if (catYears > 24) {
      c = ((catYears - 24) / 4) + 2;
    }
    if (dogYears > 24) {
      d = ((dogYears - 24) / 5) + 2;
    }
    result[0] = c;
    result[1] = d;
    return result;
  }
  
}
/*-------------------------------------------------------------------------
public class Dinglemouse {

  public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
      return new int[] {convert(catYears,4), convert(dogYears,5)};
  }
  
  private static int convert(int y, int d) { return y >= 24 ? (y-24)/d + 2 : y >= 15 ? 1 : 0; }
}
------------------------------------------------------------------------------
public class Dinglemouse {

  public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
    final int ownedCat = catYears < 15 ? 0 : catYears < 24 ? 1 : 2 + (catYears-24)/4;
    final int ownedDog = dogYears < 15 ? 0 : dogYears < 24 ? 1 : 2 + (dogYears-24)/5;
    return new int[]{ownedCat, ownedDog};
  }
  
}
------------------------------------------------------------------------------
public class Dinglemouse {

  public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        return new int[]{toYears(catYears, 4), toYears(dogYears, 5)};
    }

    private static int toYears(int animaYear, int m) {
        int animalRealYars = 0;
        if (animaYear >= 15) animalRealYars++;
        if (animaYear >= 24) {
            animalRealYars++;
            animalRealYars += (animaYear - 24) / m;
        }
        return animalRealYars;
    }
  
}




*/