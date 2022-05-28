package hotel.proyecto;

public class TipoHabitacion {

    public String Nombre;
    public int CantidaPersonas;
    public double Precio;


    public TipoHabitacion(String nombre, int cantidaPersonas, double precio) {
        Nombre = nombre;
        CantidaPersonas = cantidaPersonas;
        Precio = precio;
    }


    @Override
    public String toString() {
        return "TipoHabitacion [CantidaPersonas=" + CantidaPersonas + ", Nombre=" + Nombre + ", Precio=" + Precio + "]";
    }

    
    
}
