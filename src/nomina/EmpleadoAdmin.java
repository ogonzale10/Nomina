
package nomina;


public class EmpleadoAdmin extends Empleado{
    
    double salarioBasico;

    public EmpleadoAdmin(String cedula, String nombre, String apellido, String cargo) {
        super(cedula, nombre, apellido, cargo);
    }

    public EmpleadoAdmin() {
    }

    public EmpleadoAdmin(double salarioBasico, String cedula, String nombre, String apellido, String cargo) {
        super(cedula, nombre, apellido, cargo);
        this.salarioBasico = salarioBasico;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
