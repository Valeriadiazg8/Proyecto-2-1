package hotel.proyecto;

public class Consumido {

    public String Id;
    public InventarioBar InventarioBar;
    public Restaurante Restaurante;
    public Consumido(String id, hotel.proyecto.InventarioBar inventarioBar, hotel.proyecto.Restaurante restaurante) {
        Id = id;
        InventarioBar = inventarioBar;
        Restaurante = restaurante;
    }
    @Override
    public String toString() {
        return "Consumido [Id=" + Id + ", InventarioBar=" + InventarioBar + ", Restaurante=" + Restaurante + "]";
    }

    
    
}
