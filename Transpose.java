import java.util.Scanner;

class Transpose{
  private int r,c;
  int[][] a;

  public Transpose(int r, int c){
    this.r = r;
    this.c = c;
    this.a = new int[r][c];
  }

  public void getData(){
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
          a[i][j] = sc.nextInt();
        }
      }
  }


  public Transpose tran(){
    Transpose t = new Transpose(c, r);
    for(int i = 0; i < c; i++){
      for(int j = 0; j < r; j++){
        t.a[i][j] = a[j][i];
      }
    }
    return t;
  }

  public void display(){
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }

}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();
      Transpose o = new Transpose(r, c);
      o.getData();
      o.display();;
      Transpose t = o.tran();
      t.display();
}  
}
