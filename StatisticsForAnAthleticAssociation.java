/* 6KYU CodeWars Statistics for an Athletic Association

You are the "computer expert" of a local Athletic Association (C.A.A.). 
Many teams of runners come to compete. Each time you get a string of all 
race results of every team who has run. For example here is a string 
showing the individual results of a team of 5 runners:

"01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17"

Each part of the string is of the form: h|m|s where h, m, s (h for hour, m 
for minutes, s for seconds) are positive or null integer (represented as 
strings) 
with one or two digits. Substrings in the input string are separated by ,  
or ,.

To compare the results of the teams you are asked for giving three statistics; 
range, average and median.

Range : difference between the lowest and highest values. In {4, 6, 9, 3, 7} the 
lowest value is 3, and the highest is 9, so the range is 9 − 3 = 6.

Mean or Average : To calculate mean, add together all of the numbers and then 
divide the sum by the total count of numbers.

Median : In statistics, the median is the number separating the higher half of 
a data sample from the lower half. The median of a finite list of numbers can 
be found by arranging all the observations from lowest value to highest value 
and picking the middle one (e.g., the median of {3, 3, 5, 9, 11} is 5) when there 
is an odd number of observations. If there is an even number of observations, then 
there is no single middle value; the median is then defined to be the mean of the 
two middle values (the median of {3, 5, 6, 9} is (5 + 6) / 2 = 5.5).

Your task is to return a string giving these 3 values. For the example given above, 
the string result will be

"Range: 00|47|18 Average: 01|35|15 Median: 01|32|34"

of the form: "Range: hh|mm|ss Average: hh|mm|ss Median: hh|mm|ss"`

where hh, mm, ss are integers (represented by strings) with each 2 digits.

Remarks:
if a result in seconds is ab.xy... it will be given truncated as ab.
if the given string is "" you will return ""

*/

import java.util.stream.Collectors;
import java.util.List;
import java.util.Collections;
import java.time.Duration;

public class Stat {
    public static String stat(String strg) {
        if (strg.trim().isEmpty()) {
            return "";
        }

        List<Long> result = Stream.of(strg.split(",")).map(Stat::toSeconds).sorted().collect(Collectors.toList());
        long bucket = Collections.max(result) - Collections.min(result);
        double avg = result.stream().mapToLong(Long::longValue).average().getAsDouble();
        double mid = result.size() % 2 == 0 ?
                result.stream().skip(result.size() / 2 - 1).limit(2).mapToLong(Long::longValue).average().getAsDouble() :
                result.stream().mapToDouble(Long::doubleValue).skip(result.size() / 2).findFirst().getAsDouble();

        return String.format("Range: %1$s Average: %2$s Median: %3$s", formatSeconds(bucket), formatSeconds((long) avg), formatSeconds((long) mid));
    }

    private static long toSeconds(String result) {
        int[] time = Stream.of(result.trim().split("\\|")).mapToInt(Integer::parseInt).toArray();
        Duration hours = Duration.ofHours(time[0]);
        Duration minutes = Duration.ofMinutes(time[1]);
        Duration seconds = Duration.ofSeconds(time[2]);
        return hours.plus(minutes).plus(seconds).getSeconds();
    }

