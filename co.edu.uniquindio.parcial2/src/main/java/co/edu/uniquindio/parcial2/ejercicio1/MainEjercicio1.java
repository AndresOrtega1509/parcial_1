package co.edu.uniquindio.parcial2.ejercicio1;

import co.edu.uniquindio.parcial2.model.*;
import co.edu.uniquindio.parcial2.model.enumeracion.TipoContrato;

import java.util.Date;
import java.util.List;

public class MainEjercicio1 {
    public static void main(String[] args){
        FincaUq fincaUq = inicializarDatosPrueba();

        //Crud Empleado

        //Crear
        crearEmpleado(2,"Sofia", "Martinez", "1016874393", 23, 1150000, 8, TipoContrato.MEDIO_TIEMPO, fincaUq);
        crearEmpleado(1,"Daniel", "Ortega", "1094435405", 18, 800000, 10, TipoContrato.HORAS, fincaUq);
        crearEmpleado(3,"Carlos", "Lopez", "1098432309", 32, 1000000, 8, TipoContrato.TIEMPO_COMPLETO,fincaUq);
        crearEmpleado(2, "Andrea", "Suarez", "1094238594", 28, 1500000, 8, TipoContrato.HORAS, fincaUq);
        crearEmpleado(1,"Jose", "Sanchez", "1024490348", 20, 900000, 10, TipoContrato.MEDIO_TIEMPO,fincaUq);

        //Read
        fincaUq.mostrarInformacionTipoEmpleado(3);
        System.out.println("Informacion empleados:");
        mostrarInformacionEmpleados(fincaUq);

        //Delate
        eliminarEmpleado("1739748303", fincaUq);
        System.out.println("-----> Información luego de eliminar:");
        mostrarInformacionEmpleados(fincaUq);

        //update
        actualizarEmpleado("1024490348", "Santiago", "Ospina", 19, 1100000, 8,TipoContrato.TIEMPO_COMPLETO ,fincaUq);
        System.out.println("-----> Información luego de actualizar");
        mostrarInformacionEmpleados(fincaUq);

        Date fechaInicio = new Date(23,9,23,19,9);
        Date fechaFin = new Date(23,9,24,15,9);

        fincaUq.crearTarea(1, "1016874393", fechaInicio, fechaFin);

    }

    private static FincaUq inicializarDatosPrueba() {
        FincaUq fincaUq = new FincaUq();
        fincaUq.setNombre("El obrero");

        return fincaUq;
    }

    private static void crearEmpleado(int tipoEmpleado, String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo, TipoContrato tipoContrato, FincaUq fincaUq) {
        fincaUq.crearEmpleado(tipoEmpleado,nombre,apellido,cedula,edad,salario,numeroHorasTrabajo,tipoContrato);
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

    private static void actualizarEmpleado(String cedula,String nuevoNombre, String nuevoApellido, int nuevaEdad, double nuevoSalario , int nuevoNumeroHoras, TipoContrato nuevoContrato, FincaUq fincaUq) {

        fincaUq.actualizarEmpleado(cedula, nuevoNombre, nuevoApellido, nuevaEdad, nuevoSalario, nuevoNumeroHoras, nuevoContrato);
    }
}
