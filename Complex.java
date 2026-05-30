import java.util.Scanner;
class Complex{
  private int real,img;
  public Complex(int x, int y){
    this.real = x;
    this.img = y;
  }

  public void printComp(){
    System.out.println("Complex num : "+real+" + "+"i"+img);
  }

  public Complex addComp(Complex a){
    int realR = this.real + a.real;
    int imgR = this.img + a.img;
    return new Complex(realR, imgR);
  }

  public Complex SubComp(Complex a){
    int realR = this.real - a.real;
    int imgR = this.img - a.img;
    return new Complex(realR, imgR);
  }

  public Complex MultiComp(Complex a){
    int realR = (this.real*a.real)-(this.img*a.img);
    int imgR = (this.real*a.img)+(this.img*a.real);

    return new Complex(realR, imgR);
  }
}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Complex c1 = new Complex(2, 3);
      Complex c2 = new Complex(4, 5);
      Complex res;

      int ch;
      do{
        System.out.println("1. Sum\n2. Sub\n3. Multi\n4. exit\n");
        System.out.print("Enter your choice : ");
        ch = sc.nextInt();
        switch(ch){
          case 1 : res = c1.addComp(c2);
          res.printComp();
          break;
          case 2 : res = c1.SubComp(c2);
          res.printComp();
          break;
          case 3 : res = c1.MultiComp(c2);
          res.printComp();
          break;
          }
      }while(ch != 4);
    }
  }  
