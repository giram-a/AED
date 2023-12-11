/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WrokQueue;

/**
 *
 * @author aniketgiram
 */
public class SupervisorWorkRequest extends WorkRequest{
    public static String REQUEST_INPROGRESS = "In Process";
    public static String REQUEST_APPROVAL = "Request for Approval";
    public static String REQUEST_SENT = "Sent";
    public static String REQUEST_ACCEPT = "Accept";
    public static String REQUEST_REJECT = "Reject";
    private String testResult;
    private String comments;
    

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
