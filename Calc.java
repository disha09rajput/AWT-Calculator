import java.awt.*;
import java.awt.event.*;

class Calc
{
   public static void main(String[] args) {
    Frame f = new Frame("CALCULTOR OF DIRECTIONS");
    f.setVisible(true);
    f.setSize(500,500);

    Color c1 = new Color(4,61,255);
    Font f1 = new Font("Helvetica",Font.BOLD,20);

    Label l1 = new Label("Login To Use"); 
    l1.setFont(f1);
    l1.setForeground(c1);

    Label l2 = new Label("Username"); 
    Label l3 = new Label("Password"); 

    TextField t1 = new TextField(15); 
    TextField t2 = new TextField(15); 

    Button b1 = new Button("Login"); 

    f.add(l1); l1.setBounds(180,90,150,30);
    f.add(l2); l2.setBounds(180,130,100,30);
    f.add(t1); t1.setBounds(180,160,120,30);
    f.add(l3); l3.setBounds(180,190,100,30);
    f.add(t2); t2.setBounds(180,220,120,30);
    f.add(b1); b1.setBounds(180,250,120,30);

    f.setLayout(null);



    b1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        // t1, t2
        String username = t1.getText();
        String password = t2.getText();

        if(username.equals("Disha") && password.equals("12345")){     // equals()
          System.out.println("Correct");
          
          UserCalc u = new UserCalc();
          u.init();
          
        }
        else{
          System.out.println("InCorrect");
        }

      }
    });



    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }
    });

  }
}
