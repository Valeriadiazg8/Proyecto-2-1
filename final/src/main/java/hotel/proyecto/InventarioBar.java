package hotel.proyecto;

public class InventarioBar {
    public TipoLicor Licor;
    public Bebida Bebida;
    public Snack Snack;

    
    public InventarioBar(TipoLicor licor, hotel.proyecto.Bebida bebida, hotel.proyecto.Snack snack) {
        Licor = licor;
        Bebida = bebida;
        Snack = snack;
    }


    @Override
    public String toString() {
        return "InventarioBar [Bebida=" + Bebida + ", Licor=" + Licor + ", Snack=" + Snack + "]";
    }

    

}
