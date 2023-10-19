package co.edu.uniquindio.parcial2.ejercicio1;

import co.edu.uniquindio.parcial2.model.*;
import co.edu.uniquindio.parcial2.model.enumeracion.TipoContrato;

import java.util.List;

public class MainEjercicio1 {
    public static void main(String[] args){
        FincaUq fincaUq = inicializarDatosPrueba();

        Administrador administrador = new Administrador();
        administrador.setTipoContrato(TipoContrato.TIEMPO_COMPLETO);

        Recolector recolector = new Recolector();
        recolector.setTipoContrato(TipoContrato.HORAS);

        Jornalero jornalero = new Jornalero();
        jornalero.setTipoContrato(TipoContrato.MEDIO_TIEMPO);

        //Crud Empleado

        //Crear
        crearEmpleado("Sofia", "Martinez", "1016874393", 23, 1150000, 8, fincaUq);
        crearEmpleado("Daniel", "Ortega", "1094435405", 18, 800000, 10, fincaUq);
        crearEmpleado("Carlos", "Lopez", "1098432309", 32, 1000000, 8, fincaUq);
        crearEmpleado("Andrea", "Suarez", "1094238594", 28, 1500000, 8, fincaUq);
        crearEmpleado("Jose", "Sanchez", "1024490348", 20, 900000, 10, fincaUq);

        //Read
        System.out.println("Informacion empleados:");
        mostrarInformacionEmpleados(fincaUq);

        //Delate
        eliminarEmpleado("1094435405", fincaUq);
        System.out.println("-----> Información luego de eliminar:");
        mostrarInformacionEmpleados(fincaUq);

        //update
        actualizarEmpleado("1024490348", "Santiago", "Ospina", 19, 1100000, 8, fincaUq);
        System.out.println("-----> Información luego de actualizar");
        mostrarInformacionEmpleados(fincaUq);

    }

    private static FincaUq inicializarDatosPrueba() {
        FincaUq fincaUq = new FincaUq();
        fincaUq.setNombre("El obrero");

        return fincaUq;
    }

    private static void crearEmpleado(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo, FincaUq fincaUq) {
        fincaUq.crearEmpleado(nombre,apellido,cedula,edad,salario,numeroHorasTrabajo);
    }

    private static void mostrarInformacionEmpleados(FincaUq fincaUq) {
        List<Empleado> listaEmpleados = fincaUq.obtenerEmpleados();
        int tamanoLista = listaEmpleados.size();
        for (int i = 0; i < tamanoLista; i ++){
            Empleado empleado = listaEmpleados.get(i);
            System.out.println(empleado.toString());
        }
    }

    private static void eliminarEmpleado(String cedula, FincaUq fincaUq) {

        fincaUq.eliminarEmpleado(cedula);
    }

    private static void actualizarEmpleado(String cedula,String nuevoNombre, String nuevoApellido, int nuevaEdad, double nuevoSalario , int nuevoNumeroHoras, FincaUq fincaUq) {

        fincaUq.actualizarEmpleado(cedula, nuevoNombre, nuevoApellido, nuevaEdad, nuevoSalario, nuevoNumeroHoras);
    }
}
