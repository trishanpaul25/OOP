import java.util.Scanner;

class Myclass{
  public int abs(int x){
    if(x < 0){
      return (-1*x);
    }
    return x;
  }
  public float abs(float x){
    if(x < 0){
      return (-1*x);
    }
    return x;
  }
  public double abs(double x){
    if(x < 0){
      return (-1*x);
    }
    return x;
  }
}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Myclass obj;
      int ch;
      do{
        System.out.println("1. int\n2. float\n3. double\n4. exit\n");
        ch = sc.nextInt();
        switch (ch) {
          case 1:
            int x;
            x = sc.nextInt();
            obj = new Myclass();
            System.out.println(obj.abs(x));
            break;
          case 2:
            float y;
            y = sc.nextFloat();
            obj = new Myclass();
            System.out.println(obj.abs(y));
            break;
          case 3:
            double z;
            z = sc.nextDouble();
            obj = new Myclass();
            obj.abs(z);
            System.out.println(obj.abs(z));
            break;
          default:
            break;
        }
      }while(ch != 4);
}  
}
