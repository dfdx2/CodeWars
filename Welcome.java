public class Welcome {
   public static String greet(String language){
   // your code
 if (language == "english") {
   return "Welcome";
 }    
     else if (language == "czech") {
       return "Vitejte";
     }
     else if ( language == "danish") {
       return "Velkomst";
     }
     else if (language == "estonian") {
       return "Tere tulemast";
     }
     else if (language == "finnish") {
       return "Tervetuloa";
     } 
     else if (language == "flemish") {
       return "Welgekomen";
     }
     else if (language == "french") {
       return "Bienvenue";
     }
     else if (language == "german") {
       return "Willkommen";
     }
     else if (language == "irish") {
       return "Failte";
     }
     else if (language == "latvian") {
       return "Gaidits";
     }
     else if (language == "lithuanian") {
       return "Laukiamas";
     }
     else if (language == "polish") {
       return "Witamy";
     }
     else if (language == "spanish") {
       return "Bienvenido";
     }
     else if (language == "swedish") {
       return "Valkommen";
     }
     else if (language == "welsh") {
       return "Croeso";
     }
     else if (language == "dutch") {
       return "Welkom";
     }
     else if (language == "italian") {
       return "Benvenuto";
     }
     else {
       return "Welcome";
     }

/****
 *    import java.util.HashMap;

public class Welcome {
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
 * 
 * 
 * 
 * import java.util.HashMap;

public class Welcome {
  public static String greet(String language){
    HashMap<String, String> greeting = new HashMap<>();
    greeting.put("english", "Welcome");
    greeting.put("czech", "Vitejte");
    greeting.put("danish", "Velkomst");
    greeting.put("dutch", "Welkom");
    greeting.put("estonian", "Tere tulemast");
    greeting.put("finnish", "Tervetuloa");
    greeting.put("flemish", "Welgekomen");
    greeting.put("french", "Bienvenue");
    greeting.put("german", "Willkommen");
    greeting.put("irish", "Failte");
    greeting.put("italian", "Benvenuto");
    greeting.put("latvian", "Gaidits");
    greeting.put("lithuanian", "Laukiamas");
    greeting.put("polish", "Witamy");
    greeting.put("spanish", "Bienvenido");
    greeting.put("swedish", "Valkommen");
    greeting.put("welsh", "Croeso");
    
    if (greeting.containsKey(language)) {
      return greeting.get(language);
    }
    return greeting.get("english");
   }
}
 * 
 * 
 * 
 * 
 * 
 */