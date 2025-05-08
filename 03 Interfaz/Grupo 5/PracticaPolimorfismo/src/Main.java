import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ingresoHabitacion;
        float montoPagar;
        System.out.println("Ingrese el numero de habitacion:");
        ingresoHabitacion = sc.nextLine();
        System.out.println("Ingrese monto pagar:");
        if (sc.hasNextFloat()) {
           montoPagar = sc.nextFloat();
            ReservarHabitacion reservar = new ReservarHabitacion(ingresoHabitacion);
            Pago pago = new Pago(montoPagar);
            String reserva=reservar.ejecutarAccion();
            String Abona=pago.ejecutarAccion();
        } else {
            System.out.println("La entrada no es un número de punto flotante válido.");
            sc.next(); // Importante: consumir la entrada incorrecta para evitar un bucle infinito
        }

        sc.close();
    }
}
