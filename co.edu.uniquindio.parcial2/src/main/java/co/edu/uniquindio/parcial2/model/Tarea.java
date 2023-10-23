package co.edu.uniquindio.parcial2.model;

import java.util.Date;

public class Tarea {
    private int numeroTarea;
    private Date fechaInicio;
    private Date fechaFin;
    private double duracionTarea;
    private String descripcion;
    private Empleado empleadoAsociado;
    FincaUq ownedByFincaUq;

    /*Constructor*/

    public Tarea() {
    }

    public Tarea(int numeroTarea, Date fechaInicio, Date fechaFin, double duracionTarea, String descripcion) {
        this.numeroTarea = numeroTarea;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionTarea = duracionTarea;
        this.descripcion = descripcion;
    }

    /*Getters and Setters*/

    public int getNumeroTarea() {
        return numeroTarea;
    }

    public void setNumeroTarea(int numeroTarea) {
        this.numeroTarea = numeroTarea;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getDuracionTarea() {
        return duracionTarea;
    }

    public void setDuracionTarea(double duracionTarea) {
        this.duracionTarea = duracionTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FincaUq getOwnedByFincaUq() {
        return ownedByFincaUq;
    }

    public void setOwnedByFincaUq(FincaUq ownedByFincaUq) {
        this.ownedByFincaUq = ownedByFincaUq;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public void setEmpleadoAsociado(Empleado empleadoAsociado) {
        this.empleadoAsociado = empleadoAsociado;
    }
}
