package pe.edu.upc.trabajogrupo2.dtos;

public class UsuarioOrdenesDTO {

    private int idUsuario;
    private String nomUsuario;
    private long totalOrdenes;

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

    public long getTotalOrdenes() {
        return totalOrdenes;
    }

    public void setTotalOrdenes(long totalOrdenes) {
        this.totalOrdenes = totalOrdenes;
    }
}
