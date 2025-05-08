> Describan como resolvieron la actividad y suban las clases .java en esta carpeta.


# Actividad del tema Polimorfismo

1.- Crear una clase base que represente una acción general en el hotel.

2.- Crear subclases que representen acciones específicas como reservar una habitación y procesar un pago.

3.- Implementar polimorfismo de subtipos para que una referencia de la clase base pueda ejecutar distintos comportamientos en tiempo de ejecución.

4.- Completar el código faltante en la siguiente clase Main, donde ya se establecen las referencias pero faltan las clases asociadas.

# Código proporcionado (Main.java):
```java
public class Main {
    public static void main(String[] args) {
        // Declaramos una referencia a una acción del hotel
        AccionHotel accion;

        // Tomar una reserva
        accion = new ReservaHabitacion("Habitación 101", "Juan Pérez");
        accion.ejecutarAccion();

        // Procesar un pago
        accion = new Pago("Tarjeta de crédito", 5000);
        accion.ejecutarAccion();
    }
}
```

#### Tareas:

Crear la clase superclase `AccionHotel`, que debe tener el método `ejecutarAccion()`.

Crear las clases `ReservaHabitacion` y `Pago`, que deben sobrescribir `ejecutarAccion()`.

Probar el código completando la lógica de cada clase.

📌 Tip: Usar el polimorfismo de subtipos para que `AccionHotel` pueda referenciar objetos de `ReservaHabitacion` y `Pago`.