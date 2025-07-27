// import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class past extends JFrame{
   past(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        JTable table=new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);
      /*   try{
Conn c=new Conn();
String q="Select * from Customer";
ResultSet result=c.statement.executeQuery(q);
table.setModel(DbUtils.resultSetToTableModel(result));

        }
        catch(Exception e){
            e.printStackTrace();
        }*/
        JLabel label1=new JLabel("ID");
        label1.setBounds(31,11,100,25);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);
        
        JLabel label2=new JLabel("Number");
        label2.setBounds(150,11,100,25);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JLabel label3=new JLabel("Name");
        label3.setBounds(270,11,100,25);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4=new JLabel("Gender");
        label4.setBounds(360,11,100,25);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4);

        JLabel label5=new JLabel("Country");
        label5.setBounds(480,11,100,25);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);


        JLabel label6=new JLabel("Room");
        label6.setBounds(600,11,100,25);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label6);

        JLabel label7=new JLabel("CI Time");
        label7.setBounds(680,11,100,25);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label7);

        JLabel label8=new JLabel("COUT TIME");
        label8.setBounds(800,11,100,25);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label8);

        JButton back=new JButton("Back");
        back.setBounds(450,510,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent E){
                setVisible(false);
            }
        });
        panel.add(back);

setUndecorated(true);
        setSize(900,600);
        setLayout(null);
        setLocation(500,100);
         setVisible(true);
    }
    public static void main(String args[]){
        new past();
    }
}