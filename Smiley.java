import javax.swing.*;
import java.awt.*;

class Smiley extends JPanel{
  public void paintComponent(Graphics gr){
    super.paintComponent(gr);

    gr.setColor(Color.YELLOW);
    gr.fillOval(100,100,200,200);

    gr.setColor(Color.BLACK);
    gr.fillOval(150,150,20,20);
    gr.fillOval(230,150,20,20);

    gr.drawArc(150,180,100,50,180,180);
  }
}

public class Main {

  public static void main(String[] args) {
    JFrame f = new JFrame();
    Smiley s = new Smiley();
    f.setSize(500,500);
    f.setName("Trishan");
    f.setVisible(true);
    f.add(s);
  }
}
