package ec.edu.ups.poo;

import java.util.List;

public class Administrativo extends Persona {
    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo(List direcciones, String correoElectronico, String telefono, String apellido, String nombre, String cedula, List<String> cargos, List<String> responsabilidades) {
        super(direcciones, correoElectronico, telefono, apellido, nombre, cedula);
        this.cargos = cargos;
        this.responsabilidades = responsabilidades;
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }
}