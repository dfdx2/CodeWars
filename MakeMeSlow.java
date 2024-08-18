/* 7KYU CodeWars Make Me Slow 

Make me slow! Calling makeMeSlow() should take at least 7 seconds.

*/
public class MakeMeSlow {
    public static void makeMeSlow() {
      try {
        Thread.sleep(7000);
        for (int i = 0; i < 1000000; i++) {
        }
      }
        catch (InterruptedException e) {
        }
    }
}
/*-----------------------------------------------------------
public class Kata {
    public static void makeMeSlow() {
        try {
            Thread.sleep(7001);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
-------------------------------------------------------------
interface Kata {
  static void makeMeSlow() {
    try {
      Thread.sleep(7000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
-------------------------------------------------------------
public class Kata {
  public static void makeMeSlow() {
    for (long i = Integer.MIN_VALUE; i < Math.sqrt(Long.MAX_VALUE); i ++) {
    }
  }
}
-------------------------------------------------------------
public class Kata {
   public static void makeMeSlow() {
	        // this function is too fast!
	        for (int i = 0; i < 1000000; i++) {
	          for (int j = 0; j < 10000; j++) {
               for (int l = 0; l < 1000; l++) {
              
             }
            }
	        	 
	        }
	    }
}
--------------------------------------------------------------
public class Kata {
  public static void makeMeSlow() {
    try {
      Thread.sleep(8000);
    } catch (InterruptedException e) {
    }
  }
}
--------------------------------------------------------------
import java.io.*;
import java.lang.Thread;
public class Kata {
    public static void makeMeSlow() {
        // this function is too fast!
       try {
         Thread.sleep(2137);
          Thread.sleep(2137);
         Thread.sleep(2137);
         Thread.sleep(2137);
       }
      catch (Exception e) {
           
            // catching the exception
            System.out.println(e);
        }
    }
}
--------------------------------------------------------------
public class Kata {
    public static void makeMeSlow() {
        // this function is too fast!
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
--------------------------------------------------------------
public class Kata {
    public static void makeMeSlow() {
        long endTime = System.currentTimeMillis() + 7000;
        while (System.currentTimeMillis() < endTime) {}
    }
}
--------------------------------------------------------------
import java.util.concurrent.TimeUnit;

public class Kata {
    public static void makeMeSlow() {
        // this function is too fast!
      try {
        TimeUnit.SECONDS.sleep(7);
        } catch(Exception e) {
        System.err.println(e.getMessage());
      }
    }
}
----------------------------------------------------------------
public class Kata {
    public static void makeMeSlow() {
      long startTime = System.currentTimeMillis();
      while(System.currentTimeMillis() - startTime < 7000) {}
    }
}
*/