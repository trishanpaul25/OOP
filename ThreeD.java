import java.util.*;
abstract class ThreeD{
  protected double w,h,l;

  public abstract double area();

  public abstract double volume();
}

class Box extends ThreeD{
    public Box(double w, double l, double h){
    this.w = w;
    this.l = l;
    this.h = h;
  }

  public double area(){
    return 2*(w*l + w*h + l*h);
  }

  public double volume(){
    return w*l*h;
  }
}

class Cube extends ThreeD{
  public Cube(double s){
    this.w = s;
  }

  public double area(){
    return 6*w*w;
  }

  public double volume(){
    return w*w*w;
  }
}

class Cylinder extends ThreeD{
  public Cylinder(double r, double h){
    this.w = r;
    this.h = h;
  }

  public double area(){
    return 2*3.14*w*h;
  }

  public double volume(){
    return 3.14*w*w*h;
  }
}

class Cone extends ThreeD{
  public Cone(double r, double h){
    this.w = r;
    this.h = h;
    this.l = Math.sqrt(r*r + h*h);
  }

  public double area(){
    return Math.PI*w*l;
  }

  public double volume(){
    return 1.0/3*Math.PI*w*w*h;
  }
}


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ch;
    ThreeD o;
    double w,l,h;
    do{
      System.out.println("1. Box\n2. Cube\n3. Cyl\n4. Cone\n5.exit");
      ch = sc.nextInt();

      switch (ch) {
        case 1:
          w = sc.nextDouble();
          l = sc.nextDouble();
          h = sc.nextDouble();
          o = new Box(w,l,h);
          System.out.println("Box area = "+o.area()+" Volume = "+o.volume());
          break;
        case 2:
          w = sc.nextDouble();
          o = new Cube(w);
          System.out.println("Cube area = "+o.area()+" Volume = "+o.volume());
          break;
        case 3:
          w = sc.nextDouble();
          h = sc.nextDouble();
          o = new Cylinder(w,h);
          System.out.println("Cylinder area = "+o.area()+" Volume = "+o.volume());
          break;
        case 4:
          w = sc.nextDouble();
          h = sc.nextDouble();
          o = new Cone(w,h);
          System.out.println("Cone area = "+o.area()+" Volume = "+o.volume());
          break;
      
        default:
          break;
      }
    }while (ch!=5);
  }
}
