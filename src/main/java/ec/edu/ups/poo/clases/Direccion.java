package ec.edu.ups.poo.clases;

public class Direccion {
    private String callePrincipal;
    private String calleSecundaria;
    private String numeracion;
    private String pais;
    private String provincia;
    private String ciudad;
    private String tipoDireccion;

    public Direccion() {}

    public Direccion(String callePrincipal, String calleSecundaria, String numeracion, String pais, String provincia, String ciudad, String tipoDireccion) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numeracion = numeracion;
        this.pais = pais;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.tipoDireccion = tipoDireccion;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipoDireccion() {
        return tipoDireccion;
    }

    public void setTipoDireccion(String tipoDireccion) {
        this.tipoDireccion = tipoDireccion;
    }

    @Override
    public String toString() {
        return "Dirección: \n" +
                "Calle Principal: " + callePrincipal + "\n" +
                "Calle Secundaria: " + calleSecundaria + "\n" +
                "Numeración: " + numeracion + "\n" +
                "País: " + pais + "\n" +
                "Provincia: " + provincia + "\n" +
                "Ciudad: " + ciudad + "\n" +
                "Tipo Dirección: " + tipoDireccion;
    }
}
