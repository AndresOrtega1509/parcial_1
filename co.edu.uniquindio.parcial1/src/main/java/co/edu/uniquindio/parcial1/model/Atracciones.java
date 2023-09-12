package co.edu.uniquindio.parcial1.model;

public class Atracciones {

    private String nombre;
    private String horario;
    private String descripcion;
    private Integer rangoEdad;
    private String nivelPeligro;
    private Integer pesoMaximo;


    /* Constructor*/

    public Atracciones(String nombre, String horario, String descripcion, Integer rangoEdad, String nivelPeligro, Integer pesoMaximo) {
        this.nombre = nombre;
        this.horario = horario;
        this.descripcion = descripcion;
        this.rangoEdad = rangoEdad;
        this.nivelPeligro = nivelPeligro;
        this.pesoMaximo = pesoMaximo;
    }

    /* Getters and setters */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getRangoEdad() {
        return rangoEdad;
    }

    public void setRangoEdad(Integer rangoEdad) {
        this.rangoEdad = rangoEdad;
    }

    public String getNivelPeligro() {
        return nivelPeligro;
    }

    public void setNivelPeligro(String nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    public Integer getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Integer pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

}
