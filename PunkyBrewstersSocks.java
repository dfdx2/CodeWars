/* 7KYU CodeWars 80's Kids # 3 : Punky Brewster's Socks

Punky loves wearing different colored socks, but Henry 
can't stand it.

Given an array of different colored socks, return a pair 
depending on who was picking them out.

Example:

getSocks("Punky", ["red","blue","blue","green"]) -> ["red", "blue"]
Note that Punky can have any two colored socks, in any order, 
as long as they are different and both exist. Henry always picks 
a matching pair.

If there is no possible combination of socks, return an empty array.

*/
import java.util.*;
public class PunkyBrewstersSocks {

  public static String[] getSocks(String name, String[] socks) {
    Set<String> x = new HashSet<>();
    for (String a : socks) {
      if (!x.add(a) && "Henry" == name) {
        return new String[] {a, a};
      }
      else if (x.size() == 2 && "Punky" == name) {
        return x.toArray(new String[2]);
      }
    }
    return new String[0];
  }
}
/*----------------------------------------------------------
import java.util.HashSet;
import java.util.Set;

public class EightiesKids3 {

	public static String[] getSocks(String name, String[] socks) {
		Set<String> set = new HashSet<>();
		for(String sock: socks) {
			if(!set.add(sock) && "Henry".equals(name))
				return new String[] {sock, sock};
			if(set.size() == 2 && "Punky".equals(name))
				return set.toArray(new String[2]);
		}
		
		return new String[0];
	}
}
------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class EightiesKids3 {

    public static String[] getSocks(String name, String[] socks) {
        if (socks.length < 2) {
            return new String[0];
        }

        if (name.equals("Punky")) {
            String sock1 = socks[0];
            String sock2 = socks[1];
            for (int i = 2; i < socks.length && sock1.equals(sock2); i++) {
                sock2 = socks[i];
            }

            if (sock1.equals(sock2)) {
                return new String[0];
            } else {
                return new String[]{sock1, sock2};
            }
        } else {
            Map<String, Integer> map = new HashMap<>();
            for (String sock : socks) {
                Integer i = map.get(sock);
                if (i == null) {
                    map.put(sock, 1);
                } else {
                    return new String[]{sock, sock};
                }
            }
        }

        return new String[0];
    }
}
------------------------------------------------------------
import java.util.*;
public class EightiesKids3 {

  public static String[] getSocks(String name, String[] socks) {
  System.out.println("name: "+name);
  int count = 0;
  boolean same = false;
                Map<String, Integer> counts = new HashMap<>(socks.length);
        
       // System.out.println(socks.length);
        if (socks.length == 1)
          return new String[]{};
            
       for(String i : socks) {
                if(!counts.containsKey(i)) counts.put(i, 1);
                else counts.put(i, counts.get(i) + 1);
              }
    System.out.println("size of map: "+counts.size());
    Iterator it=counts.entrySet().iterator();
		System.out.println( "Iterate through the HashMap" );
		while(it.hasNext())
			System.out.println( it.next());  
      
            if (name.equals("Henry")){
            for(Map.Entry entry: counts.entrySet()){
            if((Integer)entry.getValue() >= 2 ){
                same = true;
                System.out.println((String)entry.getKey());
                String henry=(String) entry.getKey();
                return new String[]{henry,henry};
                //break; //breaking because its one to one map
                }
            }
            if (!same)
              return new String[]{};
            }
            
            if (name.equals("Punky")){
            if (counts.size()==1 || counts.size()==0)
              return new String[]{};
            for (String s1: socks){
                for (String s2: socks){
                    if (!s1.equals(s2))
                      return new String[]{s1,s2};
                }
              }
            }
              
      
      return null;
  }
}
------------------------------------------------------------
public class EightiesKids3 {

  public static String[] getSocks(String name, String[] socks) {
    String[] pair=new String[2];
		 String[] pairs=new String[0];
		if(socks.length==1)
		{
			return pairs;
		}
		if(name=="Punky")
		{
			for(int i=0;i<socks.length;i++)
			{
				for(int j=i+1;j<socks.length;j++)
				{
					if(socks[i]!=socks[j])
					{
						pair[0]=socks[i];
						pair[1]=socks[j];
						return pair;
					}
				}
			}
		}
		
		if(name=="Henry")
		{
			for(int i=0;i<socks.length;i++)
			{
				for(int j=i+1;j<socks.length;j++)
				{
					if(socks[i]==socks[j])
					{
						pair[0]=socks[i];
						pair[1]=socks[j];
						return pair;
					}
				}
			}
		}
		
		return pairs;
	    // your code here
	  }
		
}
------------------------------------------------------------
import java.util.*;

public class EightiesKids3 {

  public static String[] getSocks(String name, String[] socks) {
  
    List<String> socks_set = new ArrayList<String>(new HashSet<String>(Arrays.asList(socks)));
    
    switch (name) {
      case "Punky": return socks_set.size() >= 2 ? new String[] {socks_set.get(0), socks_set.get(1)} : new String[] {};
      case "Henry": 
        for (int i = 0; i < socks.length; i++) {
          if (Collections.frequency(Arrays.asList(socks), socks[i]) >= 2) return new String[] {socks[i], socks[i]};
        }
      default: return new String[] {};
    }
  }
}
------------------------------------------------------------
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class EightiesKids3 {

     public static String[] getSocks(String name, String[] socks) {
        if ("Henry".equals(name)) {
            return Arrays.stream(socks)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry -> entry.getValue() > 1L)
                    .findFirst()
                    .map(entry -> new String[] {entry.getKey(), entry.getKey()})
                    .orElse(new String[] {});
        } else {
            List<String> list = Arrays.stream(socks).distinct().collect(Collectors.toList());
            return list.size() < 2 ? new String[] {} : new String[] {list.get(0), list.get(1)};
        }
    }
    
}
------------------------------------------------------------
import java.util.*;
public class EightiesKids3 {

  public static String[] getSocks(String name, String[] socks) {
    HashSet<String> set = new HashSet<String>();
    for(String sock: socks)
    {
      if(!set.add(sock) && "Henry".equals(name))
      {
        return new String[] {sock, sock};
      }
      if(set.size() == 2 && "Punky".equals(name))
      {
        return set.toArray(new String[2]);
      }
    }
    
    return new String[0];
  }
}
*/