/* 8KYU CodeWars Grasshopper - Terminal Game Combat function

Create a combat function that takes the player's current 
health and the amount of damage recieved, and returns the 
player's new health. Health can't be less than 0.


*/
public class TerminalGameCombat {
  public static int combat(int health, int damage) {
    return health - damage > 0 ? health - damage : 0;
  }
}
/*---------------------------------------------
public class Game {
  
  public static int combat(int health, int damage) {
    return Math.max(health - damage, 0);
  }
}
-----------------------------------------------
public class Game {
  
  public static int combat(int health, int damage) {
    return (health < damage)? 0 : health-damage;
  }
}
------------------------------------------------
public class Game {
  
  public static int combat(int health, int damage) {
    int expected = health - damage;
    if(expected < 0) return 0;

    return expected;
  }
}
------------------------------------------------
  
  public static int combat(int health, int damage) {
    health = health - damage;
    if (health < 0 ) {
      return 0;
    }
    else {
      return health;
    }
  }
}
-------------------------------------------------
public class Game {
  
  public static int combat(int health, int damage) {
    health-=damage;
    if (health<0){
      health=0;
    }
    return health;
  }
}
--------------------------------------------------
public class Game {
  
  public static int combat(int health, int damage) {
    int remainingHealth = damage >= health ? 0 : health - damage;
    return remainingHealth;
  }
}

---------------------------------------------------
public class Game {
  
  public static int combat(int health, int damage) {
    int currentHealth = health - damage;
    return currentHealth > 0 ? currentHealth : 0;
  }
}
--------------------------------------------------
public class Game {
  
  public static int combat(int health, int damage) {
    return (health - damage <= 0) ? 0 : health - damage;
  }
}
*/