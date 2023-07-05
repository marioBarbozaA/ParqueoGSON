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
import javax.swing.JOptionPane;


public class ClsAcceso {
    
    public ClsAcceso(){
        Recordar = false;
        Activo = false;
    }
    
    public int IdAcceso;
    public String Correo;
    public String Clave;
    public boolean Recordar;
    public boolean Activo;
    
    
    
    public boolean ConsultarAcceso(String Correo, String Clave){
        
        boolean Acceso = false;
        
        for (ClsAcceso MiObjeto : ClsDB.jsonAcceso)
        {
            if (MiObjeto.Correo.equals(Correo) &&
                MiObjeto.Clave.equals(Clave) &&
                MiObjeto.Activo) {
                Acceso = true;
            }
        }
        
        return Acceso;
    }
    
    public boolean RecuperarClave(String Correo){
        
        boolean Result = false;
        
        for (ClsAcceso MiObjeto : ClsDB.jsonAcceso)
        {
            if (MiObjeto.Correo.equals(Correo)) {
                MiObjeto.Clave = "123";
                Result = true;
            }
        }
        
        boolean Guardado = GuardarDatosMemoria();
        
        if (Result && Guardado) {
            JOptionPane.showMessageDialog(null, 
                                          "Se realizó un cambio de contraseña", 
                                          "Cambio aplicado", 
                                          JOptionPane.INFORMATION_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog(null, 
                                          "El correo ingresado no existe", 
                                          "Error en validación", 
                                          JOptionPane.ERROR_MESSAGE
            );
        }
        
        return Result;
    }
    
    
    
    /****************************************
     *                                      *
     *   CODIGO PARA GUARDAR DATOS EN TXT   *
     *                                      *
     ****************************************/
    public boolean GuardarDatosMemoria(){
        
        boolean Guardado = false;
        
        Gson gson = new Gson();
        String jsonString = gson.toJson(ClsDB.jsonAcceso);
        
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
            Type listType = new TypeToken<ArrayList<ClsAcceso>>(){}.getType();
            ArrayList<ClsAcceso> ListaGuardada = gson.fromJson(Result, listType);
            
            ClsDB.jsonAcceso = ListaGuardada;
            
        } catch (Exception e) {}
        
    }
}
