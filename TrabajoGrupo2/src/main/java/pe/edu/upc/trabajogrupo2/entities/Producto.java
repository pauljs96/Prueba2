package pe.edu.upc.trabajogrupo2.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    @Column(name = "nombreProducto", nullable = false, length = 40)
    private String nombreProducto;
    @Column(name = "marcaProducto", nullable = false, length = 20)
    private String marcaProducto;
    @Column(name = "labProducto", nullable = false, length = 20)
    private String labProducto;
    @Column(name = "fechaEmision", nullable = false)
    private Date fechaEmision;
    @Column(name = "fechaVenc", nullable = false)
    private Date fechaVenc;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, String marcaProducto, String labProducto, Date fechaEmision, Date fechaVenc) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.labProducto = labProducto;
        this.fechaEmision = fechaEmision;
        this.fechaVenc = fechaVenc;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getLabProducto() {
        return labProducto;
    }

    public void setLabProducto(String labProducto) {
        this.labProducto = labProducto;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }
}
