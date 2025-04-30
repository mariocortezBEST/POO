package ejemplo_4.entity;

import ejemplo_4.service.Motor;
import ejemplo_4.service.Vehiculo;

public class Auto implements Vehiculo, Motor{

    @Override
    public void cambiarAceite() {
        
        System.out.println("Cambiando Aceite Del AUTO!!");
        
    }

    @Override
    public void hacerService() {
        
        System.out.println("Haciendo Service Del AUTO!!");
        
    }

    @Override
    public void acelerar() {
        
        System.out.println("Acelerando AUTO!!");
        
    }

    @Override
    public void cambiarRespuesto() {
        
        System.out.println("Cambiando Respuestos del AUTO!!");
        
    }

    @Override
    public void arrancarMotor() {
        
        System.out.println("Arrancando Motor Del AUTO!!");
        
    }

    @Override
    public void apagarMotor() {
        
        System.out.println("Apagando Motor Del AUTO!!");
        
    }
    
}
