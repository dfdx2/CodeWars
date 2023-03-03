//  7KYU   Bumps in the Road
/*
Your car is old, it breaks easily. The shock absorbers are gone and you 
think it can handle about 15 more bumps before it dies totally.
Unfortunately for you, your drive is very bumpy! Given a string showing 
either flat road ("_") or bumps ("n"), work out if you make it home safely. 
15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".



*/
public class BumpsTheRoad {
  public static String bumps(final String road) {
    return road.chars().filter(i->(char)i=='n').count() <= 15 ? "Woohoo!" : "Car Dead";
  }
}
/*------------------------------------------------------------------------------------------
public class BumpsTheRoad {
  public static String bumps(final String road) {
    int count=0;
    for (int i = 0; i < road.length(); i++) {
      if (road.charAt(i) =='n')
        count++;
    }  
    if (count <= 15)
      return "Woohoo!";
    else
      return "Car Dead";
  }
}
--------------------------------------------------------------------------------------------
public class BumpsTheRoad {
  private static final Integer SAFE_COUNT = 15;
  private static final String FLAT = "_";
  private static final String SUCCESS_MESSAGE = "Woohoo!";
  private static final String FAILURE_MESSAGE = "Car Dead";
  
  public static String bumps(final String road) {
    String bumps = road.replaceAll(FLAT, "");
    boolean safe = bumps.length() <= SAFE_COUNT; 
    return safe ? SUCCESS_MESSAGE : FAILURE_MESSAGE;
  }
}
-------------------------------------------------------------------------------------------
 class BumpsTheRoad {
 static String bumps(String road) {
    return road.replace("_", "").length() > 15 ? "Car Dead" : "Woohoo!";
  }
}





*/