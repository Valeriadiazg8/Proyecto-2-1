package hotel.proyecto;

public class ProductoRestaurante {
    public String Nombre;
    public String Disponibilidad;
    public double Precio;

    public ProductoRestaurante(String nombre, String disponibilidad, double precio) {
        Nombre = nombre;
        Disponibilidad = disponibilidad;
        Precio = precio;
    }
    @Override
    public String toString() {
        return "ProductoRestaurante [Disponibilidad=" + Disponibilidad + ", Nombre=" + Nombre + ", Precio=" + Precio
                + "]";
    }
}
