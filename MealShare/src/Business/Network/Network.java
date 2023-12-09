/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.enterprise.EnterpriseDirectory;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class Network {

    private String cntry;

    private String st;

    private String city;
    
    private String name;

    private EnterpriseDirectory enterpDirect;
    

    public Network() {
        enterpDirect = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpDirect;
    }

    public String getCountry() {
        return cntry;
    }

    public void setCountry(String cntry) {
        this.cntry = cntry;
    }

    public String getState() {
        return st;
    }

    public void setState(String st) {
        this.st = st;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return this.city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public ArrayList<Integer> getZipCodesInRange(String city)
    {
        ArrayList<Integer> zipCodeList = new ArrayList<>();
        zipCodeList.add(01245);
        zipCodeList.add(02135);
        
        return zipCodeList;
    }
}
