package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String cedula;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private List<Direccion> direcciones;

    public Persona() {
        this.direcciones = new ArrayList<>();
    }

    public Persona(String cedula, String nombre, String apellido, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.direcciones = new ArrayList<>();
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void addDireccion(Direccion direccion) {
        direcciones.add(direccion);
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    @Override
    public String toString() {
        return "Cédula: " + cedula + "\nNombre: " + nombre + " " + apellido + "\nTeléfono: " + telefono +
                "\nCorreo: " + correo + "\nDirecciones: " + direcciones.toString();
    }
}
