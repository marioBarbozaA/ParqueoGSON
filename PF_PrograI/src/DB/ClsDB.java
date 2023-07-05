/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import Clases.ClsAcceso;
import Clases.ClsVehiculos;
import java.util.ArrayList;

/**
 *
 * @author juand
 */
public class ClsDB {
    public static int contador = 1;
    public static ArrayList<ClsAcceso> jsonAcceso = new ArrayList<ClsAcceso>();
    public static ArrayList<ClsVehiculos> jsonVehiculos = new ArrayList<ClsVehiculos>();
    public static ArrayList<ClsVehiculos> jsonVehiculosRetirados = new ArrayList<ClsVehiculos>();
    
    public void eliVehiculoPlaca(String placa){
        for (int i=0;i<jsonVehiculos.size(); i++){
            if (jsonVehiculos.get(i).Placa.equals(placa)){
                jsonVehiculos.remove(i);
                break;
            }
        }
    }
}
