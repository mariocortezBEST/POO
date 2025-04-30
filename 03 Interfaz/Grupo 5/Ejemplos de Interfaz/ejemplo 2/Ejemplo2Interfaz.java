
package ejemplo.pkg2.interfaz;


public class Ejemplo2Interfaz {

   
    public static void main(String[] args) {
       Volador Hidroavion = new Hidroavion();
       Nadador Hidro = new Hidroavion();
       
       Hidro.nadar();
       Hidroavion.volar();
    }
    
}
