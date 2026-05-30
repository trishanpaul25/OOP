import java.util.Scanner;

class op{
  private int[] a;
  public op(int n){
    this.a = new int[n];
  }

  int top = -1;
  public void push(int x){
    if(top >= a.length -1){
      System.out.println("check");
      return;
    }
    a[++top] = x;
  }

  public int pop(){
    if(top == -1){
      return -1;
    }

    return a[top--];

  }

  public int peek(){
    if(top == -1){
      return -1;
    }

    return a[top];
  }

  public void display(){
    for(int i = top; i >= 0; i--){
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }

}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      op c = new op(n);
      c.push(1);
      c.push(2);
      c.push(3);
      c.push(4);
      c.push(5);
      c.push(6);
      System.out.println(c.peek());
      c.display();
      c.pop();
      c.pop();
      c.pop();
      c.pop();
      c.display();
}  
}
