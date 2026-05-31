import java.util.*;

class Shared{
  private boolean h = true;

  public synchronized void helloTurn(char x){
    try{
      while(!h){
        wait();
      }

      System.out.println(x);
      h = false;
      notify();
    }catch(InterruptedException e){
      System.out.println("Odd Thread Interrupted");
    }
  }
  
  public synchronized void JavaTurn(char x){
    try{
      while(h){
        wait();
      }

      System.out.println(x);
      h = true;
      notify();
    }catch(InterruptedException e){
      System.out.println("Even Thread Interrupted");
    }
  }
}

class Hello extends Thread{
  private Shared s;
  private String n;
  public Hello(Shared s, String n){
    this.s = s;
    this.n = n;
  }

  public void run(){
    for(int i = 0; i < n.length(); i++){
      s.helloTurn(n.charAt(i));
      try{
        Thread.sleep(1000);
      }catch(InterruptedException e){
        System.out.println("Sleep Interrupted");
      }
    }
  }
}

class Java extends Thread{
  private Shared s;
  private String n;
  public Java(Shared s, String n){
    this.s = s;
    this.n = n;
  }

  public void run(){
    for(int i = 0; i < n.length(); i++){
      s.JavaTurn(n.charAt(i));
      try{
        Thread.sleep(1000);
      }catch(Exception e){
        System.out.println("Sleep Interrupted");
      }
    }
  }
}
class World extends Thread{
  private String n;
  public World(String n){
    this.n = n;
  }

  public void run(){
    for(int i = 0; i < n.length(); i++){
      System.out.println(n.charAt(i));
      try{
        Thread.sleep(1000);
      }
      catch(Exception e){
        System.out.println("Sleep Interrupted");
      }
    }
  }
}
public class Main{
  public static void main(String[] args) throws Exception{
    Shared s = new Shared();
    Hello o1 = new Hello(s, "Hello");
    Java o2 = new Java(s, "Java");
    World o3 = new World("Hello");
    World o4 = new World("World");
    o1.start();
    o2.start();

    o1.join();
    o2.join();
    o4.start();
    //H e l l o W o r l d
    //o3.start();
    //o3.join();
    //o4.start();
  }
}
