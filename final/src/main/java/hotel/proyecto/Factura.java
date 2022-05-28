package hotel.proyecto;

public class Factura {
    public String Id;
    public Cliente Cliente;
    public Reserva Reserva;
    public Consumido Consumido;
    public Hotel Hotel;
    public InformacionPago InformacionPago;

    
    public Factura(String id, hotel.proyecto.Cliente cliente, hotel.proyecto.Reserva reserva,
            hotel.proyecto.Consumido consumido, hotel.proyecto.Hotel hotel,
            hotel.proyecto.InformacionPago informacionPago) {
        Id = id;
        Cliente = cliente;
        Reserva = reserva;
        Consumido = consumido;
        Hotel = hotel;
        InformacionPago = informacionPago;
    }
    @Override
    public String toString() {
        return "Factura [Cliente=" + Cliente + ", Consumido=" + Consumido + ", Hotel=" + Hotel + ", Id=" + Id
                + ", InformacionPago=" + InformacionPago + ", Reserva=" + Reserva + "]";
    }
    

}
