import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

class UpdateCheck extends JFrame {
    UpdateCheck() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 45, 48));
        panel.setBounds(100, 100, 940, 490);
        panel.setLayout(null);
        add(panel);

//        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
//        Image i = image.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
//        ImageIcon il = new ImageIcon(i);
//        JLabel lab = new JLabel(il);
//        lab.setBounds(500, 60, 300, 300);
//        panel.add(lab);
//
//        JLabel label1 = new JLabel("Check-In Details:");
//        label1.setBounds(124, 11, 222, 25);
//        label1.setForeground(Color.WHITE);
//        label1.setFont(new Font("Tahoma", Font.BOLD, 20));
//        panel.add(label1);
//
//        JLabel label2 = new JLabel("ID:");
//        label2.setBounds(25, 88, 46, 14);
//        label2.setForeground(Color.WHITE);
//        label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        panel.add(label2);
//
//        Choice c = new Choice();
//        c.setBounds(248, 85, 140, 20);
//        panel.add(c);
//        try {
//            Conn C = new Conn();
//            ResultSet result = C.statement.executeQuery("select * from customer");
//            while (result.next()) {
//                c.add(result.getString("idNo"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        JLabel label3 = new JLabel("Room Number:");
//        label3.setBounds(25, 129, 107, 14);
//        label3.setForeground(Color.WHITE);
//        label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        panel.add(label3);
//        JTextField roomtxt = new JTextField();
//        roomtxt.setBounds(248, 129, 140, 20);
//        panel.add(roomtxt);
//
//        JLabel label4 = new JLabel("Name:");
//        label4.setBounds(25, 174, 97, 14);
//        label4.setForeground(Color.WHITE);
//        label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        panel.add(label4);
//        JTextField nametxt = new JTextField();
//        nametxt.setBounds(248, 174, 140, 20);
//        panel.add(nametxt);
//
//        JLabel label5 = new JLabel("Checked-In:");
//        label5.setBounds(25, 216, 97, 14);
//        label5.setForeground(Color.WHITE);
//        label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        panel.add(label5);
//        JTextField cktxt = new JTextField();
//        cktxt.setBounds(248, 216, 140, 20);
//        panel.add(cktxt);
//
//        JLabel label6 = new JLabel("Amount Paid:");
//        label6.setBounds(25, 261, 150, 14);
//        label6.setForeground(Color.WHITE);
//        label6.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        panel.add(label6);
//        JTextField aptxt = new JTextField();
//        aptxt.setBounds(248, 261, 140, 20);
//        panel.add(aptxt);
//
//        JLabel label7 = new JLabel("Pending Amount:");
//        label7.setBounds(25, 302, 150, 14);
//        label7.setForeground(Color.WHITE);
//        label7.setFont(new Font("Tahoma", Font.PLAIN, 14));
//        panel.add(label7);
//        JTextField patxt = new JTextField();
//        patxt.setBounds(248, 302, 140, 20);
//        panel.add(patxt);
//
//        JButton update = new JButton("Update");
//        update.setBounds(56, 378, 89, 22);
//        update.setBackground(Color.BLACK);
//        update.setForeground(Color.WHITE);
//        panel.add(update);
//        update.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent E) {
//                try {
//                    Conn C = new Conn();
//                    String q = c.getSelectedItem();
//                    String room = roomtxt.getText();
//                    String name = nametxt.getText();
//                    String check = cktxt.getText();
//                    String amount = aptxt.getText();
//                    C.statement.executeUpdate("update customer set idNo ='" + room + "', name='" + name + "', checkin='" + check + "', deposit='" + amount + "' where roomno='" + q + "'");
//                    JOptionPane.showMessageDialog(null, "Updated Successfully");
//                    setVisible(false);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });



        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icon/updated.png"));
        Image i = image.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon il = new ImageIcon(i);
        JLabel lab = new JLabel(il);
        lab.setBounds(500, 60, 300, 300);
        panel.add(lab);

        JLabel label1 = new JLabel("Check-In Details:");
        label1.setBounds(124, 11, 222, 25);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(label1);

        JLabel label2 = new JLabel("ID:");
        label2.setBounds(25, 88, 46, 14);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label2);

        Choice c = new Choice();
        c.setBounds(248, 85, 140, 20);
        panel.add(c);
        try {
            Conn C = new Conn();
            ResultSet result = C.statement.executeQuery("select * from customer");
            while (result.next()) {
                c.add(result.getString("idNo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel label3 = new JLabel("Room Number:");
        label3.setBounds(25, 129, 107, 14);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label3);
        JTextField roomtxt = new JTextField();
        roomtxt.setBounds(248, 129, 140, 20);
        panel.add(roomtxt);

        JLabel label4 = new JLabel("Name:");
        label4.setBounds(25, 174, 97, 14);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label4);
        JTextField nametxt = new JTextField();
        nametxt.setBounds(248, 174, 140, 20);
        panel.add(nametxt);

        JLabel label5 = new JLabel("Checked-In:");
        label5.setBounds(25, 216, 97, 14);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label5);
        JTextField cktxt = new JTextField();
        cktxt.setBounds(248, 216, 140, 20);
        panel.add(cktxt);

        JLabel label6 = new JLabel("Amount Paid:");
        label6.setBounds(25, 261, 150, 14);
        label6.setForeground(Color.WHITE);
        label6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label6);
        JTextField aptxt = new JTextField();
        aptxt.setBounds(248, 261, 140, 20);
        panel.add(aptxt);

        JLabel label7 = new JLabel("Pending Amount:");
        label7.setBounds(25, 302, 150, 14);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(label7);
        JTextField patxt = new JTextField();
        patxt.setBounds(248, 302, 140, 20);
        panel.add(patxt);

        JButton update = new JButton("Update");
        update.setBounds(56, 378, 89, 22);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent E) {
                try {
                    Conn C = new Conn();
                    String q = c.getSelectedItem();
                    String room = roomtxt.getText();

                    String name = nametxt.getText();
                    String check = cktxt.getText();
                    String amount = aptxt.getText();
                    C.statement.executeUpdate("update customer set idNo ='" + room + "', name='" + name + "', checkin='" + check + "', deposit='" + amount + "' where roomno='" + q + "'");
                    JOptionPane.showMessageDialog(null, "Updated Successfully");
                    setVisible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        JButton back = new JButton("Back");
        back.setBounds(168, 378, 89, 22);
        panel.add(back);
    }

    public static void main(String[] args) {
        new UpdateCheck().setVisible(true);
    }
}
