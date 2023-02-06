/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.ui.hospital;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.project.ecosystem.Business;
import com.project.ecosystem.Ecosystem;
import com.project.db4o.DB4OUtil;
import com.project.enterprise.Enterprise;
import com.project.network.Network;
import com.project.organization.Organization;
import com.project.utils.Utils;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import com.project.ui.systemadmin.SysAdminJpanel;
import com.project.useraccount.UserAccount;
import com.project.utils.AuthenticationUtil;
import com.project.utils.Validation;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Anjali
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Business business;
    private Ecosystem ecosystem;
    private DB4OUtil db4oUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
        initComponents();
        this.business = db4oUtil.retrieveSystem();
        //this.ecosystem = new Ecosystem("System", "ROOT", "Root"); // This is for test purposes
        displayImage();
        
        
    }
    
    public void displayImage() {
        try {
            String fileName = new File("src/Resource/01.png").getCanonicalPath();
            BufferedImage myPicture = ImageIO.read(new File(fileName));
            Image img = myPicture.getScaledInstance(containerPanel.getWidth(),
                    containerPanel.getHeight(), Image.SCALE_SMOOTH);
            photoLbl.setIcon(new ImageIcon(img));
        } catch (IOException ioe) {
            System.out.println("Exception" + ioe);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        loginPanel = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblPic = new javax.swing.JLabel();
        containerPanel = new javax.swing.JPanel();
        photoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        loginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 14, 54), 2));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(174, 14, 54));
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOG IN");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        loginPanel.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 123, 45));

        btnLogin.setBackground(new java.awt.Color(174, 14, 54));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOG OUT");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        loginPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 123, 45));
        loginPanel.add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 210, 70));

        splitPane.setLeftComponent(loginPanel);

        containerPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 14, 54), 2));
        containerPanel.setPreferredSize(new java.awt.Dimension(1050, 800));
        containerPanel.setLayout(new java.awt.CardLayout());
        containerPanel.add(photoLbl, "card2");

        splitPane.setRightComponent(containerPanel);

        getContentPane().add(splitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
       
         db4oUtil.storeSystem(business);
        LoginPanel loginPanel = new LoginPanel(containerPanel, business);
        //SplitPane.setRightComponent(loginPanel);
        containerPanel.add(loginPanel);
        CardLayout cardLayout = (CardLayout) containerPanel.getLayout();
//        btnlogout.setEnabled(false);
        cardLayout.next(containerPanel);
       
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        LoginPanel loginPanel = new LoginPanel(containerPanel, business);
        //SplitPane.setRightComponent(loginPanel);
        containerPanel.add(loginPanel);
        CardLayout cardLayout = (CardLayout) containerPanel.getLayout();
        cardLayout.next(containerPanel);
//        btnlogout.setEnabled(true);
        

    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel lblPic;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel photoLbl;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables

}