import java.util.Scanner;

class Car{
  public int speed;
  public Car(int speed){
    this.speed = speed;
  }

  public void printSpeed(){
    System.out.println("Car speed : "+speed);
  }

  public void carStart(){
    if(speed > 0){
      System.out.println("Car already started");
      return;
    }
    speed = 30;
    System.out.println("Car now started");
    printSpeed();
  }

  public void carSlow(){
    if(speed < 20){
      System.out.println("Cannot reduce car speed to negetive");
      return;
    }
    speed = speed - 20;
    System.out.println("Car speed reduced by 20");
    printSpeed();
  }

    public void carFast(){
    if(speed > 170){
      System.out.println("Cannot increase car speed more than 200");
      return;
    }
    speed = speed + 30;
    System.out.println("Car speed increased by 30");
    printSpeed();
  }
  
}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int speed = sc.nextInt();
      Car c = new Car(speed);

      c.carStart();
      c.carStart();
      c.carFast();
      c.carFast();
      c.carFast();
      c.carFast();
      c.carFast();
      c.carFast();
      c.carFast();
      c.carFast();
      c.carFast();
      c.carFast();
      c.carFast();
      c.carSlow();
      c.carSlow();
      c.carSlow();
      c.carSlow();
      c.carSlow();
      c.carSlow();
      c.carSlow();
      c.carSlow();
      c.carSlow();
      c.carSlow();
      c.carSlow();
      c.carSlow();
    }
  }  
