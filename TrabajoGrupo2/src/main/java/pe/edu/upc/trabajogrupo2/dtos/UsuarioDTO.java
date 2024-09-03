package pe.edu.upc.trabajogrupo2.dtos;

import pe.edu.upc.trabajogrupo2.entities.Rol;

public class UsuarioDTO {
    private int idUsuario;
    private String nomUsuario;
    private String apelUsuario;
    private String dirUsuario;
    private String correoUsuario;
    private String claveUsuario;
    private Rol rol;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getApelUsuario() {
        return apelUsuario;
    }

    public void setApelUsuario(String apelUsuario) {
        this.apelUsuario = apelUsuario;
    }

    public String getDirUsuario() {
        return dirUsuario;
    }

    public void setDirUsuario(String dirUsuario) {
        this.dirUsuario = dirUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
