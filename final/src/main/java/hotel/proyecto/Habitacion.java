package hotel.proyecto;

public class Habitacion {

    public TipoHabitacion TipoDeHabitacion;    
    public int NumeroHabitación;
    public int NumeroPiso;
    public Habitacion(TipoHabitacion tipoDeHabitacion, int numeroHabitación, int numeroPiso) {
        TipoDeHabitacion = tipoDeHabitacion;
        NumeroHabitación = numeroHabitación;
        NumeroPiso = numeroPiso;
    }
    @Override
    public String toString() {
        return "Habitacion [NumeroHabitación=" + NumeroHabitación + ", NumeroPiso=" + NumeroPiso + ", TipoDeHabitacion="
                + TipoDeHabitacion + "]";
    }

     
    
}
