package hotel.proyecto;

public class Empleado extends Persona{
    public TipoCargo Cargo;    
    public String Usuario;
    public String Contraseña;



    public Empleado(String id, String nombre, String apellido, String edad, String telefono, TipoCargo cargo,
            String usuario, String contraseña) {
        super(id, nombre, apellido, edad, telefono);
        Cargo = cargo;
        Usuario = usuario;
        Contraseña = contraseña;
    }



    @Override
    public String toString() {
        return "Empleado [Cargo=" + Cargo + ", Contraseña=" + Contraseña + ", Usuario=" + Usuario + "]";
    }

    
    
}
