import java.util.Scanner;

class MathOp{
  public static final double Pi = 3.14;

  public static double mul(double a, double b){
    return a*b;
  }
  public static double div(double a, double b){
    return a/b;
  }
}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double d = sc.nextInt();
      double r = MathOp.div(d, 2);
      double full = MathOp.mul(MathOp.Pi, MathOp.mul(r, r));
      double half = MathOp.div(full,2);
      System.out.println("Area : "+half);
}  
}
