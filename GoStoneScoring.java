/* 7KYU CodeWars Go: Stone Scoring

One traditional method of determining the winning side of a Go match is called stone scoring. This method has some flaws but is algorithmically the easiest one. Therefore, we will start of with this method.

Your puzzle input is a 2D collection that represents a Go board like:

board = [
    [W, W, W, B, B, B],
    [W, W, W, W, B, B],
    [W, W, W, B, B, B],
    [W, X, W, B, B, B],
    [X, W, B, B, B, B],
    [W, W, B, X, B, X]
]
B represent fields with black stones, W represent fields with white stones, and X represent empty fields. Your task is to determine the winning side, i.e. the side with more stones on the board. Then, return either W or B and the number of the side's stones as a tuple depending on which side has more stones on the board. If there is a tie, return a T and the number of stones of one side as a tuple. Empty fields are not considered in this method for determining the winning side. Thus, they can be ignored.

In the example, B has 17 stones on the boards whereas W only has 15. Hence, the black side won and ("B", 17) should be returned.

Be aware that the board can vary in size but is at least of size 3x3!



*/

public class GoStoneScoring {
    
    public static GameScore determineWinner(char[][] board) {
      
      // GameScore is preloaded as:
      // public record GameScore(char winner, int count) {}
      
      int black = 0;
      int white = 0;
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
          if (board[i][j] == 'B') {
            black++;
          }
          if (board[i][j] == 'W') {
            white++;
          }
        }
      }
      if (black > white) {
        return new GameScore('B', black);
      }
      if (white > black) {
        return new GameScore('W', white);
      }
      return new GameScore('T', white);
    }
}
/*-----------------------------------------------------------------------------
public class Kata {
    
    public static GameScore determineWinner(char[][] board) {
      
      // GameScore is preloaded as:
      // public record GameScore(char winner, int count) {}
      
      int w = 0, b = 0;
      for (char[] row : board) {
        for(char c : row) {
          if (c == 'W') w++;
          else if (c == 'B') b++;
        }
      } 
      if (w == b) return new GameScore('T', w);
      else if (w > b) return new GameScore('W', w);
      else return new GameScore('B', b);
    }
}
-------------------------------------------------------------------------------
public class Kata {
    
    public static GameScore determineWinner(char[][] board) {
      int bs = 0, ws = 0;
      for(var row: board)
        for(var cell: row) {
          switch(cell) {
              case 'B': ++bs; break;
              case 'W': ++ws; break;
          }
        }      
      return
        bs == ws ? new GameScore('T', ws) :
        bs > ws ? new GameScore('B', bs) :
        new GameScore('W', ws);
    }
}
-------------------------------------------------------------------------------
public class Kata {
    private static int countColor(final char color, char[][] board) {
        int count = 0;
        for (char[] row : board) {
            for (int j = 0; j < board[0].length; j++) {
                if (color == row[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    public static GameScore determineWinner(char[][] board) {
      int black = countColor('B', board), white = countColor('W', board);
      // GameScore is preloaded as:
      // public record GameScore(char winner, int count) {}
      if (black > white) return new GameScore('B', black);
      else if (black < white) return new GameScore('W', white);
      else return new GameScore('T', black);
    }
}
-------------------------------------------------------------------------------
public class Kata {
    
      public static GameScore determineWinner(char[][] board) {
          int WCount = 0, BCount = 0;
          for (int i = 0; i < board.length; i++) {
              for (int j = 0; j < board[i].length; j++) {
                  if (board[i][j] == 'W') {
                      WCount++;
                  } else if (board[i][j] == 'B') {
                      BCount++;
                  }
              }
          }
          return WCount > BCount ? new GameScore('W', WCount) : WCount < BCount ? new GameScore('B', BCount) : new GameScore('T', WCount);
      }
}
--------------------------------------------------------------------------------
public class Kata {
  public static GameScore determineWinner(char[][] board) {
    int white = 0;
    int black = 0;
    for (char[] row : board)
      for (char c : row) {
        if (c == 'W') white++;
        if (c == 'B') black++;
      }
    return new GameScore(black > white ? 'B' : white > black ? 'W' : 'T', Math.max(black,white));
  }
}
-------------------------------------------------------------------------------
public class Kata {

    public static GameScore determineWinner(char[][] board) {
        int countW = 0;
        int countB = 0;

        for (char[] row : board) {
            for (char cell : row) {
                if (cell == 'W') {
                    countW++;
                } else if (cell == 'B') {
                    countB++;
                }
            }
        }

        if (countW > countB) {
            return new GameScore('W', countW);
        } else if (countB > countW) {
            return new GameScore('B', countB);
        } else {
            return new GameScore('T', countW);
        }
    }
}
*/