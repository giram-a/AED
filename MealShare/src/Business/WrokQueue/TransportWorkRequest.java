/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WrokQueue;

import Business.Common.Meal;

/**
 *
 * @author aniketgiram
 */
public class TransportWorkRequest extends WorkRequest{
    private String transportReqId;
    private static int count = 000;
    private Meal meal;
    private String transReqResult;
    private String comment;
    
    public TransportWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(count);
        transportReqId = sb.toString();
        count++;
    }

    public String getTransportReqId() {
        return transportReqId;
    }

    public void setTransportReqId(String transportReqId) {
        this.transportReqId = transportReqId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        TransportWorkRequest.count = count;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public String getTransReqResult() {
        return transReqResult;
    }

    public void setTransReqResult(String transReqResult) {
        this.transReqResult = transReqResult;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
