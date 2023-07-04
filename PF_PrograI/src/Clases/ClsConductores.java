/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import DB.ClsDB;
import com.google.gson.Gson;
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
public class ClsConductores {
    
    public int IdConductor;
    public String Cedula;
    public String Nombre;
    public String Apellidos;
    public String Telefono;
    public String Correo;
    public String Cuenta;
    
    
    
    /****************************************
     *                                      *
     *   CODIGO PARA GUARDAR DATOS EN TXT   *
     *                                      *
     ****************************************/
    public boolean GuardarDatosMemoria(){
        
        boolean Guardado = false;
        
        Gson gson = new Gson();
        String jsonString = gson.toJson(ClsDB.jsonConductores);
        
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
            Type listType = new TypeToken<ArrayList<ClsConductores>>(){}.getType();
            ArrayList<ClsConductores> ListaGuardada = gson.fromJson(Result, listType);
            
            ClsDB.jsonConductores = ListaGuardada;
            
        } catch (Exception e) {}
        
    }
}
