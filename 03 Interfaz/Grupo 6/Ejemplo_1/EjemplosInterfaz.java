/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplosinterfaz;

/**
 *
 * @author Estudiante
 */
public class EjemplosInterfaz {

    public static void main(String[] args) {
        Volador pajaro = new Pajaro();
        Volador avion = new Avion();
        
        pajaro.volar();
        avion.volar();
    }
}
