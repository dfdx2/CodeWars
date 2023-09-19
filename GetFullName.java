/* 7KYU CodeWars FIXME: Get Full Name

The code provided is supposed return a person's Full Name given 
their first and last names.

But it's not working properly.

Notes
The first and/or last names are never null, but may be empty.

Task
Fix the bug so we can all go home early.

*/
public class Dinglemouse {

    private String firstName;
    private String lastName;
    
    public Dinglemouse(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }
    
    public String getFullName() { 
      if (firstName.length() < 1) {
        return lastName;
      }
      if (lastName.length() < 1) {
        return firstName;
      }
      else {
        return firstName + " " + lastName;
      }
    }
}
/*--------------------------------------------------------------------------------
public class Dinglemouse {

  private final String firstName;
  private final String lastName;
  
  public Dinglemouse(final String firstName, final String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public String getFullName() { 
    return (firstName + " " + lastName).trim(); 
  }
  
}
-------------------------------------------------------------------------------
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

class Dinglemouse {
    private String firstName;
    private String lastName;
    private String fullName;
    
    Dinglemouse(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = Stream.of(firstName, lastName)
            .filter(s -> !s.isEmpty())
            .collect(joining(" "));
    }
    
    String getFullName() {
        return fullName;
    }
}
---------------------------------------------------------------------------
class Dinglemouse {
  String fullName;

  Dinglemouse(String firstName, String lastName) {
    fullName = firstName + " " + lastName;
  }

  String getFullName() {
    return fullName.trim();
  }
}




*/