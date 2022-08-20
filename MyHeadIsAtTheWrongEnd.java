/*  8KYU CodeWars  My head is at the wrong end

You're at the zoo... all the meerkats look weird. Something 
has gone terribly wrong - someone has gone and switched their 
heads and tails around!

Save the animals by switching them back. You will be given an 
array which will have three values (tail, body, head). It is 
your job to re-arrange the array so that the animal is the right 
way round (head, body, tail).

Same goes for all the other arrays/lists that you will get in the 
tests: you have to change the element positions with the same 
exact logics

Simples!

*/

public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    String[] result = new String[3];

    result[0] = arr[2];
    result[1] = arr[1];
    result[2] = arr[0];
    return result;
  }
}

/*--------------------------------------------------
public class WrongEndHead {
  public static String[] fixTheMeerkat(String[] arr) {
    return new String[] {arr[2], arr[1], arr[0]};
  }
}
-----------------------------------------------------



*/