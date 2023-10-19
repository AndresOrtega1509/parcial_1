package co.edu.uniquindio.parcial2.model;

import java.util.ArrayList;
import java.util.List;

public class FincaUq {
    private String nombre;
    List<Empleado> listaEmpleados = new ArrayList<>();
    List<Tarea> listaTareas = new ArrayList<>();

    /*Constructor*/
    public FincaUq() {
    }

    public FincaUq(String nombre) {
        this.nombre = nombre;
    }

    /*Getters and Setters*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(List<Tarea> listaTareas) {
        this.listaTareas = listaTareas;
    }

    public void crearEmpleado(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo) {

        int resultadoBusqueda = devolverPosicionEmpleado(cedula);
        if (resultadoBusqueda == -1){
            Empleado empleado = new Empleado();
            empleado.setNombre(nombre);
            empleado.setApellido(apellido);
            empleado.setCedula(cedula);
            empleado.setEdad(edad);
            empleado.setSalario(salario);
            empleado.setNumeroHorasTrabajo(numeroHorasTrabajo);
            getListaEmpleados().add(empleado);
            System.out.println("Empleado creado exitosamente");

        }else {
            System.out.println("El empleado ya esta creado en el sistema");
        }
    }

    public void mostrarEmpleado() {

        List<Empleado> listaEmpleado = obtenerEmpleados();
        int tamanoLista = listaEmpleado.size();
        for (int i=0; i < tamanoLista; i++){
            Empleado empleado = listaEmpleado.get(i);
            System.out.println(empleado.toString());
        }
    }

    public List<Empleado> obtenerEmpleados() {
        return getListaEmpleados();
    }

    public int devolverPosicionEmpleado(String cedula) {
        int posicion = -1;
        boolean bandera = false;
        for(int i = 0; i < listaEmpleados.size() && bandera == false; i++) {
            if(listaEmpleados.get(i).getCedula().equalsIgnoreCase(cedula)) {
                bandera = true;
                posicion = i;
            }
        }
        return posicion;
    }

    public void eliminarEmpleado(String cedula) {
        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equalsIgnoreCase(cedula)){
                getListaEmpleados().remove(empleado);
                break;
            }
        }
    }

    public void actualizarEmpleado(String cedula, String nuevoNombre, String nuevoApellido, int nuevaEdad, double nuevoSalario, int nuevoNumeroHoras) {

        for (Empleado empleado : listaEmpleados){
            if (empleado.getCedula().equals(cedula)){
                empleado.setNombre(nuevoNombre);
                empleado.setApellido(nuevoApellido);
                empleado.setEdad(nuevaEdad);
                empleado.setSalario(nuevoSalario);
                empleado.setNumeroHorasTrabajo(nuevoNumeroHoras);
                break;
            }
        }
    }
}

