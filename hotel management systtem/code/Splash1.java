import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash1 extends JFrame {
    Splash1(Reception reception) {
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));
        JLabel label = new JLabel(image);
        label.setBounds(0, 0, 1000, 500);
        add(label);

        setLayout(null);
        setLocation(500, 80);
        setSize(1000, 500);
        setUndecorated(true);
        setVisible(true);

        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                reception.setVisible(false);
                new Dashboard2();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
}