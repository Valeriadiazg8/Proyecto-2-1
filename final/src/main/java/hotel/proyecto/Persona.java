package hotel.proyecto;

public class Persona {

    public String Id;
    public String Nombre;
    public String Apellido;
    public String Edad;
    public String Telefono;

    
    public Persona(String id, String nombre, String apellido, String edad, String telefono) {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Telefono = telefono;
    }


    @Override
    public String toString() {
        return "Persona [Apellido=" + Apellido + ", Edad=" + Edad + ", Id=" + Id + ", Nombre=" + Nombre + ", Telefono="
                + Telefono + "]";
    }

    

    
}
