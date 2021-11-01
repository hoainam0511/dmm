/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.hepbo;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ACER
 */
public class DataVali {
    public static void validateEmpty(JTextField Field, StringBuilder sb ,String errorMessage){
        if (Field.getText().equals("")) {
            sb.append(errorMessage).append("\n");
            Field.setBackground(Color.pink);
            Field.requestDefaultFocus();
        }else{
            Field.setBackground(Color.white);
        }
    }
       public static void validateEmpty(JPasswordField Field, StringBuilder sb ,String errorMessage){
           String pass = new String(Field.getPassword());
        if (pass.equals("")) {
            sb.append(errorMessage).append("\n");
            Field.setBackground(Color.pink);
            Field.requestDefaultFocus();
        }else{
            Field.setBackground(Color.white);
        }
    }
}
