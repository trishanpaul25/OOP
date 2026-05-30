import java.util.Scanner;

class Box{
  private int w, h, l;
  public Box(){
    w = h = l = 1;
  }

  public Box(int s){
    this.w = s;
    this.h = s;
    this.l = s;
  }

  public Box(int w, int h, int l){
    this.w = w;
    this.h = h;
    this.l = l;
  }

  public int Volume(){
    return w*h*l;
  }
}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Box b;
      int ch;
      do{
      System.out.println("1. Default\n2. one\n3. all\n4. exit");
      ch = sc.nextInt();

      switch(ch){
        case 1 : b = new Box();
        System.out.println("Volume = "+b.Volume());
        break;
        case 2 :
        int s = sc.nextInt();
        b = new Box(s);
        System.out.println("Volume = "+b.Volume());
        break;
        case 3 :
        int w,l,h;
        w = sc.nextInt();
        h = sc.nextInt();
        l = sc.nextInt();
        b = new Box(w,h,l);
        System.out.println("Volume = "+b.Volume());
        break;
      }
      }while(ch != 4);
    }
}  
