package pe.edu.upc.trabajogrupo2.dtos;

import pe.edu.upc.trabajogrupo2.entities.Usuario;

import java.time.LocalDate;

public class OrdenCompraDTO {
    private int idOrdenCompra;
    private LocalDate fechaOrden;
    private Double montoOrden;
    private String estadoOrden;
    private Usuario usuario;

    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public LocalDate getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(LocalDate fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Double getMontoOrden() {
        return montoOrden;
    }

    public void setMontoOrden(Double montoOrden) {
        this.montoOrden = montoOrden;
    }

    public String getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(String estadoOrden) {
        this.estadoOrden = estadoOrden;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
