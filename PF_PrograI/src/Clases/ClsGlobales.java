/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Forms.FrmClientes;
import Forms.FrmPrincipal;
import Forms.FrmVehiculos;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juand
 */
public class ClsGlobales {
    
    public static FrmPrincipal formPrincipal = new FrmPrincipal();
   
    public static FrmClientes fClientes = new FrmClientes();
    public static FrmVehiculos fVehiculos = new FrmVehiculos();
    
    public static boolean ValidarMail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    
}
