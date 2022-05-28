package hotel.proyecto;

public class TipoLicor {
    
    public String Nombre;
    public String Disponibilidad;
    public int Cantidad;
    public double Precio;
    
    public TipoLicor(String nombre, String disponibilidad, int cantidad, double precio) {
        Nombre = nombre;
        Disponibilidad = disponibilidad;
        Cantidad = cantidad;
        Precio = precio;
    }
    @Override
    public String toString() {
        return "TipoLicor [Cantidad=" + Cantidad + ", Disponibilidad=" + Disponibilidad + ", Nombre=" + Nombre
                + ", Precio=" + Precio + "]";
    }


    
    

}
