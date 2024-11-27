abstract class MetodoPago {
    protected String titular;
    protected int numero;

    public MetodoPago(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public abstract void realizarPago(double monto);

    @Override
    public String toString() {
        return "Titular: " + titular + " | Número: " + numero;
    }
}
