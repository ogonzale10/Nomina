
package nomina;

import java.util.ArrayList;
import java.util.Calendar;


public class Nomina {

    double salarioBasico;
    double valorHora;
    Calendar fecha;
    int horasTotales;
    double ventaTotal;
    ArrayList<Empleado> empleados = new ArrayList<>();

    public Nomina(double valorHora, int horasTotales, double ventaTotal) {
        this.valorHora = valorHora;
        this.horasTotales = horasTotales;
        this.ventaTotal = ventaTotal;
        this.salarioBasico = 700000;
    }
    

    public Nomina() {
        this.salarioBasico = 700000;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getVentaTotal() {
        return ventaTotal;
    }

    public void setVentaTotal(double ventaTotal) {
        this.ventaTotal = ventaTotal;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
public void adicionarEmpleado (Empleado empleado){
    {
        if (!empleados.contains(empleado)) {
            empleados.add(empleado);
        }
    }
}  

public void eliminarEmpleado (String cedula){
    for (int i = 0; i < empleados.size(); i++) {
      Empleado data = empleados.get(i);
        if (data.getCedula().equalsIgnoreCase(cedula)) {
            empleados.remove(data);
        }        
    }    
}

public String buscarEmpleado (String cedula){
    String resultado;
        for (int i = 0; i < empleados.size(); i++) {
            Empleado data = empleados.get(i);
            if (data.getCedula().equalsIgnoreCase(cedula)) {
                return data.getNombre() + data.getApellido();
            }
            else {
                return null;
            }
        }
    return null;
}

public double pagarEmpleado (int totalhoras){
    double saldo = 0;
    saldo = (valorHora * totalhoras);
    return saldo;
}

public double pagarEmpleado (double deducciones){
    double saldo = 0;
    double descuento = deducciones * 0.1;
    saldo = salarioBasico;
    return saldo-=descuento;
    
}

public double pagarEmpleado (double deducciones, double porcentage, double totalVentas){
    double saldo = 0;
    double descuento = deducciones * 0.1;
    saldo = salarioBasico + (totalVentas * porcentage);
    return saldo -= descuento;
}

public String mostrarEmpleados (){
    String lista=null;
    for (int i = 0; i < empleados.size(); i++) {
        Empleado actual = empleados.get(i);
        lista = ""+ actual.getApellido() + " " +actual.getNombre()+" "+ actual.getCedula()+"\t";
    }
    
    return lista;
}
    
}
