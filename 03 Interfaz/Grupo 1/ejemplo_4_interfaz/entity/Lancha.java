package ejemplo_4.entity;

import ejemplo_4.service.Motor;
import ejemplo_4.service.Vehiculo;

public class Lancha implements Vehiculo, Motor{

    @Override
    public void cambiarAceite() {
        
        System.out.println("Cambiando Aceite De LANCHA!!");
        
    }

    @Override
    public void hacerService() {
        
        System.out.println("Haciendo Service De LANCHA!!");
        
    }

    @Override
    public void acelerar() {
        
        System.out.println("Acelerando LANCHA!!");
        
    }

    @Override
    public void cambiarRespuesto() {
        
        System.out.println("Cambiando Respuestos de la LANCHA!!");
        
    }

    @Override
    public void arrancarMotor() {
        
        System.out.println("Arrancando Motor De La LANCHA!!");
        
    }

    @Override
    public void apagarMotor() {
        
        System.out.println("Apagando Motor De La LANCHA!!");
        
    }
}