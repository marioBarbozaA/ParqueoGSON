/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import Clases.ClsAcceso;
import Clases.ClsClientes;
import Clases.ClsConductores;
import Clases.ClsEnvios;
import Clases.ClsVehiculos;
import java.util.ArrayList;

/**
 *
 * @author juand
 */
public class ClsDB {
    
    public static ArrayList<ClsAcceso> jsonAcceso = new ArrayList<ClsAcceso>();
    public static ArrayList<ClsClientes> jsonClientes = new ArrayList<ClsClientes>();
    public static ArrayList<ClsVehiculos> jsonVehiculos = new ArrayList<ClsVehiculos>();
    public static ArrayList<ClsConductores> jsonConductores = new ArrayList<ClsConductores>();
    public static ArrayList<ClsEnvios> jsonEnvios = new ArrayList<ClsEnvios>();
}
