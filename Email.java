import java.util.*;
class Email{
  public static void emailVal(String x){
    int at = x.indexOf('@');
    int lat = x.lastIndexOf('@');
    if(x.contains(" ")||!x.endsWith("@gmail.com")||at != lat){
      throw new IllegalArgumentException("Invalid email");
    }
    else System.out.println("Valid email");
  } 
}


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String x = sc.nextLine();
    try{
      Email.emailVal(x);
    }catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
  }    
}
