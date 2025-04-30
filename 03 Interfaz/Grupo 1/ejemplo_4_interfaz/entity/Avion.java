package ejemplo_4.entity;

import ejemplo_4.service.Motor;
import ejemplo_4.service.Vehiculo;

public class Avion implements Vehiculo, Motor{

    @Override
    public void cambiarAceite() {
        
        System.out.println("Cambiando Aceite Del AVION!!");
        
    }

    @Override
    public void hacerService() {
        
        System.out.println("Haciendo Service Del AVION!!");
        
    }

    @Override
    public void acelerar() {
        
        System.out.println("Acelerando AVION!!");
        
    }

    @Override
    public void cambiarRespuesto() {
        
        System.out.println("Cambiando Respuestos del AVION!!");
        
    }

    @Override
    public void arrancarMotor() {
        
        System.out.println("Arrancando Motor Del AVION!!");
        
    }

    @Override
    public void apagarMotor() {
        
        System.out.println("Apagando Motor Del AVION!!");
        
    }
}
