public class Pago extends  AccionHotel{
    private float montoPagar=12.0F;

    public Pago() {
    }

    public Pago(float montoPagar) {
        this.montoPagar = montoPagar;
    }

    @Override
    String ejecutarAccion() {
        System.out.println("El monto a pagar es: "+ this.montoPagar);
        return null;
    }
}
