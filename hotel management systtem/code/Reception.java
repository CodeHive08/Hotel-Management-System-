import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Reception extends JFrame{
  JButton logout,back;
    Reception(){
        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(280,5,1238,1080);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,270,1080);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i3=im1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon il=new ImageIcon(i3);
        JLabel lab=new JLabel(il);
        lab.setBounds(300,20,800,800);
        panel1.add(lab);
        ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i=im.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon ig=new ImageIcon(i);
        JLabel label=new JLabel(ig);
        label.setBounds(5,530,200,195);
        panel.add(label);
        JButton ncf=new JButton("New Customer Form");
        ncf.setBounds(30,30,200,30);
        ncf.setBackground(Color.BLACK);
        ncf.setForeground(Color.WHITE);
        panel.add(ncf);
        ncf.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
      try{
new NewCustomer();
      }catch(Exception E){
        E.getStackTrace();
      }
          }
        } );
        JButton room=new JButton("Room");
        room.setBounds(30,70,200,30);
        room.setBackground(Color.BLACK);
        room.setForeground(Color.WHITE);
        panel.add(room);
        room.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
      try{
new Room();
      }catch(Exception E){
        E.getStackTrace();
      }
          }
        } );
        JButton dept=new JButton("Travelling");
        dept.setBounds(30,110,200,30);
        dept.setBackground(Color.BLACK);
        dept.setForeground(Color.WHITE);
        panel.add(dept);
        dept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Splash1(Reception.this);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        JButton cus=new JButton("Customer Info");
        cus.setBounds(30,150,200,30);
        cus.setBackground(Color.BLACK);
        cus.setForeground(Color.WHITE);
        panel.add(cus);
        cus.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
      try{
new CustomerInfo();
      }catch(Exception E){
        E.getStackTrace();
      }
          }
        } );
        JButton man=new JButton("Manager Info");
        man.setBounds(30,190,200,30);
        man.setForeground(Color.WHITE);
        man.setBackground(Color.BLACK);
        panel.add(man);
        man.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
      try{
    new ManagerInfo();
      }catch(Exception E){
        E.getStackTrace();
      }
          }
        } );
        JButton co=new JButton("Checkout");
        co.setBounds(30,230,200,30);
        co.setBackground(Color.BLACK);
        co.setForeground(Color.WHITE);
        panel.add(co);
        co.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
      try{
new CheckOut();
      }catch(Exception E){
        E.getStackTrace();
      }
          }
        } );
        JButton up=new JButton("Update Check-In Details");
        up.setBounds(30,270,200,30);
        up.setBackground(Color.BLACK);
        up.setForeground(Color.WHITE);
        panel.add(up);
        up.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
      try{
new UpdateCheck();
      }catch(Exception E){
        E.getStackTrace();
      }
          }
        } );
        JButton rs=new JButton("Update Room Status");
        rs.setBounds(30,310,200,30);
        rs.setBackground(Color.BLACK);
        rs.setForeground(Color.WHITE);
        panel.add(rs);
        rs.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
      try{
new UpdateRoom();
      }catch(Exception E){
        E.getStackTrace();
      }
          }
        } );
        JButton ps=new JButton("Pick up Service");
        ps.setBounds(30,350,200,30);
        ps.setBackground(Color.BLACK);
        ps.setForeground(Color.WHITE);
        panel.add(ps);
        ps.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
      try{
new PickUp();
      }catch(Exception E){
        E.getStackTrace();
      }
          }
        } );
        JButton sr=new JButton("Search Room");
        sr.setBounds(30,390,200,30);
        sr.setBackground(Color.BLACK);
        sr.setForeground(Color.WHITE);
        panel.add(sr);
        sr.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e){
      try{
new SearchRoom();
      }catch(Exception E){
        E.getStackTrace();
      }
          }
        } );
        getContentPane().setBackground(Color.WHITE);
        logout=new JButton("Logout");
       logout.setBounds(30,470,95,30);
       logout.setBackground(Color.BLACK);
       logout.setForeground(Color.WHITE);
       logout.setFont(new Font("Tahoma",Font.PLAIN,15));
       logout.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
try{
    new Login();
    setVisible(false);

}
catch(Exception E){
    E.getStackTrace();
}
        }
       });
       add(logout);
       back=new JButton("Back");
       back.setBounds(140,470,95,30);
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setFont(new Font("Tahoma",Font.PLAIN,15));
       back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
try{
new Dashboard();
setVisible(false);
}
catch(Exception E){
    E.getStackTrace();
}
        }
       });
       add(back);
    
        setLayout(null);
setSize(1950,1090);
setUndecorated(true);
setVisible(true);

    }
public static void main(String args[]){
  new Reception();
    }
}