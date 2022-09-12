/*   8KYU Grasshopper Terminal Game Move Function
Terminal game move function
In this game, the hero moves from left to right. 
The player rolls the dice and moves the number 
of spaces indicated by the dice two times.

Create a function for the terminal game that takes 
the current position of the hero and the roll (1-6) 
and return the new position.

Example:
move(3, 6) should equal 15

public void basicTests() {
        assertEquals(8, Move.move(0, 4));
        assertEquals(15, Move.move(3, 6));
        assertEquals(12, Move.move(2, 5));

*/



public class Move {
    public static int move(int position, int roll) {
        // your code here
      return (2 * roll) + position;
    }
}