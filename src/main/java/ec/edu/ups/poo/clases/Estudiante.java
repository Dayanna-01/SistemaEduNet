package ec.edu.ups.poo.clases;

public class Estudiante extends Persona {

    private String carrera;

    public Estudiante() {}

    public Estudiante(String cedula, String nombre, String apellido, String telefono, String correo, String carrera) {
        super(cedula, nombre, apellido, telefono, correo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante: \n" +
                "Cédula: " + getCedula() + "\n" +
                "Nombre: " + getNombre() + "\n" +
                "Apellido: " + getApellido() + "\n" +
                "Teléfono: " + getTelefono() + "\n" +
                "Correo: " + getCorreo() + "\n" +
                "Carrera: " + carrera;
    }
}
