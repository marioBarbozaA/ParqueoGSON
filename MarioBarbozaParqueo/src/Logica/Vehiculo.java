/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author diemo
 */
public class Vehiculo {
    private String placa;
    private double horas;
    private String tipo;
    private double descuento;

    public Vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public Vehiculo(String placa, String tipo, double descuento) {
        this.placa = placa;
        this.tipo = tipo;
        this.descuento = descuento;
    }
    
    public Vehiculo(String placa, String tipo, double descuento,double horas) {
        this.placa = placa;
        this.tipo = tipo;
        this.descuento = descuento;
        this.horas = horas;
    }
    
    @Override
    public String toString() {
        String strVehiculo = "Placa = " + placa + "\t\t Horas = " + horas + "\t Tipo = " + tipo  ;
        
        if (getDescuento() > 0)
            strVehiculo += "\t descuento = " + descuento;
        
        return strVehiculo;
        
    }

    public String getMensajeDeSalida() {
        String strVehiculo = "Vehiculo placa " + placa + " sale con "+ horas +" h, debe pagar un monto de " + getMonto();
        
        if (getDescuento() > 0)
            strVehiculo += ", se le aplica un descuento de " + descuento + "%, por lo que su pago final es de " + getMontoConDescuento();
        
        return strVehiculo;
        
    }
  
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
    public double getMonto(){
        switch(this.tipo.toUpperCase()){
            case "CARRO":
                return this.getHoras() * 1200;
            case "MOTOCICLETA":
                return this.getHoras() * 800;
            case "BICICLETA":
                return this.getHoras() * 500;
            case "CAMION":
                return this.getHoras() * 2800;
            default:
                return this.getHoras() * 2000;
        }
    }
    
    public double getMontoConDescuento(){
        return getMonto() * (1 - getDescuento()/100);
    }
 
}
