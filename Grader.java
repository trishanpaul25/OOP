import java.util.Scanner;
class Grader{
  private int score;
  public Grader(int score){
    this.score = score;
  }

  public void letterGrade(){
    if(score < 0 || score > 100){
      System.out.print("Invalid score\n");
      return;
    }

    if(score >= 90) {
      System.out.println("Grade = O");
      return;
    }
    if(score >= 80) {
      System.out.println("Grade = E");
      return;
    }
    if(score >= 70) {
      System.out.println("Grade = A");
      return;
    }
    if(score >= 60) {
      System.out.println("Grade = B");
      return;
    }
    if(score >= 50) {
      System.out.println("Grade = C");
      return;
    }
    if(score < 50) {
      System.out.println("Grade = F");
      return;
    }
  }
}
public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter score : ");
      int score = sc.nextInt();
      Grader g = new Grader(score);
      g.letterGrade();
    }
}  
