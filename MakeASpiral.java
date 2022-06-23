/*
Your task, is to create a NxN spiral with a given size.
For example, spiral with size 5 should look like this:

00000
....0
000.0
0...0
00000

and with the size 10:

0000000000
.........0
00000000.0
0......0.0
0.0000.0.0
0.0..0.0.0
0.0....0.0
0.000000.0
0........0
0000000000

Return value should contain array of arrays, of 0 and 1, with the first row being 
composed of 1s. For example for given size 5 result should be:

[[1,1,1,1,1],[0,0,0,0,1],[1,1,1,0,1],[1,0,0,0,1],[1,1,1,1,1]]
Because of the edge-cases for tiny spirals, the size will be at least 5.
General rule-of-a-thumb is, that the snake made with '1' cannot touch to itself.
*/

public class Spiralizor {

    public static int[][] spiralize(int size) {
      int [][] a = new int[size][size];
      int size4 = size%4 == 0 ? 1: 0;
      for (int y = 0, c = 1; y <= size/2; y++) {
        for (int x = y; x < size -y; x++)
          a[y][x] = a[x][size - 1 - y] = a[size - 1 - y][size - 1 - x] = a[size - 1 - x][y] = c;
          c = 1 - c;
        if (y + size4 < size / 2) a[y + 1][y] = c;
      }
      return a;
    }
}