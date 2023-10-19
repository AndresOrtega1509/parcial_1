package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.model.enumeracion.TipoContrato;

public class Jornalero extends FincaUq{

    private TipoContrato tipoContrato;

    /*Constructor*/
    public Jornalero() {
    }

    /*Getters and Setters*/
    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
}
