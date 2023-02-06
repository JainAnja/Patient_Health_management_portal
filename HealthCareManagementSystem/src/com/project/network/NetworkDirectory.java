/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.network;

import java.util.ArrayList;

/**
 *
 * @author Anjali
 */
public class NetworkDirectory {
    
    
    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        this.networkList = new ArrayList();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
     
    public Network createAndAddNetwork(String name, String networkType)
    {
        Network network = new Network(name,networkType);
        networkList.add(network);
        return network;
    }
    
    
    public boolean isPresent(Network network)
    {
        for(Network net:networkList)
        {
            if(net==network)
            {
                return true;
            }
        }
        return false;
    }
    

public boolean isPresent(String networkName)
    {
        for(Network network:networkList)
        {
            if(network.getName().equalsIgnoreCase(networkName))
            {
                return true;
            }
        }
        return false;
    }

    
    
}
