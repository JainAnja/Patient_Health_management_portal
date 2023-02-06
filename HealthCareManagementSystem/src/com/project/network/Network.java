/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.network;

import com.project.enterprise.EnterpriseDirectory;

/**
 *
 * @author Anjali
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private static int count=0;
    private int networkId;
    private String networkType;
    private NetworkDirectory subNetworkDirectory;

    public Network(String name, String networkType) {
        this.name = name;
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.networkId = ++count;
        this.networkType = networkType;
        this.subNetworkDirectory = new NetworkDirectory();
    }
    
     public enum NetworkType {
    
        GLOBAL("Global Network"),
        COUNTRY("Country Network"),
        STATE("State Network");
        
        
        public String value;
        
        private NetworkType(String value)
        {
            this.value = value;
        }
        
        public String getValue()
        {
            return value;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Network.count = count;
    }

    public int getNetworkId() {
        return networkId;
    }

    public void setNetworkId(int networkId) {
        this.networkId = networkId;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public NetworkDirectory getSubNetworkDirectory() {
        return subNetworkDirectory;
    }

    public void setSubNetworkDirectory(NetworkDirectory subNetworkDirectory) {
        this.subNetworkDirectory = subNetworkDirectory;
    }
    
    
     public Network findStateNetwork(String countryName, String stateName)
    {
        Network rootNetwork=this;
        for(Network countryNetwork:rootNetwork.getSubNetworkDirectory().getNetworkList())
        {
            for(Network stateNetwork:countryNetwork.getSubNetworkDirectory().getNetworkList())
            {
                if(countryNetwork.getName().equalsIgnoreCase(countryName) && stateNetwork.getName().equalsIgnoreCase(stateName))
                {
                    return stateNetwork;
                }   
            }
        }
        return null;
    }
    
    
      
    public Network findCountryNetwork(String countryName)
    {
         Network rootNetwork=this;
        for(Network countryNetwork:rootNetwork.getSubNetworkDirectory().getNetworkList())
        {
            if(countryNetwork.getName().equalsIgnoreCase(countryName))
            return countryNetwork;
        }
        return null;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
     
     
     
     
    
}
