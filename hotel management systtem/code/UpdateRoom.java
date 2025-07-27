import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
class UpdateRoom extends JFrame{
    UpdateRoom(){
        JPanel panel=new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,940,490);
        panel.setLayout(null);
        add(panel);

        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image i=image.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon il=new ImageIcon(i);
        JLabel lab=new JLabel(il);
        lab.setBounds(500,60,300,300);
        panel.add(lab);

        JLabel label1=new JLabel("Update Room Status:");
        label1.setBounds(124,11,222,25);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label1);

        JLabel label2=new JLabel("ID:");
        label2.setBounds(25,88,46,14);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label2);

        Choice c=new Choice();
        c.setBounds(248,85,140,20);
        panel.add(c);

        try {
            Conn C = new Conn();
            ResultSet result = C.statement.executeQuery("select idNo from customer");
            while (result.next())
            {
                String customerid=result.getString("idNo");
                c.add(customerid);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel label3=new JLabel("Room Number:");
        label3.setBounds(25,129,107,14);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label3);
        JTextField roomtxt=new JTextField();
        roomtxt.setBounds(248,129,140,20);
        panel.add(roomtxt);
        JLabel label4=new JLabel("Availability:");
        label4.setBounds(25,174,97  ,14);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label4);
        JTextField nametxt=new JTextField();
        nametxt.setBounds(248,174,140,20);
        panel.add(nametxt);

        JLabel label5=new JLabel("Clean Status:");
        label5.setBounds(25,216,97  ,14);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(label5);
        JTextField cktxt=new JTextField();
        cktxt.setBounds(248,216,140,20);
        panel.add(cktxt);


        JButton update=new JButton("Update");
        update.setBounds(120,315,89,22);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        panel.add(update);
         update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent E){
try{
Conn C=new Conn();
String status=cktxt.getText();
C.statement.executeUpdate("update room set cleaning_status='"+status+"'where roomNo="+nametxt.getText());
JOptionPane.showMessageDialog(null,"Updated Successfully");
setVisible(false);
}catch(Exception e){
    e.printStackTrace();
}
            }
        });

        JButton back=new JButton("Back");
        back.setBounds(180,355,89,22);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
back.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent E){
        setVisible(false);
    }
});
        JButton check=new JButton("Check");
        check.setBounds(60,355,89,22);
        check.setBackground(Color.BLACK);
        check.setForeground(Color.WHITE);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent E){
                String id=c.getSelectedItem();
                String q="Select * from customer where number='"+id+"'";
                try{
Conn c=new Conn();
ResultSet result=c.statement.executeQuery(q);
while(result.next()){
    roomtxt.setText(result.getString("room"));
}
ResultSet res=c.statement.executeQuery("select * from room where roomNo='"+roomtxt.getText()+"'");
while(res.next()){
 nametxt.setText(res.getString("availablex"));
    cktxt.setText(res.getString("cleaning_status"));
}
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });

        setSize(950,450);
        setLocation(400,200);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }
    public static void main(String args[]){
        new UpdateRoom();
    }
}