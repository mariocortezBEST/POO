package ejemplo_4;

import ejemplo_4.entity.Auto;
import ejemplo_4.entity.Avion;
import ejemplo_4.entity.Lancha;
import ejemplo_4.entity.Moto;

public class Ejemplo_4 {

    public static void main(String[] args) {
        
        Auto autito = new Auto();
        
        Avion avi = new Avion();
        
        Lancha lan = new Lancha();
        
        Moto motito = new Moto();
        
        autito.acelerar();

        avi.apagarMotor();
        
        lan.arrancarMotor();
        
        motito.cambiarAceite();
        
        autito.cambiarRespuesto();
        
        lan.hacerService();
        
    }
    
}
