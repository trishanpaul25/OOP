import java.util.Scanner;
class Staff{
  private int code;
  private String name;

  public Staff(int c, String s){
    this.code = c;
    this.name = s;
  }

  public void display(){
    System.out.println("Staff code : "+code);
    System.out.println("Staff name : "+name);
  }
}

class Teacher extends Staff{
  private int code;
  private String name;
  private String sub;
  private String pub;

  public Teacher(int c, String n, String sub, String pub){
    super(c,n);
    this.sub = sub;
    this.pub = pub;
  }
  public void display(){
    super.display();
    System.out.println("Subject : "+sub);
    System.out.println("publication : "+pub);
  }
}

class Officer extends Staff{
  private int code;
  private String name;
  private char g; 

  public Officer(int c, String n, char g){
    super(c,n);
    this.g = g;
  }
  public void display(){
    super.display();
    System.out.println("Grade : "+g);
  }
}

class Typist extends Staff{
  private int code;
  private String name;
  private int speed;

  public Typist(int c, String n,int s){
    super(c,n);
    this.speed = s;
  }
  public void display(){
    super.display();
    System.out.println("Speed : "+speed);
  }
}

class regTyp extends Typist{
  private int code;
  private String name;
  private int speed;
  private int rem;

  public regTyp(int c, String n, int s, int rem){
    super(c, n, s);
    this.rem = rem;
  }

  public void display(){
    super.display();
    System.out.println("rem : "+rem);
  }
}

class casTyp extends Typist{
  private int code;
  private String name;
  private int speed;
  private int wage;

  public casTyp(int c, String n, int s, int wage){
    super(c, n, s);
    this.wage = wage;
  }

  public void display(){
    super.display();
    System.out.println("wage : "+wage);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ch;
    do{
      System.out.println("1. Teacher\n2. Officer\n3. regular typ\n4. Casual typ\nexit");
      ch = sc.nextInt();

      switch (ch) {
        case 1:
          Teacher t = new Teacher(56, "Trishan", "Math", "Lol");
          t.display();
          break;
      case 2:
          Officer o = new Officer(56, "Trishan", 'A');
          o.display();
          break;
      case 3:
          regTyp r = new regTyp(56, "Trishan", 200, 2000);
          r.display();
          break;
      case 4:
          casTyp c = new casTyp(56, "Trishan", 123, 250);
          c.display();
          break;
      
        default:
          break;
      }
    }while(ch != 5);
  }
}  