    private static String formatSeconds(long seconds) {
        long second = seconds % 60;
        long minute = seconds / 60 % 60;
        long hour = seconds / 3600;
        return String.format("%02d|%02d|%02d", hour, minute, second);
    }
}
/*------------------------------------------------------------------------
import java.util.*;
public class Stat {
        
	public static String stat(String strg) {  
		List<Integer> stats = new ArrayList<Integer>();
		int Mean = 0;
		for(String time:strg.split(",")){
			time = time.trim();
			int t = Integer.parseInt(time.substring(0, time.indexOf('|')))*60*60 + 
					Integer.parseInt(time.substring(time.indexOf('|')+1,time.lastIndexOf('|')))*60 +
					Integer.parseInt(time.substring(time.lastIndexOf('|')+1));
			Mean+=t;
			stats.add(t);			
		}
		Collections.sort(stats);
		int Range = Collections.max(stats) - Collections.min(stats);
		Mean /= stats.size();
		int Median = stats.size()%2 == 0? (stats.get((stats.size()/2)-1) + stats.get(stats.size()/2))/2 : stats.get((stats.size()/2));
		
		return String.format("Range: %02d|%02d|%02d Average: %02d|%02d|%02d Median: %02d|%02d|%02d",
				Range/3600,(Range%3600)/60,Range%60,Mean/3600,(Mean%3600)/60,Mean%60,Median/3600,(Median%3600)/60,Median%60);
	}
}
-------------------------------------------------------------------------------------
import java.util.*;
import java.util.regex.Pattern;

public class Stat {
        
	public static String stat(String strg) {
    if (strg.equals("")) return "";
    Integer[] stats =
      Arrays.asList(strg.split(", "))
            .stream()
            .map(Stat::toSeconds)
            .sorted()
            .toArray(Integer[]::new);
    int range = stats[stats.length - 1] - stats[0];
    int avg = Arrays.stream(stats).mapToInt(Integer::intValue).sum() / stats.length;
    int median = stats.length % 2 != 0 ?
      stats[stats.length / 2] :
      (stats[stats.length / 2] + stats[stats.length / 2 - 1]) / 2;
    return String.format("Range: %s Average: %s Median: %s", secToSt(range), secToSt(avg), secToSt(median));
	}
  
  private static int toSeconds(String st) {
    String[] time = st.split(Pattern.quote("|"));
    return Integer.parseInt(time[0]) * 3600 +
           Integer.parseInt(time[1]) * 60 +
           Integer.parseInt(time[2]);
  }
  
  private static String secToSt(int val) {
    int h = (int) val / 3600;
    int m = (int) (val - 3600 * h) / 60;
    return String.format("%02d", h) + "|" + 
           String.format("%02d", m) + "|" + 
           String.format("%02d", (int) (val - 3600 * h - 60 * m));
  }
}
----------------------------------------------------------------------------------
import java.text.MessageFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stat {

    private static final String PIPE = "\\|";
    private static final String COMMA_SPACE = ", ";
    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("HH|mm|ss");

    private static Integer range(List<Integer> l) {
        return Collections.max(l) - Collections.min(l);
    }

    private static Integer mean(List<Integer> l) {
        return l.stream()
                .reduce((i1, i2) -> i1 + i2)
                .get() / l.size();
    }

    private static Integer median(List<Integer> l) {
        Collections.sort(l);
        int s = l.size();
        int half = s / 2;
        return s % 2 == 0
                ? (l.get(half) + l.get(half - 1)) / 2
                : l.get(half);
    }

    public static String stat(String strg) {
        if (strg == null || strg.isEmpty()) {
            return "";
        }

        List<Integer> l = Arrays
                .stream(strg.split(COMMA_SPACE))
                .map((s) -> {
                    String[] x = s.split(PIPE);
                    return LocalTime.of(
                            Integer.valueOf(x[0]), Integer.valueOf(x[1]), Integer.valueOf(x[2])
                    ).toSecondOfDay();
                })
                .collect(Collectors.toList());

        return MessageFormat.format("Range: {0} Average: {1} Median: {2}",
                LocalTime.ofSecondOfDay(range(l)).format(DTF),
                LocalTime.ofSecondOfDay(mean(l)).format(DTF),
                LocalTime.ofSecondOfDay(median(l)).format(DTF)
        );
    }
}
-------------------------------------------------------------------------------
import static java.util.stream.IntStream.of;
import static java.util.stream.Stream.of;

class Stat {
  static String stat(String strg) {
    int[] times = of(strg.split(", ")).map(t -> t.split("\\|")).mapToInt(t -> 
                     Integer.parseInt(t[2]) + 60 * Integer.parseInt(t[1]) + 3600 * Integer.parseInt(t[0])).sorted().toArray();

    var stats = of(times).summaryStatistics();
    int range = stats.getMax() - stats.getMin();
    int average = (int) stats.getAverage();
    int median = times.length % 2 > 0 ? times[times.length / 2] : (times[times.length / 2] + times[times.length / 2 - 1]) / 2;

    return String.format("Range: %02d|%02d|%02d Average: %02d|%02d|%02d Median: %02d|%02d|%02d",
        range / 3600, range % 3600 / 60, range % 60,
        average / 3600, average % 3600 / 60, average % 60,
        median / 3600, median % 3600 / 60, median % 60);
  }
}




*/