/* 5KYU CodeWars Greed is Good

Greed is a dice game played with five six-sided dice. Your mission, 
should you choose to accept it, is to score a throw according to 
these rules. You will always be given an array with five six-sided 
dice values.

 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
A single die can only be counted once in each roll. For example, a 
given "5" can only count as part of a triplet (contributing to the 
500 points) or as a single 50 points, but not both in the same roll.

Example scoring

 Throw       Score
 ---------   ------------------
 5 1 3 4 1   250:  50 (for the 5) + 2 * 100 (for the 1s)
 1 1 1 3 1   1100: 1000 (for three 1s) + 100 (for the other 1)
 2 4 4 5 4   450:  400 (for three 4s) + 50 (for the 5)
In some languages, it is possible to mutate the input to the function. This 
is something that you should never do. If you mutate the input, you will not 
be able to pass all the tests.


*/
public class Greed{
  public static int greedy(int[] dice){
    int result = 0;
    int[] test = new int[7];
    for (int i : dice) {
      ++test[i];
    }
    for (int i = 1; i < test.length; i++) {
      if (i == 1) {
        result += (test[i] > 2 ? 1000 + (test[1] - 3) * 100 : test[1] * 100);
      }
      else if (i == 5) {
        result += (test[i] > 2 ? 500 + (test[5] - 3) * 50 : test[5] * 50);
      }
      else {
        result += (test[i] > 2 ? i * 100 : 0);
      }
    }
    return result;
  }
}





