class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, int numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con PayPal...");
        System.out.println("Pago realizado exitosamente con la cuenta PayPal: " + correoElectronico);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago realizado con PayPal para la cuenta: " + correoElectronico);
    }

    @Override
    public String toString() {
        return super.toString() + " | Correo Electrónico: " + correoElectronico;
    }
}
