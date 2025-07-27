import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Admin extends JFrame{
    JButton add_Employee,add_Room,add_Drivers,logout,back,emp;
    Admin(){
       add_Employee=new JButton("ADD EMPLOYEE");
       add_Employee.setBounds(250,230,200,30);
       add_Employee.setBackground(Color.WHITE);
       add_Employee.setForeground(Color.BLACK);
       add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
       add_Employee.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
try{
new add_Employee();
}
catch(Exception E){
    E.getStackTrace();
}
        }
       });
       add(add_Employee);
       add_Room=new JButton("ADD ROOM");
       add_Room.setBounds(250,380,200,30);
       add_Room.setBackground(Color.WHITE);
       add_Room.setForeground(Color.BLACK);
       add_Room.setFont(new Font("Tahoma",Font.BOLD,15));
       add_Room.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
try{
new Add_Room();
}
catch(Exception E){
    E.getStackTrace();
}
        }
       });
       add(add_Room);
       add_Drivers=new JButton("ADD DRIVER");
       add_Drivers.setBounds(250,530,200,30);
       add_Drivers.setBackground(Color.WHITE);
       add_Drivers.setForeground(Color.BLACK);
       add_Drivers.setFont(new Font("Tahoma",Font.BOLD,15));
       add_Drivers.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
try{
new add_Driver();
}
catch(Exception E){
    E.getStackTrace();
}
        }
       });
       add(add_Drivers);
         emp=new JButton("ALL EMPLOYEE INFO");
        emp.setBounds(250,700,200,30);
        emp.setFont(new Font("Tahoma",Font.BOLD,15));
        emp.setBackground(Color.WHITE);
        emp.setForeground(Color.BLACK);
        add(emp);
        emp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    new Employee();
                }catch(Exception E){
                    E.getStackTrace();
                }
            }
        } );
       logout=new JButton("Logout");
       logout.setBounds(10,800,95,30);
       logout.setBackground(Color.BLACK);
       logout.setForeground(Color.WHITE);
       logout.setFont(new Font("Tahoma",Font.BOLD,15));
       logout.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
try{
    new Login();
    setVisible(false);
// System.exit(0);
}
catch(Exception E){
    E.getStackTrace();
}
        }
       });
       add(logout);
       back=new JButton("Back");
       back.setBounds(110,800,95,30);
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setFont(new Font("Tahoma",Font.BOLD,15));
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
       ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
       Image i=im.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
       ImageIcon img=new ImageIcon(i);
       JLabel label=new JLabel(img);
      label.setBounds(70,180,120,120);
      add(label);
      ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
      Image l2=l1.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
      ImageIcon l3=new ImageIcon(l2);
      JLabel labe=new JLabel(l3);
     labe.setBounds(70,340,120,120);
     add(labe);
     ImageIcon l=new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
     Image ll=l.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
     ImageIcon lll=new ImageIcon(ll);
     JLabel lab=new JLabel(lll);
    lab.setBounds(70,500,120,120);
    add(lab);
//    #############
        ImageIcon m=new ImageIcon(ClassLoader.getSystemResource("icon/emp.png"));
        Image mm=m.getImage().getScaledInstance(120, 120,Image.SCALE_DEFAULT);
        ImageIcon mmm=new ImageIcon(mm);
        JLabel leb=new JLabel(mmm);
        leb.setBounds(70,650,120,120);
        add(leb);

    ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
    Image i4=i3.getImage().getScaledInstance(400, 400,Image.SCALE_DEFAULT);
    ImageIcon i5=new ImageIcon(i4);
    JLabel lr=new JLabel(i5);
    lr.setBounds(1000,250,400,400);
    add(lr);
        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
    setSize(1950,1090);
    setUndecorated(true);
    setVisible(true);
    }
    public static void main(String args[]){
        new Admin();
    }
}