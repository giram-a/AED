/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Common;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aniketgiram
 */
public class Validation {
    public static int calculateAge(Date dateOfBirth)
    {
       try
       {     
            Calendar dob = Calendar.getInstance();
            dob.setTime(dateOfBirth);
            Calendar today = Calendar.getInstance();
            int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
            if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR))
            age--;
            return age;
       }
       catch(Exception e)
       {
            return 0;   
       }
    }
}
