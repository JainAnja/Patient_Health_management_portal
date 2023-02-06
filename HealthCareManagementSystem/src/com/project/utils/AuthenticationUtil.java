/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.utils;

import com.project.ecosystem.Business;
import com.project.enterprise.Enterprise;
import com.project.network.Network;
import com.project.organization.Organization;
import com.project.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anjali
 */
public class AuthenticationUtil {

    private Business business;
    private JPanel containerPanel;

    public AuthenticationUtil(Business business, JPanel containerPanel) {
        this.business = business;
        this.containerPanel = containerPanel;
    }

    public void authenticateUser(String userName, String password) {
        UserAccount ua = null;
        Enterprise inEnterprise = null;

        ua = business.getSystemorg().getUserAccountDirectory().authenticateUser(userName, password);

        if (ua != null) {
            if (!ua.isIsActive()) {

                JOptionPane.showMessageDialog(null, "Sorry,it seems your account is disabled.", "Login Denied", JOptionPane.ERROR_MESSAGE);
                return;
            }
            CardLayout layout = (CardLayout) containerPanel.getLayout();
            containerPanel.add("workArea", ua.getRole().createWorkArea(containerPanel, ua, null, null, business.getSystemorg()));
            layout.next(containerPanel);
            return;
        }

        Network rootNetwork = business.getSystemorg().getRootNetwork();

        for (Enterprise enterprise : rootNetwork.getEnterpriseDirectory().getEnterpriseList()) {
            ua = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
            if (ua != null) {
                inEnterprise = enterprise;
                CardLayout layout = (CardLayout) containerPanel.getLayout();
                containerPanel.add("workArea", ua.getRole().createWorkArea(containerPanel, ua, null, inEnterprise, business.getSystemorg()));
                layout.next(containerPanel);
                return;
            }
        }

        if (ua == null) {
            for (Network countryNetwork : rootNetwork.getSubNetworkDirectory().getNetworkList()) {
                for (Enterprise enterprise : countryNetwork.getEnterpriseDirectory().getEnterpriseList()) {

                    ua = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (ua != null) {
                        inEnterprise = enterprise;
                        CardLayout layout = (CardLayout) containerPanel.getLayout();
                        containerPanel.add("workArea", ua.getRole().createWorkArea(containerPanel, ua, null, inEnterprise, business.getSystemorg()));
                        layout.next(containerPanel);
                        return;
                    }

                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        ua = org.getUserAccountDirectory().authenticateUser(userName, password);
                        if (ua != null) {
                            inEnterprise = enterprise;
                            CardLayout layout = (CardLayout) containerPanel.getLayout();
                            containerPanel.add("workArea", ua.getRole().createWorkArea(containerPanel, ua, org, inEnterprise, business.getSystemorg()));
                            layout.next(containerPanel);
                            return;
                        }
                    }

                }

            }
        }

        if (ua == null) {
            for (Network countryNetwork : rootNetwork.getSubNetworkDirectory().getNetworkList()) {
                for (Network stateNetwork : countryNetwork.getSubNetworkDirectory().getNetworkList()) {
                    for (Enterprise enterprise : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {

                        ua = enterprise.getUserAccountDirectory().authenticateUser(userName, password);

                        if (ua != null) {
                            inEnterprise = enterprise;
                            CardLayout layout = (CardLayout) containerPanel.getLayout();

                            containerPanel.add("workArea", ua.getRole().createWorkArea(containerPanel, ua, null, inEnterprise, business.getSystemorg()));
                            layout.next(containerPanel);
                            return;
                        }

                        ua = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        if (ua != null) {
                            inEnterprise = enterprise;
                            CardLayout layout = (CardLayout) containerPanel.getLayout();
                            containerPanel.add("workArea", ua.getRole().createWorkArea(containerPanel, ua, null, inEnterprise, business.getSystemorg()));
                            layout.next(containerPanel);
                            return;
                        }

                        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            ua = org.getUserAccountDirectory().authenticateUser(userName, password);
                            if (ua != null) {
                                inEnterprise = enterprise;
                                CardLayout layout = (CardLayout) containerPanel.getLayout();
                                containerPanel.add("workArea", ua.getRole().createWorkArea(containerPanel, ua, org, inEnterprise, business.getSystemorg()));
                                layout.next(containerPanel);
                                return;
                            }
                        }

                    }
                }

            }
        }

        if (ua == null) {
            JOptionPane.showMessageDialog(null, "Incorrect credentials for user", "Login Denied", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}
