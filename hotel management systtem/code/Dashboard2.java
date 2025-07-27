import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Dashboard2 extends JFrame{
    Dashboard2(){
       setLayout(null);
       setBounds(0,0,1600,1000);
       JPanel p1=new JPanel();
       p1.setLayout(null);
       p1.setBackground(new Color(0,0,102));
       p1.setBounds(0,0,1600,63);
       add(p1);
       ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
       Image l2=l1.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);
       ImageIcon l3=new ImageIcon(l2);
       JLabel labe=new JLabel(l3);
     labe.setBounds(5,0,70,70);
     p1.add(labe);
JLabel heading=new JLabel("Dashboard");
heading.setBounds(80,10,300,40);
heading.setForeground(Color.WHITE);
heading.setFont(new Font("Tahoma",Font.BOLD,30));
p1.add(heading);
JPanel p2=new JPanel();
       p2.setLayout(null);
       p2.setBackground(new Color(0,0,102));
       p2.setBounds(0,65,300,900);
       add(p2);
JButton add_persondetails= new JButton("Add Person Details");
add_persondetails.setBounds(0,0,300,50);
add_persondetails.setBackground(new Color(0,0,102));
add_persondetails.setFont(new Font("Tahoma",Font.PLAIN,20));
add_persondetails.setMargin(new Insets(0,0,0,60));
add_persondetails.setForeground(Color.WHITE);
add_persondetails.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e){
try{
new AddCustomer();
}catch(Exception E){
  E.getStackTrace();
}
    }
  } );
p2.add(add_persondetails);

JButton upd_persondetails= new JButton("Update Person Details");
upd_persondetails.setBounds(0,50,300,50);
upd_persondetails.setBackground(new Color(0,0,102));
upd_persondetails.setFont(new Font("Tahoma",Font.PLAIN,20));
upd_persondetails.setMargin(new Insets(0,0,0,60));
upd_persondetails.setForeground(Color.WHITE);
upd_persondetails.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e){
try{
new UpdateCustomer();
}catch(Exception E){
E.getStackTrace();
}
  }
} );
p2.add(upd_persondetails);

JButton view_persondetails= new JButton("Customers_History");
view_persondetails.setBounds(0,100,300,50);
view_persondetails.setBackground(new Color(0,0,102));
view_persondetails.setFont(new Font("Tahoma",Font.PLAIN,20));
view_persondetails.setMargin(new Insets(0,0,0,120));
view_persondetails.setForeground(Color.WHITE);
view_persondetails.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e){
try{
new Customers_history();
}catch(Exception E){
E.getStackTrace();
}
  }
} );
p2.add(view_persondetails);

JButton del_persondetails= new JButton("Delete Person Details");
del_persondetails.setBounds(0,150,300,50);
del_persondetails.setBackground(new Color(0,0,102));
del_persondetails.setFont(new Font("Tahoma",Font.PLAIN,20));
del_persondetails.setMargin(new Insets(0,0,0,40));
del_persondetails.setForeground(Color.WHITE);
del_persondetails.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
      try {
          DeleteCustomer deleteCustomer = new DeleteCustomer();
          deleteCustomer.setVisible(true);
      } catch (Exception ex) {
          ex.printStackTrace();
      }
  }
});
p2.add(del_persondetails);

JButton check= new JButton("Check Packages");
check.setBounds(0,200,300,50);
check.setBackground(new Color(0,0,102));
check.setFont(new Font("Tahoma",Font.PLAIN,20));
check.setMargin(new Insets(0,0,0,110));
check.setForeground(Color.WHITE);
check.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e){
try{
new Checkpackage();
}catch(Exception E){
E.getStackTrace();
}
  }
} );
p2.add(check);

JButton book= new JButton("Book Package");
book.setBounds(0,250,300,50);
book.setBackground(new Color(0,0,102));
book.setFont(new Font("Tahoma",Font.PLAIN,20));
book.setMargin(new Insets(0,0,0,120));
book.setForeground(Color.WHITE);
book.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            BookPackage bookpackage = new BookPackage();
            bookpackage.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
});
p2.add(book);
JButton payments = new JButton("Payments");
payments.setBounds(0,300,300,50);
payments.setBackground(new Color(0,0,102));
payments.setFont(new Font("Tahoma",Font.PLAIN,20));
payments.setMargin(new Insets(0,0,0,155));
payments.setForeground(Color.WHITE);
payments.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e){
try{
new Payment();
}catch(Exception E){
E.getStackTrace();
}
  }
} );
p2.add(payments);


JButton calc= new JButton("Calculator");
calc.setBounds(0,350,300,50);
calc.setBackground(new Color(0,0,102));
calc.setFont(new Font("Tahoma",Font.PLAIN,20));
calc.setMargin(new Insets(0,0,0,145));
calc.setForeground(Color.WHITE);
calc.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e){
try{
Runtime.getRuntime().exec("calc.exe");
}catch(Exception E){
E.getStackTrace();
}
  }
} );
p2.add(calc);

JButton note= new JButton("Notepad");
note.setBounds(0,400,300,50);
note.setBackground(new Color(0,0,102));
note.setFont(new Font("Tahoma",Font.PLAIN,20));
note.setMargin(new Insets(0,0,0,145));
note.setForeground(Color.WHITE);
note.addActionListener(new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e){
try{
Runtime.getRuntime().exec("notepad.exe");
}catch(Exception E){
E.getStackTrace();
}
  }
} );
p2.add(note);

JButton back=new JButton("Back");
back.setBounds(20,500,95,30);
back.setBackground(new Color(0,0,102));
back.setForeground(Color.WHITE);
back.setFont(new Font("Tahoma",Font.BOLD,15));
back.addActionListener(new ActionListener() {
 @Override
 public void actionPerformed(ActionEvent e){
try{
new Reception();
setVisible(false);
}
catch(Exception E){
E.getStackTrace();
}
 }
});
p2.add(back);

ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/home.jpg"));
Image i2=i1.getImage().getScaledInstance(1650, 1000,Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel lab=new JLabel(i3);
lab.setBounds(0,0,1650,1000);
add(lab);

JLabel text=new JLabel("Welcome To Travelling Section");
text.setBounds(400,70,1200,70);
text.setForeground(Color.WHITE);
text.setFont(new Font("Raleway",Font.PLAIN,55));
lab.add(text);
setUndecorated(true);
     setVisible(true);
    }
    public static void main(String args[]){
new Dashboard2();
    }
}