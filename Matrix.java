import java.util.Scanner;

class Matrix{
  private int r,c;
  int[][] a;

  public Matrix(int n){
    r = c = n;
    this.a = new int[r][c];
  }

  public Matrix(int r, int c){
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


  public Matrix add(Matrix b){
    if(this.r != b.r || this.c != b.c) return null;

    Matrix sum = new Matrix(r, c);

    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        sum.a[i][j] = this.a[i][j] + b.a[i][j];
      }
    }
    return sum;
  }

  public Matrix multi(Matrix b){
    if(this.c != b.r) return null;
    Matrix m = new Matrix(this.r,b.c);
    for(int i = 0; i < this.r; i++){
      for(int j = 0; j < b.c; j++){
        for(int k = 0; k < this.c; k++){
          m.a[i][j] += this.a[i][k]*b.a[k][j];
        }
      }
    }
    return m;
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
      int r1 = sc.nextInt();
      int c1 = sc.nextInt();
      Matrix o = new Matrix(r1, c1);
      o.getData();
      o.display();
      int r2 = sc.nextInt();
      int c2 = sc.nextInt();
      Matrix b = new Matrix(r2,c2);
      b.getData();
      b.display();
      Matrix mul = o.multi(b);
      mul.display();
}  
}
