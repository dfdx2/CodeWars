/* 7KYU CodeWars Chinese Zodiac

The Chinese zodiac is a repeating cycle of 12 years, with each year being represented by an animal and its reputed attributes. The lunar calendar is divided into cycles of 60 years each, and each year has a combination of an animal and an element. There are 12 animals and 5 elements; the animals change each year, and the elements change every 2 years. The current cycle was initiated in the year of 1984 which was the year of the Wood Rat.

Since the current calendar is Gregorian, I will only be using years from the epoch 1924. For simplicity I am counting the year as a whole year and not from January/February to the end of the year.

##Task

Given a year, return the element and animal that year represents ("Element Animal"). For example I'm born in 1998 so I'm an "Earth Tiger".

animals (or $animals in Ruby) is a preloaded array containing the animals in order:

['Rat', 'Ox', 'Tiger', 'Rabbit', 'Dragon', 'Snake', 'Horse', 'Goat', 'Monkey', 'Rooster', 'Dog', 'Pig']

elements (or $elements in Ruby) is a preloaded array containing the elements in order:

['Wood', 'Fire', 'Earth', 'Metal', 'Water']

Tell me your zodiac sign and element in the comments. Happy coding :)

*/
public class ChineseZodiac {
  public static String chineseZodiac(int year) {
    String[] animal = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
    String[] element = {"Wood", "Fire", "Earth", "Metal", "Water"};
    return element[((year - 1924) / 2) % 5] + " " + animal[(year - 1924) % 12];
  }
}
/*------------------------------------------------------------------------------
public class Kata extends Arrays{
  public static String chineseZodiac(int year) {
    String[] animal = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
    String[] element = {"Wood", "Fire", "Earth", "Metal", "Water"};
    int x = (year - 1924) % 12;
    int y = (year - 1924) / 2;
    y = y % 5;
    return element[y] + " " + animal[x];
  }
}
-------------------------------------------------------------------------
public class Kata extends Arrays {

  public static String chineseZodiac(int year) {
    return elements[((year-1924)/2)%5]+" "+animals[(year-1924)%12];
  }
}
---------------------------------------------------------------------------
public class Kata extends Arrays{
  private static final int YEAR_BASE = 1924;

  public static String chineseZodiac(int year) {
    String element = elements[((year - YEAR_BASE) / 2) % 5];
    String animal = animals[(year - YEAR_BASE) % 12];
    return element + " " + animal;
  }
}
----------------------------------------------------------------------------
public class Kata {
  private static final int STARTING_YEAR = 1924;
  private static final int ONE_ELEMENT_DURATION = 2;
  private static final String[] ANIMALS = new String[] { "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse",
      "Goat", "Monkey", "Rooster", "Dog", "Pig" };
  private static final String[] ELEMENTS = new String[] { "Wood", "Fire", "Earth", "Metal", "Water" };

  public static String chineseZodiac(int year) {
    int sixtyBasedYear = (year - STARTING_YEAR) % 60;
    int animalsCompleteRound = ANIMALS.length;
    int elementsCompleteRound = ELEMENTS.length * ONE_ELEMENT_DURATION;

    int animalIndex = sixtyBasedYear % animalsCompleteRound;
    int elementIndex = (sixtyBasedYear % elementsCompleteRound) / ONE_ELEMENT_DURATION;

    String message = ELEMENTS[elementIndex] + " " + ANIMALS[animalIndex];
    return message;
  }
}
---------------------------------------------------------------------------
public class Kata extends Arrays{
  public static String chineseZodiac(int year) {
    int element = (year-1924)%10;
    int animal = (year-1924)%12;
    String result = "";
    
    switch(element){
        case 0: case 1: result += "Wood "; break;
        case 2: case 3: result += "Fire "; break;
        case 4: case 5: result += "Earth "; break;
        case 6: case 7: result += "Metal "; break;
        case 8: case 9: result += "Water "; break;
    }
    
    switch(animal){
        case 0: result += "Rat"; break;
        case 1: result += "Ox"; break;
        case 2: result += "Tiger"; break;
        case 3: result += "Rabbit"; break;
        case 4: result += "Dragon"; break;
        case 5: result += "Snake"; break;
        case 6: result += "Horse"; break;
        case 7: result += "Goat"; break;
        case 8: result += "Monkey"; break;
        case 9: result += "Rooster"; break;
        case 10: result += "Dog"; break;
        case 11: result += "Pig"; break;
    }
    return result;
  }
}
---------------------------------------------------------------------------
public class Kata extends Arrays{
  private static final String[] animals = {"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
  private static final String[] elements = {"Wood", "Fire", "Earth", "Metal", "Water"};

  public static String chineseZodiac(int year) {
        int diff = year - 1924; 
        int anIndex = diff % animals.length;
        int elIndex = (diff / 2) % elements.length; 
        return elements[elIndex] + " " + animals[anIndex];
  }
}
----------------------------------------------------------------------------
public class Kata extends Arrays{
  Integer startYear =1924;
  public static String chineseZodiac(int year) {
    Integer yearDiff = year-1924;
    return ""+elements[((yearDiff%10)/2)]+" "+animals[yearDiff%12];
  }
}
----------------------------------------------------------------------------
public class Kata extends Arrays{
  public static String chineseZodiac(int year) {
    int a = (year+8)%12, e = (year-4)%10>>1;
    return elements[e]+" "+animals[a];
  }
}
*/