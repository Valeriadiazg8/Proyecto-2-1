package hotel.proyecto;

public class Hotel {
    public String Nombre;
    public int Nit;
    public String Telefono;
    public String Dirección;   
    public Restaurante Restaurante;    
    public InventarioBar Bar;
    public Hotel(String nombre, int nit, String telefono, String dirección, hotel.proyecto.Restaurante restaurante,
            InventarioBar bar) {
        Nombre = nombre;
        Nit = nit;
        Telefono = telefono;
        Dirección = dirección;
        Restaurante = restaurante;
        Bar = bar;
    }
    @Override
    public String toString() {
        return "Hotel [Bar=" + Bar + ", Dirección=" + Dirección + ", Nit=" + Nit + ", Nombre=" + Nombre
                + ", Restaurante=" + Restaurante + ", Telefono=" + Telefono + "]";
    }    

}
