package com.mycompany.sesionpoo_animal;

public class animal {
    String nombre;
    String especie;
    int edad;
    String sonido;
    animal siguiente;
    
    
    animal(String nombre,String especie,int edad, String sonido) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.sonido = sonido;
        this.siguiente = null;
    } 
    
    void mostrarInfo() {
        System.out.println(" nombre: " + nombre + " especie: " + especie + " edad: "+ edad + " sonido: " + sonido);
    
    }
    
    void mostrarsonido() {
        System.out.println(" el nombre del animal es: " + nombre + " y su sonido es: " + sonido);
    }
        
}
