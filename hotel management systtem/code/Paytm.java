import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Paytm extends JFrame {

    Paytm() {
        setTitle("Paytm Launcher");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));

        JButton openPaytmButton = new JButton("Open Paytm Website");
        openPaytmButton.setBounds(100, 50, 200, 40);
        add(openPaytmButton);
        openPaytmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPaytmWebsite();
            }
        });

        JButton backButton = new JButton("Back");
        backButton.setBounds(100, 100, 200, 40);
        add(backButton);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });

        setSize(400, 200);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setVisible(true);
    }
private void openPaytmWebsite() {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new java.net.URI("https://paytm.com/rent-payment"));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Failed to open the website: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Paytm().setVisible(true);
    }
}
