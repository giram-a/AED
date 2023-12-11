/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WrokQueue;

import Business.Common.Donation;

/**
 *
 * @author aniketgiram
 */
public class DonationRequest extends WorkRequest{
    private String dBy;
    private String rId;
    private static int count = 000;
    private Donation donation;
   
    public DonationRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("DONATION");
        sb.append(count);
        rId = sb.toString();
        count++;
    }

    public String getDonatedBy() {
        return dBy;
    }

    public void setDonatedBy(String dBy) {
        this.dBy = dBy;
    }

    public void setDonation(Donation donation) {
        this.donation = donation;
    }

    public Donation getDonation() {
        return donation;
    }
    

    @Override
    public String toString() {
        return this.rId;
    }
}
