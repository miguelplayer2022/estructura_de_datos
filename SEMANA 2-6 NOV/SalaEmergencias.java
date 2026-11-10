package salaemergencias;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

// Clase Paciente: va en el mismo archivo, sin "public"
class Paciente implements Comparable<Paciente> {

    // PASO 1: atributos, constructor y getters
    private String nombre;
    private int gravedad; // Del 1 (Leve) al 5 (Crítico)

    public Paciente(String nombre, int gravedad) {
        this.nombre = nombre;
        this.gravedad = gravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getGravedad() {
        return gravedad;
    }

    // PASO 2: getGravedadTexto() y toString()
    public String getGravedadTexto() {
        switch (gravedad) {
            case 5: return "Critico";
            case 4: return "Grave";
            case 3: return "Moderado";
            case 2: return "Leve";
            case 1: return "Muy Leve";
            default: return "Desconocido";
        }
    }

    @Override
    public String toString() {
        return nombre + " (Gravedad: " + getGravedadTexto() + ")";
    }

    // PASO 5: compareTo() -> Ordena por gravedad descendente (mayor gravedad = mayor prioridad)
    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(otro.gravedad, this.gravedad);
    }
}

public class SalaEmergencias {

    public static void main(String[] args) {

        // PASO 1 y 2: prueba tu clase Paciente aquí
        System.out.println("=== PRUEBA DE LA CLASE PACIENTE ===");
        Paciente pacientePrueba = new Paciente("Juan Perez", 4);
        System.out.println(pacientePrueba);
        System.out.println("Texto de gravedad: " + pacientePrueba.getGravedadTexto());
        System.out.println("\n-----------------------------------\n");

        // PASO 3: sala de espera (Cola normal FIFO - orden de llegada)
        Queue<Paciente> salaEspera = new LinkedList<>();
        salaEspera.offer(new Paciente("Carlos", 2)); // Leve
        salaEspera.offer(new Paciente("Lucia", 5));  // Crítico
        salaEspera.offer(new Paciente("Pedro", 1));  // Muy Leve
        salaEspera.offer(new Paciente("Sofia", 4));  // Grave

        System.out.println("=== PASO 3: SALA DE ESPERA (Orden de llegada) ===");
        System.out.println(salaEspera);
        System.out.println();

        // PASO 4: triage (PriorityQueue que organiza por prioridad de gravedad)
        PriorityQueue<Paciente> triage = new PriorityQueue<>();
        
        // Pasamos todos los pacientes de la sala de espera al triage
        while (!salaEspera.isEmpty()) {
            triage.offer(salaEspera.poll());
        }

        System.out.println("=== PASO 4: TRIAGE (Ordenados por prioridad medica) ===");
        System.out.println("La cabeza de la cola de prioridad (el mas grave) es: " + triage.peek());
        System.out.println();

        // PASO 6: atención e historial (Stack LIFO para registrar la atención)
        Stack<Paciente> historialAtencion = new Stack<>();

        System.out.println("=== PASO 6: ATENCION MEDICA E HISTORIAL ===");
        while (!triage.isEmpty()) {
            Paciente atendido = triage.poll();
            System.out.println("Atendiendo a: " + atendido);
            historialAtencion.push(atendido);
        }

        System.out.println("\nHistorial de pacientes atendidos (ultimo atendido en la cima):");
        while (!historialAtencion.isEmpty()) {
            System.out.println("- " + historialAtencion.pop());
        }

    }
}