/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.project.ui.patient;

import com.project.ecosystem.Business;
import com.project.ecosystem.DataLoader;
import com.project.ecosystem.Ecosystem;
import com.project.location.City;
import com.project.location.Country;
import com.project.location.State;
import com.project.organization.Organization;
import com.project.patient.PatientProfile;
import com.project.person.Address;
import com.project.person.Person;
import com.project.role.PatientRole;
import com.project.useraccount.UserAccount;
import com.project.utils.Utils;
import com.project.utils.Validation;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anjali
 */
public class PatientDetailUpdateWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form Update
     */
    private JPanel containerPanel;
    private UserAccount account;
    private PatientProfile patientProfile;
    
    
    public PatientDetailUpdateWorkAreaPanel(JPanel containerPanel, UserAccount account) {
        initComponents();
        this.containerPanel = containerPanel;
        this.account = account;

        Person person = account.getPerson();
        if (person instanceof PatientProfile) {
            patientProfile = (PatientProfile) person;
        }
        populateCityComboBox();
        populatePatientDetails();

    }

    public void populatePatientDetails() {

        txtUsername.setText(account.getUserName());
        txtPassword.setText(account.getPassword());
        txtFirst.setText(account.getPerson().getfName());
        txtLast.setText(account.getPerson().getlName());
        txtDOB.setText(String.valueOf(account.getPerson().getAge()));
        txtPhoneNumber.setText(String.valueOf(account.getPerson().getPhoneNum()));
        txtMemberNumber.setText(patientProfile.getInsuranceNumber());
        comboxCountry.setSelectedItem((String)account.getPerson().getAddress().getCountry());
        comboxSate.setSelectedItem((String)account.getPerson().getAddress().getState());
        comboBoxInsuranceGroup.setSelectedItem((String)patientProfile.getInsuranceGroup());
    }

    public void populateCityComboBox() {

        for (Country country : DataLoader.getCountries()) {
            comboxCountry.addItem(country.getName());
            for (State state : country.getStates()) {
                comboxSate.addItem(state.getName());
                
            }
        }
    }
    
    public void populateInsuranceGroup() {
        
        for(String entry : DataLoader.getInsuranceMap().keySet()) {
            comboBoxInsuranceGroup.addItem(entry);
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

        btnBack = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtFirst = new javax.swing.JTextField();
        txtLast = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblPhone = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        comboxCountry = new javax.swing.JComboBox<>();
        comboxSate = new javax.swing.JComboBox<>();
        lblCountry = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblIsurance = new javax.swing.JLabel();
        comboBoxInsuranceGroup = new javax.swing.JComboBox<>();
        txtMemberNumber = new javax.swing.JTextField();
        lblMemberNum = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 14, 54), 5), "Update Details", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18), new java.awt.Color(174, 14, 54))); // NOI18N

        btnBack.setBackground(new java.awt.Color(174, 14, 54));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblName.setForeground(new java.awt.Color(174, 14, 54));
        lblName.setText("First Name:");

        lblDOB.setForeground(new java.awt.Color(174, 14, 54));
        lblDOB.setText("Age:");

        lblLastName.setForeground(new java.awt.Color(174, 14, 54));
        lblLastName.setText("Last Name:");

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(174, 14, 54));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblPhone.setForeground(new java.awt.Color(174, 14, 54));
        lblPhone.setText("Phone Number:");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        lblState.setForeground(new java.awt.Color(174, 14, 54));
        lblState.setText("State:");

        comboxCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboxCountryItemStateChanged(evt);
            }
        });
        comboxCountry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboxCountryFocusGained(evt);
            }
        });
        comboxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxCountryActionPerformed(evt);
            }
        });

        comboxSate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboxSateItemStateChanged(evt);
            }
        });
        comboxSate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxSateActionPerformed(evt);
            }
        });

        lblCountry.setForeground(new java.awt.Color(174, 14, 54));
        lblCountry.setText("Country:");

        jLabel6.setForeground(new java.awt.Color(174, 14, 54));
        jLabel6.setText("Password:");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(174, 14, 54));
        jLabel7.setText("Username:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(174, 14, 54));
        jLabel8.setText("Address details");

        lblIsurance.setForeground(new java.awt.Color(174, 14, 54));
        lblIsurance.setText("Insurance group:");

        lblMemberNum.setForeground(new java.awt.Color(174, 14, 54));
        lblMemberNum.setText("Member number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(174, 14, 54));
        jLabel3.setText("Insurance details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(lblIsurance)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxInsuranceGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMemberNum)
                                    .addGap(38, 38, 38)
                                    .addComponent(txtMemberNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addComponent(lblCountry)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(comboxCountry, 0, 161, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36)
                                            .addComponent(comboxSate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(66, 66, 66))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblDOB)
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblName)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(536, 536, 536)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(33, 33, 33)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(192, 192, 192)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblLastName)
                                                .addComponent(jLabel6)
                                                .addComponent(lblPhone))
                                            .addGap(31, 31, 31)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(778, 778, 778))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboxCountry, comboxSate, txtDOB, txtFirst, txtLast, txtPassword, txtPhoneNumber, txtUsername});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnSave});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtUsername)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDOB))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPhone)))
                .addGap(53, 53, 53)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCountry)
                    .addComponent(lblState)
                    .addComponent(comboxSate))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIsurance)
                    .addComponent(lblMemberNum)
                    .addComponent(txtMemberNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxInsuranceGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnSave)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboxCountry, comboxSate, txtDOB, txtFirst, txtLast, txtPassword, txtPhoneNumber, txtUsername});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBack, btnSave});

    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void comboxSateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxSateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxSateActionPerformed

    private void comboxSateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboxSateItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_comboxSateItemStateChanged

    private void comboxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxCountryActionPerformed

    private void comboxCountryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboxCountryFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_comboxCountryFocusGained

    private void comboxCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboxCountryItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxCountryItemStateChanged

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        // TODO add your handling code here
        boolean errorFlag = false;
        String errorFields = "Please enter correct values for following fields: \n";

        if (!Utils.isValidText(txtFirst.getText())) {
            errorFields += "Invalid First Name\n";
            errorFlag = true;
        }

        if (!Utils.isValidText(txtLast.getText())) {
            errorFields += "Invalid Last Name\n";
            errorFlag = true;
        }

        if (!Utils.isValidText(txtDOB.getText())) {
            errorFields += "Invalid Date of Birth\n";
            errorFlag = true;
        }

        if (!errorFlag) {
            account.getPerson().setfName(txtFirst.getText());
            account.getPerson().setlName(txtLast.getText());
            //            account.getPerson().setPhoneNum(txtPhoneNumber.getText());
            account.setPassword(txtPassword.getText());

            JOptionPane.showMessageDialog(this, "Patient profile updated successfully for id : " + account.getPerson().getId(),
                    "FORM SUCCESS", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        containerPanel.remove(this);
        CardLayout cardLayout = (CardLayout) containerPanel.getLayout();
        cardLayout.previous(containerPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboBoxInsuranceGroup;
    private javax.swing.JComboBox<String> comboxCountry;
    private javax.swing.JComboBox<String> comboxSate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblIsurance;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMemberNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblState;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtLast;
    private javax.swing.JTextField txtMemberNumber;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}