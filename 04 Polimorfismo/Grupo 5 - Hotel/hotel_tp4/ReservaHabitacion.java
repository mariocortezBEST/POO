
package hotel_tp4;


public class ReservaHabitacion implements accionHotel{
    String abitacion;
    String nombre;

    public ReservaHabitacion() {
    }

    public ReservaHabitacion(String abitacion, String nombre) {
        this.abitacion = abitacion;
        this.nombre = nombre;
    }

    public String getAbitacion() {
        return abitacion;
    }

    public void setAbitacion(String abitacion) {
        this.abitacion = abitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void ejecutarAccion() {
        System.out.println("Nro: "+ this.abitacion +" A nombre de: "+ this.nombre);
    }
    
    
}
