class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private int codigoSeguridad;

    public TarjetaCredito(String titular, int numero, String fechaExpiracion, int codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con tarjeta de crédito...");
        System.out.println("Pago realizado exitosamente con la tarjeta de " + titular);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago realizado con tarjeta de crédito para el titular " + titular);
    }

    @Override
    public String toString() {
        return super.toString() + " | Fecha Expiración: " + fechaExpiracion + " | Código Seguridad: " + codigoSeguridad;
    }
}
