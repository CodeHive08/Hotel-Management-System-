import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

class CheckOut extends JFrame {
    CheckOut() throws Exception {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 45, 48));
        panel.setBounds(5, 5, 790, 390);
        panel.setLayout(null);
        add(panel);

        JLabel label1 = new JLabel("Check-Out");
        label1.setBounds(100, 20, 150, 30);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panel.add(label1);

        JLabel label2 = new JLabel("CustomerID");
        label2.setBounds(30, 80, 150, 30);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label2);

        Choice customer = new Choice();
        customer.setBounds(200, 80, 150, 25);
        panel.add(customer);

        JLabel label3 = new JLabel("Room Number");
        label3.setBounds(30, 130, 150, 30);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(200, 130, 150, 30);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label4);

        JLabel label5 = new JLabel("Check-In Time");
        label5.setBounds(30, 180, 150, 30);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label5);

        JLabel label6 = new JLabel();
        label6.setBounds(200, 180, 200, 30);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label6);

        JLabel label7 = new JLabel("Check-Out Time");
        label7.setBounds(30, 230, 150, 30);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label7);

        Date date = new Date();
        JLabel label8 = new JLabel("" + date);
        label8.setBounds(200, 230, 200, 30);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(label8);

        try {
            Conn c = new Conn();
            ResultSet result = c.statement.executeQuery("select * from customer");
            while (result.next()) {
                customer.add(result.getString("idNo"));
            }
        } catch (Exception E) {
            E.printStackTrace();
        }

        JButton checkOut = new JButton("Check-Out");
        checkOut.setBounds(30, 300, 120, 30);
        checkOut.setForeground(Color.WHITE);
        checkOut.setBackground(Color.BLACK);
        panel.add(checkOut);
        checkOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Conn cv = new Conn();
                    cv.statement.executeUpdate("delete from customer where number='" + customer.getSelectedItem() + "'");
                    cv.statement.executeUpdate("update room set available='Available' where roomno='" + label4.getText() + "'");
                    JOptionPane.showMessageDialog(null, "Check-Out Successful");
                    setVisible(false);
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(300, 300, 120, 30);
        check.setForeground(Color.WHITE);
        check.setBackground(Color.BLACK);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Conn c = null;
                try {
                    c = new Conn();
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    ResultSet res = c.statement.executeQuery("select * from customer where number='" + customer.getSelectedItem() + "'");
                    while (res.next()) {
                        label4.setText(res.getString("room"));
                        label6.setText(res.getString("checkintime"));
                    }
                } catch (Exception E) {
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(170, 300, 120, 30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setUndecorated(true);
        setLayout(null);
        setLocation(500, 210);
        setSize(800, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        try {
            new CheckOut();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
