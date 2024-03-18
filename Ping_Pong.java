/* 6KYU CodeWars Ping Pong

The folly of Mr Pong
While Mrs Pong is away visiting her sister, Mr Pong has foolishly set up a ping pong table in his lounge room, and invites his neighbour Mr Ping over for a friendly ping pong session.

When Mr Ping hits the ping pong ball, the ping pong ball goes ping.

When Mr Pong hits the ping pong ball, the ping pong ball goes pong.

Unfortunately, not every hit goes where it was meant to...

Sometimes the ping pong ball hits the net, or bounces off a wall, or it ricochets off Mrs Pong's rather expensive porcelain collection, a light fitting, or various pieces of lounge furniture, before finally coming to rest on the floor. When that happens there are all kinds of bad noises.

Example
A typical rally may sound like this:

ping-pong-ping-pong-ping-pong-ping-pong-dong-tang-bing-tink-donk-donk-donk

Mr Ping served
There were several good returns
Mr Pong hits a bad shot which broke the handle off his wife's 2nd favourite teacup. Oops.
Kata Task
Who scored the most points?

Input
The sounds of one or more rallies.

Output
The name of the winning player: ping or pong

Notes
To score a point the same player must both serve and win the rally.
Whoever picks the ball off the floor will serve next. It's random.
A bad noise is anything other than ping or pong.
A bad noise means whoever hit the ball last hit a bad shot.
For some unknown reason all noises are 4 lowercase characters, and delimited by -
If scores are even, then the winner is the player who did NOT hit the final bad shot.
There are no double hits.
The final rally always ends with the ball on the floor.
All input is valid.



*/

import static java.util.regex.Pattern.compile;
public class Dinglemouse {

