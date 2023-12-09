/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author aniketgiram
 */
public class Business {
    
    public void redirection(JPanel MainCardLayout, String panelName, JPanel panel){
        MainCardLayout.add(panelName, panel);
        CardLayout layout = (CardLayout) MainCardLayout.getLayout();
        layout.next(MainCardLayout);
    }
}
