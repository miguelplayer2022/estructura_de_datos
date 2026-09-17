package com.mycompany.sesionpoo_animal;

public class SesionPOO_animal {
   
    public static void main(String[] args) {
        
        animal a1 = new animal("mota","gato",10,"maullido");
        animal a2 = new animal("pantalones","gato",1,",maullido");
        animal a3 = new animal ("leon","atlas",5,"rugido");
        animal a4 = new animal ("ballena","orca",3,"chasquidos");
        animal a5 = new animal ("cocodrilo","marino",7,"bramidos");
        
        System.out.println("datos de los animales");
        
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();
        a4.mostrarInfo();
        a5.mostrarInfo();
        
        System.out.println("sonido de animales");
        
        a1.mostrarsonido();
        a2.mostrarsonido();
        a3.mostrarsonido();
        a4.mostrarsonido();
        a5.mostrarsonido();
        
         
        
        
        
        System.out.println("lista de los animales");
        
        a1.siguiente = a2;
        a2.siguiente = a3;
        a3.siguiente = a4;
        a4.siguiente = a5;
        
        animal actual = a1;
        while (actual != null) {
            actual.mostrarInfo();
            actual = actual.siguiente;
        }
        System.out.println("no hay mas animales en la lista");
        
                
        
       
    }
}
