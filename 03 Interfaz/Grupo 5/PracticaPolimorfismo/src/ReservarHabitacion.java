public class ReservarHabitacion extends AccionHotel{
    private String numeroHabitacion="H101";

    public ReservarHabitacion() {
    }

    public ReservarHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    @Override
    String ejecutarAccion() {
        System.out.println("Se reservo la habitacion:"+this.numeroHabitacion);
        return null;
    }
}
