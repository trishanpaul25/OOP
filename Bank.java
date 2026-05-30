import java.util.Scanner;

class Bank{
  
  private String name;
  private int no;
  private char type;
  private double bal;
  
  public void open(String name, int no, char type, double bal){
    this.name = name;
    this.no = no;
    this.type = type;
    this.bal = bal;
  }

  public void deposit(double amt){
    bal = bal+amt;
    System.out.println("Deposit successful");
  }

  public void withdraw(double amt){
    if(type == 'S' && bal-amt < 1000 || type == 'C' && bal-amt < 25000){
      System.out.println("Min balance not maintained");
      return;
    }
    bal = bal - amt;
    System.out.println("Withdrawal Successful");
  }

  public void display(){
    System.out.println("Name : "+name);
    System.out.println("balance : "+bal);
  }

}
public class Main {
  public static void main(String[] args) {
      Bank b = new Bank();
      b.open("Trishan", 56, 'S', 2000);
      b.deposit(10000);
      b.withdraw(5000);
      b.withdraw(6100);
      b.display();
    }
}  
