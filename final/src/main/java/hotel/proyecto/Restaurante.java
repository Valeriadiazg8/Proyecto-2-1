package hotel.proyecto;

public class Restaurante {
    
    public String Id;
    public ProductoRestaurante producto;
    public int Cantidad;

    public Restaurante(String id, ProductoRestaurante producto, int cantidad) {
        Id = id;
        this.producto = producto;
        Cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "Restaurante [Cantidad=" + Cantidad + ", Id=" + Id + ", producto=" + producto + "]";
    }
    
    
    

}


