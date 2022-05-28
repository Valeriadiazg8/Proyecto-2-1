package hotel.proyecto;

public class TipoCargo {

    // public Administrador Administrador;
    // public Aseo Aseo;
    // public Auditor Auditor;
    // public Gerente Gerente;
    // public JefesAyB Jefes;
    // public Mantenimiento Mantenimiento ;
    // public Recepcionista Recepcionista;

    public int Codigo;
    public String Cargo;


    public TipoCargo(int codigo, String cargo) {
        this.Codigo = codigo;
        Cargo = cargo;
    }
    @Override
    public String toString() {
        return "TipoCargo [Cargo=" + Cargo + ", codigo=" + Codigo + "]";
    }

    

}
