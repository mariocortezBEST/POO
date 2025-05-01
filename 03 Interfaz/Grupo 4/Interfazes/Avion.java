/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfazes;

/**
 *
 * @author Señor X
 */
public class Avion implements Volador, Vehiculo {
    @Override
    public void volar() {
        System.out.println("El avión está volando.");
    }
    
    @Override
    public void mover() {
        System.out.println("El avión está despegando."); //pequeño cambio en el print para diferenciar
    }
    
    
}
