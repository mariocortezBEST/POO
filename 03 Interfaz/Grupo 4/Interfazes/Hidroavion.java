/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfazes;

/**
 *
 * @author Señor X
 */
public class Hidroavion implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El hidroavión está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El hidroavión está flotando en el agua.");
    }
}