  public static String pingPong(String sounds) {
   long result = compile("(?<!pong-)(ping-pong-?)++(?!ping)").matcher(sounds).results().count() - compile("(?<!ping-)(pong-ping-?)++(?!pong)").matcher(sounds).results().count();
    return result > 0 || result == 0 && sounds.lastIndexOf("ping") < sounds.lastIndexOf("pong") ? "ping" : "pong";
  }
}
/*---------------------------------------------------------------------------
import java.util.regex.Pattern;

public class Dinglemouse {

  public static String pingPong(String sounds) {
    long ping = rePing.matcher(sounds).results().count();
    long pong = rePong.matcher(sounds).results().count();
    return ping > pong || ping == pong && sounds.lastIndexOf("ping") < sounds.lastIndexOf("pong") ? "ping" : "pong";
  }
  
  static final Pattern
    rePing = Pattern.compile("(?<!pong-)(ping-pong-?)++(?!ping)"),
    rePong = Pattern.compile("(?<!ping-)(pong-ping-?)++(?!pong)");
  
}
-----------------------------------------------------------------------------
public class Dinglemouse {

  final static String PING = "ping";
  final static String PONG = "pong";

  public static String pingPong(String sounds) {
    int ping = 0, pong = 0;
    String servedBy = "", hitBy = "", last = "";
    for (String noise : sounds.split("-")) {
      if (PING.equals(noise) || PONG.equals(noise)) {
        // A hit
        if (servedBy.isEmpty()) servedBy = noise;
        hitBy = noise;
      }
      else {
        // A bad noise
        if (PING.equals(servedBy) && PONG.equals(last)) ping++;
        if (PONG.equals(servedBy) && PING.equals(last)) pong++;
        servedBy = "";
      }
      last = noise;
    }
    return ping > pong ? PING : pong > ping ? PONG : PONG.equals(hitBy) ? PING : PONG;
  }
  
}
------------------------------------------------------------------------------
import java.util.HashMap;

public class Dinglemouse {
    public static String pingPong(String sounds) {
        String[] soundList = sounds.split("-");
        HashMap<String, Integer> state = new HashMap<>();
        HashMap<String, String> player = new HashMap<>();
        state.put("served", 0);
        state.put("ping", 0);
        state.put("pong", 0);        
        for(String sound : soundList) {
            if(isGoodShot(sound)) {
                if(state.get("served") == 0) {
                    state.put("served", 1);
                    player.put("serving", sound);
                }
                player.put("acting", sound);
            } else {
                if(state.get("served") == 0) continue;
                if(!player.get("serving").equalsIgnoreCase(player.get("acting"))) {
                    String winner =  player.get("serving");                   
                    state.put(winner, state.get(winner) + 1);
                } 
                state.put("served", 0);
                               
            }
        }
        if(state.get("ping") > state.get("pong"))   return "ping";
        if(state.get("ping") < state.get("pong"))   return "pong";
        if (player.get("acting").equalsIgnoreCase("pong"))  return "ping";
        return "pong";
    }

    public static boolean isGoodShot(String sound) {
        return sound.equalsIgnoreCase("ping") || sound.equalsIgnoreCase("pong");
    }

}
------------------------------------------------------------------------------
import java.util.*;
import java.util.regex.*;

public class Dinglemouse {
    
    final static private Pattern WINNER = Pattern.compile("(?<!ping-)(?<!pong-)(ping-pong-|pong-ping-)+(?!ping)(?!pong)");
    
    public static String pingPong(String sounds) {
        int[] pnts = new int[2];
        WINNER.matcher(sounds)
              .results().forEach( m-> pnts[m.group(1).split("-")[0].equals("ping")?0:1]++ );
        boolean isPingLast = sounds.lastIndexOf("ping") > sounds.lastIndexOf("pong");
        
        return pnts[0]==pnts[1] && isPingLast || pnts[0]< pnts[1] ? "pong" : "ping";
    }
}
------------------------------------------------------------------------------
public class Dinglemouse {
    public static String pingPong(String sounds) {
        // Your code here!
        String[] arrayOfIndividualSounds = sounds.split("-");//разделяем строку на массив строк со звуками
        int countPing = 0; //переменная для посчета очков пинга
        int countPong = 0; // переменная для посчета очков понга
        boolean statePing = false; //  состояние пинга (был ли предыдущим звук "ping" перед шумом)
        boolean statePong = false; //  состояние понга (был ли предыдущим звук "pong" перед шумом)
        boolean stateNoise = false;// состояние шума
        boolean inningsPing = false; // подача пинга
        boolean inningsPong = false; //  подача понга
        //проверяем чья первая подача
        if ("ping".equals(arrayOfIndividualSounds[0])) {
            inningsPing = true;
        } else if ("pong".equals(arrayOfIndividualSounds[0])) {
            inningsPong = true;
        }
        for (String str : arrayOfIndividualSounds) {//перебираем цикл  
            switch (str) {
                case "ping" -> { //запоминаем состояние пинга
                    if (stateNoise) {//проверяем является ли удар подачей
                        inningsPing = true;
                        inningsPong = false;
                        stateNoise = false;
                    }
                    statePing = true;
                    statePong = false;

                }
                case "pong" -> {//запоминаем состояние понга
                    if (stateNoise) {//проверяем является ли удар подачей
                        inningsPong = true;
                        inningsPing = false;
                        stateNoise = false;
                    }
                    statePong = true;
                    statePing = false;

                }
                default -> {//считаем очки если попался шум
                    if (!stateNoise) {//если предыдущий звук не шум
                        if (statePing && inningsPong) {//если пинг был перед шумом и пинг не подавал то понг +1 очко
                            countPong += 1;

                        }
                        if (statePong && inningsPing) {//если понг был перед шумом  и понг не подавал то пинг +1 очко
                            countPing += 1;

                        }
                    }
                    stateNoise = true;

                }

            }
        }
        //проверям каких очков больше и определяем победителя, если их равное количество то побеждает игрок НЕ сделавший последний неудачный бросок.
        if (countPong > countPing) {
            return "pong";
        } else if (countPing > countPong) {
            return "ping";
        } else if (statePing) {
            return "pong";
        } else if (statePong) return "ping";
        return " ";
    }


}
------------------------------------------------------------------------------
import java.util.ArrayList;
import java.util.List;
public class Dinglemouse {

    private static String ping = "ping";
    private static String pong = "pong";

    public static String pingPong(String sounds) {

        String[] soundsList = sounds.split("-");
        List<String> rallies = getRallies(soundsList);

        if (rallies.size() == 1){
            return getWinnerThroughAShortRally(rallies);
        }else{
            return getWinnerThroughALongRally(rallies);
        }
    }

    private static String getWinnerThroughAShortRally(List<String> rallies) {
        int pingScore = 0;
        int pongScore = 0;
        String lastGoodHit = "";
        String[] rally = rallies.get(0).split("\\s");

        if(rally.length <= 1){
            if (rally[0].trim().equals(pong)){
                pingScore++;
            }
            if (rally[0].trim().equals(ping)){
                pongScore++;
            }
        }else {
            return getWinnerThroughALongRally(rallies);
        }

        return getWinner(pingScore, pongScore, lastGoodHit);
    }

    public static String getWinnerThroughALongRally(List<String> rallies){
        int pingScore = 0;
        int pongScore = 0;
        String lastGoodHit = "";
        for (int idx = 0; idx < rallies.size(); idx++) {
            String[] rally = rallies.get(idx).split("\\s");
            if (rally[0].equals(ping) && rally[rally.length - 1].equals(pong)) {
                pingScore++;
                lastGoodHit = ping;
            }
            if (rally[0].equals(pong) && rally[rally.length - 1].equals(ping)) {
                pongScore++;
                lastGoodHit = pong;
            }
            if (rally[0].equals(pong) && rally[rally.length - 1].equals(pong)){
                lastGoodHit = ping;
            }
            if (rally[0].equals(ping) && rally[rally.length - 1].equals(ping)){
                lastGoodHit = pong;
            }
        }
        return getWinner(pingScore, pongScore, lastGoodHit);
    }


    private static List<String> getRallies(String[] soundsList) {
        List<String> rallies = new ArrayList<>();
        StringBuilder rally = new StringBuilder();

        for (int idx = 0; idx < soundsList.length; idx++) {
            String currentWord = soundsList[idx];
            if (currentWord.equals(ping) || currentWord.equals(pong)) {
                rally.append(currentWord)
                        .append(" ");
            } else if (!rally.toString().isEmpty()){
                rallies.add(rally.toString());
                rally = new StringBuilder();
            }
        }
        return rallies;
    }

    private static String getWinner(int pingScore, int pongScore, String lastGoodHit) {
        if (pingScore == pongScore) {
            return lastGoodHit;
        }
        if (pingScore > pongScore) {
            return ping;
        } else {
            return pong;
        }
    }
  
}
------------------------------------------------------------------------------
public class Dinglemouse {

    public static String pingPong(String sounds) {
      //Scores
      int ping_score = 0; int pong_score = 0;
      String winner = "", first_serve = "", last_hit = "";
      for (String i : sounds.split("-")){
        //If bad noise
        if (!"ping".equals(i) && !"pong".equals(i)){
          if ("ping".equals(first_serve) && !"ping".equals(last_hit)){ping_score++;}
          if ("pong".equals(first_serve) && !"pong".equals(last_hit)){pong_score++;}
          //Clear first serve for next round
          first_serve = "";
        }
        //If good noise
        else{
          if (first_serve==""){first_serve = i;}
          last_hit = i;
        }
      }
      
      //Determining winner
      if (ping_score > pong_score){winner = "ping";}
      if (pong_score > ping_score){winner = "pong";}
      if (ping_score == pong_score){
        if ("ping".equals(last_hit)){
          winner="pong";
        }
        if("pong".equals(last_hit)){
          winner = "ping";
        }
      }

      return winner;
    }
  
}
-------------------------------------------------------------------------------
public class Dinglemouse {

    public static String pingPong(String soundsStr) {
        String[] sounds = soundsStr.split("-");
        boolean served = false;
        String server = null;
        String lastHitter = null, lastBadHitter = null;
        int[] score = new int[2];
        for (String sound : sounds) {
            if (!sound.equals("ping") && !sound.equals("pong")) {
                if (served) {
                    served = false;
                    if (!server.equals(lastHitter)) {
                        if (server.equals("ping")) score[0]++;
                        else score[1]++;
                    }
                    lastBadHitter = lastHitter;
                }
            } else {
                if (!served) {
                    served = true;
                    server = sound;
                }
                lastHitter = sound;
            }
        }
        if (score[0] == score[1]) {
            return lastBadHitter.equals("ping") ? "pong" : "ping";
        }
        return score[0] > score[1] ? "ping" : "pong";
    }
  
}
------------------------------------------------------------------------------
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Dinglemouse {

    public static String pingPong(String sounds) {
        if ("ping".equals(sounds) || "pong".equals(sounds))
            return sounds;

        final var reduced = Stream.of(sounds.split("(-(?!ping)(?!pong)[a-z]{4})+"))
                .map(s -> s.startsWith("-") ? s.substring(1) : s)
                .map(s -> s.startsWith("ping") ?
                        s.endsWith("pong") ? "ping" : "pong*" :
                        s.endsWith("ping") ? "pong" : "ping*")
                .toList();

        final var last = reduced.get(reduced.size() - 1).replace("*", "");

        final var collect = reduced.stream().collect(groupingBy(identity(), counting()));
        final long pings = collect.getOrDefault("ping", 0L);
        final long pongs = collect.getOrDefault("pong", 0L);

        return pings == pongs
                ? last
                : pings < pongs ? "pong" : "ping";
    }
}
*/