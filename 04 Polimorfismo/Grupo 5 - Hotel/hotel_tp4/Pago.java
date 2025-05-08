
package hotel_tp4;

public class Pago implements accionHotel{
    
    String metodoDePago;
    float monto;

    public Pago() {
    }

    public Pago(String metodoDePago, float monto) {
        this.metodoDePago = metodoDePago;
        this.monto = monto;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    
    

    @Override
    public void ejecutarAccion() {
        System.out.println("Pagando hotel con: " + this.metodoDePago+", Monto total: " + this.monto);
    }
    
}
