package ejemplo_4.entity;

import ejemplo_4.service.Motor;
import ejemplo_4.service.Vehiculo;

public class Moto implements Vehiculo, Motor{

    @Override
    public void cambiarAceite() {
        
        System.out.println("Cambiando Aceite Del MOTO!!");
        
    }

    @Override
    public void hacerService() {
        
        System.out.println("Haciendo Service Del MOTO!!");
        
    }

    @Override
    public void acelerar() {
        
        System.out.println("Acelerando MOTO!!");
        
    }

    @Override
    public void cambiarRespuesto() {
        
        System.out.println("Cambiando Respuestos del MOTO!!");
        
    }

    @Override
    public void arrancarMotor() {
        
        System.out.println("Arrancando Motor Del MOTO!!");
        
    }

    @Override
    public void apagarMotor() {
        
        System.out.println("Apagando Motor Del MOTO!!");
        
    }
}
