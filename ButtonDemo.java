/*
* modified version of the code where pressing a "fire" button does the same 
* thing as pressing the "f" key and a "water" button does the same thing as 
* pressing any key other than "f".
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyListener;


public class ButtonDemo extends javax.swing.JFrame implements KeyListener {
    ActionEvent evt;
    

    public ButtonDemo() {
        initComponents();
        FireButton.addKeyListener(this);
    }

    @SuppressWarnings("unchecked")                       
    private void initComponents() {

        FireButton = new javax.swing.JButton();
        keyLabel = new javax.swing.JLabel();
        WaterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FireButton.setText("Fire");
        FireButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FireButtonActionPerformed(evt);
            }
        });

        keyLabel.setText("Press fire button");

        WaterButton.setText("Water");
        WaterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(keyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(FireButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(WaterButton)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FireButton)
                    .addComponent(WaterButton))
                .addGap(67, 67, 67)
                .addComponent(keyLabel)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void FireButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.evt = evt;
        keyLabel.setText("You pressed the fire button");
    }                                          

    private void WaterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        keyLabel.setText("You pressed the wrong key");
    }                                           

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ButtonDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo().setVisible(true);
            }
        });
    }   
    
    public void keyTyped(KeyEvent e) {
            // not putting anything in this method
    }

    public void keyPressed (KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_F) {
            FireButtonActionPerformed(evt);
//                keyLabel.setText("You pressed the fire button");
        } else {
            WaterButtonActionPerformed(evt);
//                keyLabel.setText("You pressed the wrong key");
        }
    }
    
    public void keyReleased(KeyEvent txt) {
            // not putting anything in this method
    }
                    
    private javax.swing.JButton FireButton;
    private javax.swing.JButton WaterButton;
    private javax.swing.JLabel keyLabel;                 
}
