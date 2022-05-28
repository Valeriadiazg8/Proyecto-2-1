package hotel.proyecto;

public class InformacionPago {

    public String Hora;
    public String modoPago;
    public InformacionPago(String hora, String modoPago) {
        Hora = hora;
        this.modoPago = modoPago;
    }
    @Override
    public String toString() {
        return "InformacionPago [Hora=" + Hora + ", modoPago=" + modoPago + "]";
    }

     

}