/*
---------------------------------------------------------------
interface Greed {
  static int greedy(int[] dice) {
    int[] count = new int[6];
    for (int d : dice) {
      count[d - 1]++;
    }
    return count[0] / 3 * 1000 +
           count[0] % 3 * 100 +
           count[1] / 3 * 200 +
           count[2] / 3 * 300 +
           count[3] / 3 * 400 +
           count[4] / 3 * 500 +
           count[4] % 3 * 50 +
           count[5] / 3 * 600;
  }
}
---------------------------------------------------------------
public class Greed {

	public static int greedy(int[] dice) {
		int total=0;

		int[] diceOccur = {0,0,0,0,0,0,0};
		for(int j: dice) diceOccur[j]++;
		
		for(int i=1; i<diceOccur.length; i++) {
			if(i==1) {
				total += (diceOccur[i] > 2? 1000+(diceOccur[1]-3)*100: diceOccur[1]*100);
			} else
			if(i==5) {
				total += (diceOccur[i] > 2? 500+(diceOccur[5]-3)*50: diceOccur[5]*50);
			} else {
				total += (diceOccur[i] > 2? i*100: 0);
			}
		}

		return total;
	}

}
--------------------------------------------------------------------------
public class Greed {

  public static int greedy(int[] dice) {
    int n[] = new int[7];
    for (int d : dice) n[d]++;
    return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 + n[5]%3*50 + n[6]/3*600;
  }
  
}
--------------------------------------------------------------------------
public class Greed{
  public static int greedy(int[] dice){
        int res = 0;
        int[] count = new int[]{0, 0, 0, 0, 0, 0};
        int[] weight = new int[]{100, 0, 0, 0, 50, 0};
        int[] weight3 = new int[]{1000, 200, 300, 400, 500, 600};

        for (int die : dice) count[die-1]++;

        for (int i = 0; i < count.length; i++) res+=(count[i]/3*weight3[i]) + (count[i]%3 * weight[i]);

        return res;
  }
}
--------------------------------------------------------------------------
import java.util.HashMap;
public class Greed{
  public static int greedy(int[] dice){
        int sum = 0;
        HashMap<Integer, Integer> c = new HashMap<Integer, Integer>();
        for(int i = 0; i < dice.length; i++) {
            if(c.containsKey(dice[i]) && c.get(dice[i]) != null) {
                c.put(dice[i], c.get(dice[i])+1);
            } else {
                c.put(dice[i], 1);
            }
        }
        for(int i = 1; i < 7; i++) {
            if(c.get(i) != null) {
                int tmp = c.get(i);
                sum += score(i, (tmp-tmp%3)/3, tmp%3);
            }
        }
        return sum;
    }

    public static int score (int n, int three, int one) {
        int result = 0;

        switch (n) {
            case 1: result = three * 1000 + one * 100; break;
            case 2: result = three *200; break;
            case 3: result = three *300; break;
            case 4: result = three *400; break;
            case 5: result = three *500 + one *50; break;
            case 6: result = three *600; break;
            default: break;
        }
        return result;
    }
}
-------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Greed{
  public static int greedy(int[] dice){
    Map<Integer, Long> collect = Arrays.stream(dice).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    int score = 0;
    for (Map.Entry<Integer, Long> e : collect.entrySet()) {
      switch (e.getKey()) {
        case 1: score += ( ( e.getValue() >= 3) ? 1000 : 0) + (e.getValue() % 3) * 100; break;
        case 2: score += ( ( e.getValue() >= 3) ? 200 : 0); break;
        case 3: score += ( ( e.getValue() >= 3) ? 300 : 0); break;
        case 4: score += ( ( e.getValue() >= 3) ? 400 : 0); break;
        case 5: score += ( ( e.getValue() >= 3) ? 500 : 0) + (e.getValue() % 3) * 50; break;
        case 6: score += ( ( e.getValue() >= 3) ? 600 : 0); break;
      }
    }
    return score;
  }
}
--------------------------------------------------------------------------
import java.util.Arrays;
import java.util.stream.Collectors;

public class Greed{
    public static int greedy(int[] dice) {
        return Arrays.stream(dice)
                .boxed()
                .collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .entrySet()
                .stream()
                .mapToInt(item -> calculate(item.getKey(), item.getValue().intValue()))
                .sum();
    }
  
    private static int calculate(int number, int count) {
        int calculatedScore = 0;

        if (number == 1) {
            calculatedScore = calculateValue(number, count, 1000, 100);
        } else if (number == 2) {
            calculatedScore = calculateValue(number, count, 200, 0);
        } else if (number == 3) {
            calculatedScore = calculateValue(number, count, 300, 0);
        } else if (number == 4) {
            calculatedScore = calculateValue(number, count, 400, 0);
        } else if (number == 5) {
            calculatedScore = calculateValue(number, count, 500, 50);
        } else if (number == 6) {
            calculatedScore = calculateValue(number, count, 600, 0);
        }

        return calculatedScore;
    }

    private static int calculateValue(int number, int count, int constValue, int secondConstValue) {
        int result;

        if (number == 1 || number == 5) {
            if (count > 3) {
                int secondCount = count % 3;
                result = constValue + secondCount * secondConstValue;
            } else {
                result = count == 3 ? constValue : count * secondConstValue;
            }
        } else {
            result = count >= 3 ? constValue : secondConstValue;
        }
        
        return result;
    }
}
-------------------------------------------------------------------------
public class Greed{
  public static int greedy(int[] dice){
    int counter1=0;
    int counter2=0;
    int counter3=0;
    int counter4=0;
    int counter5=0;
    int counter6=0;
    for(int i=0; i<dice.length; i++){
      switch (dice[i]){
          case 1: counter1++;
          break;
          case 2: counter2++;
          break;
          case 3: counter3++;
          break;
          case 4: counter4++;
          break;
          case 5: counter5++;
          break;
          case 6: counter6++;
          break;
      }
      
    }
   int sum=count(counter1, 1000, 100)+count(counter2, 200, 0)+count(counter3, 300, 0)+count(counter4, 400, 0)+count(counter5, 500, 50)
           +count(counter6, 600, 0);
    
    return sum;
  }
  
  
  public static int count(int counter, int sumthree, int sumone){
  int sum=0;
	    if(counter>=3){
	      counter-=3;
	      sum+=sumthree;
	      }
	    if(sumone!=0){
	    	if(sum==0 && counter!=0 ) {
	    		
	    		sum=1;
	    		sum=counter*sumone;
	    	}else {
	    		
	    		sum+=counter*sumone;
	    	}
	    }
	  return sum;
  }
}
--------------------------------------------------------------------------
public class Greed{
  public static int greedy(int[] dice){
    int[] len = new int[6];
    int point = 0;

    for (int i : dice)
      len[i - 1]++;
    
    for (int i = 0; i < len.length; i++){
      if (len[i] >= 3){
        point += i == 0? 1000: 100 * (i + 1);
        len[i] -= 3;
      }
      point += i == 0? 100 * len[i]: 0;
      point += i == 4? 50 * len[i]: 0;
    }
    
    return point;
  }
}
-------------------------------------------------------------------------
import java.util.*;

public class Greed {
    public static int get_score(HashMap<String, Integer> Данные) {
        int значение = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 1 || i == 5)
                значение += Данные.get(Integer.toString(i)) % 3 * (i == 1 ? 100 : 50);
            значение += Данные.get(Integer.toString(i))/3*i*(i==1?1000:100);
        }
        return значение;
    }

    public static int count(int[] arr, int d) {
        int ct = 0;
        for (int e : arr)
            if (e == d)
                ct++;
        return ct;
    }

    public static int greedy(int[] dice) {
        HashMap<String, Integer> таблица = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            таблица.put(Integer.toString(i), count(dice, i));
        }
        return get_score(таблица);
    }
}
--------------------------------------------------------------------------
public class Greed{
  public static int greedy(int[] dice){
      int score = 0;

        int [][]threeNeeded = { 
            { 1, 1000 },
            { 6, 600  },
            { 5, 500  },
            { 4, 400  },
            { 3, 300  },
            { 2, 200  }
        };
        int [][]oneNeeded = {
            { 1, 100 },
            { 5, 50  }
        };

        for( int i = 0; i < threeNeeded.length; i++ ){
            int count = 0;
            int currentCheck = threeNeeded[i][0]; 
            for( int j = 0; j < dice.length; j++ ){
                if( currentCheck == dice[j] )
                    count++;
            }
            if( count >= 3 ){
                count = 0;
                score += threeNeeded[i][1];
                for( int j = 0; j < dice.length; j++ ){
                    if( dice[j] == currentCheck ){
                        count++;
                        dice[j] = 0;
                    }
                    if( count == 3 )
                        break;
                }
                break;
            }
        }
        for( int i = 0; i < oneNeeded.length; i++ ){
            int currentCheck = oneNeeded[i][0];
            for( int j = 0; j < dice.length; j++ ){
                if( currentCheck == dice[j] ){
                    score += oneNeeded[i][1];
                    dice[j] = 0;
                }
            }
        }
        return score;
  }
}
--------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Greed {
    public static int greedy(int[] dice){
        return Arrays.stream(dice)
                .boxed()
                .collect(groupingBy(Function.identity(), counting()))
                .entrySet().stream()
                .map(Greed::processing)
                .reduce(0, Integer::sum);
    }

    private static int processing(Map.Entry<Integer, Long> entry) {
        switch (entry.getKey()) {
            case 1: return (int) (entry.getValue() >= 3 ? 1000 + 100 * (entry.getValue() % 3) : 100 * entry.getValue());
            case 2: return entry.getValue() >= 3 ? 200 : 0;
            case 3: return entry.getValue() >= 3 ? 300 : 0;
            case 4: return entry.getValue() >= 3 ? 400 : 0;
            case 5: return (int)(entry.getValue() >= 3 ? 500 + 50 * (entry.getValue() % 3) : 50 * entry.getValue());
            case 6: return entry.getValue() >= 3 ? 600 : 0;
            default: return 0;
        }
    }
}
*/




