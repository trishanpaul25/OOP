import java.util.*;
class Factorial{
  public static long[] a = new long[21];
  public static long fact(int x){
    if(x < 0) throw new IllegalArgumentException("Number cannot be negetive");
    if(x >= a.length) throw new IllegalArgumentException("Value must be under 20");

    a[0] = 1;
    for(int i = 1; i <= x; i++){
      a[i] = i*a[i-1];
    }
    return a[x];
  }
}


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    try{
      System.out.println("Factorial : "+Factorial.fact(x));
    }
    catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
  }    
}
