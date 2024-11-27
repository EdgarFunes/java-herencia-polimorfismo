import java.util.ArrayList;

class Pagos {
    private ArrayList<MetodoPago> metodosPago;

    public Pagos() {
        this.metodosPago = new ArrayList<>();
    }

    public void agregarMetodo(MetodoPago metodoPago) {
        metodosPago.add(metodoPago);
    }

    public void realizarPagos(double monto) {
        for (MetodoPago metodoPago : metodosPago) {
            metodoPago.realizarPago(monto);
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodoPago : metodosPago) {
            if (metodoPago instanceof Cancelable) {
                ((Cancelable) metodoPago).cancelarPago();
            }
        }
    }

    public void mostrarPagos() {
        System.out.println("Métodos de Pago Registrados:");
        for (MetodoPago metodoPago : metodosPago) {
            System.out.println(metodoPago);
        }
    }
}
