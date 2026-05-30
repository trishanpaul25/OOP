import java.util.Scanner;
class Local{
  private int duration;
  public Local(int d){
    this.duration = d;
  }

  public double calculate(){
    int u = duration/3;
    if(duration % 3 != 0) u++;
    double rate = u*0.1/2;
    return rate;
  }
}

class Long{
  private int duration;
  private double time;
  private int std;
  public Long(int d, double t, int s){
    this.duration = d;
    this.time = t;
    this.std = s;
  }

  public double calculate(){
    if(time >=  24.0 || time < 0.0){
      System.out.println("Invalid time\n");
      return -1;
    }
    double rate = 0.0;
    if(time >= 6.00 && time <=22.00){
      if(std == 11){
        rate = duration*1/2;
      }
      else if(std == 22){
        rate = duration*1.5/2;
      }
      else if(std == 44){
        rate = duration*0.75/2;
      }
    }
    else if(time > 22.00 && time < 6.00){
      if(std == 11){
        rate = duration*0.5/2;
      }
      else if(std == 22){
        rate = duration*0.5/2;
      }
      else if(std == 44){
        rate = duration*0.4/2;
      }
    }

    return rate;
  }
}
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int ch;
    do{
      System.out.println("1. Local\n2. Long\n3. exit\n");
      ch = sc.nextInt();
      switch(ch){
        case 1:
          int d;
          System.out.print("Enter call duration : ");
          d = sc.nextInt();
          Local o1 = new Local(d);
          System.out.println("Local Call Bill : "+o1.calculate());
          break;
        case 2:
          int du,std;
          double time;
          System.out.print("Enter call duration : ");
          du = sc.nextInt();
          System.out.print("Enter call std : ");
          std = sc.nextInt();
          System.out.print("Enter call time : ");
          time = sc.nextDouble();
          Long o2 = new Long(du, time, std);
          if(o2.calculate() == -1.0){
            System.out.println("ENter valid time");
          }else System.out.println("Long call bill : "+o2.calculate());
          break;
      }
    }while(ch!=3);
  }
}  
