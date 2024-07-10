/* 7KYU CodeWars Another Card Game

Twelve cards with grades from 0 to 11 randomly divided 
among 3 players: Frank, Sam, and Tom, 4 cards each. The 
game consists of 4 rounds. The goal of the round is to 
move by the card with the most points.

In round 1, the first player who has a card with 0 points, 
takes the first turn, and he starts with that card. Then 
the second player (queue - Frank -> Sam -> Tom -> Frank, etc.) 
can move with any of his cards (each card is used only once 
per game, and there are no rules that require players to make 
only the best moves). The third player makes his move after 
the second player, and he sees the previous moves.

The winner of the previous round then makes the first move in 
the next round with any remaining card.

The player who wins 2 rounds first, wins the game.

Task

Return true if Frank has a chance of winning the game.

Return false if Frank has no chance.

Input

3 arrays of 4 unique numbers in each (numbers in array are 
sorted in ascending order). Input is always valid, no need 
to check.

Example

Round 1: Frank 2 5 8 11, Sam 1 4 7 10, Tom 0 3 6 9. Tom has 
to start from 0. Frank is risking nothing and goes 2. Sam gets 
lucky and wins round by throwing 4.

Round 2: Frank 5 8 11, Sam 1 7 10, Tom 3 6 9. Sam starts from 1. Tom goes 3, Frank wins with 5.

Round 3: Frank 8 11, Sam 7 10, Tom 6 9. Frank starts from 11 and wins the round either way.

Frank is the first to win 2 rounds and therefore wins the game, the answer is true.

One more example
Frank 0 1 2 3, Sam 6 7 8 11, Tom 4 5 9 10.
With these cards Frank has no chance, the answer is false.

Tip
Players can actually play DUMB moves, especially Sam and Tom

*/
public class Another_Card_Game {
  public static boolean game(int[] frank, int[] sam, int[] tom) {
    return frank[2] > Math.max(sam[0], tom[0]) && frank[3] > Math.max(sam[1], tom[1]);
  }
}
/*---------------------------------------------------------------
public class Kata 
{
  public static boolean game(int[] frank, int[] sam, int[] tom) 
  {
           int wynikFranka = 0;

        for (int i = 0; i < frank.length; i++) {
            for (int j = 0; j < frank.length; j++) {
                if (frank[j] > sam[i] && frank[j] > tom [i]){
                    wynikFranka += 1;
                    frank[j] = 0;
                    break;
                }
                if (wynikFranka >= 2) return true;
            }

        }

        return wynikFranka >= 2;
  }
}
-----------------------------------------------------------------
public class Kata 
{
  public static boolean game(int[] frank, int[] sam, int[] tom) 
  {
    return ((frank[3] > Math.max(sam[3],tom[3]) && frank[2] > Math.max(sam[2],tom[2]))
           || (frank[3] > Math.max(sam[2],tom[2]) && frank[2] > Math.max(sam[1],tom[1]))
           || (frank[3] > Math.max(sam[1],tom[1]) && frank[2] > Math.max(sam[0],tom[0]))) ? true : false;
  }
}
-----------------------------------------------------------------
import java.util.Arrays;
import java.util.TreeSet;

public class Kata 
{
  public static boolean game(int[] frank, int[] sam, int[] tom) 
  {
    
        int frankWins = 0;
        Integer[] frank_temp = new Integer[frank.length];
        Integer[] tom_temp = new Integer[tom.length];
        Integer[] sam_temp = new Integer[sam.length];

        for (int i = 0; i < frank.length; i++) {
            frank_temp[i] = frank[i];
            tom_temp[i] = sam[i];
            sam_temp[i] = tom[i];
        }
        
        TreeSet<Integer> franksHand = new TreeSet<>(Arrays.asList(frank_temp));
        TreeSet<Integer> tomsHand = new TreeSet<>(Arrays.asList(tom_temp));
        TreeSet<Integer> samsHand = new TreeSet<>(Arrays.asList(sam_temp));

        Integer franksCard = null;
        Integer tomsCard = null;
        Integer samsCard = null;
        
        for (int i = 0; i < frank.length; i++) {
            franksCard = franksHand.last();
            tomsCard = tomsHand.lower(franksCard);  // get greatest card smaller than franks card
            samsCard = samsHand.lower(franksCard);  // get greatest card smaller than franks card
            if(tomsCard == null) tomsCard = tomsHand.last(); // if no card is smaller than franks, use highest card
            if(samsCard == null) samsCard = samsHand.last(); // if no card is smaller than franks, use highest card

            if (franksCard >  tomsCard && franksCard > samsCard) frankWins++; // test if frank wins
            
            // drop cards
            franksHand.remove(franksCard);
            tomsHand.remove(tomsCard);
            samsHand.remove(samsCard);
        }
-----------------------------------------------------------------
import java.util.*;
public class Kata 
{
  public static boolean game(int[] frank, int[] sam, int[] tom) 
  {
  Arrays.sort(sam);
        Arrays.sort(tom);
        Arrays.sort(frank);
        return frank[2] > sam[0] && frank[2] > tom[0] && frank[3] > sam[1] && frank[3] > tom[1];
  }
}
-----------------------------------------------------------------
import java.util.Arrays;

public class Kata 
{
  public static boolean game(int[] frank, int[] sam, int[] tom) 
  {
// i see, code's not clean. But, it was really tough. Can't be 7kuy, but kata's amazing.
if (frank[0] != 0) {
            int wins = 0;
            int usedIndex = 0;
            for (int j = 0; j < frank.length; j++) {
                if (frank[j] > sam[0] && frank[j] > tom[0]) {
                    wins++;
                    usedIndex = j;
                  break;
                }
            }
            for (int j = 3; j > 0; j--) {
                if (j == usedIndex) {
                    continue;
                }
                if (frank[j] > sam[1] && frank[j] > tom[1]) {
                    wins++;
                }
            }

            if (wins >= 2) {
                return true;
            }
            return false;
        } else {
            int wins = 0;
            int usedIndex = 0;
            for (int j = 1; j < frank.length; j++) {
                if (frank[j] > sam[0] && frank[j] > tom[0]) {
                    wins++;
                    usedIndex = j;
                  break;
                }
            }
            for (int j = 3; j > 1; j--) {
                if (j == usedIndex) {
                    continue;
                }
                if (frank[j] > sam[1] && frank[j] > tom[1]) {
                    wins++;
                }
            }

            if (wins >= 2) {
                return true;
            }
            return false;
        }
    }
  }
-----------------------------------------------------------------
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Kata 
{
  public static boolean game(int[] frank, int[] sam, int[] tom) {
		List<Integer> samList = IntStream.of(sam)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
		List<Integer> tomList = IntStream.of(tom)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
		Arrays.sort(frank);
		System.out.println(Arrays.toString(frank));
		System.out.println(samList);
		System.out.println(tomList);
		int i=frank.length, count=0, fail=0;
		while(i-->=0) {
			samList = getLeastNum(frank[i],samList);
			tomList = getLeastNum(frank[i],tomList);
			if(i==samList.size() && i==tomList.size()) count++;
			else fail++;
			if(fail>1 && fail>count) return false;
			else if(count>1) return true;
		}
		return false;
	}
	private static List<Integer> getLeastNum(int frankNum, List<Integer> player) {
		for(int i=0; i<player.size() ; i++) {
			if(frankNum>player.get(i)) {
				player.remove(i);
				break;
			}
		}
		return player;
	}
}
-----------------------------------------------------------------
import java.util.ArrayList;
public class Kata {
  public static boolean game(int[] frank, int[] sam, int[] tom) {
    boolean result = false;
    int[][] queue = new int[3][4];
    int[] indexes = new int[3];
    if (frank[0] == 0) {
      queue[0] = copy(frank);
      queue[1] = copy(sam);
      queue[2] = copy(tom);
      indexes[0] = 0;
      indexes[1] = 1;
      indexes[2] = 2;
    }
    else if (sam[0] == 0) {
      queue[0] = copy(sam);
      queue[1] = copy(tom);
      queue[2] = copy(frank);
      indexes[0] = 1;
      indexes[1] = 2;
      indexes[2] = 0;
    }
    else if (tom[0] == 0) {
      queue[0] = copy(tom);
      queue[1] = copy(frank);
      queue[2] = copy(sam);
      indexes[0] = 2;
      indexes[1] = 0;
      indexes[2] = 1;
    }
    ArrayList<int[]> possibleResultsList = getAllPossibleResults(queue, indexes);
    int[] possibleResults;
    for (int i = 0; i < possibleResultsList.size(); i++) {
      possibleResults = possibleResultsList.get(i);
      if (possibleResults[0] == 2) {
        result = true;
        break;
      }
    }
    return result;
  }
  private static int[] copy(int[] array) {
    int[] result = new int[array.length];
    System.arraycopy(array, 0, result, 0, array.length);
    return result;
  }
  private static ArrayList<int[]> getAllPossibleResults(int[][] queue, int[] indexes) {
    ArrayList<int[]> result = new ArrayList<int[]>();
    int[] possibleResults;
    for (int i = 0; i < 16; i++) {
      for (int j = 0; j < 27; j++) {
        for (int k = 0; k < 8; k++) {
          possibleResults = getPossibleResults(queue, indexes, i, j, k);
          result.add(possibleResults);
        }
      }
    }
    return result;
  }
  private static int[] getPossibleResults(int[][] queue, int[] indexes, int number1, int number2, int number3) {
    int[] result = new int[]{0, 0, 0};
    int[][] queueCopy = deepCopy(queue);
    int[] digits1 = getBaseFourDigits(number1);
    digits1 = makeArrayLengthWithElement(digits1, 3, 0);
    int[] roundOne = new int[3];
    int digit;
    for (int i = 0; i < 3; i++) {
      digit = digits1[i];
      roundOne[i] = queueCopy[i][digit];
      queueCopy[i] = removeElementAtIndex(queueCopy[i], digit);
    }
    int winningCard = maximum(roundOne);
    int winnerIndex = indexes[indexOf(roundOne, winningCard)];
    result[winnerIndex]++;
    int[] digits2 = getBaseThreeDigits(number2);
    digits2 = makeArrayLengthWithElement(digits2, 3, 0);
    int[] roundTwo = new int[3];
    for (int i = 0; i < 3; i++) {
      digit = digits2[i];
      roundTwo[i] = queueCopy[i][digit];
      queueCopy[i] = removeElementAtIndex(queueCopy[i], digit);
    }
    winningCard = maximum(roundTwo);
    winnerIndex = indexes[indexOf(roundTwo, winningCard)];
    result[winnerIndex]++;
    if (contains(result, 2) == false) {
      int[] digits3 = getBaseTwoDigits(number3);
      digits3 = makeArrayLengthWithElement(digits3, 3, 0);
      int[] roundThree = new int[3];
      for (int i = 0; i < 3; i++) {
        digit = digits3[i];
        roundThree[i] = queueCopy[i][digit];
        queueCopy[i] = removeElementAtIndex(queueCopy[i], digit);
      }
      winningCard = maximum(roundThree);
      winnerIndex = indexes[indexOf(roundThree, winningCard)];
      result[winnerIndex]++;
      if (contains(result, 2) == false) {
        int[] roundFour = new int[3];
        for (int i = 0; i < 3; i++) {
          roundFour[i] = queueCopy[i][0];
        }
        winningCard = maximum(roundFour);
        winnerIndex = indexes[indexOf(roundFour, winningCard)];
        result[winnerIndex]++;
      }
    }
    return result;
  }
  private static int[][] deepCopy(int[][] array) {
    int[][] result = new int[array.length][];
    for (int i = 0; i < array.length; i++) {
      result[i] = copy(array[i]);
    }
    return result;
  }
  private static int[] getBaseFourDigits(int number) {
    int[] result = new int[]{};
    int digit;
    while (number != 0) {
      digit = number % 4;
      result = insertElementAtBeginning(result, digit);
      number = number / 4;
    }
    if (result.length == 0) {
      result = addElement(result, 0);
    }
    return result;
  }
  private static int[] insertElementAtBeginning(int[] array, int element) {
    int[] result = new int[array.length + 1];
    result[0] = element;
    System.arraycopy(array, 0, result, 1, array.length);
    return result;
  }
  private static int[] addElement(int[] array, int element) {
    int[] result = new int[array.length + 1];
    System.arraycopy(array, 0, result, 0, array.length);
    result[array.length] = element;
    return result;
  }
  private static int[] makeArrayLengthWithElement(int[] array, int length, int element) {
    int[] result = copy(array);
    while (result.length != length) {
      result = insertElementAtBeginning(result, element);
    }
    return result;
  }
  private static int[] removeElementAtIndex(int[] array, int index) {
    int[] result = new int[]{};
    for (int i = 0; i < array.length; i++) {
      if (i != index) {
        result = addElement(result, array[i]);
      }
    }
    return result;
  }
  private static int maximum(int[] numbers) {
    int result = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      result = Math.max(result, numbers[i]);
    }
    return result;
  }
  private static int indexOf(int[] array, int element) {
    int result = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == element) {
        result = i;
        break;
      }
    }
    return result;
  }
  private static int[] getBaseThreeDigits(int number) {
    int[] result = new int[]{};
    int digit;
    while (number != 0) {
      digit = number % 3;
      result = insertElementAtBeginning(result, digit);
      number = number / 3;
    }
    if (result.length == 0) {
      result = addElement(result, 0);
    }
    return result;
  }
  private static boolean contains(int[] array, int element) {
    return indexOf(array, element) >= 0;
  }
  private static int[] getBaseTwoDigits(int number) {
    int[] result = new int[]{};
    int digit;
    while (number != 0) {
      digit = number % 2;
      result = insertElementAtBeginning(result, digit);
      number = number / 2;
    }
    if (result.length == 0) {
      result = addElement(result, 0);
    }
    return result;
  }
}
*/