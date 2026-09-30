package listaenlazadas_29;

import java.util.LinkedList;

public class Listaenlazadas_29 {

    
    public static void main(String[] args) {
      
        //  asignar o modificar objetos o productos con constructor vacio
        
        Product p1 = new Product ();
        p1.setID(1);
        p1.setName("papa criolla");
        p1.setExistence(25);
        p1.setPrice((double)25000);
        
        // crear objetos o productos con constructor lleno
        
        Product p2 = new Product (02,"arroz",(double)5000,2);
        Product p3 = new Product (03,"cebolla",(double)1000,1);
        Product p4 = new Product (04,"tomate",(double)1500,3);
        Product p5 = new Product (05,"apio",(double)3000,4);
        
        //obtener informacion de los productos
        
        System.out.println(p1.getName());
        System.out.println(p1.getExistence());
        
        
        // modificar precio
        
        p1.setPrice((double)30000);
        p1.mostrarinfo();
  

        System.out.println(p1.mostrarinfo()); 
        System.out.println(p2.mostrarinfo()); 
        
        
        // crear la lista enlazada para almanecar objetos
        
        LinkedList<Product> productos = new LinkedList<>();
        
        // Agregar productos a la lista y practicar inserciones al inicio y al final.
        
        // insertar p2 y p3 al final de lista
        
        productos.add(p2);
        productos.add(p3);
        
        // insertar p1 al inicio de la lista
        
        productos.addFirst(p1);
        
        // insertar p4 y p5 al final de la lista
        
        productos.addLast(p4);
        productos.addLast(p5);
        
        //  Consultar el primer elemento, el último elemento, una posición determinada y la cantidad de elementos.
        
        System.out.println("\n consultar inventario ");
        
        // primer elemento
        
        Product primerProducto = productos.getFirst();
        System.out.println(" primer producto del inventario: " + primerProducto.getName());
        
        // ultimo elemento 
        
        Product ultimoProducto = productos.getLast();
        System.out.println(" ultimo producto del inventario: " + ultimoProducto.getName());
        
        // posicion determinada 
        
        Product productoPosicion2 = productos.get(2);
        System.out.println(" producto en la posicion 2: " + productoPosicion2.getName());
        
        // cantidad total de elementos en el invetario
        
        int cantidad = productos.size();
        System.out.println(" productos totales del inventario: " + cantidad);
        
        // Recorrer y mostrar los elementos almacenados en la lista (for each).
        
        int pos = 0;
        
        for (Product proc : productos) {
            System.out.println("\n posicion " + pos + ":" + proc.mostrarinfo());
            pos++;
        }
        
        // recorrer y mostrar los elementos almacenados en la lista con ciclo for 
        
        // for (int i = 0; i < productos.size();i ++){ 
            // Product proc = productos.get(i);
            // System.out.println(" posicion " + i + ":" + proc.mostrarinfo() );
        // } 
        
       // Buscar un producto.
       
        System.out.println("\n buscar un producto del inventario ");
        
        String nombreProc = "cebolla";
        int posicionEncontrada = -1;
        Product productoEncontrado = null;
        
        // recorrer lista buscando por el nombre
        
        for (int i = 0;i < productos.size(); i ++ ) {
            if (productos.get(i).getName().equalsIgnoreCase(nombreProc)) {
                posicionEncontrada = i;
                productoEncontrado = productos.get(i);
                break;
            
            }
        
        }
        
        // identificar que el producto este dentro del inventario
        
        if (posicionEncontrada != -1 ) {
            System.out.println(" el producto " + nombreProc + " fue encontrado en las posicion: " + posicionEncontrada);
            System.out.println(" Detalles: " + productoEncontrado.mostrarinfo());
        
        } else {
            
            System.out.println(" el producto: " + nombreProc + " no esta en la lista. ");
        
        }
        
        // Modificar información de un producto.
        
        System.out.println("\n modificar informacion de un producto ");
        
        // Modificacion del prodcuto "tomate" 
        
        productos.get(3).setExistence(50);
        
        System.out.println("\n nueva informacion del producto: " + productos.get(3).mostrarinfo());
        
        //  Eliminar elementos de la lista al inicio y al final.
        
        System.out.println("\n eliminar productos del inventario: ");
        
        // almacenar la referencia de los codigos que se van a eliminar
        
        Product eliminarInicio = productos.removeFirst();
        Product eliminarFinal = productos.removeLast();
        
        System.out.println("\n se elimino el primer elemento del inventario: " + eliminarInicio.getName());
        System.out.println("\n se elimino el ulitmo elemento del inventario: " + eliminarFinal.getName());
        
        // Mostrar inventario actualizado 
        
        System.out.println("\n inventario actualizado ");
        for (Product proc : productos ) {
            System.out.println(proc.mostrarinfo());
        
        }
        

    }
    
}
