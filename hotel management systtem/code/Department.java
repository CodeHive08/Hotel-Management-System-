import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Department extends JFrame{
    
    Department(){
        JPanel panel=new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);

        /*try{
           con c=new con();
           String deparmentInfo="Select * from department";
           ResultSet result=c.statement.executeQuery(departmentInfo);
           table.setModel(DbUtils.resultSetToTableModel(result));
           
        } catch(Exception e){
            e.printStackTrace();
        }*/
        JButton back=new JButton("BACK");
        back.setBounds(400,410,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener(){
         @Override
         public void actionPerformed(ActionEvent E){
            setVisible(false);
         }
        }
        );
        JButton label=new JButton(" TRAVELLING SERVICES");
        label.setBounds(150,210,210,30);
        label.setForeground(Color.BLACK);
        label.setBackground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);
        

        setLayout(null);
        setLocation(550,150);
        setSize(700,500);
        setUndecorated(true);
        setVisible(true);

    }
    public static void main(String args[]){
new Department();
    }
}