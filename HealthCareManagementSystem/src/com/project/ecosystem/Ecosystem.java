/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.ecosystem;

import com.project.location.Country;
import com.project.network.Network;
import com.project.network.NetworkDirectory;
import com.project.organization.Organization;
import com.project.role.Role;
import com.project.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class Ecosystem extends Organization{
    private static Ecosystem ecosystem;
    private NetworkDirectory networkDirectory;
    private Network rootNetwork;
    private ArrayList<Country> countries;

    public Ecosystem(String systemName, String networkName, String networkType) {
        super(systemName, "SYSTEM");
        this.networkDirectory = new NetworkDirectory();
        this.rootNetwork = new Network(networkName, networkType);
        this.countries = new ArrayList<>();
    }
  
    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public Network getRootNetwork() {
        return rootNetwork;
    }

    public void setRootNetwork(Network rootNetwork) {
        this.rootNetwork = rootNetwork;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList <Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    public boolean checkUserNamePresent(String emailId)
    {
        for(Network network: getAllNetwork())
        {
            if(network.getEnterpriseDirectory().checkUserNamePresent(emailId))
                return true;
        }
        return false;
    }
    
    public ArrayList<Network> getAllNetwork()
    {
        
        ArrayList<Network> finalNetworkList=new ArrayList<>();
        finalNetworkList.add(rootNetwork);
        for(Network country: rootNetwork.getSubNetworkDirectory().getNetworkList())
        {
           finalNetworkList.add(country);
            for(Network state:country.getSubNetworkDirectory().getNetworkList())
            {
               finalNetworkList.add(state);
                for(Network city: state.getSubNetworkDirectory().getNetworkList())
                {
                    finalNetworkList.add(city);
                }
            }
        }
        return finalNetworkList;
}
    
   
}
