/* 8 KYU  CodeWars Basic Subclasses - Adam And Eve

According to the creation myths of the Abrahamic religions, 
Adam and Eve were the first Humans to wander the Earth.
You have to do God's job. The creation method must return an 
array of length 2 containing objects (representing Adam and Eve). 
The first object in the array should be an instance of the class Man. 
The second should be an instance of the class Woman. Both objects 
have to be subclasses of Human. Your job is to implement the Human, 
Man and Woman classes.
 */
public class God {
    private static Human[] humans = null;

    public static Human[] create() {
        if (humans == null) {
            humans = new Human[2];
            humans[0] = new Man();
            humans[1] = new Woman();
        }
        return humans;
    }

}
class Human {
}

class Man extends Human {
}

class Woman extends Human {
}
/*___________________________________________________________________

public class God {
  public static Human[] create(){
    return new Human[]{new Man(), new Woman()};
  }
}
class Human{
}
class Man extends Human{
}
class Woman extends Human{
}
________________________________________________________________________
public class God {
  public static Human[] create() {
     return new Human[] { new Man(), new Woman() };
  }
}

abstract class Human {}

class Man extends Human {}

class Woman extends Human {}
__________________________________________________________________________

public class God {
  public static Human[] create(){
     return new Human[]{new Man(), new Woman()};
  }
}

interface Human {}
class Man implements Human {}
class Woman implements Human {}
______________________________________________________________________________
*/