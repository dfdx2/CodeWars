public class SwitchItUp 
{
  public static String switchItUp(int number)
  {
   String num;
    switch (number) {
        case (0): num = "Zero"; break;
        case (1): num = "One"; break;
        case (2): num = "Two"; break;
        case (3): num = "Three"; break;
        case (4): num = "Four"; break;
        case (5): num = "Five"; break;
        case (6): num = "Six"; break;
        case (7): num = "Seven"; break;
        case (8): num = "Eight"; break;
        case (9): num = "Nine"; break;
        default: num = "Invalid "; break;
    }
    return num;
  }
}