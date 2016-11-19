
package nomina;


public class EmpleadoComision extends Empleado {
    
    int numeroVentas;
    double cantidadVentas;
    double salarioBasico;

    public EmpleadoComision(int numeroVentas, double cantidadVentas, String cedula, String nombre, String apellido, String cargo) {
        super(cedula, nombre, apellido, cargo);
        this.numeroVentas = numeroVentas;
        this.cantidadVentas = cantidadVentas;
        
    }

    public EmpleadoComision() {
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public double getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(double cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
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
