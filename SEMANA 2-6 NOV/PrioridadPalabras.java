package prioridadpalabras;

import java.util.PriorityQueue;

public class PrioridadPalabras {

    public static void main(String[] args) {

        PriorityQueue<String> cola = new PriorityQueue<>();

        // TODO 1: Mete con offer() 4 palabras: tu nombre, tu ciudad,
        //         tu carrera y tu lenguaje de programación favorito.
        //         Luego imprime la cola completa con System.out.println(cola);
        String nombre = "Juan";
        String ciudad = "Bogota";
        String carrera = "Ingenieria";
        String lenguaje = "Java";

        cola.offer(nombre);
        cola.offer(ciudad);
        cola.offer(carrera);
        cola.offer(lenguaje);

        System.out.println("Cola completa: " + cola + "\n");

        // TODO 2: ANTES de ejecutar, escribe aquí en un comentario
        //         cuál crees que será la cabeza. Luego imprímela con peek().
        //         Mi predicción: "Bogota"
        System.out.println("Cabeza (peek): " + cola.peek() + "\n");

        // TODO 3: Vacía la cola con isEmpty() y poll(), imprimiendo cada palabra.
        System.out.println("Vaciando la cola:");
        while (!cola.isEmpty()) {
            System.out.println("Se extrajo: " + cola.poll());
        }

    }
}