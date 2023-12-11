/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WrokQueue;

import Business.Common.Meal;
import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class NeedMealWorkRequest extends WorkRequest{
    private String rId;
    private static int count = 000;
    private String comments;
    private Meal meal;
    private String reqResult;
    
    public NeedMealWorkRequest(){
        StringBuffer sb = new StringBuffer();
        sb.append("REQ");
        sb.append(count);
        rId = sb.toString();
        count++;
    }

    public String getrId() {
        return rId;
    }

    public void setrId(String rId) {
        this.rId = rId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        NeedMealWorkRequest.count = count;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getReqResult() {
        return reqResult;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }
    
    @Override
    public String toString() {
        return this.rId;
    }
}
