package DB;

import Clases.ClsAcceso;
import Clases.ClsVehiculos;
import java.util.ArrayList;


public class ClsDB {
    private static final int MAX_VEHICULOS = 12;
    public static ClsVehiculos[] arregloVehiculos = new ClsVehiculos[MAX_VEHICULOS];
    public static ArrayList<ClsAcceso> jsonAcceso = new ArrayList<ClsAcceso>();
    public static ArrayList<ClsVehiculos> jsonVehiculos = new ArrayList<ClsVehiculos>();
    
    public static void rellenarParqueo() {
        for (ClsVehiculos vehiculo : jsonVehiculos) {
            int lugarParqueo = vehiculo.getLugarParqueo();
            if (lugarParqueo >= 0 && lugarParqueo < MAX_VEHICULOS) {
                arregloVehiculos[lugarParqueo] = vehiculo;
            }
        }
    }
    
    
    public static int contarParqueados(){
        int con = 0;
        for (ClsVehiculos vehiculo : jsonVehiculos){
           if( vehiculo.activo == true)
               con++;
        }
        return con;
        
    }
    
    public static boolean agregarVehiculo(ClsVehiculos vehiculo){
        if ( contarParqueados() >= MAX_VEHICULOS) {
            return false;
        }
        jsonVehiculos.add(vehiculo);
        int lugarParqueo = buscarPrimerIndiceNulo();
        if (lugarParqueo >= 0) {
            vehiculo.setLugarParqueo(lugarParqueo);
            arregloVehiculos[lugarParqueo] = vehiculo;
        }
        return true;
    }
    
    public static void quitarVehiculo(ClsVehiculos vehiculo) {
    int lugarParqueo = vehiculo.getLugarParqueo();
    if (lugarParqueo >= 0 && lugarParqueo < MAX_VEHICULOS) {
        arregloVehiculos[lugarParqueo] = null;
        
    }
}
    public static void ActualizarParqueo(ClsVehiculos vehiculo) {
        
        for (int i = 0; i <  jsonVehiculos.size(); i++) {
            if (vehiculo.IdVehiculo == jsonVehiculos.get(i).IdVehiculo){
                quitarVehiculo(jsonVehiculos.get(i));
                jsonVehiculos.get(i).activo = false;
                jsonVehiculos.get(i).lugarParqueo = -1;
                jsonVehiculos.get(i).GuardarDatosMemoria();
                
            }
            
            };
    }
    
    
    private static int buscarPrimerIndiceNulo() {
        for (int i = 0; i < MAX_VEHICULOS; i++) {
            if (arregloVehiculos[i] == null) {
                return i;
            }
        }
        return -1; // No hay posiciones nulas disponibles
    }
}
