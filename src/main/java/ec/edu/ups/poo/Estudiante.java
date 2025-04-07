package ec.edu.ups.poo;

import java.util.List;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(List<String> direcciones, String correoElectronico, String telefono, String apellido, String nombre, String cedula, String carrera) {
        super(direcciones, correoElectronico, telefono, apellido, nombre, cedula);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}