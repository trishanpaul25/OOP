import java.util.Scanner;
class vehicle{

  protected String num;
  protected int speed;
  protected String col, owner;
  public vehicle(String num,int speed, String col, String owner){
    this.num = num;
    this.speed = speed;
    this.col = col;
    this.owner = owner;
  }

  public void showData(){
    System.out.println("License Number : "+num);
    System.out.println("vehicle speed : "+speed);
    System.out.println("vehicle color : "+col);
    System.out.println("vehicle owner : "+owner);
  }
}

class Bus extends vehicle{
  protected String num;
  protected int speed;
  protected String col, owner;
  protected int route;

  public Bus(String num,int speed, String col, String owner, int route){
    super(num, speed, col, owner);
    this.route = route;
  }
  public void showData(){
    super.showData();
    System.out.println("Bus route number : "+route);
  }
}

class Car extends vehicle{
  protected String num;
  protected int speed;
  protected String col, owner;
  protected String manu;

   public Car(String num,int speed, String col, String owner, String manu){
    super(num, speed, col, owner);
    this.manu = manu;
  }
  public void showData(){
    super.showData();
    System.out.println("Manufacturer name  : "+manu);
  }
}
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ch;
    do{
      System.out.println("1. Bus\n2. Car\nexit");
      ch = sc.nextInt();

      switch (ch) {
        case 1:
          Bus t = new Bus("TP56",80 , "Orange", "Trishan",3);
          t.showData();
          break;
      case 2:
          Car o = new Car("Tiyasha14",120,"Cherry red","Tiyasha","Trishan");
          o.showData();
          break;
        default:
          break;
      }
    }while(ch != 5);
  }
}  
