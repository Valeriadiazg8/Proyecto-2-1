package hotel.proyecto;

public class Snack {
    
    public String Nombre;
    public String Disponibilidad;
    public int Cantidad;
    public double Precio;
    
    public Snack(String nombre, String disponibilidad, int cantidad, double precio) {
        Nombre = nombre;
        Disponibilidad = disponibilidad;
        Cantidad = cantidad;
        Precio = precio;
    }
    @Override
    public String toString() {
        return "Snack [Cantidad=" + Cantidad + ", Disponibilidad=" + Disponibilidad + ", Nombre=" + Nombre + ", Precio="
                + Precio + "]";
    }

    
    
    

}
