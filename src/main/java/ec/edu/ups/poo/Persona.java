package ec.edu.ups.poo;

import java.util.List;

public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correoElectronico;
    private List direcciones;

    public Persona(List direcciones, String correoElectronico, String telefono, String apellido, String nombre, String cedula) {
        this.direcciones = direcciones;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List direcciones) {
        this.direcciones = direcciones;
    }
}