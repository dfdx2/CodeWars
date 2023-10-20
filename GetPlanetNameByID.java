/* 8KYU CodeWars Get Planet Name By ID

The function is not returning the correct values. Can you figure out why?

Example (Input --> Output ):

3 --> "Earth"

*/

class Planet {
  static String getPlanetName(int id) {
    return (id == 1 ? "Mercury" : (id == 2) ? "Venus" : (id == 3) ? "Earth" : (id == 4) ? "Mars" : (id == 5) ? "Jupiter" : (id == 6) ? "Saturn" : (id == 7) ? "Uranus" : (id == 8) ? "Neptune" : (id == 9) ? "Pluto" : "Try again");
  }
}
/*------------------------------------------------------------------------------
class Planet {
  static String F [] = {"" , "Mercury" , "Venus", "Earth", "Mars","Jupiter", "Saturn","Uranus","Neptune"};
  static String getPlanetName(int id) { 
    return F[id];
    }
}
-------------------------------------------------------------------------------
interface Planet {
  static String getPlanetName(int id) {
    return new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"}[--id];
  }
}
-------------------------------------------------------------------------------   
class Planet {
  static String getPlanetName(int id) {
    return switch (id) {
      case 1 -> "Mercury";
      case 2 -> "Venus";
      case 3 -> "Earth";
      case 4 -> "Mars";
      case 5 -> "Jupiter";
      case 6 -> "Saturn";
      case 7 -> "Uranus";
      case 8 -> "Neptune";
      default -> throw new IllegalArgumentException(id + " is not a planet id");
    };
  }
}
---------------------------------------------------------------------------------
class Planet {
  static String getPlanetName(int S) {
    String[] A = new String[]{"Mercury",
                              "Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
    return A[S-1];
  }
}
--------------------------------------------------------------------------------
class Planet {
  static String getPlanetName(int id) {
    return (id == 1 ? "Mercury" : (id == 2) ? "Venus" : (id == 3) ? "Earth" : (id == 4) ? "Mars" : (id == 5) ? "Jupiter" : (id == 6) ? "Saturn" : (id == 7) ? "Uranus" : (id == 8) ? "Neptune" : (id == 9) ? "Pluto" : "Try again");
  }
}
------------------------------------------------------------------------------
class Planet {
  static String getPlanetName(int id) throws IllegalArgumentException {
    String name = "";
    switch (id) {
      case 1:
        name = "Mercury";
        break;
      case 2:
        name = "Venus";
        break;
      case 3:
        name = "Earth";
        break;
      case 4:
        name = "Mars";
        break;
      case 5:
        name = "Jupiter";
        break;
      case 6:
        name = "Saturn";
        break;
      case 7:
        name = "Uranus";
        break;
      case 8:
        name = "Neptune";
        break;
      default:
        throw new IllegalArgumentException(String.format("Solar system do not have planet with id=%d", id));
        
    }
    return name;
  }
}
--------------------------------------------------------------------------------
class Planet {
  static String getPlanetName(int id) {
    return new String[]{"Sol","Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Zaphod"}[id];
  }
}
---------------------------------------------------------------------------------
class Planet {
  static String getPlanetName(int id) {
    String name = switch (id) {
            case 1 -> "Mercury";
            case 2 -> "Venus";
            case 3 -> "Earth";
            case 4 -> "Mars";
            case 5 -> "Jupiter";
            case 6 -> "Saturn";
            case 7 -> "Uranus";
            case 8 -> "Neptune";
            default -> null;
        };
        return name;
    }
}
--------------------------------------------------------------------------------
class Planet {
  static String getPlanetName(int id) {
    String name = null;
    switch (id) {
      case 1:
        return "Mercury";
      case 2:
        return "Venus";
      case 3:
        return "Earth";
      case 4:
        return "Mars";
      case 5:
        return "Jupiter";
      case 6:
        return "Saturn";
      case 7:
        return "Uranus";
      case 8:
        return "Neptune";
    }
    return null;
  }
}



*/