import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AddCustomer extends JFrame{
	JLabel usertxt;
	JComboBox idtxt;
	JTextField numtxt,nametxt,countrytxt,addresstxt,emailtxt,phnotxt;
	JRadioButton m,f;
	JButton add,back;
AddCustomer(){
	setLayout(null);
	setBounds(	450,200,850,550);
	getContentPane().setBackground(Color.WHITE);

	JLabel label = new JLabel("ADD CUSTOMER ");
	label.setBounds(118, 5, 260, 40);
	label.setForeground(Color.BLACK);
	label.setFont(new Font("Tahoma", Font.BOLD, 20));
	add(label);

	JLabel username=new JLabel("USERNAME");
	username.setBounds(30,50,150,25);
	add(username);

	nametxt=new JTextField();
nametxt.setBounds(220,50,150,25);
add(nametxt);


	usertxt=new JLabel();
	usertxt.setBounds(220,50,150,25);
	add(usertxt);

	JLabel id=new JLabel("ID");
	id.setBounds(30,90,150,25);
	add(id);
	 
idtxt=new JComboBox(new String[]{"Passport","AadharCard","PAN Card","Ration Card"});
idtxt.setBounds(220,90,150,25);
idtxt.setBackground(Color.WHITE);
add(idtxt);

JLabel num=new JLabel("ID NUMBER");
num.setBounds(30,130,150,25);
add(num);

numtxt=new JTextField();
numtxt.setBounds(220,130,150,25);
add(numtxt);



JLabel gender=new JLabel("GENDER");
gender.setBounds(30,170,150,25);
add(gender);

m=new JRadioButton("MALE");
m.setBounds(220,170,70,25);
m.setBackground(Color.WHITE);
add(m);
f=new JRadioButton("FEMALE");
f.setBounds(340,170,80,25);
f.setBackground(Color.WHITE);
add(f);

ButtonGroup bg=new ButtonGroup();
bg.add(m);
bg.add(f);

JLabel country=new JLabel("COUNTRY");
country.setBounds(30,210,150,25);
add(country);

countrytxt=new JTextField();
countrytxt.setBounds(220,210,150,25);
add(countrytxt);

JLabel address=new JLabel("ADDRESS");
address.setBounds(30,250,150,25);
add(address);

addresstxt=new JTextField();
addresstxt.setBounds(220,250,150,25);
add(addresstxt);

JLabel email=new JLabel("EMAIL");
email.setBounds(30,290,150,25);
add(email);

emailtxt=new JTextField();
emailtxt.setBounds(220,290,150,25);
add(emailtxt);

JLabel phone=new JLabel("PHONE NUMBER");
phone.setBounds(30,330,150,25);
add(phone);

phnotxt=new JTextField();
phnotxt.setBounds(220,330,150,25);
add(phnotxt);


add = new JButton("Add");
        add.setBounds(70, 470, 100, 25);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
		/*add.addActionListener(new ActionListener() {
		 	@Override
			public void actionPerformed(ActionEvent e){
	try{
	
	}
	catch(Exception E){
		E.getStackTrace();
	}
			}
		   });*/
        add(add);

        back = new JButton("Back");
        back.setBounds(180, 470, 100, 25);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
	try{
	// new Dashboard2();
	setVisible(false);
	}
	catch(Exception E){
		E.getStackTrace();
	}
			}
		   });
		  
	 
        add(back);

		ImageIcon l1=new ImageIcon(ClassLoader.getSystemResource("icon/newcustomer.jpg"));
       Image l2=l1.getImage().getScaledInstance(400, 500,Image.SCALE_DEFAULT);
       ImageIcon l3=new ImageIcon(l2);
       JLabel labe=new JLabel(l3);
     labe.setBounds(440,40,450,420);
     add(labe);

	setVisible(true);

}
public static void main(String args[]){
	new AddCustomer();
}
}