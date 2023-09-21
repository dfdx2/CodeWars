/* 7KYU CodeWars ATM

An ATM has banknotes of nominal values 10, 20, 50, 100, 200 and 500 dollars. 
You can consider that there is a large enough supply of each of these banknotes.

You have to write the ATM's function that determines the minimal number of 
banknotes needed to honor a withdrawal of n dollars, with 1 <= n <= 1500.

Return that number, or -1 if it is impossible.

Good Luck!!!

*/

public class ATM {
  
  public int solve(int n) {
    int count = 0;
    if (n % 10 != 0) {
      return -1;
    }
    while (n > 0) {
      if (n >= 500) {
        count++;
        n -= 500;
      }
      else if (n >= 200 && n < 500) {
        count++;
        n -= 200;
      }
      else if (n >= 100 && n < 200) {
        count++;
        n -= 100;
      }
      else if (n >= 50 && n < 100) {
        count++;
        n -= 50;
      }
      else if (n >= 20 && n < 50) {
        count++;
        n -= 20;
      }
      else if (n >= 10 && n < 20) {
        count++;
        n -= 10;
      }
      else {
        break;
      }
    }
    return count;
  }
  
}
/*-------------------------------------------------------------------------------
public class ATM {
  
  public int solve(int n) {
    int[] denominations = new int[]{500, 200, 100, 50, 20, 10};
    int result = 0;
    
    for (int denomination: denominations) {
      result += n / denomination;
      n %= denomination;
    }
    
    return n == 0 ? result : -1;
  }
  
}
-------------------------------------------------------------------------------
public class ATM {
  
  public static int solve(int n) {
		if (n % 10 != 0) {
			return -1;
		}
		int notes = 0;
		notes += n / 500;
		notes += n % 500 / 200;
		notes += n % 500 % 200 / 100;
		notes += n % 500 % 200 % 100 / 50;
		notes += n % 500 % 200 % 100 % 50 / 20;
		notes += n % 500 % 200 % 100 % 50 % 20 / 10;
		return notes;
	}
  
}
---------------------------------------------------------------------------
public class ATM {
  
  public int solve(int n) {
  		
      // Your code here
      int[] arr={10,20,50,100,200,500};
      int sum=0;
      for (int i=0;i<6;i++){
        if(arr[i]%n==0){
          return i;
          }
        }
        return -1;
  }
  
}
-------------------------------------------------------------------------------
public class ATM {

    public int solve(int number) {

        int counter = 0;
        int[] notes = {10, 20, 50, 100, 200, 500};

        if (number % 10 != 0) {
            return -1;
        }

        for (int i = notes.length - 1; i >= 0; i--) {

            if (number - notes[i] >= 0) {
                number -= notes[i];
                counter++;
                i++;
            }

        }

        return counter;
    }

}
------------------------------------------------------------------------------
public class ATM {
  
  public int solve(int n) {
  		return n%10==0?(n%500)+(n%500/200)+(n%500%200/100)+(n%100/50)+(n%50/20)+(n%20/10):-1;
  }
  
}
-------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Comparator;

public class ATM {

  private int numBills = 0;
  private int dollars;
  public int solve(int n) {
  	if(n % 10 != 0){
      return -1;
    }
    
    numBills = 0;
    dollars = n;
    
    dispenseBills(500, 200, 100, 50, 20, 10);
    return numBills;
  }
  
  private void dispenseBills(int... denominations) {
    denominations = sortedDescending(denominations);
    for(final int denomination : denominations) {
      while(dollars - denomination >= 0) {
        dollars -= denomination;
        numBills++;
      }
    }
  }
  
  private int[] sortedDescending(int[] array) {
    return Arrays.stream(array)
                 .boxed()
                 .sorted(Comparator.reverseOrder())
                 .mapToInt(Integer::intValue)
                 .toArray();
  }
}


*/