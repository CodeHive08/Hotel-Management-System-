import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class option extends JFrame implements ActionListener{
      
    JButton b1;
    JButton b2;
 
    option() {
        JLabel var1 = new JLabel("Select an  option from below:");
        var1.setFont(new Font("Tahoma",Font.BOLD,18));
               var1.setForeground(Color.WHITE);
    var1.setBounds(40, 20, 280, 30);
        add(var1);
        setLayout(null);
       setLocation(550, 200);
       setSize(600, 300);
       setUndecorated(true);
       setVisible(true);
     
       this.b1 = new JButton("Active");
       this.b1.setBounds(40, 140, 130, 30);
       this.b1.setFont(new Font("Serif", 1, 15));
       this.b1.setBackground(Color.BLACK);
       this.b1.setForeground(Color.WHITE);
       this.b1.addActionListener(this);
       this.add(this.b1);
       this.b2 = new JButton("Past customers");
       this.b2.setBounds(180, 140, 160, 30);
       this.b2.setFont(new Font("Serif", 1, 15));
       this.b2.setBackground(Color.BLACK);
       this.b2.setForeground(Color.WHITE);
       this.add(this.b2);
       this.b2.addActionListener(this);
       this.b2 = new JButton("Cancel");
       getContentPane().setBackground(new Color(3, 45, 48));
       
    }
 
    public void actionPerformed(ActionEvent var1) {
       if (var1.getSource() == this.b1) {
          try {
            new CustomerInfo();
             this.setVisible(false);
          } catch (Exception var3) {
             var3.getStackTrace();
          }
       } else {
          new past();
          this.setVisible(false);
       }
 
    }
 
    public static void main(String[] var0) {
       new option();
    }
}