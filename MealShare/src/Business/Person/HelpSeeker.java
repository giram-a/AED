/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import Business.Common.Meal;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author aniketgiram
 */
public class HelpSeeker extends Person{
    
    private String helpSeekerId;
    private static int count = 001;
    private boolean shareVitalInfo = false;
    private boolean hasSensorDevice = false;
    private boolean hasCardiacProb = false;
    private boolean getAlerts = false;
    private ArrayList<Meal> nutritionList;
    
    
    public HelpSeeker()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("CUST");
        sb.append(count);
        helpSeekerId = sb.toString();
        count++;
        nutritionList = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return this.getName();
    }

  
    public String getHelpSeekerId() {
        return helpSeekerId;
    }
    
    private volatile boolean stop = false;
    private int counter = 0;
   
//    public ArrayList<VitalSign> getVitalSignList() {
//        return vitalSignList;
//    }
//
//    public boolean isShareVitalInfo() {
//        return shareVitalInfo;
//    }
//
//    public void setShareVitalInfo(boolean shareVitalInfo) {
//        this.shareVitalInfo = shareVitalInfo;
//    }
//
//    public boolean isHasSensorDevice() {
//        return hasSensorDevice;
//    }
//
//    public void setHasSensorDevice(boolean hasSensorDevice) {
//        this.hasSensorDevice = hasSensorDevice;
//    }
//
//    public boolean isGetAlerts() {
//        return getAlerts;
//    }
//
//    public void setGetAlerts(boolean getAlerts) {
//        this.getAlerts = getAlerts;
//    }
//
//    public boolean isHasCardiacProb() {
//        return hasCardiacProb;
//    }
//
//    public void setHasCardiacProb(boolean hasCardiacProb) {
//        this.hasCardiacProb = hasCardiacProb;
//    }
//
//    public boolean isSendDataToDoctor() {
//        return sendDataToDoctor;
//    }
//
//    public void setSendDataToDoctor(boolean sendDataToDoctor) {
//        this.sendDataToDoctor = sendDataToDoctor;
//    }
 
}
