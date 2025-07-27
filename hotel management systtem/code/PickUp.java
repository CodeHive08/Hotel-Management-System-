import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class PickUp extends JFrame{
    PickUp(){
        JPanel panel=new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,790,590);
        panel.setLayout(null);
        add(panel);
        
        JLabel label1=new JLabel("Pick Up Service");
        label1.setBounds(90,11,160,25);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label1);
        JLabel label2=new JLabel("Type of Car");
        label2.setBounds(32,97,89,20);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label2);

Choice c=new Choice();
c.setBounds(123,94,150,25);
panel.add(c);
try{
    Conn C=new Conn();
ResultSet result=C.statement.executeQuery("select * from driver");
while(result.next()){
    c.add(result.getString("company"));
}

}catch(Exception e){
    e.printStackTrace();
}
JTable table=new JTable();
table.setBounds(10,233,800,250);
table.setBackground(new Color(3,45,48));
table.setForeground(Color.WHITE);
panel.add(table);
try{
Conn C=new Conn();
String q="select * from driver";
ResultSet result=C.statement.executeQuery(q);
table.setModel(DbUtils.resultSetToTableModel(result));
}
catch(Exception e){
e.printStackTrace();
}    


JLabel label3=new JLabel("Name");
label3.setBounds(24,208,46,14);
label3.setForeground(Color.WHITE);
panel.add(label3);

JLabel label4=new JLabel("Age");
label4.setBounds(165,208,46,14);
label4.setForeground(Color.WHITE);
panel.add(label4);

JLabel label5=new JLabel("Gender");
label5.setBounds(264,208,46,14);
label5.setForeground(Color.WHITE);
panel.add(label5);

JLabel label6=new JLabel("Company");
label6.setBounds(366,208,100,14);
label6.setForeground(Color.WHITE);
panel.add(label6);

JLabel label7=new JLabel("Car Name");
label7.setBounds(486,208,100,14);
label7.setForeground(Color.WHITE);
panel.add(label7);

JLabel label8=new JLabel("Available");
label8.setBounds(600,208,100,14);
label8.setForeground(Color.WHITE);
panel.add(label8);

JLabel label9=new JLabel("Location");
label9.setBounds(700,208,100,14);
label9.setForeground(Color.WHITE);
panel.add(label9);
JButton display=new JButton("Display");
display.setBounds(200,500,120,30);
display.setBackground(Color.BLACK);
display.setForeground(Color.WHITE);
panel.add(display);
display.addActionListener(new ActionListener(){
@Override
public void actionPerformed(ActionEvent E){
String q="select * from driver where company='"+c.getSelectedItem()+"'";
try{
Conn c=new Conn();
ResultSet result=c.statement.executeQuery(q);
table.setModel(DbUtils.resultSetToTableModel(result));
}catch(Exception e){
    e.printStackTrace();
}
}
});
JButton back=new JButton("Back");
back.setBounds(420,500,120,30);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
panel.add(back);
back.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent E){
        setVisible(false);
    }

});
setLayout(null);
        setSize(800,600);
        setLocation(500,100);
        setUndecorated(true);
     setVisible(true);
    }
    public static void main(String args[]){
new PickUp();
    }
}