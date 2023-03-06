/*  8KYU CodeWars Welcome!

Your start-up's BA has told marketing that your website has a large 
audience in Scandinavia and surrounding countries. Marketing thinks 
it would be great to welcome visitors to the site in their own language. 
Luckily you already use an API that detects the user's location, so this 
is an easy win.


The Task

Think of a way to store the languages as a database (eg an object). The 
languages are listed below so you can copy and paste!
Write a 'welcome' function that takes a parameter 'language' (always a string), 
and returns a greeting - if you have it in your database. It should default to 
English if the language is not in the database, or in the event of an invalid input.

The Database

english: "Welcome",
czech: "Vitejte",
danish: "Velkomst",
dutch: "Welkom",
estonian: "Tere tulemast",
finnish: "Tervetuloa",
flemish: "Welgekomen",
french: "Bienvenue",
german: "Willkommen",
irish: "Failte",
italian: "Benvenuto",
latvian: "Gaidits",
lithuanian: "Laukiamas",
polish: "Witamy",
spanish: "Bienvenido",
swedish: "Valkommen",
welsh: "Croeso"
Possible invalid inputs include:

IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
IP_ADDRESS_NOT_FOUND - ip address not in the database
IP_ADDRESS_REQUIRED - no ip address was supplied

*/

public static String greet(String language){
  HashMap<String, String> map = new HashMap<>();
  
  map.put("english", "Welcome");
  map.put("czech", "Vitejte");
  map.put("danish", "Velkomst");
  map.put("dutch", "Welkom");
  map.put("estonian", "Tere tulemast");
  map.put("finnish", "Tervetuloa");
  map.put("flemish", "Welgekomen");
  map.put("french", "Bienvenue");
  map.put("german", "Willkommen");
  map.put("irish", "Failte");
  map.put("italian", "Benvenuto");
  map.put("latvian", "Gaidits");
  map.put("lithuanian", "Laukiamas");
  map.put("polish", "Witamy");
  map.put("spanish", "Bienvenido");
  map.put("swedish", "Valkommen");
  map.put("welsh", "Croeso");
  
  return map.getOrDefault(language, map.get("english"));

}
}

/*-------------------------------------------------------------------------
 public class Welcome {
    public static String greet(final String language) {
        switch (language) {
            case "czech":
                return "Vitejte";
            case "danish":
                return "Velkomst";
            case "dutch":
                return "Welkom";
            case "estonian":
                return "Tere tulemast";
            case "finnish":
                return "Tervetuloa";
            case "flemish":
                return "Welgekomen";
            case "french":
                return "Bienvenue";
            case "german":
                return "Willkommen";
            case "irish":
                return "Failte";
            case "italian":
                return "Benvenuto";
            case "latvian":
                return "Gaidits";
            case "lithuanian":
                return "Laukiamas";
            case "polish":
                return "Witamy";
            case "spanish":
                return "Bienvenido";
            case "swedish":
                return "Valkommen";
            case "welsh":
                return "Croeso";
            case "english":
            default:
                return "Welcome";
        }
    }
}
--------------------------------------------------------------------------
public class Welcome {
   public static String greet(final String language) {
      String[][] database = { { "english", "Welcome" }, { "czech", "Vitejte" }, { "danish", "Velkomst" },
            { "dutch", "Welkom" }, { "estonian", "Tere tulemast" }, { "finnish", "Tervetuloa" },
            { "flemish", "Welgekomen" }, { "french", "Bienvenue" }, { "german", "Willkommen" }, { "irish", "Failte" },
            { "italian", "Benvenuto" }, { "latvian", "Gaidits" }, { "lithuanian", "Laukiamas" }, { "polish", "Witamy" },
            { "spanish", "Bienvenido" }, { "swedish", "Valkommen" }, { "welsh", "Croeso" } };

      for (int i = 0; i < database.length; i++) {
         System.out.print(database[i][0] + " ");
         if ((database[i][0]).toString() == language) {
            return database[i][1].toString();
         }
      }

      return "Welcome";
   }
}
---------------------------------------------------------------------------
public class Welcome {
   
  enum Welcomes {
    english("Welcome"),
    czech("Vitejte"),
    danish("Velkomst"),
    dutch("Welkom"),
    estonian("Tere tulemast"),
    finnish("Tervetuloa"),
    flemish("Welgekomen"),
    french("Bienvenue"),
    german("Willkommen"),
    irish("Failte"),
    italian("Benvenuto"),
    latvian("Gaidits"),
    lithuanian("Laukiamas"),
    polish("Witamy"),
    spanish("Bienvenido"),
    swedish("Valkommen"),
    welsh("Croeso");
    
    private String str;  
    Welcomes(String str) { this.str = str; }   
    public String toString() { return str; }   
    public static boolean contains(String s) { 
      for(Welcomes w : values())
        if (w.name().equals(s)) 
              return true;
      return false;
  } 
}
   
   public static String greet(String language){
     return Welcomes.contains(language) ? Welcomes.valueOf(language).toString() : Welcomes.valueOf("english").toString();     
   }
}
----------------------------------------------------------------------------
public class Welcome {
   public static String greet(String language){
   
       String resultado = "Welcome";
       //System.out.println("language = "+language);
  
       String[][] tabla = new String[20][2];
       tabla [0][0] = "english"; tabla [0][1] = "Welcome";
       tabla [1][0] = "czech"; tabla [1][1] = "Vitejte";
       tabla [2][0] = "danish"; tabla [2][1] = "Velkomst";
       tabla [3][0] = "dutch"; tabla [3][1] = "Welkom";
       tabla [4][0] = "estonian"; tabla [4][1] = "Tere tulemast";
       tabla [5][0] = "finnish"; tabla [5][1] = "Tervetuloa";
       tabla [6][0] = "flemish"; tabla [6][1] = "Welgekomen";
       tabla [7][0] = "french"; tabla [7][1] = "Bienvenue";
       tabla [8][0] = "german"; tabla [8][1] = "Willkommen";
       tabla [9][0] = "irish"; tabla [9][1] = "Failte";
       tabla [10][0] = "italian"; tabla [10][1] = "Benvenuto";
       tabla [11][0] = "latvian"; tabla [11][1] = "Gaidits";
       tabla [12][0] = "lithuanian"; tabla [12][1] = "Laukiamas";
       tabla [13][0] = "polish"; tabla [13][1] = "Witamy";
       tabla [14][0] = "spanish"; tabla [14][1] = "Bienvenido";
       tabla [15][0] = "swedish"; tabla [15][1] = "Valkommen";
       tabla [16][0] = "welsh"; tabla [16][1] = "Croeso";
       tabla [17][0] = "IP_ADDRESS_INVALID"; tabla [17][1] = "Welcome";
       tabla [18][0] = "IP_ADDRESS_NOT_FOUND"; tabla [18][1] = "Welcome";
       tabla [19][0] = "IP_ADDRESS_REQUIRED"; tabla [19][1] = "Welcome";

      for (int i=0; i<20;i++){
        if (language.equals(tabla[i][0])){
          resultado=tabla[i][1];
        }
      }
      //System.out.println("Resultado = "+resultado);
      return resultado;
  }
}
---------------------------------------------------------------------------
