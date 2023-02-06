/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.project.ui.entadmin;

import com.project.employee.Employee;
import com.project.enterprise.Enterprise;
import com.project.organization.Organization;
import com.project.organization.Organization.Type;
import com.project.role.AdminRole;
import com.project.role.BloodInventoryManagerRole;
import com.project.role.DoctorRole;
import com.project.role.InsuranceClaimsManagerRole;
import com.project.role.LabAssistantRole;
import com.project.role.NurseRole;
import com.project.role.Pharmacist;
import com.project.role.ReceptionistRole;
import com.project.role.Role;
import com.project.ui.hospital.LoginPanel;
import com.project.useraccount.UserAccount;
import com.project.utils.Validation;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anjali
 */
public class EntAdminWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form EntAdminWorkAreaJpanel
     */
    JPanel containerPanel;
    UserAccount account;
    Enterprise enterprise;

    public EntAdminWorkAreaJpanel(JPanel containerPanel, UserAccount account, Enterprise enterprise) {
        initComponents();
        this.containerPanel = containerPanel;
        this.account = account;
        this.enterprise = enterprise;
        populateOrganizationComboBox();
        populatetableOrganizationDetails(enterprise);
        jLayManageOrganizationAdmin.setVisible(false);
        jBtnReceptionistCheck.setVisible(false);

    }

    public void populatetableOrganizationDetails(Enterprise enterprise) {
        DefaultTableModel model = (DefaultTableModel) tblOrganisationDetail.getModel();
        model.setRowCount(0);
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[3];
            row[0] = org;
            row[1] = org.getOrganizationID();
            row[2] = org.getOrganizationType();
            model.addRow(row);
        }
    }

    public void populatetableAdminDetails(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) tblAdminDetail.getModel();
        model.setRowCount(0);

        for (UserAccount userAc : organization.getUserAccountDirectory().getUserAccountList()) {
            Object[] row = new Object[2];
            row[0] = userAc;
            row[1] = userAc.isIsActive() ? "Active" : "Disable";
            model.addRow(row);

        }
    }

    public void populateOrganizationComboBox() {
        jComOrganizationType.removeAllItems();
        for (Type type : Organization.Type.values()) {
            jComOrganizationType.addItem(type);
        }

        this.enterprise = enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JtabOrganizationReportcreate = new javax.swing.JTabbedPane();
        jPanelManageOrganization = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganisationDetail = new javax.swing.JTable();
        jLayAddOrganization = new javax.swing.JLayeredPane();
        txtOrganizationName = new javax.swing.JTextField();
        jComOrganizationType = new javax.swing.JComboBox();
        btnAddOrganizationAdmin = new javax.swing.JButton();
        btnAddOrganization1 = new javax.swing.JButton();
        lblValidatorOgranType = new javax.swing.JLabel();
        lblValidatorOgranName = new javax.swing.JLabel();
        jLayManageOrganizationAdmin = new javax.swing.JLayeredPane();
        btnAddAdmintoOrganization = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAdminDetail = new javax.swing.JTable();
        txtAdminName = new javax.swing.JTextField();
        txtAdminEmailId = new javax.swing.JTextField();
        lblVladatoradminName = new javax.swing.JLabel();
        lblVladatoradminEmailID = new javax.swing.JLabel();
        jBtnReceptionistCheck = new javax.swing.JRadioButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btnLogOutEnt = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 14, 54), 5), "Enterprise Admin", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 18), new java.awt.Color(174, 14, 54))); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtabOrganizationReportcreate.setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelManageOrganization.setBackground(new java.awt.Color(255, 255, 255));

        tblOrganisationDetail.setBackground(new java.awt.Color(252, 246, 245));
        tblOrganisationDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 14, 54)));
        tblOrganisationDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oragnization Name", "Oragnization Id", "Organization Type"
            }
        ));
        jScrollPane1.setViewportView(tblOrganisationDetail);

        jLayAddOrganization.setBackground(new java.awt.Color(0, 0, 153));
        jLayAddOrganization.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 14, 54), 2), "Add Organization", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(174, 14, 54))); // NOI18N

        txtOrganizationName.setText("Enter Organization Name");
        txtOrganizationName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOrganizationNameFocusGained(evt);
            }
        });
        txtOrganizationName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrganizationNameActionPerformed(evt);
            }
        });

        jComOrganizationType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComOrganizationType.setSelectedIndex(-1);

        btnAddOrganizationAdmin.setBackground(new java.awt.Color(174, 14, 54));
        btnAddOrganizationAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrganizationAdmin.setText("ADD MEMBERS TO SELECTED ORG");
        btnAddOrganizationAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationAdminActionPerformed(evt);
            }
        });

        btnAddOrganization1.setBackground(new java.awt.Color(174, 14, 54));
        btnAddOrganization1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrganization1.setText("ADD NEW ORGANIZATION");
        btnAddOrganization1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganization1ActionPerformed(evt);
            }
        });

        jLayAddOrganization.setLayer(txtOrganizationName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayAddOrganization.setLayer(jComOrganizationType, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayAddOrganization.setLayer(btnAddOrganizationAdmin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayAddOrganization.setLayer(btnAddOrganization1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayAddOrganization.setLayer(lblValidatorOgranType, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayAddOrganization.setLayer(lblValidatorOgranName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayAddOrganizationLayout = new javax.swing.GroupLayout(jLayAddOrganization);
        jLayAddOrganization.setLayout(jLayAddOrganizationLayout);
        jLayAddOrganizationLayout.setHorizontalGroup(
            jLayAddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayAddOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayAddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayAddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtOrganizationName)
                        .addComponent(lblValidatorOgranName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComOrganizationType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jLayAddOrganizationLayout.createSequentialGroup()
                        .addGroup(jLayAddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddOrganizationAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddOrganization1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValidatorOgranType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayAddOrganizationLayout.setVerticalGroup(
            jLayAddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayAddOrganizationLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(txtOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValidatorOgranName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jComOrganizationType, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jLayAddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValidatorOgranType, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddOrganization1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddOrganizationAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayManageOrganizationAdmin.setBackground(new java.awt.Color(0, 0, 153));
        jLayManageOrganizationAdmin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(174, 14, 54), 2), "Manage Organization Members", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14), new java.awt.Color(174, 14, 54))); // NOI18N

        btnAddAdmintoOrganization.setBackground(new java.awt.Color(174, 14, 54));
        btnAddAdmintoOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAdmintoOrganization.setText("ADD NEW ORG. MEMBER");
        btnAddAdmintoOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdmintoOrganizationActionPerformed(evt);
            }
        });

        tblAdminDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Status"
            }
        ));
        jScrollPane2.setViewportView(tblAdminDetail);

        txtAdminName.setText("Enter Full Name");
        txtAdminName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAdminNameFocusGained(evt);
            }
        });

        txtAdminEmailId.setText("Enter Email Id");
        txtAdminEmailId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAdminEmailIdFocusGained(evt);
            }
        });

        jBtnReceptionistCheck.setText("isReceptionist");

        jLayManageOrganizationAdmin.setLayer(btnAddAdmintoOrganization, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayManageOrganizationAdmin.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayManageOrganizationAdmin.setLayer(txtAdminName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayManageOrganizationAdmin.setLayer(txtAdminEmailId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayManageOrganizationAdmin.setLayer(lblVladatoradminName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayManageOrganizationAdmin.setLayer(lblVladatoradminEmailID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayManageOrganizationAdmin.setLayer(jBtnReceptionistCheck, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayManageOrganizationAdminLayout = new javax.swing.GroupLayout(jLayManageOrganizationAdmin);
        jLayManageOrganizationAdmin.setLayout(jLayManageOrganizationAdminLayout);
        jLayManageOrganizationAdminLayout.setHorizontalGroup(
            jLayManageOrganizationAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayManageOrganizationAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayManageOrganizationAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayManageOrganizationAdminLayout.createSequentialGroup()
                        .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdminEmailId))
                    .addGroup(jLayManageOrganizationAdminLayout.createSequentialGroup()
                        .addComponent(lblVladatoradminName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(lblVladatoradminEmailID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayManageOrganizationAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddAdmintoOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jLayManageOrganizationAdminLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jBtnReceptionistCheck)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayManageOrganizationAdminLayout.setVerticalGroup(
            jLayManageOrganizationAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayManageOrganizationAdminLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jLayManageOrganizationAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAdminName)
                    .addComponent(txtAdminEmailId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayManageOrganizationAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVladatoradminName, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVladatoradminEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jBtnReceptionistCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddAdmintoOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelManageOrganizationLayout = new javax.swing.GroupLayout(jPanelManageOrganization);
        jPanelManageOrganization.setLayout(jPanelManageOrganizationLayout);
        jPanelManageOrganizationLayout.setHorizontalGroup(
            jPanelManageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageOrganizationLayout.createSequentialGroup()
                .addGroup(jPanelManageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelManageOrganizationLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLayAddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayManageOrganizationAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelManageOrganizationLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelManageOrganizationLayout.setVerticalGroup(
            jPanelManageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManageOrganizationLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanelManageOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayAddOrganization)
                    .addComponent(jLayManageOrganizationAdmin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JtabOrganizationReportcreate.addTab("Manage Organization", jPanelManageOrganization);

        add(JtabOrganizationReportcreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1310, 680));

        jLayeredPane1.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1130, -1));

        btnLogOutEnt.setText("LogOut");
        btnLogOutEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutEntActionPerformed(evt);
            }
        });
        add(btnLogOutEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrganizationNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrganizationNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrganizationNameActionPerformed

    private void txtOrganizationNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOrganizationNameFocusGained
        // TODO add your handling code here:

        txtOrganizationName.setText("");
        txtOrganizationName.setForeground(Color.BLACK);

    }//GEN-LAST:event_txtOrganizationNameFocusGained

    private void txtAdminNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdminNameFocusGained
        // TODO add your handling code here:

        txtAdminName.setText("");
        txtAdminName.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtAdminNameFocusGained

    private void txtAdminEmailIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdminEmailIdFocusGained
        // TODO add your handling code here:

        txtAdminEmailId.setText("");
        txtAdminEmailId.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtAdminEmailIdFocusGained

    private void btnAddOrganization1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganization1ActionPerformed
        // TODO add your handling code here:

        boolean errorFlag = false;

        lblValidatorOgranName.setText("");
        lblValidatorOgranType.setText(" ");
        if (!Validation.validateTextFieldsForNonEmpty(txtOrganizationName) || txtOrganizationName.getText().equalsIgnoreCase("Enter Organization Name")) {
            errorFlag = true;
            lblValidatorOgranName.setText("Please enter organization name");
        }

        if (!Validation.validateTextFieldsForString(txtOrganizationName)) {
            errorFlag = true;
            lblValidatorOgranName.setText("Only alphabets and -sign allowed for organization name");
        }

        if (String.valueOf(jComOrganizationType.getSelectedItem()).equalsIgnoreCase("Please select organization type")) {
            errorFlag = true;
            lblValidatorOgranType.setText("Please select an organization type");
        }

        if (!errorFlag) {
            Type type = (Type) jComOrganizationType.getSelectedItem();
            Organization organization = enterprise.getOrganizationDirectory().createOrganization(txtOrganizationName.getText(), type);
            populatetableOrganizationDetails(enterprise);
        }
    }//GEN-LAST:event_btnAddOrganization1ActionPerformed

    private void btnAddOrganizationAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationAdminActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrganisationDetail.getSelectedRow();

        if (selectedRow >= 0) {
            Organization organization = (Organization) tblOrganisationDetail.getValueAt(selectedRow, 0);
            jLayManageOrganizationAdmin.setVisible(true);
            if (organization.getOrganizationType().equalsIgnoreCase(Organization.Type.ADMIN.getValue())) {
                jBtnReceptionistCheck.setVisible(true);
            }
            else {
                jBtnReceptionistCheck.setVisible(false);
            }

            populatetableAdminDetails(organization);
        } else {
            JOptionPane.showMessageDialog(null, "Please select organization to add admin", "No selection", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnAddOrganizationAdminActionPerformed

    private void btnAddAdmintoOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdmintoOrganizationActionPerformed

        // TODO add your handling code here:
        boolean errorFlag = false;
        lblVladatoradminName.setText("");
        lblVladatoradminEmailID.setText("");

        lblVladatoradminName.setForeground(Color.red);
        lblVladatoradminEmailID.setForeground(Color.red);
        int selectedRow = tblOrganisationDetail.getSelectedRow();

        if (selectedRow >= 0) {
            Organization organization = (Organization) tblOrganisationDetail.getValueAt(selectedRow, 0);
            if (!Validation.validateTextFieldsForNonEmpty(txtAdminName) || txtAdminName.getText().equalsIgnoreCase("Admin first name:")) {
                if (!Validation.validateTextFieldsForString(txtAdminName)) {
                    errorFlag = true;
                    lblVladatoradminName.setEnabled(true);
                    lblVladatoradminName.setText("Please enter valid name");
                }
            }

            if (!Validation.validateTextFieldsForNonEmpty(txtAdminEmailId) || txtAdminEmailId.getText().equalsIgnoreCase("Admin Email id:")) {
                errorFlag = true;
                lblVladatoradminEmailID.setEnabled(true);
                lblVladatoradminEmailID.setText("Please enter admin email id");
            }

            if (!Validation.validateTextFieldsForEmailId(txtAdminEmailId)) {
                errorFlag = true;
                lblVladatoradminEmailID.setEnabled(true);
                lblVladatoradminEmailID.setText("Please enter valid email id");
            }

            if (!errorFlag) {

                if (!enterprise.getOrganizationDirectory().checkifUserNameisPresent(txtAdminEmailId.getText().trim())) {
                    Organization.Type selectedOrganizationType = Organization.Type.fromString(organization.getOrganizationType());
                    UserAccount ua = null;
                    String inputAdminName = txtAdminName.getText().trim();
                    String inputPassword = inputAdminName;

                    Employee employee = organization.getEmployeeDirectory().addNewEMployee(inputAdminName);
                    switch (selectedOrganizationType) {
                        case ADMIN:
                            if (!jBtnReceptionistCheck.isSelected()) {
                                ua = organization.getUserAccountDirectory().createUserAccount(inputAdminName, inputPassword, employee, new AdminRole());
                            } else {
                                ua = organization.getUserAccountDirectory().createUserAccount(inputAdminName, inputPassword, employee, new ReceptionistRole());
                            }

                            break;
                        case DOCTOR:
                            ua = organization.getUserAccountDirectory().createUserAccount(inputAdminName, inputPassword, employee, new DoctorRole());
                            break;
                        case NURSE:
                            ua = organization.getUserAccountDirectory().createUserAccount(inputAdminName, inputPassword, employee, new NurseRole());
                            break;
                        case LABORATORY:
                            ua = organization.getUserAccountDirectory().createUserAccount(inputAdminName, inputPassword, employee, new LabAssistantRole());
                            break;
                        case PHARMACY:
                            ua = organization.getUserAccountDirectory().createUserAccount(inputAdminName, inputPassword, employee, new Pharmacist());
                            break;
                        case INSURANCE:
                            ua = organization.getUserAccountDirectory().createUserAccount(inputAdminName, inputPassword, employee, new InsuranceClaimsManagerRole());
                            break;
                        case BLOODBANKINVENTORY:
                            ua = organization.getUserAccountDirectory().createUserAccount(inputAdminName, inputPassword, employee, new BloodInventoryManagerRole());
                            break;
                        default:
                            break;
                    }

                    JOptionPane.showMessageDialog(null, "New organization admin is created successfully for " + ua.getUserName(), "User account created", JOptionPane.INFORMATION_MESSAGE);
                    populatetableAdminDetails(organization);

                    txtAdminName.setText("");
                    txtAdminEmailId.setText("");
                    jBtnReceptionistCheck.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "User account with email id" + txtAdminName.getText().trim() + " already exists", "Duplicate entry", JOptionPane.ERROR_MESSAGE);
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select organization to add member", "No selection", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnAddAdmintoOrganizationActionPerformed

    private void btnLogOutEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutEntActionPerformed
        // TODO add your handling code here:

        containerPanel.removeAll();

    }//GEN-LAST:event_btnLogOutEntActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JtabOrganizationReportcreate;
    private javax.swing.JButton btnAddAdmintoOrganization;
    private javax.swing.JButton btnAddOrganization1;
    private javax.swing.JButton btnAddOrganizationAdmin;
    private javax.swing.JButton btnLogOutEnt;
    private javax.swing.JRadioButton jBtnReceptionistCheck;
    private javax.swing.JComboBox jComOrganizationType;
    private javax.swing.JLayeredPane jLayAddOrganization;
    private javax.swing.JLayeredPane jLayManageOrganizationAdmin;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanelManageOrganization;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblValidatorOgranName;
    private javax.swing.JLabel lblValidatorOgranType;
    private javax.swing.JLabel lblVladatoradminEmailID;
    private javax.swing.JLabel lblVladatoradminName;
    private javax.swing.JTable tblAdminDetail;
    private javax.swing.JTable tblOrganisationDetail;
    private javax.swing.JTextField txtAdminEmailId;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtOrganizationName;
    // End of variables declaration//GEN-END:variables
}
