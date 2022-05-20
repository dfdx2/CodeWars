public class Fibonacci {
  public static long fib (int n){
    //code here 
    if (n == 1) return 1;
    if (n == 2) return 1;
    
        return fib(n - 2) + fib(n - 1);
        
    }


    


}