import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class add_Driver extends JFrame implements ActionListener{
    JTextField name,age,brand,carno,location;
    JComboBox gen,available;
    JButton add,back;
    add_Driver(){
        setSize(900,500);
        setLayout(null);
        setLocation(20,200);
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);
        JLabel label=new JLabel("ADD DRIVERS");
        label.setBounds(194,10,200,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,22));
        panel.add(label);
        JLabel label1=new JLabel("NAME");
        label1.setBounds(64,70,102,22);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);  
        name=new JTextField();
        name.setBounds(174,70,156,20);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        name.setBackground(new Color(16,108,115));
         panel.add(name);
         
         JLabel label2=new JLabel("AGE");
         label2.setBounds(64,110,102,22);
         label2.setForeground(Color.WHITE);
         label2.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label2);
         age=new JTextField();
         age.setBounds(174,110,156,20);
         age.setForeground(Color.WHITE);
         age.setFont(new Font("Tahoma",Font.BOLD,14));
         age.setBackground(new Color(16,108,115));
          panel.add(age);
          JLabel label3=new JLabel("Gender");
          label3.setBounds(64,150,102,22);
          label3.setForeground(Color.WHITE);
          label3.setFont(new Font("Tahoma",Font.BOLD,14));
          panel.add(label3);
          gen=new JComboBox(new String[]{"Male","Female"});
          gen.setBounds(176,150,154,20);
          gen.setForeground(Color.WHITE);
         gen.setFont(new Font("Tahoma",Font.BOLD,14));
         gen.setBackground(new Color(16,108,115));
         panel.add(gen);
         
         JLabel label4=new JLabel("CAR COMPANY");
         label4.setBounds(64,190,110,22);
         label4.setForeground(Color.WHITE);
         label4.setFont(new Font("Tahoma",Font.BOLD,14));
         panel.add(label4);
         brand=new JTextField();
         brand.setBounds(174,190,156,20);
         brand.setForeground(Color.WHITE);
         brand.setFont(new Font("Tahoma",Font.BOLD,14));
         brand.setBackground(new Color(16,108,115));
          panel.add(brand);
          JLabel label5=new JLabel("CAR NO");
          label5.setBounds(64,230,102,22);
          label5.setForeground(Color.WHITE);
          label5.setFont(new Font("Tahoma",Font.BOLD,14));
          panel.add(label5);
          carno=new JTextField();
          carno.setBounds(174,230,156,20);
          carno.setForeground(Color.WHITE);
          carno.setFont(new Font("Tahoma",Font.BOLD,14));
          carno.setBackground(new Color(16,108,115));
           panel.add(carno);
           
           JLabel label6=new JLabel("AVAILABLE");
          label6.setBounds(64,270,102,22);
          label6.setForeground(Color.WHITE);
          label6.setFont(new Font("Tahoma",Font.BOLD,14));
          panel.add(label6);
          available=new JComboBox(new String[]{"YES","NO"});
          available.setBounds(176,270,154,20);
          available.setForeground(Color.WHITE);
         available.setFont(new Font("Tahoma",Font.BOLD,14));
         available.setBackground(new Color(16,108,115));
         panel.add(available);
         JLabel label7=new JLabel("LOCATION");
          label7.setBounds(64,310,102,22);
          label7.setForeground(Color.WHITE);
          label7.setFont(new Font("Tahoma",Font.BOLD,14));
          panel.add(label7);
         location=new JTextField();
          location.setBounds(174,310,156,20);
          location.setForeground(Color.WHITE);
          location.setFont(new Font("Tahoma",Font.BOLD,14));
          location.setBackground(new Color(16,108,115));
           panel.add(location);
           add=new JButton("ADD");
           add.setBounds(64,380,111,33);
           add.setBackground(Color.BLACK);
           add.setForeground(Color.WHITE);
           add.addActionListener(this);
           panel.add(add);
           back=new JButton("BACK");
           back.setBounds(198,380,111,33);
           back.setBackground(Color.BLACK);
           back.setForeground(Color.WHITE);
          back.addActionListener(this);
           panel.add(back);
           ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
           Image i=img.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
           ImageIcon i1=new ImageIcon(i);
           JLabel l=new JLabel(i1);
           l.setBounds(500,60,300,300);
           panel.add(l);
        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            String getname,getage,getgender,getlocation,getbrand,getcarno,getstatus;
            getname=name.getText();
            getage=age.getText();
            getbrand=brand.getText();
            getcarno=carno.getText();
            getlocation=location.getText();
            getgender=(String) gen.getSelectedItem();
            getstatus=(String) available.getSelectedItem();

            try{
                Conn conn=new Conn();
                String query="insert into driver(name,age,gender,company,car_no,status,location) values('"+getname+"','"+getage+"','"+getgender+"','"+getbrand+"','"+getcarno+"','"+getstatus+"','"+getlocation+"')";
                conn.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"driver added successfully");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }

        }
        else{
            setVisible(false);
        }
    }
    public static void main(String args[]){
        new add_Driver();
    }

}