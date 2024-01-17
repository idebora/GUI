import javax.swing.*;
import java.awt.*;

//    TO DO: create an interface for an simple math computer

public class Main {

        public static void main(String[] args) {
            JFrame frame = new JFrame("Calculator");
            frame.setSize(500, 400);
            frame.setLocation(200, 200);
            LayoutManager manager = new FlowLayout();
            frame.setLayout(manager);
            frame.getContentPane().add(new TextField("    1"));
            frame.getContentPane().add(new JLabel("+"));
            frame.getContentPane().add(new TextField("    2"));
            frame.getContentPane().add(new JLabel("="));
            frame.getContentPane().add(new TextField("    3"));
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