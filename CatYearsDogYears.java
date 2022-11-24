/*  8KYU CodeWars Cat Years, Dog Years 

Kata Task
I have a cat and a dog.

I got them at the same time as kitten/puppy. That was humanYears years ago.

Return their respective ages now as [humanYears,catYears,dogYears]

NOTES:

humanYears >= 1
humanYears are whole numbers only
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

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    
    int[] result = new int[3];
    result[0] = humanYears;
    if (humanYears == 1) {
      result[1] = 15;
      result[2] = 15;
    }
    else if (humanYears == 2) {
      result[1] = 15 + 9;
      result[2] = 15 + 9;
    }
    else {
      result[1] = 15 + 9 + ((humanYears - 2) * 4);
      result[2] = 15 + 9 + ((humanYears - 2) * 5);
    }
    return result;
  }

}
/*----------------------------------------------------------------------------
 public class Dinglemouse {
  public static int[] humanYearsCatYearsDogYears(final int y) {
    return new int[]{y,y==1?15:16+4*y,y==1?15:14+5*y};
  }
}
-----------------------------------------------------------------------------
public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
     int catYears =0, dogYears = 0;
        switch (humanYears) {
            default:
                catYears = 4 * (humanYears - 2);
                dogYears = 5 * (humanYears - 2);
            case 2:
                catYears += 9;
                dogYears += 9;
            case 1:
                catYears += 15;
                dogYears += 15;
        }
    return new int[]{humanYears, catYears, dogYears};
  }

}

*/