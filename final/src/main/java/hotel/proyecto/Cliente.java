package hotel.proyecto;

public class Cliente extends Persona{




    public Cliente(String id, String nombre, String apellido, String edad, String telefono) {
        super(id, nombre, apellido, edad, telefono);
    }

    @Override
    public String toString() {
        return "Cliente []";
    } 

   
    

}
