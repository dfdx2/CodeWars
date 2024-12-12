/* 7KYU CodeWars Arithmetic Sequence!

Introduction

A sequence is usually a set or an array of numbers that has a 
strict way for moving from the nth term to the (n+1)th term.

If f(n) = f(n-1) + c where c is a constant value, then f is 
an arithmetic sequence.

An example would be (where the first term is 0 and the constant is 1) 
is [0, 1, 2, 3, 4, 5, ... and so on]

Else if f(n) = f(n-1) * c where c is a constant value, then f 
is a geometric sequence.

Example where the first term is 2 and the constant is 2 will be 
[2, 4, 8, 16, 32, 64, ... to infinity ... ]

There are some other sequences that aren't arithmetic nor are they 
geometric.

Here is a link to feed your brain! : Sequence

Task

You're going to write a function that's going to return the value in 
the nth index of an arithmetic sequence. (That is, adding a constant 
to move to the next element in the "sequence").

The function takes three inputs first,n,c where:

first is the first value in the index 0.

n is the index of the value we want.

c is the constant added between each term.

Remember that first is in the index 0 .. just saying ...

*/
public class ArithmeticSequence {
  public static int nthterm(int first, int n, int c) {
    int result = first;
    for (int i = 0; i < n; i++) {
      result += c;
    }
    return result;
  }
}
/*-------------------------------------------------------------------
public class Sequence {
  public static int nthterm(int first, int n, int c) {
    return first + (n * c);
  }
}
---------------------------------------------------------------------
public class Sequence {
  public static int nthterm(int first, int n, int c) {
    // Using math properties for arithmetical sequences: f(n) = n*c + first 
    return first + n * c;
  }
}
---------------------------------------------------------------------
public class Sequence {
  public static int nthterm(int first, int n, int c) {
    int num = first;
    int i = 0; 
    while(i < n ){
      num = num + c; 
      i++; 
    }
    return num; 
  }
}
---------------------------------------------------------------------
import java.util.stream.IntStream;

public class Sequence {
  public static int nthterm(int first, int n, int c) {
        return IntStream.range(0, n).reduce(first, (acc, num) -> acc + c);
  }
}
---------------------------------------------------------------------
import java.util.Stack;

public class Sequence {
	  public static int nthterm(int first, int n, int c) {
	    Stack<Integer> set = new Stack<Integer>();
	    for(int i=0; i<n+1; i++){
	    set.add(first+c*i);
	    }    
	    return set.pop(); //put last element
	  }
	}
---------------------------------------------------------------------
import java.util.stream.IntStream;

public class Sequence {
    public static int nthterm(int first, int n, int c) {
        return IntStream.iterate(first, i -> i + c).skip(n).findFirst().getAsInt();
    }
}
---------------------------------------------------------------------
public class Sequence {
  public static int nthterm(int first, int n, int c) {
    return n <= 0 ? first : nthterm(first, n - 1, c) + c;
  }
}

*/