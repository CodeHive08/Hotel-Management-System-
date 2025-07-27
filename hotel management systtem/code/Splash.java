import javax.swing.*;

class Splash extends JFrame{
    Splash(){
        ImageIcon image=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        JLabel label=new JLabel(image);
        label.setBounds(0,0,500,500);
        add(label);
        setLayout(null);
        setLocation(500,80);
        setSize(500,500);  
        setUndecorated(true);      
        setVisible(true);
        try{
            Thread.sleep(3500);
            new Login();
      setVisible(false);
        }
        catch(Exception e){
            e.getStackTrace();
            
        }
    }
    public static void main(String args[]){
        new Splash();
    }
}