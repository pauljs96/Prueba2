package pe.edu.upc.trabajogrupo2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "OrdenCompra")
public class OrdenCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrdenCompra;
    @Column(name = "fechaOrden", nullable = false)
    private LocalDate fechaOrden;
    @Column(name = "montoOrden", nullable = false)
    private Double montoOrden;
    @Column(name = "estadoOrden", nullable = false, length = 20)
    private String estadoOrden;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public OrdenCompra() {}

    public OrdenCompra(int idOrdenCompra, LocalDate fechaOrden, Double montoOrden, String estadoOrden, Usuario usuario) {
        this.idOrdenCompra = idOrdenCompra;
        this.fechaOrden = fechaOrden;
        this.montoOrden = montoOrden;
        this.estadoOrden = estadoOrden;
        this.usuario = usuario;
    }

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
