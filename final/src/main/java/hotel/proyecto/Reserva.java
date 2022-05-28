package hotel.proyecto;

public class Reserva {
    
    public String Id;
    public Habitacion Habitacion;
    public String FechaHoraDeIngreso;
    public String FechaHoraDeSalida;

    public Reserva(String id, hotel.proyecto.Habitacion habitacion, String fechaHoraDeIngreso,
            String fechaHoraDeSalida) {
        Id = id;
        Habitacion = habitacion;
        FechaHoraDeIngreso = fechaHoraDeIngreso;
        FechaHoraDeSalida = fechaHoraDeSalida;
    }
    
    @Override
    public String toString() {
        return "Reserva [FechaHoraDeIngreso=" + FechaHoraDeIngreso + ", FechaHoraDeSalida=" + FechaHoraDeSalida
                + ", Habitacion=" + Habitacion + ", Id=" + Id + "]";
    }

    
}
