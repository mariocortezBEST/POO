
package hotel_tp4;

public class Hotel_TP4 {

    public static void main(String[] args) {
        // Declaramos una referencia a una acción del hotel
        accionHotel accion;

        // Tomar una reserva
        accion = new ReservaHabitacion("Habitación 101", "Juan Pérez");
        accion.ejecutarAccion();

        // Procesar un pago
        accion = new Pago("Tarjeta de crédito", 5000);
        accion.ejecutarAccion();
    }
}
