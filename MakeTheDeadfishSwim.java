/* 6KYU CodeWars Make The Deadfish Swim

Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.

Deadfish.parse("iiisdoso") =- new int[] {8, 64};

*/
import java.util.ArrayList;
public class MakeTheDeadFishSwim {
    public static int[] parse(String data) {
        int result = 0;
      ArrayList<Integer> results = new ArrayList<>();
      for (char ch : data.toCharArray()) {
        if (ch == 'i') {
          result++;
        }
        if (ch == 'd') {
          result--;
        }
        if (ch == 's') {
          result *= result;
        }
        if (ch == 'o') {
          results.add(result);
        }
      }
      return results.stream().mapToInt(i -> i).toArray();
    }
}
/*---------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class DeadFish {
  public static int[] parse(String data) {
    int value = 0;
    List<Integer> result = new ArrayList<>();
    for(char letter : data.toCharArray()) {
      switch(letter) {
        case 'i': value++; break;
        case 'd': value--; break;
        case 's': value *= value; break;
        case 'o': result.add(value); break;
        default: throw new IllegalArgumentException("Not valid code letter");
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;

public class DeadFish {
public static int[] parse(String data) {
        List<Integer> output = new ArrayList<>();
        int counter = 0;
        CommandFactory commandFactory = new CommandFactory(output);
        for (char code: data.toCharArray()) {
            Command command = commandFactory.getCommand(code);
            counter = command.execute(counter);
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}

class CommandFactory {

    private final List<Integer> output;

    public CommandFactory(List<Integer> output) {
        this.output = output;
    }

    Command getCommand(char code) {
        switch (code) {
            case 'i': return new IncrementCommand();
            case 'd': return new DecrementCommand();
            case 's': return new SquareCommand();
            case 'o': return new OutputCommand(output);
        }
        throw new RuntimeException("error");
    }
}

interface Command {
    int execute(int data);
}

class IncrementCommand implements Command {

    @Override
    public int execute(int data) {
        return data+1;
    }
}

class DecrementCommand implements Command {

    @Override
    public int execute(int data) {
        return data-1;
    }
}

class SquareCommand implements Command {

    @Override
    public int execute(int data) {
        return data*data;
    }
}

class OutputCommand implements Command {

    private final List<Integer> output;

    public OutputCommand(List<Integer> output) {
        this.output = output;
    }

    @Override
    public int execute(int data) {
        output.add(data);
        return data;
    }
}
-----------------------------------------------------------------
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        int val = 0;
        List<Integer> list = new ArrayList<>();
        for(char ch: data.toCharArray()) {
            if (ch == 'i')
                val++;
            else if (ch == 'd')
                val--;
            else if (ch == 's')
                val*=val;
            else if (ch == 'o')
                list.add(val);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
------------------------------------------------------------------
import java.util.*;
import java.util.function.*;

public class DeadFish {

    private static HashMap<Character,UnaryOperator<Integer>> commands = new HashMap<>();
    
    static {
      commands.put('i', x -> x + 1);
      commands.put('d', x -> x - 1);
      commands.put('s', x -> x * x);
    }

    public static int[] parse(String data) {
        ArrayList<Integer> output = new ArrayList<>();
        
        int value = 0;
        for(char command : data.toCharArray()) {
          if(command == 'o') {
            output.add(value);
          } else {
            value = commands.get(command).apply(value);
          }
        }
        
        return output.stream().mapToInt(x -> x).toArray();
    }
}
-------------------------------------------------------------------
public class DeadFish {

  public static int[] parse(String data) {
    int v = 0, i = 0, ret[] = new int[data.replaceAll("[^o]","").length()]; 
    for (char c : data.toCharArray()) {
      switch (c) {
        case 'i' : v++;        break;
        case 'd' : v--;        break;
        case 's' : v=v*v;      break;
        case 'o' : ret[i++]=v; break;
      }
    }
    return ret;
  }

}
-------------------------------------------------------------------
public class DeadFish {
    public static int[] parse(String data) {
      
      int[] arr = new int[data.length() - data.replace("o", "").length()];
      int temp = 0;
      int count = 0;
      for(int i = 0; i < data.length(); i++){
        switch (data.charAt(i)){
          case 'i':
            temp++;
            break;
          case 'd':
            temp--;
            break;
          case 's':
            temp *= temp;
            break;
          case 'o':
            arr[count] = temp;
            count++;
            break;
        }
      }
      return arr; 
    }
}
-------------------------------------------------------------------
public class DeadFish {
  public static int[] parse(String data) {
    int[] result = new int[numberOf('o', data)];
    int resultIndex = 0;
    int value = 0;
    for(char letter : data.toCharArray()) {
      switch(letter) {
        case 'i': value++; break;
        case 'd': value--; break;
        case 's': value *= value; break;
        case 'o': result[resultIndex] = value;
                  resultIndex++;
                  break;
      }
    }
    return result;
  }
  
  private static int numberOf(char letter, String string) {
    return (int) string.chars()
                       .filter(c -> c == letter)
                       .count();
  }
}
------------------------------------------------------------------
import java.util.*;

public class DeadFish {
    public static int[] parse(String data) {
        int value = 0;
        char[] characters = data.toCharArray();
        ArrayList<Integer> arrList = new ArrayList();
        for (char c : characters) {
          switch(c) {
            case 'i':
              value++;
              break;
            case 'd':
              value--;
              break;
            case 's':
              value *= value;
              break;
            case 'o':
              arrList.add(value);
              break;
            }
        }
        int[] intList = arrList.stream()
							.mapToInt(Integer::intValue)
							.toArray();
        return intList;
    }
}
*/