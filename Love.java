/*     Who remembers back to their time in the schoolyard, when girls would take a flower
       and tear its petals, saying each of the following phrases each time a petal was 
       torn:

                    I love you
                    a little
                    a lot
                    passionately
                    madly
                    not at all
        When the last petal was torn there were cries of excitement, dreams, surging thoughts 
        and emotions.
        Your goal in this kata is to determine which phrase the girls would say for a flower 
        of a given number of petals, where nb_petals > 0.
 */

 public class Sid {
      public static String howMuchILoveYou(int nb_petals) {
        
        return (nb_petals % 6 == 1) ? "I love you" : (nb_petals % 6 == 2) ? "a little" : (nb_petals % 6 == 3) ? "a lot" : (nb_petals % 6 == 4) ? "passionately" : (nb_petals % 6 == 5) ? "madly" : "not at all";
     
      }
  }
/*------------------------------------------------------------------------------------------
 public class Love {
    public static String howMuchILoveYou(int nb_petals) {
    
    //your code here :)
     
    if(nb_petals % 6 == 1){
        return ("I love you");
  }
    else if(nb_petals % 6 == 2){
        return ("a little");
  } else if(nb_petals % 6 == 3){
        return ("a lot");
  } else if(nb_petals % 6 == 4){
        return ("passionately");
  } else if(nb_petals % 6 == 5){
        return ("madly");
  } else{
        return ("not at all");
  }
}
-----------------------------------------------------------------------------------------------------
public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
    
      String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
    
      return arr[nb_petals%6];
    }
}
---------------------------------------------------------------------------------------------------
public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
    
    //your code here :)
      switch (nb_petals % 6){
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";
            case 0:
                return "not at all";
                default:
                return "";
        }
    }
}
--------------------------------------------------------------------------------------------
class Sid {
    private static final String[] phrases = {
        "I love you","a little","a lot","passionately","madly","not at all"
    };

    static String howMuchILoveYou(final int nbPetals) {  
        return phrases[(nbPetals - 1) % phrases.length];
    }
}
------------------------------------------------------------------------------------------
public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        int result = nb_petals;
        while (result > 6) {
            result -= 6;
        }

        switch (result){
            case 1:return "I love you";
            case 2:return "a little";
            case 3:return "a lot";
            case 4:return "passionately";
            case 5:return "madly";
            case 6:return "not at all";
            default:return "";
        }
    }
}
---------------------------------------------------------------------------------------
public class Sid {
    public static String howMuchILoveYou(int n) {
      return new String[]{"not at all", "I love you", "a little", "a lot", "passionately", "madly"}[n % 6];
    }
}


*/