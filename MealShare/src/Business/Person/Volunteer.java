/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author aniketgiram
 */
public class Volunteer extends Person{
 
    private String volunteerId;
    private static int count = 001;
    private String latitiude;
    private String longitude;
    private ArrayList<Testimonial> testimonialList;
    
    
    public Volunteer()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("VOL");
        sb.append(count);
        volunteerId = sb.toString();
        count++;
        testimonialList= new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.getName();
    }

  
    public String getVolunteerId() {
        return volunteerId;
    }

    public String getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(String latitiude) {
        this.latitiude = latitiude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Testimonial> getTestimonialList() {
        return testimonialList;
    }

   
    public Testimonial addTestimonial()
    {
        Testimonial testimonial = new Testimonial();
        testimonialList.add(testimonial);
        return testimonial;
    }
    
   
}
