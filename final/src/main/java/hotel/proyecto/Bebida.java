package hotel.proyecto;

public class Bebida {

    public String Nombre;
    public String Disponibilidad;
    public int Cantidad;
    public double Precio;

    
    public Bebida(String nombre, String disponibilidad, int cantidad, double precio) {
        Nombre = nombre;
        Disponibilidad = disponibilidad;
        Cantidad = cantidad;
        Precio = precio;
    }


    @Override
    public String toString() {
        return "Bebida [Cantidad=" + Cantidad + ", Disponibilidad=" + Disponibilidad + ", Nombre=" + Nombre
                + ", Precio=" + Precio + "]";
    }
    
    
    
    
}
