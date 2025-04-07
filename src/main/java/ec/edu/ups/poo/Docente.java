package ec.edu.ups.poo;

import java.util.List;

public class Docente extends Persona{
    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;

    public Docente(List<String> direcciones, String correoElectronico, String telefono, String apellido, String nombre, String cedula, List<String> titulosAcademicos, List<String> areasDeEspecializacion) {
        super(direcciones, correoElectronico, telefono, apellido, nombre, cedula);
        this.titulosAcademicos = titulosAcademicos;
        this.areasDeEspecializacion = areasDeEspecializacion;
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEspecializacion() {
        return areasDeEspecializacion;
    }

    public void setAreasDeEspecializacion(List<String> areasDeEspecializacion) {
        this.areasDeEspecializacion = areasDeEspecializacion;
    }
}