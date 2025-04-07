package ec.edu.ups.poo;

import java.util.GregorianCalendar;
import java.util.List;

public class Institucion {
    private String idOficial;
    private List ubicaciones;
    private GregorianCalendar fechaDeInicio;
    private String rol;

    public Institucion(String idOficial, List ubicaciones, GregorianCalendar fechaDeInicio, String rol) {
        this.idOficial = idOficial;
        this.ubicaciones = ubicaciones;
        this.fechaDeInicio = fechaDeInicio;
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public GregorianCalendar getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(GregorianCalendar fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public List getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public String getIdOficial() {
        return idOficial;
    }

    public void setIdOficial(String idOficial) {
        this.idOficial = idOficial;
    }
}