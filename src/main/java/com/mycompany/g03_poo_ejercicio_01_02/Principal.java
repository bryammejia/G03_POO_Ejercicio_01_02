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
        empleadoUno.nombre = "Juan Coraisaca";
        empleadoUno.horasTrabajadas = 100;
        empleadoUno.costoHora = 6;
        empleadoUno.anioIngreso = 2010;
        
  System.out.println("-----------------------MENU PRINCIPAL------------------------");
  System.out.println("");
  System.out.println("El empleado N-1 se llama: "+empleadoUno.nombre);
  System.out.println("Sus horas trabajadas son de: "+empleadoUno.horasTrabajadas);
  System.out.println("el costo por hora es de: "+empleadoUno.costoHora);
  System.out.println("El año de ingreso del empleado fue: "+empleadoUno.anioIngreso);
  
  System.out.println("");
  System.out.println("Los ingresos totales del trabajador es de: "+empleadoUno.calcularIngreso(2022));

  System.out.println("El bono extra es de: "+empleadoUno.calcularBonoHorasExtra(100));
  
  System.out.println("Los impuestos son: "+empleadoUno.calcularImpuestos(500, 1000, 2000));
  
  
        
  System.out.println("------------------------------------------------------------------");
  System.out.println("");
  
          var empleadoDos = new Empleado();
          empleadoDos.nombre = "Mariana Marquez";
          empleadoDos.horasTrabajadas = 200;
          empleadoDos.costoHora = 5;
          empleadoDos.anioIngreso = 2020;
   
  System.out.println("-----------------------MENU PRINCIPAL------------------------");
  System.out.println("");
  System.out.println("El empleado N-2 se llama: "+empleadoDos.nombre);
  System.out.println("Sus horas trabajadas son de: "+empleadoDos.horasTrabajadas);
  System.out.println("el costo por hora es de: "+empleadoDos.costoHora);
  System.out.println("El año de ingreso del empleado fue: "+empleadoDos.anioIngreso);
  
  
  System.out.println("Los ingresos totales del trabajador es de: "+empleadoDos.calcularIngreso(2022));

  System.out.println("El bono extra es de: "+empleadoDos.calcularBonoHorasExtra(100));
  
  System.out.println("Los impuestos son: "+empleadoDos.calcularImpuestos(500, 1000, 2000));
  
   
          
  System.out.println("------------------------------------------------------------------");
  System.out.println("");
       
          var empleadoTres = new Empleado();
          empleadoTres.nombre = "Carlos Zumba";
          empleadoTres.horasTrabajadas = 150;
          empleadoTres.costoHora = 8;
          empleadoTres.anioIngreso = 2018;
        
  System.out.println("-----------------------MENU PRINCIPAL------------------------");
  System.out.println("");
  System.out.println("El empleado N-3 se llama: "+empleadoTres.nombre);
  System.out.println("Sus horas trabajadas son de: "+empleadoTres.horasTrabajadas);
  System.out.println("el costo por hora es de: "+empleadoTres.costoHora);
  System.out.println("El año de ingreso del empleado fue: "+empleadoTres.anioIngreso);
  System.out.println("");
  
  System.out.println("Los ingresos totales del trabajador es de: "+empleadoTres.calcularIngreso(2022));

  System.out.println("El bono extra es de: "+empleadoTres.calcularBonoHorasExtra(100));
  
  System.out.println("Los impuestos son: "+empleadoTres.calcularImpuestos(500, 1000, 2000));
          
  System.out.println("-------------------------------------------------------------------");
    }   
}
