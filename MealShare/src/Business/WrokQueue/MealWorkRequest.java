/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WrokQueue;

import Business.Common.Meal;
import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author aniketgiram
 */
public class MealWorkRequest extends WorkRequest{
    private String sendDataRequestId;
    private static int count = 000;
    private ArrayList<Meal> meals;
    private String reqResult;
    
    public MealWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("00");
        sb.append(count);
        sendDataRequestId = sb.toString();
        count++;
        meals = new ArrayList<>();
    }
    

    @Override
    public String toString() {
        return this.sendDataRequestId;       
    }

    public String getSendDataRequestId() {
        return sendDataRequestId;
    }

    public void setSendDataRequestId(String sendDataRequestId) {
        this.sendDataRequestId = sendDataRequestId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MealWorkRequest.count = count;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }
    
    public Meal getMealByID(String id){
        Optional<Meal> m = meals.stream().filter((data) -> data.getMealID().equals(sendDataRequestId)).findFirst();
        return m.get();
    }

    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }

    
    public String getReqResult() {
        return reqResult;
    }

    public void setReqResult(String reqResult) {
        this.reqResult = reqResult;
    }
    

}
