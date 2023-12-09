/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WrokQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author aniketgiram
 */
public abstract class WorkRequest {
    private String msg;
    private UserAccount sndr;
    private UserAccount rcvr;
    private String status;
    private Date reqDate;
    private Date resDate;
    
    public WorkRequest(){
        reqDate = new Date();
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }

    public UserAccount getSender() {
        return sndr;
    }

    public void setSender(UserAccount sndr) {
        this.sndr = sndr;
    }

    public UserAccount getReceiver() {
        return rcvr;
    }

    public void setReceiver(UserAccount rcvr) {
        this.rcvr = rcvr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return reqDate;
    }

    public void setRequestDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getResolveDate() {
        return resDate;
    }

    public void setResolveDate(Date resDate) {
        this.resDate = resDate;
    }

    @Override
    public String toString() {
        return this.msg;
    }
}
