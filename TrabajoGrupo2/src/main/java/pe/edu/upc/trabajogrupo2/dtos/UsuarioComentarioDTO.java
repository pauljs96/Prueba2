package pe.edu.upc.trabajogrupo2.dtos;

public class UsuarioComentarioDTO {

    private int idUsuario;
    private String nomUsuario;
    private long totalComentarios;

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

    public long getTotalComentarios() {
        return totalComentarios;
    }

    public void setTotalComentarios(long totalComentarios) {
        this.totalComentarios = totalComentarios;
    }
}
