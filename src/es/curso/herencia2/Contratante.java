package es.curso.herencia2;

import java.util.ArrayList;

public class Contratante {

	public static void main(String[] args) {
		EmpleadoFijo e1 = new EmpleadoFijo("José" , "Cáceres", "12345T", 25000);
		EmpleadoFijo e2 = new EmpleadoFijo("Almudena" , "García", "78787T", 30000);
		e1.calcularSalario();
		e2.calcularSalario();
		System.out.println(e1);
		System.out.println(e2);
		EmpleadoTemporal et1 = new EmpleadoTemporal("Rafael", 
				    "Fernández", "783783",0 , 7, 360);
	    et1.calcularSalario();
	    System.out.println(et1);
	      // con una estructura ArrayList de tipo Empleado puedo manipular
	      // los objetos de sus subclases.
	     ArrayList<Empleado>  listaEmpleados= new ArrayList<Empleado>();
	     listaEmpleados.add(e1);// agregado EmpleadoFijo
         listaEmpleados.add(e2);// agregado EmpleadoFijo
         listaEmpleados.add(et1);// agregado EmpleadoTemporal
         
         //para recorrer el array uso un foreach
         // de donde : empleadoItem hace referencia al elemento actual
         //            dentro del ArrayList en cada una d ela iteraciones.
         System.out.println("Lista con el arrayList");
         for (Empleado empleadoItem : listaEmpleados) {
		    System.out.println(empleadoItem);	
		 }
		}

}














