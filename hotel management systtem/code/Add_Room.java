import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Add_Room extends JFrame implements ActionListener{
JTextField t2,t4;
JComboBox t3,t5,t6;
JButton add,back;
    Add_Room(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color( 3,45,48));
        panel.setLayout(null);
        add(panel);
        JLabel l1=new JLabel("Add Rooms");
        l1.setBounds(190,10,160,22);
        l1.setFont(new Font("Tahoma",Font.BOLD,22));
        l1.setForeground(Color.WHITE);
        panel.add(l1);
        JLabel l2=new JLabel("Room number");
      l2.setBounds(64,70,152,22);
      l2.setFont(new Font("Tahoma",Font.BOLD,14));
      l2.setForeground(Color.WHITE);
      panel.add(l2);
      t2=new JTextField();
      t2.setBounds(200,70,156,20);
      t2.setFont(new Font("Tahoma",Font.PLAIN,14));
     t2.setBackground(new Color(16,108,115));
      t2.setForeground(Color.WHITE);
      panel.add(t2);
      JLabel l3=new JLabel("Availability");
      l3.setBounds(64,110,152,22);
      l3.setFont(new Font("Tahoma",Font.BOLD,14));
      l3.setForeground(Color.WHITE);
      panel.add(l3);
      t3=new JComboBox(new String[]{"Available","Occupied"});
      t3.setBounds(200,110,156,20);
      t3.setFont(new Font("Tahoma",Font.PLAIN,14));
     t3.setBackground(new Color(16,108,115));
      t3.setForeground(Color.WHITE);
      panel.add(t3);
      JLabel l4=new JLabel("Price");
      l4.setBounds(64,150,152,22);
      l4.setFont(new Font("Tahoma",Font.BOLD,14));
      l4.setForeground(Color.WHITE);
      panel.add(l4);
      t4=new JTextField();
      t4.setBounds(200,150,156,20);
      t4.setFont(new Font("Tahoma",Font.PLAIN,14));
     t4.setBackground(new Color(16,108,115));
      t4.setForeground(Color.WHITE);
      panel.add(t4);
      JLabel l5=new JLabel("Cleaning Status");
      l5.setBounds(64,190,152,22);
      l5.setFont(new Font("Tahoma",Font.BOLD,14));
      l5.setForeground(Color.WHITE);
      panel.add(l5);
      t5=new JComboBox(new String[] {"Cleaned","Dirty"} );
      t5.setBounds(200,190,156,20);
      t5.setFont(new Font("Tahoma",Font.PLAIN,14));
     t5.setBackground(new Color(16,108,115));
      t5.setForeground(Color.WHITE);
      panel.add(t5);
      JLabel l6=new JLabel("Bed Type");
      l6.setBounds(64,230,152,22);
      l6.setFont(new Font("Tahoma",Font.BOLD,14));
      l6.setForeground(Color.WHITE);
      panel.add(l6);
      t6=new JComboBox(new String[] {"Single bed","Double Bed"} );
      t6.setBounds(200,230,156,20);
      t6.setFont(new Font("Tahoma",Font.PLAIN,14));
     t6.setBackground(new Color(16,108,115));
      t6.setForeground(Color.WHITE);
      panel.add(t6);
      add=new JButton("Add");
      add.setBounds(64,321,111,33);
      add.setBackground(Color.BLACK);
      add.setForeground(Color.WHITE);
      add.addActionListener(this);
      panel.add(add);

      back=new JButton("Back");
      back.setBounds(198,321,111,33);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
      back.addActionListener(this);
      panel.add(back);
      ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
      Image i=img.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
      ImageIcon im=new ImageIcon(i);
      JLabel l=new JLabel(im);
      l.setBounds(500,60,300,300);
      panel.add(l);
      setUndecorated(true);
        setLocation(20,200);
setSize(885,500);
setVisible(true);
setLayout(null);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
        try{
            Conn conn=new Conn();
            String room=t2.getText();
            String available=(String) t3.getSelectedItem();
            String price=t4.getText();
            String status=(String) t5.getSelectedItem();
            String type=(String) t6.getSelectedItem();

            String query="insert into rooms values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
            conn.statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"room added successfully");
            setVisible(false);
        }
        catch(Exception E){
            E.getStackTrace();
        }
    }
    else{
        setVisible(false);
    }
}
    public static void main(String args[]){
new Add_Room();
    }
}