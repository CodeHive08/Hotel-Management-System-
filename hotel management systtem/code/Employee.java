import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class Employee extends JFrame{
    Employee(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        JTable table=new JTable();
        table.setBounds(10,34,980,450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);
        try{
        Conn conn=new Conn();
        String query="Select * from Employee";
            ResultSet result= conn.statement.executeQuery(query);
        table.setModel(DbUtils.resultSetToTableModel(result));

        }catch(Exception e){
            e.printStackTrace();
        }
        JButton back=new JButton("Back");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent E){
               setVisible(false);
            }
           }
           );
        JLabel label=new JLabel("Sr.No");
        label.setForeground(Color.WHITE);
        label.setBounds(41,11,40,19);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);
        JLabel label1=new JLabel("AGE");
        label1.setForeground(Color.WHITE);
        label1.setBounds(145,11,70,19);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);
        JLabel label2=new JLabel("NAME");
        label2.setForeground(Color.WHITE);
        label2.setBounds(250,11,50,19);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);
        JLabel label3=new JLabel("GENDER");
        label3.setForeground(Color.WHITE);
        label3.setBounds(358,11,50,19);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);
        JLabel label4=new JLabel("JOB");
        label4.setForeground(Color.WHITE);
        label4.setBounds(466,11,70,19);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4);
        JLabel label5=new JLabel("SALARY");
        label5.setForeground(Color.WHITE);
        label5.setBounds(566,11,70,19);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);
        JLabel label6=new JLabel("CONTACT");
        label6.setForeground(Color.WHITE);
        label6.setBounds(686,11,70,19);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label6);
        JLabel label7=new JLabel("MAIL");
        label7.setForeground(Color.WHITE);
        label7.setBounds(796,11,70,19);
        label7.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label7);
        JLabel label8=new JLabel("ID");
        label8.setForeground(Color.WHITE);
        label8.setBounds(900,11,70,19);
        label8.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label8);
        setLocation(430,100);
   setSize(1000,600);
   setLayout(null);
   setUndecorated(true);
   setVisible(true);
    }
    public static void main(String args[]){
  new Employee();
    }
}