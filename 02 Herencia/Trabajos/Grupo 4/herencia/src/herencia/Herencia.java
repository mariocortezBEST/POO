/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author emely
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Emely";
        estudiante.edad = 24;
        estudiante.universidad = "Terciario de carrera superior 6030";

        estudiante.mostrarInfo(); // Muestra nombre y edad
        estudiante.mostrarUniversidad(); // Muestra la universidad
    
    }
    
}
