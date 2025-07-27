import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class Dashboard extends JFrame implements ActionListener{
    JButton add,rec;
    Dashboard(){
        super("Hotel Management System");
        rec=new JButton("Reception");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(Color.ORANGE);
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);
        add=new JButton("Admin");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(Color.ORANGE);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        setTitle("Hotel Management system");
        ImageIcon im1=new ImageIcon(ClassLoader.getSystemResource("icon/reception.png"));
        Image i3=im1.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon il=new ImageIcon(i3);
        JLabel lab=new JLabel(il);
        lab.setBounds(400,300,200,195);
        add(lab);
        ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2=im.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);
        ImageIcon i=new ImageIcon(i2);
        JLabel labe=new JLabel(i);
        labe.setBounds(850,300,200,195);
        add(labe);
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1=image.getImage().getScaledInstance(1950,1090,Image.SCALE_DEFAULT);
        ImageIcon img=new ImageIcon(i1);
        JLabel label=new JLabel(img);
        label.setBounds(0,0,1950,1090);
        add(label);
        setLayout(null);
        setSize(1950,1090);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
if(e.getSource()==rec){
new Reception();
setVisible(false);
}else{
    new Login2();
    setVisible(false);
}
    }
    public static void main(String args[]){
new Dashboard();
    }
}