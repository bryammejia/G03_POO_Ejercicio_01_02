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
    
    public double calcularIngresos(int anioActual){
        var retorno = 1000000d;
        if(this.anioIngreso > 0 && this.anioIngreso <= anioActual ){
            retorno = anioIngreso - anioActual;
        }
     
            return retorno;
    }
  
}
