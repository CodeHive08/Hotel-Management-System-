import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class SearchRoom extends JFrame implements ActionListener{
    JCheckBox checkbox;
    Choice choice;
    JTable table;
    JButton add,back;
    SearchRoom(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        JLabel search=new JLabel("Search For Room");
        search.setBounds(250,11,186,31);
        search.setForeground(Color.WHITE);
        search.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(search);


        JLabel rbt=new JLabel("Room Bed Type");
        rbt.setBounds(50,73,120,20);
        rbt.setForeground(Color.WHITE);
        rbt.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rbt);

        JLabel rn=new JLabel("Room Number");
        rn.setBounds(23,162,150,20);
        rn.setForeground(Color.WHITE);
        rn.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rn);

        JLabel av=new JLabel("Availablity");
        av.setBounds(175,162,150,20);
        av.setForeground(Color.WHITE);
        av.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(av);

        JLabel price=new JLabel("Price");
        price.setBounds(458,162,150,20);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel ct=new JLabel("Clean Status");
        ct.setBounds(306,162,150,20);
        ct.setForeground(Color.WHITE);
        ct.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(ct);

        JLabel bt=new JLabel("Bed Type");
        bt.setBounds(580,162,150,20);
        bt.setForeground(Color.WHITE);
        bt.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(bt);
checkbox=new JCheckBox("Only Display Available");
checkbox.setBounds(400,69,205,23);
checkbox.setForeground(Color.WHITE);
checkbox.setBackground(new Color(3,45,48));
panel.add(checkbox);
choice=new Choice();
choice.add("Single Bed");
choice.add("Double Bed");
choice.setBounds(170,70,120,20);
panel.add(choice);
table=new JTable();
table.setBounds(0,187,700,150);
table.setForeground(Color.WHITE);
table.setBackground(new Color(3,45,48));
panel.add(table);
try{
Conn c=new Conn();
String q="Select * from rooms";
ResultSet result=c.statement.executeQuery(q);
table.setModel(DbUtils.resultSetToTableModel(result));

}
catch(Exception e){
    e.printStackTrace();
}
add=new JButton("Search");
add.setBounds(200,400,120,30);
add.setForeground(Color.WHITE);
add.setBackground(Color.BLACK);
add.addActionListener(this);
panel.add(add);
back=new JButton("Back");
back.setBounds(380,400,120,30);
 back.setForeground(Color.WHITE);
back.setBackground(Color.BLACK);
back.addActionListener(this);
panel.add(back);
        setUndecorated(true);
        setLocation(500,200);
        setLayout(null);
        setSize(700,500);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent E){
        if(E.getSource()==add){
            String q="Select * from rooms where Type='"+choice.getSelectedItem()+"'";
            String q1="Select * from rooms where available='Available' and Type='"+choice.getSelectedItem()+"'";
            try{
             Conn c=new Conn();
             ResultSet result=c.statement.executeQuery(q);
             table.setModel(DbUtils.resultSetToTableModel(result));
             if(checkbox.isSelected()){
                ResultSet res=c.statement.executeQuery(q1);
                table.setModel(DbUtils.resultSetToTableModel(res));
                
             }
            }catch(Exception m){
                m.printStackTrace();
            }
        }
        else{
            setVisible(false);
         }
    }
    public static void main(String args[]){
        new SearchRoom();
    }
}