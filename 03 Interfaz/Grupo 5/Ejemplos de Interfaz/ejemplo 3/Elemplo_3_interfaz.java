
package elemplo_3_interfaz;


public class Elemplo_3_interfaz {

    public static void main(String[] args) {
        vehiculo coche = new Coche();
        vehiculo avion = new Avion();
        
        avion.mover();
        coche.mover();
    }
    
}
