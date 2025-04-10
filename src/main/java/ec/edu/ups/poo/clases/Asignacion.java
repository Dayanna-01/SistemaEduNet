package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.enums.Rol;

import java.util.GregorianCalendar;

public class Asignacion {

    private Persona persona;
    private GregorianCalendar fechaInicio;
    private Rol rol;

    public Asignacion(){}

    public Asignacion(Persona persona, GregorianCalendar fechaInicio, Rol rol){
        this.persona = persona;
        this.fechaInicio = fechaInicio;
        this.rol = rol;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Asignacion{" +
                "persona=" + persona +
                ", fechaInicio=" + fechaInicio +
                ", rol=" + rol +
                '}';
    }
}
