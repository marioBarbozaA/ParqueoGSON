/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author diemo
 */
public class Parqueo {
    ArrayList<Vehiculo> vehiculos;

    public Parqueo() {
        this.vehiculos = new ArrayList<Vehiculo>();
    }
    
    public boolean addVehiculo(Vehiculo v){
        boolean existeVehiculo = buscarVehiculo(v.getPlaca()) != null;
        if (!existeVehiculo){
            this.vehiculos.add(v);
        }
        return !existeVehiculo; // true si inserta, false si no
    }
    
    public Vehiculo buscarVehiculo(String placa){
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa) )
                return vehiculo;
        }
        return null;
    }
    
    public double sumarHorasAVehiculo(String placa, double horas){
        Vehiculo vehiculoBuscado = buscarVehiculo(placa);
        System.out.println("");
        if (vehiculoBuscado != null){
            double calculoHoras = vehiculoBuscado.getHoras()+horas;
            
            if (calculoHoras >= 0) //solo si no es negativo
                vehiculoBuscado.setHoras(calculoHoras);
            
            return vehiculoBuscado.getHoras();
        }
        
        return -1;
    }
    
    public Vehiculo eliminarVehiculo(String placa){
        Vehiculo vehiculoBuscado = buscarVehiculo(placa);
        
        if (vehiculoBuscado != null){
            this.vehiculos.remove(vehiculoBuscado);
            return vehiculoBuscado;
        }
        return null;
    }
    
    public int actualizarDescuentos(double descuento){
        int actualizados = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getDescuento() == 0){
                vehiculo.setDescuento(descuento);
                actualizados++;
            }
        }
        return actualizados;
    }
    
    public String toString(){
        String str = "PARQUEO: \n";
        
        for (Vehiculo vehiculo : vehiculos) {
            str += vehiculo.toString() + "\n";
        }
        return str + "\n";
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
   public static double getMontos(Vehiculo v) {
        double monto = v.getMonto();
        
        if (v.getDescuento() > 0)
            monto =  v.getMontoConDescuento();
        return monto;
        
    }
   public String totalDinero(){
        double monto = 0;
        boolean flag = false;
        for(int i = 0; i < this.vehiculos.size();i++){
            monto += getMontos(this.vehiculos.get(i));
            flag = true;    
    }
        if (flag == true)
            return "Cantidad de vehiculos parqueo: "+ this.vehiculos.size()+", en total se cobra: " + monto + " colones.";
        else
            return "No hay vehiculos en el parqueo, por lo tanto no hay ganancia";
    }
}
