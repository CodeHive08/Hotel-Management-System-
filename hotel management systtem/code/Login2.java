import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class Login2 extends JFrame implements ActionListener{
    JTextField text1;
    JPasswordField password1;
    JButton b1,b2;
    Login2(){
        JLabel label1=new JLabel("Username:");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        add(label1);
        JLabel label2=new JLabel("Password:");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        add(label2);
        text1=new JTextField();
        text1.setBounds(150,20,150,30);
        text1.setForeground(Color.WHITE);
        text1.setFont(new Font("Tahoma",Font.PLAIN,15));
        text1.setBackground(new Color(26,104,110));
        add(text1);
        password1=new JPasswordField();
        password1.setBounds(150,60,150,30);
        password1.setForeground(Color.WHITE);
        password1.setBackground(new Color(26,104,110));
        add(password1);
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i=image.getImage().getScaledInstance(270, 270,Image.SCALE_DEFAULT);
        ImageIcon i1=new ImageIcon(i);
        JLabel label=new JLabel(i1);
    
        label.setBounds(325,10,250,200);
        add(label);
        b1=new JButton("Login");
        b1.setBounds(40,140,130,30);
        b1.setFont(new Font("Serif",Font.BOLD,15));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("Cancel");
        b2.setBounds(180,140,130,30);
        b2.setFont(new Font("Serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        b2.addActionListener(this);
        b2=new JButton("Cancel");
       getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setLocation(400,270);
    setSize(600,300);
    setUndecorated(true);
    setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            /*if(e.getSource()==b1){
                Conn conn = new Conn();
                String username = text1.getText();
                String password = password1.getText();
                String query = "select * from admin where username='" + username + "' and password='" + password + "'";
                ResultSet result = conn.statement.executeQuery(query);
                if (result.next()) {
                    try {
                        new Admin();
                        setVisible(false);
                    } catch (Exception E) {
                        E.getStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "invalid credentials");
                    new Dashboard();
                    setVisible(false);
                }
            }
            else{
                new Dashboard();
                setVisible(false);
            }*/
            new Admin();
            setVisible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
        public static void main (String args[]){
            new Login2();
        }
}