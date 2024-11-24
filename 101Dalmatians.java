/* 8KYU CodeWars 101 Dalmatians - Squash The Bugs, Not The Dogs!

Your friend has been out shopping for puppies (what a time to be alive!)... 
He arrives back with multiple dogs, and you simply do not know how to respond!

By repairing the function provided, you will find out exactly how you 
should respond, depending on the number of dogs he has.

The number of dogs will always be a number and there will always be at least 1 dog.
Good Luck! 

*/

public class 101Dalmatians {

  public static String howManyDalmatians(int number) {
  
    String[] dogs = {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"};
    
    return ((number <= 10) ? dogs[0] : (number <= 50) ? dogs[1] : (number == 101) ? dogs[3] : dogs[2]);
    
   }  
}

/*------------------------------------------------------------------------
 class ZywOo {
  static String howManyDalmatians(int number) {
    return number <= 10 ? "Hardly any" :
           number <= 50 ? "More than a handful!" :
           number == 101 ? "101 DALMATIANS!!!" : "Woah that's a lot of dogs!";
  }
}
--------------------------------------------------------------------------
public class ZywOo {
  private static final String[] dogs = {
    "Hardly any",
    "More than a handful!",
    "Woah that's a lot of dogs!",
    "101 DALMATIANS!!!"
  };

  public static String howManyDalmatians(int number) {
    return (number <= 10) ? dogs[0] : (number <= 50) ? dogs[1] : (number == 101) ?  dogs[3] : dogs[2];
  }
}




*/