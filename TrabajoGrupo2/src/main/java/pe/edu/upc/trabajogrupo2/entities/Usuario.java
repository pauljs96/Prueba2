package pe.edu.upc.trabajogrupo2.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nomUsuario", nullable = false, length = 40)
    private String nomUsuario;
    @Column(name = "apelUsuario", nullable = false, length = 40)
    private String apelUsuario;
    @Column(name = "dirUsuario", nullable = false, length = 50)
    private String dirUsuario;
    @Column(name = "correoUsuario", nullable = false, length = 50)
    private String correoUsuario;
    @Column(name = "claveUsuario", nullable = false, length = 30)
    private String claveUsuario;

    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol rol;

    public Usuario() {

    }

    public Usuario(int idUsuario, String nomUsuario, String apelUsuario, String dirUsuario, String correoUsuario, String claveUsuario, Rol rol) {
        this.idUsuario = idUsuario;
        this.nomUsuario = nomUsuario;
        this.apelUsuario = apelUsuario;
        this.dirUsuario = dirUsuario;
        this.correoUsuario = correoUsuario;
        this.claveUsuario = claveUsuario;
        this.rol = rol;
    }

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
