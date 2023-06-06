/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import javax.swing.JLabel;

/**
 *
 * @author Student
 */
public class ShowOnLabel {// showValue, value
    public static void showValue (int[] array, JLabel jLabel){
        String caption = "A: ";
        for (int i : array) {
            caption += Integer.toString(i);
            caption += " ";
        }
        jLabel.setText(caption);
    }
    
    public static void schowValue (int value, JLabel jLabel){
         String caption;
        caption = "sum: ";
        caption += Integer.toString(value);
        jLabel.setText(caption);
    }
    
}
