import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField tf;
    double num1;
    String op;

    Calculator() {

        tf = new JTextField();
        add(tf, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4,4));

        String btn[] = {
            "7","8","9","+",
            "4","5","6","-",
            "1","2","3","*",
            "C","0","=","/"
        };

        for(String s : btn) {
            JButton b = new JButton(s);
            b.addActionListener(this);
            p.add(b);
        }

        add(p);

        setTitle("Calculator");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if("0123456789".contains(s)) {
            tf.setText(tf.getText() + s);
        }

        else if(s.equals("+") || s.equals("-")
                || s.equals("*") || s.equals("/")) {

            num1 = Double.parseDouble(tf.getText());
            op = s;
            tf.setText("");
        }

        else if(s.equals("=")) {

            double num2 = Double.parseDouble(tf.getText());
            double result = 0;

            switch(op) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            tf.setText(String.valueOf(result));
        }

        else if(s.equals("C")) {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
