import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DrawPanel extends JPanel {

    Color color = Color.BLACK;
    String shape = "Rectangle";

    public void setData(Color c, String s) {
        color = c;
        shape = s;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);

        if(shape.equals("Rectangle")) {
            g.fillRect(100, 50, 150, 100);
        }
        else if(shape.equals("Oval")) {
            g.fillOval(100, 50, 180, 100);
        }
        else if(shape.equals("Circle")) {
            g.fillOval(100, 50, 120, 120);
        }
    }
}

public class ShapeDrawer extends JFrame implements ActionListener {

    JTextField rField, gField, bField;
    JComboBox<String> shapeBox;
    DrawPanel panel;

    ShapeDrawer() {

        setLayout(new BorderLayout());

        JPanel top = new JPanel();

        rField = new JTextField(5);
        gField = new JTextField(5);
        bField = new JTextField(5);

        top.add(new JLabel("R"));
        top.add(rField);

        top.add(new JLabel("G"));
        top.add(gField);

        top.add(new JLabel("B"));
        top.add(bField);

        shapeBox = new JComboBox<>(
            new String[]{"Rectangle","Oval","Circle"}
        );

        top.add(shapeBox);

        JButton btn = new JButton("Draw");
        btn.addActionListener(this);
        top.add(btn);

        add(top, BorderLayout.NORTH);

        panel = new DrawPanel();
        add(panel, BorderLayout.CENTER);

        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            int r = Integer.parseInt(rField.getText());
            int g = Integer.parseInt(gField.getText());
            int b = Integer.parseInt(bField.getText());

            if(r < 0 || r > 255 ||
               g < 0 || g > 255 ||
               b < 0 || b > 255) {

                JOptionPane.showMessageDialog(
                    this,
                    "RGB values must be between 0 and 255"
                );
                return;
            }

            panel.setData(
                new Color(r,g,b),
                (String)shapeBox.getSelectedItem()
            );

        } catch(NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                this,
                "Enter valid numbers"
            );
        }
    }

    public static void main(String[] args) {
        new ShapeDrawer();
    }
}
