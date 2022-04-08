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
        empleadoUno.horasTrabajadas = 160;
        empleadoUno.costoHora = 11.5;
        empleadoUno.anioIngreso = 2003;
        
  System.out.println("El empleado N-1 se llama: "+empleadoUno.nombre);
  System.out.println("Sus horas trabajadas son de: "+empleadoUno.horasTrabajadas);
  System.out.println("el costo por hora es de: "+empleadoUno.costoHora);
  System.out.println("El año de ingreso del empleado fue: "+empleadoUno.anioIngreso);
  
  
  System.out.println("Los ingresos totales del trabajador es de: "+empleadoUno.calcularIngreso(2022));

  System.out.println("El bono extra es de: "+empleadoUno.calcularHoraBonusExtra(150));
  
        System.out.println("Los impuestos son: "+empleadoUno.calcularImpuestos(500, 1000, 2000));
          
  
  
  
        
    }   
}
