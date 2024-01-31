import javax.swing.*;
import java.awt.*;

//    TO DO: create an interface for a simple math computer

public class Main {

        public static void main(String[] args) {
            JFrame frame = new JFrame("Calculator");
            frame.setSize(300, 500);
            frame.setLocation(200, 200);
            LayoutManager manager = new FlowLayout();
            frame.setLayout(manager);
            frame.getContentPane().add(new JButton("1"));
            frame.getContentPane().add(new JButton("2"));
            frame.getContentPane().add(new JButton("3"));
            frame.getContentPane().add(new JButton("4"));
            frame.getContentPane().add(new JButton("5"));
            frame.getContentPane().add(new JButton("6"));
            frame.getContentPane().add(new JButton("7"));
            frame.getContentPane().add(new JButton("8"));
            frame.getContentPane().add(new JButton("9"));
            frame.getContentPane().add(new JButton("0"));
            frame.getContentPane().add(new JButton("+"));
            frame.getContentPane().add(new JButton("-"));
            frame.getContentPane().add(new JButton("/"));
            frame.getContentPane().add(new JButton("*"));
            frame.getContentPane().add(new JButton("="));
            frame.getContentPane().add(new JButton("C"));


        //    frame.getContentPane().add(new JLabel("*"));
//            frame.getContentPane().add(new TextField("    2"));
//            frame.getContentPane().add(new Container());
//            frame.getContentPane().add(new TextField("    3"));
//            int a = 1;
//            String A = Integer.toString(a);
//            int b = 2;
//            String B = Integer.toString(b);
//            int rez = a + b;
//            String R = Integer.toString(a+b);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }

}