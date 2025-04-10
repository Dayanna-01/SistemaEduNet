package ec.edu.ups.POO.clases;

import ec.edu.ups.poo.clases.Persona;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona {

    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo(){
        this.cargos = new ArrayList<>();
        this.responsabilidades = new ArrayList<>();
    }

    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correo){
        super(cedula, nombre, apellido, telefono, correo);
        this.cargos = new ArrayList<>();
        this.responsabilidades = new ArrayList<>();
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

    @Override
    public String toString() {
        // Convertir las listas a cadenas de texto más legibles
        String cargosStr = String.join("\n", cargos);
        String responsabilidadesStr = String.join("\n", responsabilidades);

        // Retornar el formato deseado
        return "Cargos: " + (cargosStr.isEmpty() ? "No asignado" : cargosStr) +
                "\nResponsabilidades: " + (responsabilidadesStr.isEmpty() ? "No asignadas" : responsabilidadesStr);
    }
}
