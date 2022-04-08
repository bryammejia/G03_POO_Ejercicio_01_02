/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g03_poo_ejercicio_01_02;

/**
 *
 * @author USER
 */
public class Empleado {
    
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int anioIngreso;
    
    public double calcularIngreso(int anioActual){
        
        var sueldo = 100000d;
        var edadEmpleado = 1000000d;
        var multiplicacion = 10000d;
        var multiplicacion2 = 100000d;
        var suma = 1000000d;
        
            sueldo = horasTrabajadas * costoHora;
            edadEmpleado = anioActual - anioIngreso;
            multiplicacion = sueldo * 0.02; 
            multiplicacion2 = edadEmpleado * multiplicacion;
            suma = sueldo + multiplicacion2;
            
        return suma;
    }
    
    public double calcularHoraBonusExtra(int maximoHorasTrabajadas){
        
        var retorno = 10000000d;
        var multiplicacion = 100000d;
        
        if(this.horasTrabajadas >= 0 && this.horasTrabajadas <= 150);
            retorno =(this.horasTrabajadas - maximoHorasTrabajadas);
            multiplicacion = (this.costoHora * retorno);
            
            
        
            
        return multiplicacion;
    }
    
    
            public double calcularImpuestos(int limit1, int limit2, int limit3 ){
            
         var retorno=10000d;
        if(this.costoHora*horasTrabajadas >= 0 && this.costoHora*horasTrabajadas <= limit1){
            if(this.costoHora*horasTrabajadas >= limit1 && this.costoHora*horasTrabajadas<= limit2)
                retorno=this.costoHora*horasTrabajadas*0.05;
            else
                retorno=this.costoHora*horasTrabajadas*0.12;
        }else{
             if(this.costoHora*horasTrabajadas>=limit2 && this.costoHora*horasTrabajadas<=limit3)
                retorno=this.costoHora*horasTrabajadas*0.25;
        }
        return retorno;
   }
    
    }
  

