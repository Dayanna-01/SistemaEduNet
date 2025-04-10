package ec.edu.ups.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class Institucion {

    private int id;
    private String nombreInstitucion;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    public Institucion(){}

    public Institucion(int id, String nombreInstitucion){
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.sedes = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    public void addDireccion(String callePrincipal, String calleSecundaria, String numeracion, String pais, String provincia, String ciudad, String tipoDireccion){
        this.direccion = new Direccion(callePrincipal, calleSecundaria, numeracion, pais, provincia, ciudad, tipoDireccion);
    }


    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombreInstitucion='" + nombreInstitucion + '\'' +
                ", sedes=" + sedes +
                ", direccion=" + direccion +
                ", asignaciones=" + asignaciones +
                '}';
    }
}
