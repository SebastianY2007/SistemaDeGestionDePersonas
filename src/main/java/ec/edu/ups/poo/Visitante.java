package ec.edu.ups.poo;

import java.util.GregorianCalendar;
import java.util.List;

public class Visitante extends Persona{
    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante(List direcciones, String correoElectronico, String telefono, String apellido, String nombre, String cedula, String motivo, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida) {
        super(direcciones, correoElectronico, telefono, apellido, nombre, cedula);
        this.motivo = motivo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}