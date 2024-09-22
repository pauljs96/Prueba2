package pe.edu.upc.trabajogrupo2.dtos;

public class UsuarioOrdenesDTO {

    private int idUsuario;
    private String nomUsuario;
    private int totalOrdenes;

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

    public int getTotalOrdenes() {
        return totalOrdenes;
    }

    public void setTotalOrdenes(int totalOrdenes) {
        this.totalOrdenes = totalOrdenes;
    }
}
