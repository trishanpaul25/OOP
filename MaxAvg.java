import java.util.Scanner;

class Maxel extends Thread{
  private int[] a;
  public Maxel(int a[]){
    this.a = a;
  }

  private int max;
  public void run(){
    max = a[0];
    for(int i = 1; i < a.length; i++){
      if(a[i] > max) max = a[i];
    }
    System.out.println("Max element is "+max);
  }

  public int getMax(){
    return max;
  }
}

class Avgel extends Thread{
  private int[] a;
  public Avgel(int[] a){
    this.a = a;
  }

  private int avg;
  public void run(){
    int s = 0;
    for(int i = 0; i < a.length; i++){
      s += a[i];
    }
    avg = s/a.length;
    System.out.println("Avg element is "+avg);
  }

  public int getAvg(){
    return avg;
  }
}

public class Main{
  public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }

    Maxel m = new Maxel(a);
    Avgel t = new Avgel(a);
    
    m.start();
    t.start();

    m.join();
    t.join();
    
    System.out.println("Result = "+(double)m.getMax()/t.getAvg());
  }
}
