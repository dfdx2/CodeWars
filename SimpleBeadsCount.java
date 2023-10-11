/* 7KYU CodeWars Simple Beads Count

Two red beads are placed between every two blue beads. There are N blue beads. 
After looking at the arrangement below work out the number of red beads.

@ @@ @ @@ @ @@ @ @@ @ @@ @

Implement count_red_beads(n) (in PHP count_red_beads($n); in Java, 
Javascript, TypeScript, C, C++ countRedBeads(n)) so that it returns 
the number of red beads.

If there are less than 2 blue beads return 0.


*/
public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
      return (nBlue < 2) ? 0 : (nBlue - 1) * 2;
    }
}
/*----------------------------------------------------------------------
public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
      return java.lang.Math.max(0, (nBlue-1)*2);
    }
}
------------------------------------------------------------------------
public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
      int red=0;
      
      if(nBlue<2){
        return 0;
      }
      else{
        for(int i = 2; i<=nBlue; i++){
          red+=2;
        }
      }
      
      return red;
    }
}
-----------------------------------------------------------------------
public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
      if (nBlue==0)
        return 0;
      int red=(nBlue-1)*2;
      return red;
    }
}
-----------------------------------------------------------------------
public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
      return (nBlue - ((nBlue + Integer.MAX_VALUE) >>> 31)) * 2;
    }
}


*/