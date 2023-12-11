/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Common;

import java.util.UUID;

/**
 *
 * @author aniketgiram
 */
public class GenerateRandomID {
    
    public static UUID generateRandomId() {
        UUID uuid = UUID.randomUUID();
        return uuid;
    }
    
}
