/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author CARLOSS
 */
public class Prueba {
    
    public static void main(String[] args) {
        EmpleadoHora emp1 = new EmpleadoHora(15,"1042451281","Enuar","Martinez","Jefe");
        EmpleadoAdmin emp2 = new EmpleadoAdmin("1234567890", "Juan", "Perez", "Administrador");
        EmpleadoComision emp3 = new EmpleadoComision(20, 3000000, "1029384756", "Lucho", "Portuano", "GErente de ventas");
        ArrayList<Empleado> empleados = new ArrayList<>();
        Nomina nom = new Nomina(3000,24,20000000);
       nom.adicionarEmpleado(emp1);
        nom.adicionarEmpleado(emp2);
        nom.adicionarEmpleado(emp3);   
       try{ 
         System.out.println(nom.pagarEmpleado(300000));
        System.out.println(nom.pagarEmpleado(40));
        System.out.println(nom.pagarEmpleado(300000, 0.25, 5000000));
       }catch(RuntimeException e){
           e.printStackTrace();
           System.out.println("Haz ingresado mal los datos");
           System.out.println(e);
       }
       finally{
          System.out.println("proceso terminado");
       }
    try{
        System.out.println(nom.buscarEmpleado("1042451281"));
        System.out.println(nom.mostrarEmpleados());
        }catch(RuntimeException e){
            e.printStackTrace();
            System.out.println("revisa los datos ingresados");
            System.out.println(e);
        }
    finally {
        System.out.println("proceso terminado");
    }
       
    }
}
