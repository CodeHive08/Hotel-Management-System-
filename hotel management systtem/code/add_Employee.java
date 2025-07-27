import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class  add_Employee extends JFrame implements ActionListener{
    JTextField nametxt,agetxt,salarytxt,phonetxt,aadhartxt,emailtxt;
    JRadioButton m,f;
    JComboBox b;
    JButton add,back;
    add_Employee(){
        setLayout(null);
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);
        setUndecorated(true);
        JLabel name=new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif",Font.BOLD,17));
        name.setForeground(Color.WHITE);
        panel.add(name);
        agetxt=new JTextField();
        agetxt.setBounds(200,30,150,27);
        agetxt.setBackground(new Color(16,108,115));
        agetxt.setFont(new Font("Tahoma",Font.BOLD,14));
        agetxt.setForeground(Color.WHITE);
        panel.add(agetxt);
        JLabel age=new JLabel("AGE");
        age.setBounds(60,80,150,27);
        age.setFont(new Font("serif",Font.BOLD,17));
        age.setForeground(Color.WHITE);
        panel.add(age);
        nametxt=new JTextField();
        nametxt.setBounds(200,80,150,27);
        nametxt.setBackground(new Color(16,108,115));
        nametxt.setFont(new Font("Tahoma",Font.BOLD,14));
        nametxt.setForeground(Color.WHITE);
        panel.add(nametxt);
        JLabel gender=new JLabel("GENDER");
      gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif",Font.BOLD,17));
        gender.setForeground(Color.WHITE);
        panel.add(gender);
        m=new JRadioButton("MALE");
        m.setBounds(200,120,70,27);
        m.setBackground(new Color(3,45,48));
        m.setFont(new Font("Tahoma",Font.BOLD,14));
        m.setForeground(Color.WHITE);
        panel.add(m);
        f=new JRadioButton("FEMALE");
        f.setBounds(280,120,100,27);
        f.setBackground(new Color(3,45,48));
        f.setFont(new Font("Tahoma",Font.BOLD,14));
        f.setForeground(Color.WHITE);
        panel.add(f);
        JLabel job=new JLabel("JOB");
      job.setBounds(60,170,150,27);
        job.setFont(new Font("serif",Font.BOLD,17));
        job.setForeground(Color.WHITE);
        panel.add(job);
        b=new JComboBox(new String[]{"Front Desk","HouseKeeping","Kitchen Staff","Room Service","Manager","Accountant","Chef"});
b.setBackground((new Color(16,108,115)));
b.setBounds(200,170,150,30);
b.setFont(new Font("Tahoma",Font.BOLD,17));
b.setForeground(Color.WHITE);
panel.add(b);
JLabel salary=new JLabel("SALARY");
salary.setBounds(60,220,150,27);
  salary.setFont(new Font("serif",Font.BOLD,17));
  salary.setForeground(Color.WHITE);
  panel.add(salary);
  salarytxt=new JTextField();
        salarytxt.setBounds(200,220,150,27);
        salarytxt.setBackground(new Color(16,108,115));
        salarytxt.setFont(new Font("Tahoma",Font.BOLD,14));
        salarytxt.setForeground(Color.WHITE);
        panel.add(salarytxt);
       
        JLabel phone_number=new JLabel("PHONE NO");
        phone_number.setBounds(60,270,150,27);
          phone_number.setFont(new Font("serif",Font.BOLD,17));
          phone_number.setForeground(Color.WHITE);
          panel.add(phone_number);
          phonetxt=new JTextField();
                phonetxt.setBounds(200,270,150,27);
                phonetxt.setBackground(new Color(16,108,115));
                phonetxt.setFont(new Font("Tahoma",Font.BOLD,14));
                phonetxt.setForeground(Color.WHITE);
                panel.add(phonetxt); 
                JLabel aadhar=new JLabel("AADHAR ");
aadhar.setBounds(60,320,150,27);
  aadhar.setFont(new Font("serif",Font.BOLD,17));
  aadhar.setForeground(Color.WHITE);
  panel.add(aadhar);
  aadhartxt=new JTextField();
  aadhartxt.setBounds(200,320,150,27);
  aadhartxt.setBackground(new Color(16,108,115));
        aadhartxt.setFont(new Font("Tahoma",Font.BOLD,14));
        aadhartxt.setForeground(Color.WHITE);
        panel.add(aadhartxt);
       JLabel email=new JLabel("EMAIL ");
        email.setBounds(60,370,150,27);
          email.setFont(new Font("serif",Font.BOLD,17));
          email.setForeground(Color.WHITE);
          panel.add(email);
          emailtxt=new JTextField();
          emailtxt.setBounds(200,370,150,27);
          emailtxt.setBackground(new Color(16,108,115));
          emailtxt.setFont(new Font("Tahoma",Font.BOLD,14));
          emailtxt.setForeground(Color.WHITE);
                panel.add(emailtxt);
                
                JLabel AED=new JLabel("ADD EMPLOYEE DETAILS ");
                AED.setBounds(450,24,445,35);
                  AED.setFont(new Font("Tahoma",Font.BOLD,31));
                  AED.setForeground(Color.WHITE);
                  panel.add(AED);
add=new JButton("ADD");
add.setBounds(80,420,100,30);
add.setForeground(Color.WHITE);
add.setBackground(Color.BLACK);
add.addActionListener(this);
panel.add(add);
back=new JButton("BACK");
back.setBounds(200,420,100,30);
back.setForeground(Color.WHITE);
back.setBackground(Color.BLACK);
back.addActionListener(this);
panel.add(back);
ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
Image i=img.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
ImageIcon i1=new ImageIcon(i);
JLabel lab=new JLabel(i1);
lab.setBounds(500,100,300,300);
panel.add(lab); 
setVisible(true);
setSize(900,500);
setLocation(60,160);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==add){
            String name, salary,phone,email,age,job,aadhar,gender=null;
             name=nametxt.getText();
             age=agetxt.getText();
             salary=salarytxt.getText();
             phone=phonetxt.getText();
             email=emailtxt.getText();
             aadhar=aadhartxt.getText();
             job = (String) b.getSelectedItem();
            if(m.isSelected())
             {
                 gender="male";
             } else if (f.isSelected()) {
                 gender="female";
             }
             try{
                 Conn conn=new Conn();
                 String query="insert into employee(name,age,gender,job,salary,contact,email,identification) values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+aadhar+"')";
                 conn.statement.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"employee added successfully");
                 setVisible(false);

             } catch (Exception ex) {
                 throw new RuntimeException(ex);
             }
        }
        else{
            setVisible(false);
        }
    }

    public static void main(String args[]){
        new add_Employee();
    }
}