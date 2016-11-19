/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author CARLOSS
 */
public class EmpleadoHora extends Empleado{
   
    int horasActuales;
    double valorHora;

    public EmpleadoHora(int horasActuales, String cedula, String nombre, String apellido, String cargo) {
        super(cedula, nombre, apellido, cargo);
        this.horasActuales = horasActuales;
        
    }

    public EmpleadoHora() {
    }

    public int getHorasActuales() {
        return horasActuales;
    }

    public void setHorasActuales(int horasActuales) {
        this.horasActuales = horasActuales;
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
