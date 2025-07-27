import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;

class Room extends JFrame {
    JTable table;
    JButton back;
    Room(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
       panel.setBackground(new Color(3,45,48));
       panel.setLayout(null);
       add(panel);
       ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
       Image i=img.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
       ImageIcon i1=new ImageIcon(i);
       JLabel label=new JLabel(i1);
       label.setBounds(600,200,200,200);
       panel.add(label);
       table=new JTable();
       table.setBounds(10,40,500,400);
       table.setBackground(new Color(3,45,48));
       table.setForeground(Color.WHITE);
       panel.add(table);
         try{
        Conn conn=new Conn();
        String query="select * from rooms";
        ResultSet result=conn.statement.executeQuery(query);
        table.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception e){
            e.printStackTrace();
        }
       back=new JButton("BACK");
       back.setBounds(200,500,120,30);
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent E){
            setVisible(false);
        }
       });
       panel.add(back);
       JLabel label1=new JLabel("Availability");
       label1.setBounds(117,15,80,19);
       label1.setForeground(Color.WHITE);
       label1.setFont(new Font("Tahoma",Font.BOLD,14));
       panel.add(label1);

       JLabel label2=new JLabel("RoomService");
       label2.setBounds(210,15,150,19);
       label2.setForeground(Color.WHITE);
       label2.setFont(new Font("Tahoma",Font.BOLD,14));
       panel.add(label2);
       JLabel label3=new JLabel("Price");
       label3.setBounds(330,15,80,19);
       label3.setForeground(Color.WHITE);
       label3.setFont(new Font("Tahoma",Font.BOLD,14));
       panel.add(label3);
       JLabel label4=new JLabel("Bed Type");
       label4.setBounds(417,15,80,19);
       label4.setForeground(Color.WHITE);
       label4.setFont(new Font("Tahoma",Font.BOLD,14));
       panel.add(label4);
       JLabel label5=new JLabel("Room NO.");
       label5.setBounds(12,15,80,19);
       label5.setForeground(Color.WHITE);
       label5.setFont(new Font("Tahoma",Font.BOLD,14));
       panel.add(label5);
        setSize(900,600);
        setLocation(500,100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }
public static void main(String args[]){
    new Room();
}
}