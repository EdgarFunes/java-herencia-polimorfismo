class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioPorAsiento;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioPorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioPorAsiento = precioPorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioPorAsiento;
    }

    @Override
    public void aplicarPromocion(double descuento) {
        this.precioPorAsiento -= this.precioPorAsiento * descuento / 100;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Regular | Asientos: " + numeroAsientos + " | Precio Total: " + calcularPrecio();
    }
}
