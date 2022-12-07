/* 7KYU CodeWars How Many Arguments

args_count(1, 2, 3) -> 3
args_count(1, 2, 3, 10) -> 4

*/

class Arguments {
  public static int countArgs(Object... args) {
		//your code here
    int count = 0;
    for (int i = 0; i < args.length; i++) {
      count += 1;
    }
    return count;
	}
}
/*--------------------------------------------------------------
class Arguments {
  public static int countArgs(Object... args) {
    return args.length;
	}
}
----------------------------------------------------------------
class Arguments {

    public static int countArgs(Object... args) {
		    return args == null ? 0 : args.length;
	  }
}
---------------------------------------------------------------
class Arguments {
  public static int countArgs(Object... args) {
		 int count = 0;
        for (Object s: args) {
                count++;
                }
    return count;
	}
}
-----------------------------------------------------------------
import java.util.Arrays;

class Arguments {
 public static int countArgs(Object... args) {
		return (int) Arrays.asList(args).stream().count();
	}
}

*/