package co.edu.uniquindio.parcial1.model;

public class Visitantes {

    private String nombre;
    private String apellido;
    private Integer edad;
    private String numeroIdentificacion;
    private String tipoVisitante;
    private String sexo;
    private Integer peso;

    /* Constructor */

    public Visitantes(String nombre, String apellido, Integer edad, String numeroIdentificacion, String tipoVisitante, String sexo, Integer peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
        this.tipoVisitante = tipoVisitante;
        this.sexo = sexo;
        this.peso = peso;
    }

    /* Getters and setters */

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getTipoVisitante() {
        return tipoVisitante;
    }

    public void setTipoVisitante(String tipoVisitante) {
        this.tipoVisitante = tipoVisitante;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}
