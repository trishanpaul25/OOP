import java.util.*;

class Shared{
  private boolean odd = true;

  public synchronized void oddTurn(int x){
    try{
      while(!odd){
        wait();
      }

      System.out.println(x);
      odd = false;
      notify();
    }catch(InterruptedException e){
      System.out.println("Odd Thread Interrupted");
    }
  }
  
  public synchronized void evenTurn(int x){
    try{
      while(odd){
        wait();
      }

      System.out.println(x);
      odd = true;
      notify();
    }catch(InterruptedException e){
      System.out.println("Even Thread Interrupted");
    }
  }
}

class OddP extends Thread{
  private Shared s;
  private int n;
  public OddP(Shared s, int n){
    this.s = s;
    this.n = n;
  }

  public void run(){
    for(int i = 1; i <= n; i = i+2){
      s.oddTurn(i);
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
        System.out.println("Sleep Interrupted");
      }
    }
  }
}

class EvenP extends Thread{
  private Shared s;
  private int n;
  public EvenP(Shared s, int n){
    this.s = s;
    this.n = n;
  }

  public void run(){
    for(int i = 2; i <= n; i = i+2){
      s.evenTurn(i);
      try{
        Thread.sleep(1000);
      }catch(Exception e){
        System.out.println("Sleep Interrupted");
      }
    }
  }
}

public class Main{
  public static void main(String[] args) {
    Shared s = new Shared();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    OddP o = new OddP(s,n);
    EvenP e = new EvenP(s,n);

    o.start();
    e.start();
  }
}
