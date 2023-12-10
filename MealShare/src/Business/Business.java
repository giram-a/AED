/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Roles.Role;
import Business.Roles.SystemAdminRole;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author aniketgiram
 */
public class Business extends Organization{
    private static Business business;
    final private ArrayList<Network> networkList;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    public Business() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network addNetwork()
    {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
    
    public void redirection(JPanel MainCardLayout, String panelName, JPanel panel){
        MainCardLayout.add(panelName, panel);
        CardLayout layout = (CardLayout) MainCardLayout.getLayout();
        layout.next(MainCardLayout);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
}
