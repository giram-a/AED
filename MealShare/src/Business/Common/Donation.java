/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Common;

/**
 *
 * @author aniketgiram
 */
public class Donation {
    private String amt;
    private String dDate;
    private String acno;
    private String acname;
    public static String toAcNo = "7666700608";
    
    private static int count = 0;
    private int dId;
    
    public Donation()
    {
     count++;
     dId = count;
    }
    

    public String getAmount() {
        return amt;
    }

    public void setAmount(String amt) {
        this.amt = amt;
    }

    public String getDonationDate() {
        return dDate;
    }

    public void setDonationDate(String dDate) {
        this.dDate = dDate;
    }

    @Override
    public String toString() {
        return String.valueOf(dId);
    }

    public String getAccntNumber() {
        return acno;
    }

    public void setAccntNumber(String acno) {
        this.acno = acno;
    }

    public String getAccntName() {
        return acname;
    }

    public void setAccntName(String acname) {
        this.acname = acname;
    }

    public String getToAccountNumber() {
        return toAcNo;
    }
    
}
