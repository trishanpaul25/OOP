import java.util.Scanner;

class op{
  private int n;
  private int[] a = new int[n];
  public op(int n, int[] a){
    this.n = n;
    this.a = a;
  }

  public int sum(){
    int s = 0;
    for(int i = 0; i < n; i++){
      s += a[i];
    }
    return s;
  }

  public double avg(){
    int s = 0;
    for(int i = 0; i < n; i++){
      s += a[i];
    }
    return (double)s/n;
  }
}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
      }

      op obj = new op(n,a);
      System.out.println("Sum = "+obj.sum());
      System.out.println("Avg = "+obj.avg());
    }
}  
