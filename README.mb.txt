# Práctica de pilas y colas

**Nombre:luis alejandro carmona amaya**
**Número de lista:**

## Ejercicio 1: Pila
Salida de la consola:
```
Cima: 15
Contenido: [15]  <- la cima es el de la derecha

Cima: 12
Contenido: [15, 12]  <- la cima es el de la derecha

Cima: 5
Contenido: [15, 12, 5]  <- la cima es el de la derecha

El número de lista 15 está en la posición: 3

Se saco 5
Cima: 12
Contenido: [15, 12]  <- la cima es el de la derecha

Se saco 12
Cima: 15
Contenido: [15]  <- la cima es el de la derecha

Se saco 15
La pila esta vacia
(pega aquí la salida)
```
- ¿Por qué tu número de lista está en la posición 3?
Porque el método `search()` cuenta desde la cima hacia abajo (empezando en 1). Como el número de lista fue el primero en entrar, quedó al fondo de la pila.
- ¿Qué pasaría con while(true)?
Generaría un bucle infinito; una vez vacía la pila, el programa intentaría hacer `pop()` de nuevo y lanzaría un error (`EmptyStackException`), deteniéndose bruscamente.

## Ejercicio 2: Cola
Salida de la consola:
Tamano: 1
Cabeza: 15
Contenido: [15]  <- la cabeza es el de la izquierda

Tamano: 2
Cabeza: 15
Contenido: [15, 12]  <- la cabeza es el de la izquierda

Tamano: 3
Cabeza: 15
Contenido: [15, 12, 5]  <- la cabeza es el de la izquierda

Se atendio 15
Tamano: 2
Cabeza: 12
Contenido: [12, 5]  <- la cabeza es el de la izquierda

Se atendio 12
Tamano: 1
Cabeza: 5
Contenido: [5]  <- la cabeza es el de la izquierda

Se atendio 5
La cola esta vacia
```
(pega aquí la salida de ColaPersonal y de DiferenciasQueue)
```
- ¿Por qué la cabeza siempre es la misma?
Porque en una cola los elementos nuevos entran al final y el primero en entrar se queda al frente (cabeza) hasta que se le atiende y se extrae.
- ¿Por qué la pila y la cola sacaron los datos en orden contrario?
Por su funcionamiento: la Pila es **LIFO** (el último en entrar sale primero) y la Cola es **FIFO** (el primero en entrar sale primero).
- ¿add u offer para el banco? ¿Por qué?
**`offer`**, porque si la cola se llena, `offer` devuelve `false` de forma segura, mientras que `add` lanza una excepción y colapsa el sistema.

## Ejercicio 3: Cola de prioridad
Salida de la consola:
```
Cola completa: [Bogota, Java, Ingenieria, Juan]

Cabeza (peek): Bogota

Vaciando la cola:
Se extrajo: Bogota
Se extrajo: Ingenieria
Se extrajo: Java
Se extrajo: Juan
(pega aquí la salida)
```
- ¿Acertaste tu predicción?
Sí, la cabeza fue "Bogota" por orden alfabético estricto.
- ¿Por qué println salió desordenado y poll en orden?
Porque internamente la `PriorityQueue` usa una estructura de árbol (min-heap) optimizada para eficiencia y al imprimir directamente el objeto (`println`) muestra el orden interno de almacenamiento, pero al extraer con `poll()` respeta rigurosamente el orden de prioridad (alfabético).

## Ejercicio 4: Sala de emergencias
Salida de la consola:
=== PRUEBA DE LA CLASE PACIENTE ===
Juan Perez (Gravedad: Grave)
Texto de gravedad: Grave

-----------------------------------

=== PASO 3: SALA DE ESPERA (Orden de llegada) ===
[Carlos (Gravedad: Leve), Lucia (Gravedad: Critico), Pedro (Gravedad: Muy Leve), Sofia (Gravedad: Grave)]

=== PASO 4: TRIAGE (Ordenados por prioridad medica) ===
La cabeza de la cola de prioridad (el mas grave) es: Lucia (Gravedad: Critico)

=== PASO 6: ATENCION MEDICA E HISTORIAL ===
Atendiendo a: Lucia (Gravedad: Critico)
Atendiendo a: Sofia (Gravedad: Grave)
Atendiendo a: Carlos (Gravedad: Leve)
Atendiendo a: Pedro (Gravedad: Muy Leve)

Historial de pacientes atendidos (ultimo atendido en la cima):
- Pedro (Gravedad: Muy Leve)
- Carlos (Gravedad: Leve)
- Sofia (Gravedad: Grave)
- Lucia (Gravedad: Critico)
```
(pega aquí la salida)
```
- ¿Por qué falló en el paso 4 y no con String?
Porque los tipos básicos como `String` ya implementan `Comparable` por defecto en Java, mientras que los objetos personalizados (`Paciente`) requieren que la clase implemente explícitamente `Comparable` y defina el método `compareTo`.
- Reto: ¿cómo harías que se respete el orden de llegada?
Se puede agregar un atributo de tiempo o un contador secuencial de llegada al objeto `Paciente` y modificar el método `compareTo` para que, si dos pacientes tienen la misma gravedad, desemate evaluando quién llegó primero.