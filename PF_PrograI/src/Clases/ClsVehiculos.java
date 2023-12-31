/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import DB.ClsDB;
import java.time.LocalDateTime;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author juand
 */
public class ClsVehiculos {
    
    public int lugarParqueo; // 0-11 
    public int IdVehiculo;
    public String Placa;
    public String Tipo;
    public String duenno ;
    public String descuento;
    public boolean activo;
    public String entrada;
    public String salida;
    
    public int getLugarParqueo() {
        return lugarParqueo;
    }
    
    public void setLugarParqueo(int lugarParqueo){
        this.lugarParqueo = lugarParqueo;
    }
    
    /****************************************
     *                                      *
     *   CODIGO PARA GUARDAR DATOS EN TXT   *
     *                                      *
     ****************************************/
    public boolean GuardarDatosMemoria(){
        
        boolean Guardado = false;
        
        Gson gson = new Gson();
        String jsonString = gson.toJson(ClsDB.jsonVehiculos);
        
        String[] arrSplitFile = this.toString().split("@"); 
        
        try{
            FileWriter fr = new FileWriter(arrSplitFile[0] + ".txt");
            fr.write(jsonString);
            fr.close();
            Guardado = true;
            ObtenerDatosMemoria();
        }
        catch(Exception e)
        {
            Guardado = false;
        }
        
        return Guardado;
    }
    
    /****************************************
     *                                      *
     *   CODIGO PARA CARGAR DATOS DEL TXT   *
     *                                      *
     ****************************************/
    public void ObtenerDatosMemoria(){        
        
        String[] arrSplitFile = this.toString().split("@"); 
        
        try {
            FileReader reader = new FileReader(arrSplitFile[0] + ".txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
            String Result = "";
 
            while ((line = bufferedReader.readLine()) != null) {
                Result += line;
            }
            reader.close();  

            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<ClsVehiculos>>(){}.getType();
            ArrayList<ClsVehiculos> ListaGuardada = gson.fromJson(Result, listType);
            
            ClsDB.jsonVehiculos = ListaGuardada;
            ClsDB.rellenarParqueo();
            
        } catch (Exception e) {}
        
    }
}
