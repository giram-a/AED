/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

/**
 *
 * @author aniketgiram
 */
public class Testimonial {
    
    private static int count=0;
    private int testiID;
    private String testiText;
    private String wName;
    private String date;
    
    public Testimonial()
    {
        count++;
       testiID = count;
    }

    public int getTestimonialID() {
        return testiID;
    }


    public String getTestimonialTxt() {
        return testiText;
    }

    public void setTestimonialTxt(String testiText) {
        this.testiText = testiText;
    }

    public String getWriterName() {
        return wName;
    }

    public void setWriterName(String wName) {
        this.wName = wName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.valueOf(this.testiID);
    }
    
    
    
}
