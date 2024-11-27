import java.util.ArrayList;

class Reservas {
    private ArrayList<Vuelo> vuelos;

    public Reservas() {
        this.vuelos = new ArrayList<>();
    }

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularTotalReservas() {
        double total = 0;
        for (Vuelo vuelo : vuelos) {
            total += vuelo.calcularPrecio();
        }
        return total;
    }

    public void aplicarPromociones(double descuento) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion(descuento);
            }
        }
    }

    public void mostrarVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }
}
