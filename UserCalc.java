import java.awt.*;
import java.awt.event.*;

public class UserCalc{

   public void init(){
        Frame f1 = new Frame("Calculator");
        f1.setVisible(true);
        f1.setSize(400,400);
        f1.setLayout(new BorderLayout());

        Panel p1 = new Panel();

        TextArea t1 = new TextArea(9,9);

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button b10 = new Button("0");
        Button b11 = new Button(".");
        Button b12 = new Button("^");
        Button b13 = new Button("%");
        Button b14 = new Button("+");
        Button b15 = new Button("-");
        Button b16 = new Button("*");
        Button b17 = new Button("/");
        Button b18 = new Button("=");
        Button b19 = new Button("AC");
        Button b20 = new Button("clr");


        f1.add("North", t1);
        f1.add(p1);

        p1.setLayout(new GridLayout(5,4));

        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b10);
        p1.add(b11);
        p1.add(b12);
        p1.add(b13);
        p1.add(b14);
        p1.add(b15);
        p1.add(b16);
        p1.add(b17);
        p1.add(b18);
        p1.add(b19);
        p1.add(b20);

    }
    
}
