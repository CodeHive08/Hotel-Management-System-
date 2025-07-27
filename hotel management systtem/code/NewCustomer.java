import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Date;
class NewCustomer extends JFrame{ //implements ActionListener {
    private JComboBox<String> id;
    private JTextField nametxt, nametxt2, countrytxt, depositxt;
    private JRadioButton m, f;
    private Choice c1;
    private JLabel date;
    private JButton add, back;
    private Connection conn;

    NewCustomer() {
     /*   try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/el_diablo", "root", "loveneet@123");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database: " + e.getMessage());
            System.exit(1);
        }*/

        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 45, 48));
        panel.setBounds(5, 5, 840, 540);
        panel.setLayout(null);
        add(panel);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image i = img.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i1 = new ImageIcon(i);
        JLabel i2 = new JLabel(i1);
        i2.setBounds(550, 150, 200, 200);
        panel.add(i2);

        JLabel label = new JLabel("NEW CUSTOMER FORM");
        label.setBounds(118, 11, 260, 53);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(label);

        JLabel label2 = new JLabel("ID");
        label2.setBounds(35, 76, 200, 14);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label2);

        id = new JComboBox<>(new String[]{"Passport", "Aadhar Card", "Voter ID", "Driving License"});
        id.setBounds(271, 73, 150, 20);
        id.setForeground(Color.WHITE);
        id.setBackground(new Color(3, 45, 48));
        id.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(id);

        JLabel label3 = new JLabel("Number");
        label3.setBounds(35, 111, 200, 14);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label3);

        nametxt = new JTextField();
        nametxt.setBounds(271, 111, 150, 20);
        panel.add(nametxt);

        JLabel label4 = new JLabel("Name");
        label4.setBounds(35, 151, 200, 14);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label4);

        nametxt2 = new JTextField();
        nametxt2.setBounds(271, 151, 150, 20);
        panel.add(nametxt2);

        JLabel label5 = new JLabel("Gender");
        label5.setBounds(35, 191, 200, 14);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label5);

        m = new JRadioButton("MALE");
        m.setBounds(271, 191, 80, 14);
        m.setBackground(new Color(3, 45, 48));
        m.setFont(new Font("Tahoma", Font.BOLD, 12));
        m.setForeground(Color.WHITE);
        panel.add(m);

        f = new JRadioButton("FEMALE");
        f.setBounds(350, 191, 80, 14);
        f.setBackground(new Color(3, 45, 48));
        f.setFont(new Font("Tahoma", Font.BOLD, 12));
        f.setForeground(Color.WHITE);
        panel.add(f);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(m);
        genderGroup.add(f);

        JLabel label6 = new JLabel("Country");
        label6.setBounds(35, 231, 200, 14);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label6);

        countrytxt = new JTextField();
        countrytxt.setBounds(271, 231, 150, 20);
        panel.add(countrytxt);

        JLabel label7 = new JLabel("Allocated Room Number");
        label7.setBounds(35, 274, 200, 14);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label7);

        c1 = new Choice();
      /*  try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from rooms where available='Available';");
            while (resultSet.next()) {
                c1.add(resultSet.getString("roomno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        c1.setBounds(271, 274, 150, 20);
        c1.setFont(new Font("Tahoma", Font.BOLD, 14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3, 45, 48));
        panel.add(c1);

        Date date1 = new Date();
        date = new JLabel("" + date1);
        date.setBounds(271, 316, 200, 14);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(date);

        JLabel label8 = new JLabel("Deposit");
        label8.setBounds(35, 359, 200, 14);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label8);

        depositxt = new JTextField();
        depositxt.setBounds(271, 359, 150, 20);
        panel.add(depositxt);

        JLabel label9 = new JLabel("Check-In");
        label9.setBounds(35, 316, 200, 14);
        label9.setForeground(Color.WHITE);
        label9.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label9);

        setLocation(500, 150);
        setLayout(null);
        setSize(850, 550);

        add = new JButton("Add");
        add.setBounds(100, 430, 125, 30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
     //   add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(260, 430, 125, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
       // back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setVisible(true);
    }

   /* @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String idType = (String) id.getSelectedItem();
            String idNumber = nametxt2.getText();
            String name = nametxt.getText();
            String gender = getSelectedGender();
            String country = countrytxt.getText();
            String roomNumber = c1.getSelectedItem();
            String checkInDate = date.getText();
            String deposit = depositxt.getText();

            try {
                addCustomer(idType, idNumber, name, gender, country, roomNumber, checkInDate, deposit);
                updateRoomAvailability(roomNumber);
                JOptionPane.showMessageDialog(null, "Customer added successfully");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error adding customer: " + ex.getMessage());
            }
        } else if (e.getSource() == back) {
            setVisible(false);
        }
    }

    private String getSelectedGender() {
        if (m.isSelected()) {
            return "Male";
        } else if (f.isSelected()) {
            return "Female";
        } else {
            return null;
        }
    }

    private void addCustomer(String idType, String idNumber, String name, String gender, String country, String roomNumber, String checkInDate, String deposit) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO customer (id, idNo, name, gender, country, roomno, checkin, deposit) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        pstmt.setString(1, idType);
        pstmt.setString(3, idNumber);
        pstmt.setString(2, name);
        pstmt.setString(4, gender);
        pstmt.setString(5, country);
        pstmt.setString(6, roomNumber);
        pstmt.setString(7, checkInDate);
        pstmt.setString(8, deposit);
        pstmt.executeUpdate();
    }

    private void updateRoomAvailability(String roomNumber) throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("UPDATE rooms SET available = 'Occupied' WHERE roomno = ?");
        pstmt.setString(1, roomNumber);
        pstmt.executeUpdate();
    }*/

    public static void main(String[] args) {
        new NewCustomer();
    }
}