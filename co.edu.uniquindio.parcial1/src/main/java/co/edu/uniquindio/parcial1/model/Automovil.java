package co.edu.uniquindio.parcial1.model;

public class Automovil {

    private String nombre;
    private String tipoCarroceria;
    private String tipoMotor;
    private Integer capacidadPasajeros;
    private Double precioBase;


    public Automovil(String nombre, String tipoCarroceria, String tipoMotor, Integer capacidadPasajeros, Double precioBase) {
        this.nombre = nombre;
        this.tipoCarroceria = tipoCarroceria;
        this.tipoMotor = tipoMotor;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Integer getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(Integer capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }
}


