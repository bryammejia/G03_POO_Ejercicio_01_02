/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g03_poo_ejercicio_01_02;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[]args){
     
        var empleadoUno = new Empleado();
        empleadoUno.nombre = "Alexander Coronel";
        empleadoUno.horasTrabajadas = 200;
        empleadoUno.costoHora = 2;
        empleadoUno.anioIngreso = 2010;
        
  System.out.println("El empleado N-1 se llama: "+empleadoUno.nombre);
  System.out.println("Sus horas trabajadas son de: "+empleadoUno.horasTrabajadas);
  System.out.println("el costo por hora es de: "+empleadoUno.costoHora);
  System.out.println("El año de ingreso del empleado fue: "+empleadoUno.anioIngreso);
  
  System.out.println("El empleado lleva trabajando: "+empleadoUno.calcularIngresos(2022));
  
  
  
        
    }   
}
