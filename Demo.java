import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public final class Demo extends UploadAbstract implements KeyListener {
    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press fire button");

    Demo() {
            keyText.addKeyListener(this);
            setSize(400, 400);
            setVisible(true);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            BorderLayout layout = new BorderLayout();
            setLayout(layout);
            add(keyLabel, BorderLayout.NORTH);
            add(keyText, BorderLayout.CENTER);
    }

    public void keyTyped(KeyEvent e) {
            // not putting anything in this method
    }

    public void keyPressed (KeyEvent e) {

            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_F) {

                    keyLabel.setText("You pressed the fire button");
            } else {

                    keyLabel.setText("You pressed the wrong key");
            }
    }

    public void keyReleased(KeyEvent txt) {
            // not putting anything in this method
    }

    public static void main(String[] args) {
            Demo go = new Demo();
    }
}