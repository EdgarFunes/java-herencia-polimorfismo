public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        // Crear vuelos regulares
        VueloRegular vuelo1 = new VueloRegular(101, "Madrid", "Barcelona", "2024-12-01", 100, 50);
        VueloRegular vuelo2 = new VueloRegular(102, "Paris", "Londres", "2024-12-05", 200, 75);

        // Crear vuelos charter
        VueloCharter vuelo3 = new VueloCharter(201, "New York", "Los Angeles", "2024-12-10", 5000);
        VueloCharter vuelo4 = new VueloCharter(202, "Tokyo", "Seoul", "2024-12-15", 7000);

        // Agregar vuelos al sistema de reservas
        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);
        reservas.agregarVuelo(vuelo3);
        reservas.agregarVuelo(vuelo4);

        // Mostrar información inicial
        System.out.println("Vuelos registrados:");
        reservas.mostrarVuelos();

        // Calcular total antes de promociones
        System.out.println("\nPrecio total de las reservas: " + reservas.calcularTotalReservas());

        // Aplicar promociones
        reservas.aplicarPromociones(10); // Aplicar un 10% de descuento

        // Mostrar información después de promociones
        System.out.println("\nVuelos después de aplicar promociones:");
        reservas.mostrarVuelos();

        // Calcular total después de promociones
        System.out.println("\nPrecio total de las reservas tras promociones: " + reservas.calcularTotalReservas());
    }
}
