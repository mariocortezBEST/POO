/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfazes;

/**
 *
 * @author Señor Quiroga Santiago
 */
public class InterfazSantiago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Volador pajaro = new Pajaro();
        Volador avion = new Avion();
        Nadador hidroavion = (Nadador) new Hidroavion();
        Vehiculo avion2 = new Avion();
        Vehiculo coche = new Coche();
        Caminar elefante = new Elefante(); //ejmplo 4
        Caminar gato = new Gato();// ejemplo 4
        
        pajaro.volar();
        avion.volar();
        hidroavion.nadar();
        hidroavion.volar();
        avion2.mover();
        coche.mover();
        elefante.caminando();
        gato.caminando();
        
    }

 
    
}
