import java.util.*;
class Shared{
  boolean pingTurn = true;

  public synchronized void printPing(){
    try{
    if(!pingTurn){
      wait();
    }

    Random r = new Random();
    int s = r.nextInt(10);
    for(int i = 0; i < s; i++){
      System.out.print(" ");
    }
    System.out.println("PING");
    pingTurn = false;
    Thread.sleep(1000);
    notify();
  }
  catch(InterruptedException e){
    System.out.println("Ping Thread Interrupted");
  }
  }

  public synchronized void printPong(){
    try{
    if(pingTurn){
      wait();
    }

    Random r = new Random();
    int s = r.nextInt(10);
    for(int i = 0; i < s; i++){
      System.out.print(" ");
    }
    System.out.println("PONG");
    pingTurn = true;
    Thread.sleep(1000);
    notify();
  }catch(InterruptedException e){
    System.out.println("Pong thread interrupted");
  }
}
}

class Ping extends Thread{
  private Shared s;
  public Ping(Shared s){
    this.s = s;
  }
  public void run(){
    while(true)
    s.printPing();
  }
}

class Pong extends Thread{
  private Shared s;
  public Pong(Shared s){
    this.s = s;
  }
  public void run(){
    while(true)
    s.printPong();
  }
}

public class Main{
  public static void main(String[] args) {
    Shared s = new Shared();
    Ping p = new Ping(s);
    Pong q = new Pong(s);

    p.start();
    q.start();
  }
}
