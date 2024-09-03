package pe.edu.upc.trabajogrupo2.dtos;

import pe.edu.upc.trabajogrupo2.entities.Distrito;
import pe.edu.upc.trabajogrupo2.entities.Usuario;

public class BoticaDTO {
    private int idBotica;
    private String nombreBotica;
    private String ubicacionBotica;
    private String latitudBotica;
    private String longitudBotica;
    private Distrito distrito;
    private Usuario usuario;

    public int getIdBotica() {
        return idBotica;
    }

    public void setIdBotica(int idBotica) {
        this.idBotica = idBotica;
    }

    public String getNombreBotica() {
        return nombreBotica;
    }

    public void setNombreBotica(String nombreBotica) {
        this.nombreBotica = nombreBotica;
    }

    public String getUbicacionBotica() {
        return ubicacionBotica;
    }

    public void setUbicacionBotica(String ubicacionBotica) {
        this.ubicacionBotica = ubicacionBotica;
    }

    public String getLatitudBotica() {
        return latitudBotica;
    }

    public void setLatitudBotica(String latitudBotica) {
        this.latitudBotica = latitudBotica;
    }

    public String getLongitudBotica() {
        return longitudBotica;
    }

    public void setLongitudBotica(String longitudBotica) {
        this.longitudBotica = longitudBotica;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
