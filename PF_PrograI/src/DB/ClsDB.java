package DB;

import Clases.ClsAcceso;
import Clases.ClsVehiculos;
import java.util.ArrayList;

/**
 *
 * @author juand
 */
public class ClsDB {
    private static final int MAX_VEHICULOS = 12;
    private static ClsVehiculos[] arregloVehiculos = new ClsVehiculos[MAX_VEHICULOS];
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
    
    public static boolean agregarVehiculo(ClsVehiculos vehiculo){
        if (jsonVehiculos.size() >= MAX_VEHICULOS) {
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
        jsonVehiculos.remove(vehiculo);
    }
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
