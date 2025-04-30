
package ejemplo.pkg2.interfaz;


public class Hidroavion implements Volador,Nadador{

    @Override
    public void volar() {
        System.out.println("El hidroavión está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El hidroavión está flotando en el agua.");
    }
    
}
