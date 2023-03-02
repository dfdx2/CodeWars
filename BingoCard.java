/* 
After yet another dispute on their game the Bingo Association decides to 
change course and automate the game.  Can you help the association by 
writing a method to create a random Bingo card?

Bingo Cards
A Bingo card contains 24 unique and random numbers according to this scheme:

5 numbers from the B column in the range 1 to 15
5 numbers from the I column in the range 16 to 30
4 numbers from the N column in the range 31 to 45
5 numbers from the G column in the range 46 to 60
5 numbers from the O column in the range 61 to 75

Task
Write the function get_card()/getCard(). The card must be returned as an array 
of Bingo style numbers:

[ 'B14', 'B12', 'B5', 'B6', 'B3', 'I28', 'I27', ... ]
The numbers must be in the order of their column: B, I, N, G, O. 
Within the columns the order of the numbers is random.
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;


public class BingoCard {
    public static String[] getCard() {
        ArrayList<String> result = new ArrayList<>(24);
        Random random = new Random();
        result.addAll(random.ints(1, 16).distinct().limit(5).mapToObj(i -> String.format("B%d", i)).collect(Collectors.toList()));
        result.addAll(random.ints(16, 31).distinct().limit(5).mapToObj(i -> String.format("I%d", i)).collect(Collectors.toList()));
        result.addAll(random.ints(31, 46).distinct().limit(4).mapToObj(i -> String.format("N%d", i)).collect(Collectors.toList()));
        result.addAll(random.ints(46, 61).distinct().limit(5).mapToObj(i -> String.format("G%d", i)).collect(Collectors.toList()));
        result.addAll(random.ints(61, 76).distinct().limit(5).mapToObj(i -> String.format("O%d", i)).collect(Collectors.toList()));
        return result.toArray(new String[24]);
    }
}
/*--------------------------------------------------------------------------------------------
import java.util.*;

public class BingoCard {
  private static String[] res;
  private static int counter;
  
  public static String[] getCard() {
    counter = 0;
    res = new String[24];
    getRow( 1,15,5,"B");
    getRow(16,30,5,"I");
    getRow(31,45,4,"N");
    getRow(46,60,5,"G");
    getRow(61,75,5,"O");
    return res;
  }
  
  private static void getRow(int b, int e, int n, String l) {
    ArrayList<Integer> row = new ArrayList<Integer>();
    for (int i = b; i <= e; i++) row.add(new Integer(i)); 
    Collections.shuffle(row);
    for (int i = 0; i < n; i++) res[counter++] = l + Integer.toString(row.get(i));
  }
}
-------------------------------------------------------------------------------------------
import java.util.concurrent.*;
import java.util.stream.*;
import static java.util.stream.IntStream.*;
import static java.util.Arrays.stream;

public class BingoCard {
  public static String[] getCard() {
    return stream(Column.values()).flatMap(Column::generate).toArray(String[]::new);
  }
}

enum Column {
  B(1, 5), I(6, 10), N(11, 14), G(15, 19), O(20, 24);

  private static final int RANGE_SIZE = 15;
  public final int start, end;

  private Column(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public int size() {
    return end - start + 1;
  }

  public Stream<String> generate() {
    int begin = ordinal() * RANGE_SIZE + 1;
    return ThreadLocalRandom.current().ints(begin, begin + RANGE_SIZE).distinct().limit(size()).mapToObj(it -> name() + it);
  }
}
----------------------------------------------------------------------------------------------
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BingoCard {
    
    public static String[] getCard() {
        List<Integer> numbers = IntStream.rangeClosed(1, 75).boxed().collect(Collectors.toList());
        Collections.shuffle(numbers);
        return IntStream.range(0, 5).boxed()
            .flatMap(i -> numbers.stream()
                .filter(n -> n > i * 15 && n <= (i + 1) * 15)
                .map(n -> "BINGO".substring(i, i + 1) + n)
                .limit(i == 2 ? 4 : 5))
            .toArray(String[]::new);
    }

}
---------------------------------------------------------------------------------------------
import java.util.*;
import java.util.stream.*;
import java.util.concurrent.ThreadLocalRandom;
public class BingoCard
{
    public static String[] getCard()
    {
        List<String> result = new ArrayList<String>();		
		    result.addAll(ThreadLocalRandom.current().ints(1,15).distinct().limit(5).mapToObj(i->"B"+i).collect(Collectors.toList()));
		    result.addAll(ThreadLocalRandom.current().ints(16,30).distinct().limit(5).mapToObj(i->"I"+i).collect(Collectors.toList()));
		    result.addAll(ThreadLocalRandom.current().ints(31,45).distinct().limit(4).mapToObj(i->"N"+i).collect(Collectors.toList()));
		    result.addAll(ThreadLocalRandom.current().ints(46,60).distinct().limit(5).mapToObj(i->"G"+i).collect(Collectors.toList()));
		    result.addAll(ThreadLocalRandom.current().ints(61,75).distinct().limit(5).mapToObj(i->"O"+i).collect(Collectors.toList()));
		    return  result.toArray(new String[0]);
    }
}
-----------------------------------------------------------------------------------------------
import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.IntStream.rangeClosed;
import static java.util.stream.Stream.of;

class BingoCard {
  static int[][] scheme = {
    {'B', 1, 15, 5},
    {'I', 16, 30, 5},
    {'N', 31, 45, 4},
    {'G', 46, 60, 5},
    {'O', 61, 75, 5}
  };

  static String[] getCard() {
    return of(scheme).flatMap(s -> rangeClosed(s[1], s[2]).boxed().sorted((a, b) -> current().nextInt(-1, 2)).limit(s[3]).map(i -> (char) s[0] + "" + i)).toArray(String[]::new);
  }
}
--------------------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class BingoCard {
  private static final int MAX_NUMBER_OF_VALUES = 24;
  private static final int ROWS_IN_CARD = 5;
  private static final int FIRST_ROW = 0;
  
  // Uses a LinkedHashMap to get entries in order
  private static final LinkedHashMap<Character, Integer[]> columns = new LinkedHashMap<>();
	static {
		columns.put('B', new Integer[] { 1, 15 });
		columns.put('I', new Integer[] { 16, 30 });
		columns.put('N', new Integer[] { 31, 45 });
		columns.put('G', new Integer[] { 46, 60 });
		columns.put('O', new Integer[] { 61, 75 });
	}

	public static String[] getCard() {
		String[] bingoCard = new String[MAX_NUMBER_OF_VALUES];
    int index = 0;
    
		for (Map.Entry<Character, Integer[]> column : columns.entrySet()) {
			int lowerBound = column.getValue()[0];
			int upperBound = column.getValue()[1];
			String cellValue = "";

			for (int row = FIRST_ROW; row < ROWS_IN_CARD; row++) {      
				if (isFreeCell(column.getKey(), row))
					continue;

				do
					cellValue = column.getKey() + Integer.toString(randomNumberWithin(lowerBound, upperBound));
				while (cellValueIsAlreadyTaken(bingoCard, cellValue));

				bingoCard[index++] = cellValue;
			}
		}

		return bingoCard;
	}
  
  private static int randomNumberWithin(int lowerBound, int upperBound) {
    return (new Random().nextInt(upperBound - lowerBound) + lowerBound);
  }
  
  private static boolean isFreeCell(Character column, int row) {
    return (column == 'N' && row == 2);
  }
  
  private static boolean cellValueIsAlreadyTaken(String [] card, String cellValue) {
    return (Arrays.asList(card).contains(cellValue));
  }
}



*/