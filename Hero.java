/* 8KYU CodeWars Grasshopper - Terminal Game # 1

Terminal Game - Create Hero Prototype

In this first kata in the series, you need to define a 
Hero prototype to be used in a terminal game. The hero 
should have the following attributes:

attribute	               value

name	            user argument or 'Hero'
position	               '00'
health	                   100
damage	                     5
experience	                 0

*/
public class Hero { 
  String name;
  String position;
  int health;
  int damage;
  int experience;
  
  public Hero(String name) {
    this.name = name;
    position = "00";
    health = 100;
    damage = 5;
    experience = 0;
  }
  
  public Hero() {
    name = "Hero";
    position = "00";
    health = 100;
    damage = 5;
    experience = 0;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  public void setName() {
    name = "Hero";
  }
  public String getName() {
    return name;
  }
}
/*--------------------------------------------------------------
class Hero {
  String name = "Hero", position = "00";
  int health = 100, damage = 5, experience = 0;

  Hero() {}
  Hero(String name) { this.name = name; }
}
----------------------------------------------------------------
public class Hero { 
  String name = "Hero";
  String position = String.format("%02d", 0);
  int health = 100;
  int damage = 5;
  int experience = 0;
  
  Hero(){
   }  
  Hero(String name){
    this.name = name;
  }
  
}
----------------------------------------------------------------
public class Hero { 
  String name = "Hero";
  String position = "00";
  int health = 100;
  int damage = 5;
  int experience = 0;
  public Hero(String name){
    this.name = name;
  }
  public Hero(){
    
  }
}

----------------------------------------------------------------
public class Hero { 
   public String name;
    public String position;
    public int health;
    public int damage;
    public int experience;

    // Constructor por defecto
    public Hero() {
        this.name = "Hero";
        this.position = "00";
        this.health = 100;
        this.damage = 5;
        this.experience = 0;
    }

    // Constructor con nombre
    public Hero(String name) {
        this();
        this.name = name;
    }

    // Métodos getter
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getExperience() {
        return experience;
    }
    
    // Métodos setter (si se necesita modificar los valores después de la creación)
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
----------------------------------------------------------------
public class Hero { 
  String name = "Hero";
  String position = "00";
  int health = 100;
  int damage = 5;
  int experience = 0;

  Hero(){
  }
  Hero(String name){
    this.name = name;
  }
  
}
----------------------------------------------------------------
public class Hero { 
  // <- Hajime
  String name;
  String position;
  Integer health;
  Integer damage;
  Integer experience;
  
  public Hero(String name){
    this();
    this.name = name;
  }
  
  public Hero(){
    this.name = "Hero";
    this.position = "00";
    this.health = 100;
    this.damage = 5;
    this.experience = 0;
  }
}
----------------------------------------------------------------
public class Hero {
    String name;
    String position;
    int health;
    int damage;
    int experience;

    { 
        name = "Hero";
        position = "00";
        health = 100;
        damage = 5;
        experience = 0;
    }

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }
}
----------------------------------------------------------------
public class Hero {
    String name;
    String position;
    int health;
    int damage;
    int experience;

    // Default constructor
    public Hero() {
        this.name = "Hero";  // Update default name to "Hero"
        this.position = "00";
        this.health = 100;
        this.damage = 5;
        this.experience = 0;
    }

    // Parameterized constructor with all fields
    public Hero(String name, String position, int health, int damage, int experience) {
        this.name = name;
        this.position = position;
        this.health = health;
        this.damage = damage;
        this.experience = experience;
    }

    // Constructor with only the name parameter
    public Hero(String name) {
        this.name = name;
        this.position = "00";  // Default values
        this.health = 100;
        this.damage = 5;
        this.experience = 0;
    }
}
*/