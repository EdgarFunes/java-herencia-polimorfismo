public class SistemadePagos {
    public static void main(String[] args) {
        Pagos sistemaPagos = new Pagos();

        // Crear métodos de pago
        TarjetaCredito tarjeta1 = new TarjetaCredito("Juan Pérez", 123456789, "12/25", 123);
        TarjetaCredito tarjeta2 = new TarjetaCredito("Ana López", 987654321, "08/24", 456);
        PayPal paypal1 = new PayPal("Carlos Martínez", 1122334455, "carlos@gmail.com");

        // Agregar métodos de pago al sistema
        sistemaPagos.agregarMetodo(tarjeta1);
        sistemaPagos.agregarMetodo(tarjeta2);
        sistemaPagos.agregarMetodo(paypal1);

        // Mostrar métodos de pago
        sistemaPagos.mostrarPagos();

        // Realizar pagos
        System.out.println("\nRealizando pagos:");
        sistemaPagos.realizarPagos(500);

        // Cancelar pagos
        System.out.println("\nCancelando pagos:");
        sistemaPagos.cancelarPagos();
    }
}
