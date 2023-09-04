/* 7KYU CodeWars Testing 1-2-3

Your team is writing a fancy new text editor and you've been tasked with 
implementing the line numbering.

Write a function which takes a list of strings and returns each line 
prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon 
and space in between.

Examples: (Input --> Output)

[] --> []
["a", "b", "c"] --> ["1: a", "2: b", "3: c"]


*/

import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
      String x = ": ";
      List<String> result = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        String y = String.valueOf(i + 1) + x + lines.get(i);
        result.add(y);
      }
      return result;
    }
}
/*----------------------------------------------------------------------------
import java.util.*;

class LineNumbering {

    static List<String> number(List<String> lines) {
        ArrayList<String> result = new ArrayList();
        int i = 0;
        for (String s : lines) {
            result.add(++i + ": " + s);
        }
        return result;
    }

}
------------------------------------------------------------------------------
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class LineNumbering {
    static List<String> number(List<String> lines) {
    if (lines.size() == 0) return lines;
    return IntStream.range(0, lines.size())
            .mapToObj(n -> String.format("%d: %s", n+1, lines.get(n)))
            .collect(Collectors.toList());
    }
}
-------------------------------------------------------------------------------
import java.util.*;

class LineNumbering {

    static List<String> number(List<String> lines) {
        for(int i= 0; i< lines.size() ; i++)
        {
          lines.set(i,(i+1)+": "+lines.get(i));
        }
        return lines;
    }

}
----------------------------------------------------------------------------
import java.util.*;

class LineNumbering {

    static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>(lines.size());
        for(int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            int lineNumber = i + 1;
            String lineWithLineNumbers = String.format("%d: %s", lineNumber, line);
            result.add(lineWithLineNumbers);
        }
        return result;
    }

}
-------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class LineNumbering {

    static List<String> number(List<String> lines) {
        final AtomicInteger index = new AtomicInteger(1);
        return lines.stream().
                map(s -> String.valueOf(index.getAndIncrement()) + ": " + s).
                collect(Collectors.toList());
    }

}
-----------------------------------------------------------------------------
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        AtomicInteger i = new AtomicInteger();
        return lines.stream().map(line -> {
            i.getAndIncrement();
            return i + ": " + line;
        }).collect(Collectors.toList());
    }
}



*/