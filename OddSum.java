import java.util.Scanner;

class oddSum{
  private int r,c;
  int[][] a;

  public oddSum(int r, int c){
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


  public void sum(){
    int s = 0;
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        if(a[i][j] % 2 != 0){
          s = s+a[i][j];
        }
      }
    }
    System.out.println("Odd sum = "+s);
  }

}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();
      oddSum o = new oddSum(r, c);
      o.getData();
      o.sum();
}  
}
