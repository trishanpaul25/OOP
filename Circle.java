import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Con extends JPanel{
  public void paintComponent(Graphics gr){
    super.paintComponent(gr);

    Random ra = new Random();

    int cX = 250, cY = 250;
    for(int i = 100; i > 0; i -= 10){
      int r = ra.nextInt(256);
      int g = ra.nextInt(256);
      int b = ra.nextInt(256);

      gr.setColor(new Color(r,g,b));
      gr.drawOval(cX-i,cY-i,i*2,i*2);
    }
  }
}

public class Main {

  public static void main(String[] args) {
    JFrame f = new JFrame();
    Con s = new Con();
    f.setSize(500,500);
    f.setName("Trishan");
    f.setVisible(true);
    f.add(s);
  }
}
