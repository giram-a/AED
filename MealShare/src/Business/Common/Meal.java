/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Common;

import Business.UserAccount.UserAccount;
import Business.WrokQueue.NeedMealWorkRequest;
import Business.WrokQueue.TransportWorkRequest;

/**
 *
 * @author aniketgiram
 */
public class Meal {
    private String mealID;
    private String meal;
    private String protein;
    private String carbs;
    private String calories;
    private String date;
    private String type;
    private Boolean assigned;
    private String mealAssignedTo;
    private Boolean volunteerReqSent;
    private String volunterNeedReqID;
    private NeedMealWorkRequest volunteerNeedRequest;
    private TransportWorkRequest transportWorkRequest;
    private Boolean transportReqSent;
    private UserAccount mealAssignedUser;
    private String mealFeedback;

    public String getMealID() {
        return mealID;
    }

    public void setMealID(String mealID) {
        this.mealID = mealID;
    }

    
    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getAssigned() {
        return assigned;
    }

    public void setAssigned(Boolean assigned) {
        this.assigned = assigned;
    }

    public String getMealAssignedTo() {
        return mealAssignedTo;
    }

    public void setMealAssignedTo(String mealAssignedTo) {
        this.mealAssignedTo = mealAssignedTo;
    }

    public Boolean getVolunteerReqSent() {
        return volunteerReqSent;
    }

    public void setVolunteerReqSent(Boolean volunteerReqSent) {
        this.volunteerReqSent = volunteerReqSent;
    }

    public String getVolunterNeedReqID() {
        return volunterNeedReqID;
    }

    public void setVolunterNeedReqID(String volunterNeedReqID) {
        this.volunterNeedReqID = volunterNeedReqID;
    }

    public NeedMealWorkRequest getVolunteerNeedRequest() {
        return volunteerNeedRequest;
    }

    public void setVolunteerNeedRequest(NeedMealWorkRequest volunteerNeedRequest) {
        this.volunteerNeedRequest = volunteerNeedRequest;
    }

    public TransportWorkRequest getTransportWorkRequest() {
        return transportWorkRequest;
    }

    public void setTransportWorkRequest(TransportWorkRequest transportWorkRequest) {
        this.transportWorkRequest = transportWorkRequest;
    }

    public Boolean getTransportReqSent() {
        return transportReqSent;
    }

    public void setTransportReqSent(Boolean transportReqSent) {
        this.transportReqSent = transportReqSent;
    }

    public UserAccount getMealAssignedUser() {
        return mealAssignedUser;
    }

    public void setMealAssignedUser(UserAccount mealAssignedUser) {
        this.mealAssignedUser = mealAssignedUser;
    }

    public String getMealFeedback() {
        return mealFeedback;
    }

    public void setMealFeedback(String mealFeedback) {
        this.mealFeedback = mealFeedback;
    }
    
    @Override
    public String toString() {
        return this.meal;
    }
    
}
