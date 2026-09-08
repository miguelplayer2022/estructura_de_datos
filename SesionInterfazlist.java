/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesio.interfazlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prestamo
 */
public class SesioInterfazlist {
    private static void imprimirLista(List<String>lista)
    {
        for(int i = 0 ; i < lista.size(); i ++)
        {
            System.out.print("imprimir elemento");
            System.out.print(i);
            System.out.print(" ");
            System.out.print(lista.get(i));
            System.out.print("\n");
     
        }
    }
    public static void main(String[] args) {
        List <String> lista = new ArrayList<>();
        lista.add("cadena 1");
        lista.add("cadena 2");
        lista.add("cadena 3");
        lista.add("cadena 4");
        lista.add("cadena 5");
        
        imprimirLista(lista);
        
        lista.addFirst("string prueba");
        
        imprimirLista (lista);
        
        lista.set(3, "cambiando string");
        
        imprimirLista(lista);
        
        lista.remove(5);
        
        imprimirLista(lista);
        
        lista.removeFirst();
        
        imprimirLista(lista);
        
    }
