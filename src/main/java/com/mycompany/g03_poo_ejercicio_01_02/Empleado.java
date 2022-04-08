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
    
    public double calcularBonoHorasExtra (int maximoHorasTrabajadas){
        var retorno = 1000000d;
        
        if(this.horasTrabajadas >= maximoHorasTrabajadas){
            retorno = (this.horasTrabajadas - maximoHorasTrabajadas)* (this.costoHora * 2);
        }else{
            retorno = 0;
        }
        return retorno;
    }
    
    public double calcularImpuestos(int limit1, int limit2, int limit3){
        var retorno = 1000000d;
        double r; 
        r=this.costoHora*this.horasTrabajadas;
        if(r>0 && r<limit1){
            retorno = 0;
        }else{
            if(r>limit1 && r<limit2){
                retorno = this.costoHora*this.horasTrabajadas * 0.05;
            }else{
                if(r>=limit2 && r<=limit3){
                    retorno = this.costoHora*this.horasTrabajadas*0.12;
                }else{
                    if(r>limit3){
                     retorno=this.costoHora*this.horasTrabajadas*0.25;   
                    }
                }
            }
        }
        return retorno;
    }
            
    }
  

