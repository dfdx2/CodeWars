/* 5KYU CodeWars Product Of Consecutive Fib Numbers

The Fibonacci numbers are the numbers in the following integer sequence (Fn):

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

such as

F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.

Given a number, say prod (for product), we search two Fibonacci 
numbers F(n) and F(n+1) verifying

F(n) * F(n+1) = prod.

Your function productFib takes an integer (prod) and returns an array:

[F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
depending on the language if F(n) * F(n+1) = prod.

If you don't find two consecutive F(n) verifying F(n) * F(n+1) = prodyou 
will return

[F(n), F(n+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
F(n) being the smallest one such as F(n) * F(n+1) > prod.

Some Examples of Return:
(depend on the language)

productFib(714) # should return (21, 34, true), 
                # since F(8) = 21, F(9) = 34 and 714 = 21 * 34

productFib(800) # should return (34, 55, false), 
                # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
-----
productFib(714) # should return [21, 34, true], 
productFib(800) # should return [34, 55, false], 
-----
productFib(714) # should return {21, 34, 1}, 
productFib(800) # should return {34, 55, 0},        
-----
productFib(714) # should return {21, 34, true}, 
productFib(800) # should return {34, 55, false}, 
Note:
You can see examples for your language in "Sample Tests".

*/

public class ProdFib { 	
	
	public static long[] productFib(long prod) {
    long x = 0;
    long y = 1;
    while (x * y <= prod) {
      if ((x * y) == prod) {
        return new long[] {x, y, 1};
      }
      long s = x;
      x = y;
      y += s;
    }
    return new long[] {x, y, 0};
   }
}
/*---------------------------------------------------------------------------------
public class ProdFib { // must be public for codewars	
	
	public static long[] productFib(long prod) {
		long a = 0L;
    long b = 1L;
    while (a * b < prod) {
      long tmp = a;
      a = b;
      b = tmp + b;
    }
    return new long[] { a, b, a * b == prod ? 1 : 0 };
   }
}
--------------------------------------------------------------------------------
public class ProdFib { // must be public for codewars	
	
	public static long[] productFib(long prod) {
    // your code
    long x=0;
    long y=1;
    while(x*y<prod) {
      y = x+y;
      x = y-x;
    }
    if(x*y == prod) {
      return new long[] {x, y, 1};
    } else {
      return new long[] {x, y, 0};
    }
  }
}
--------------------------------------------------------------------------------
public class ProdFib { //SRY AMA BAD GUY :))))
static long[] mas={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711,
28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040,
1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817,
39088169, 63245986, 102334155, 165580141, 267914296, 433494437,
701408733, 1134903170,1836311903L,2971215073L};
	
	public static long[] productFib(long prod) {
     long[] result={0,0,0};
     long buf;
    for(int i=0;i<mas.length-1;i++)
    { 
     buf  = mas[i]*mas[i+1];
     if(buf<prod)continue;
     if(buf==prod){result[0]=mas[i];result[1]=mas[i+1];result[2]=1;break;}
     if(buf>prod){result[0]=mas[i];result[1]=mas[i+1];break;}
    }
		return result;
   }
}

*/