import java.util.*;

class Shared{
  private int data;
  private boolean dataAvail = false;


  public synchronized void produce(int x){
    try{
      while(dataAvail){
        wait();
      }
      data = x;
      System.out.println("Produced : "+data);
      dataAvail = true;
      notify();
    }
    catch(InterruptedException e){
      System.out.println("Produce interrupted");
    }
  }

  public synchronized void consume(){
    try{
    while(!dataAvail){
      wait();
    }
    System.out.println("Consumed : "+data);
    dataAvail = false;
    notify();
  }
  catch(InterruptedException e){
    System.out.println("Consume Interrupted");
  }
  }
}

class Prod extends Thread{
  private Shared s;
  private int n;
  public Prod(Shared s, int n){
    this.s = s;
    this.n = n;
  }
  public void run(){
    for(int i = 1; i <= n; i++){
      s.produce(i);
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
        System.out.println("Sleep interrupted");
      }
    }
  }
}

class Con extends Thread{
  private Shared s;
  private int n;
  public Con(Shared s, int n){
    this.s = s;
    this.n = n;
  }
  public void run(){
    for(int i = 1; i <= n; i++){
      s.consume();
      System.out.println("Buffer : "+(n-i));
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
        System.out.println("Sleep interrupted");
      }
    }
  }
}

public class Main{
  public static void main(String[] args) {
    Shared s = new Shared();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Prod p = new Prod(s, n);
    Con c = new Con(s, n);
    p.start();
    c.start();
  }
}
