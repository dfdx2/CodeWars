/* 8KYU CodeWars Multiplication Table For Number

Your goal is to return multiplication table for number that is 
always an integer from 1 to 10.

For example, a multiplication table (string) for number == 5 looks 
like below:

1 * 5 = 5
2 * 5 = 10
3 * 5 = 15
4 * 5 = 20
5 * 5 = 25
6 * 5 = 30
7 * 5 = 35
8 * 5 = 40
9 * 5 = 45
10 * 5 = 50

P. S. You can use \n in string to jump to the next line.

Note: newlines should be added between rows, but there should be no 
trailing newline at the end. If you're unsure about the format, look 
at the sample tests.

*/

class Kata {
    public static String multiTable(int num) {
      int total = 10;
      int count = 1;
      String x = "";
      while (count <= 10) {
        if (count == total) {
          x += (String.valueOf(count) + " * " + String.valueOf(num) + " = " + count * num);
          count++;
        }
        else {
          x += (String.valueOf(count) + " * " + String.valueOf(num) + " = " + count * num + "\n");
          count++;
        }
      }
      return x;
    }
}

/*-------------------------------------------------------------------------
class Kata {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            sb.append(i + " * " + num + " = " + result + "\n");
        }
        return sb.toString().trim();
    }
}
---------------------------------------------------------------------------------
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Kata {
    public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10)
			    .mapToObj(i -> i + " * " + num + " = " + i * num)
			    .collect(Collectors.joining("\n"));
    }
}
----------------------------------------------------------------------------
class Kata {
  
    public static String multiTable(int num) {
      String arr[] = new String[10];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = String.format("%d * %d = %d", i + 1, num, (i + 1) * num);
      }
      return String.join("\n", arr);
    }
  
}
-------------------------------------------------------------------------
class Kata {
    public static String multiTable(int num) {
              String str ="1 * " + num + " = " + num + "\n" +
                "2 * " + num + " = " + 2 * num + "\n" +
                "3 * " + num + " = " + 3 * num + "\n" +
                "4 * " + num + " = " + 4 * num + "\n" +
                "5 * " + num + " = " + 5 * num + "\n" +
                "6 * " + num + " = " + 6 * num + "\n" +
                "7 * " + num + " = " + 7 * num + "\n" +
                "8 * " + num + " = " + 8 * num + "\n" +
                "9 * " + num + " = " + 9 * num + "\n" +
                "10 * " + num + " = " + 10 * num;
        return str; // good luck
    }
}
----------------------------------------------------------------------------
class Kata {
    public static String multiTable(int num) {
      String result = "";
      for (int i = 1; i <= 10; i++) {
        result += i + " * " + num + " = " + (i * num) + ((i < 10) ? "\n" : "");
      }
      return result; 
    }
}
-------------------------------------------------------------------------------
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static String multiTable(int num) {
    return rangeClosed(1, 10).mapToObj(i -> i + " * " + num + " = " + i * num).collect(joining("\n"));
  }
}
-------------------------------------------------------------------------------
class Kata {
        public static final int TEN = 10;
        public static String multiTable(int num) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < 10; i++) {
                sb.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
            }
            sb.append(TEN).append(" * ").append(num).append(" = ").append(TEN * num);
            return sb.toString();
        }
    }



*/