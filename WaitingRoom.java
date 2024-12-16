/* 7KYU CodeWars Waiting Room

There's a waiting room with N chairs set in single row. 
Chairs are consecutively numbered from 1 to N. First is 
closest to the entrance (which is exit as well).

For some reason people choose a chair in the following way

Find a place as far from other people as possible

Find a place as close to exit as possible

All chairs must be occupied before the first person will be served

So it looks like this for 10 chairs and 10 patients

Chairs	1	2	3	4	5	6	7	8	9	10
Patients	1	7	5	8	3	9	4	6	10	2

Your task is to find last patient's chair's number.

Input: number of chairs N, an integer greater than 2.

Output: a positive integer, the last patient's chair number.

*/
public class WaitingRoom {
  public static int lastChair(int n) {
    return n - 1;
  }
}
/*--------------------------------------------------------------
public class Kata {
  public static int lastChair(int n) {
    switch (n){
        case (1): return 1;
        case (2): return 2;
        default: return n-1;
    }
  }
}

----------------------------------------------------------------
public class Kata {
  public static int lastChair(int n) {
		return n == 0 ? n - 1 : lastChair(n - 1) + 1;
  }
}
----------------------------------------------------------------
public class Kata {
  public static int lastChair(int n) {

        int[] chairs = new int[n];

        chairs[0] = 1;
        chairs[n - 1] = 2;

        int lastPatient =0;

        int currentChair = 0, currentLength = 0, current1Arg = 0, current2Arg = 0;

        for (int j = 3; j <= n; ++j) {

            for (int i = 1; i <= n; i++) {

                if ((current1Arg == 0) && (chairs[i - 1] != 0)) {

                    current1Arg = i;


                } else if ((current1Arg > 0) && (chairs[i - 1] != 0)) {
                    
                    current2Arg = i;
               
                    if((current2Arg - current1Arg -1) > currentLength) {
                        if (chairs[current2Arg - 2] != chairs[current1Arg - 1]) {
                            currentLength = (current2Arg - current1Arg - 1);
                            currentChair = (int) (Math.floor((current2Arg + current1Arg) / 2));
                          



                        }
                    }
                    current1Arg = current2Arg;
                    current2Arg = 0;
                }
            }

        
            chairs[currentChair - 1] = j;
            if(j == n)
                lastPatient = currentChair;

            current1Arg = 0;
            current2Arg = 0;
            currentChair = 0;
            currentLength = 0;


        }
        return lastPatient;
    }
}
----------------------------------------------------------------
public class Kata {
  private static int getBestSeat(boolean[] chairs) {
    int index = -1;
    int maxSoFar = -1;
    for (int i = 0; i < chairs.length; i++) {
      if (!chairs[i]) {
        int score = calcScore(chairs, i);
        if (score > maxSoFar) {
          index = i;
          maxSoFar = score;
        }
      }
    }
    return index;
  }
  
  private static int calcScore(boolean[] chairs, int chair) {
    int leftScore = 0;
    if (chair == 0) {
      leftScore = chairs.length;
    } else {
      for (int i = chair - 1; i >= 0; i--) {
        if (chairs[i]) {
          break;
        }
        leftScore ++;
      }
    }
    int rightScore = 0;
    if (chair == chairs.length - 1) {
      rightScore = chairs.length;
    } else {
      for (int i = chair + 1; i < chairs.length; i++) {
        if (chairs[i]) {
          break;
        }
        rightScore ++;
      }
    }
    return (leftScore < rightScore) ? leftScore : rightScore;
  }
  
  public static int lastChair(int n) {
    boolean[] chairs = new boolean[n];
    int chair = 0;
    for (int i = 0; i < n; i++) {
      chair = getBestSeat(chairs);
      chairs[chair] = true;
    }
    return chair + 1;
  }
}
----------------------------------------------------------------
public class Kata {
    public static int lastChair(int n) {
        int[] chairs = new int[n];
        for (int i = 0; i < n - 1; i++) {
            chairs[getNextChair(chairs)] = 1;
        }
        return getNextChair(chairs) + 1; // add 1 because of the index offset (index starts at 0)
    }

    public static int getNextChair(int[] chairs) {
        if (chairs[0] == 0) {
            return 0;
        }

        if (chairs[chairs.length - 1] == 0) {
            return chairs.length - 1;
        }
        int maxGap = 0;
        int currentGap = 0;
        int gapStart = 0, gapEnd = 0;
        for (int i = 0; i < chairs.length; i++) {
            if (chairs[i] == 0 && i != chairs.length-1) {
                currentGap++;
            } else {
                if (currentGap > maxGap) {
                    gapEnd = i - 1;
                    gapStart = i - currentGap;
                    maxGap = currentGap;
                }
                currentGap = 0;
            }
        }

        if (maxGap % 2 == 0) {
            return gapStart + maxGap/2 - 1;
        } else {
            return gapStart + maxGap/2;
        }
    }
}
----------------------------------------------------------------
public class Kata {
  public static int lastChair(int n) {
    int a = 0;
        for (int i = 1; i <= n; i ++) {
            for (int j = n; j >0; j --){
                a = i - j;
            }
        }
        return a;
  }
}
----------------------------------------------------------------
public class Kata {
  public static int lastChair(int n) {
    // TODO ;)
    if(n == 1){
      return 1;
    }
    else if(n == 2){
      return 2;
    }
    else{
      return n - 1;
    }
  }
}
---------------------------------------------------------------
public class Kata {

  // Marker value to know if someone is in a chair.
  private static final int USED = -1;
  
  public static int lastChair(int n) {
    /**
      I know its basically going to be n - 1, but let's do a scoring based solution for practice.
       n=1 -> 1
       n=2 -> 2
       n=3 -> 2
       n=4 -> 3
       n=5 -> 4
       n=6 -> 5
       ....
       n=i -> i - 1 
    
    
    if (n <= 0) {
        throw new IllegalArgumentException("Invalid count");
      }
  
      if (n == 1 || n == 2) {
        return n;
      }
      
      // skip 0, use 1..n for ease.
      // score[i] for chair position i.
      // we only need to track where the LAST patient sits. So do that in index and not keep chair array.
      int[] score = new int[n+1];
      
      int index = 0, pscore;
      
      for (int p = 1; p <= n; p++) {
        index = n;
        pscore = score[n];
        
        // walk backwards, select max score value, ignoring already used slots.
        for (int i = n; i > 0; i--) {
          if (score[i] != Kata.USED && score[i] >= pscore) {
            pscore = score[i];
            index = i;
          }
        }
        // Place person
        score[index] = Kata.USED;
        
        // update scoring to left and right of person.
        
        // Left
        int c = 1;
        for (int i = index - 1; i >= 1; i--) {
          Kata.updateScore(score, i, c++);
        }
        
        // Right
        c = 1;
        for (int i = index + 1; i <= n; i++) {
          Kata.updateScore(score, i, c++);
        }
        
      }
      return index;
    }
    
    // If the slot is open, score is either the count (if was unused so far), or the minimum of current value and count.
    private static void updateScore(int[] scores, int i, int count) {
      if (scores[i] != Kata.USED) {
        scores[i] = scores[i] == 0 ? count: Math.min(count, scores[i]);
      }
    }
  }
*/