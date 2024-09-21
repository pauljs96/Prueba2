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

    public Producto() {
    }

    public Producto(int idProducto, String labProducto, String marcaProducto, String nombreProducto) {
        this.idProducto = idProducto;
        this.labProducto = labProducto;
        this.marcaProducto = marcaProducto;
        this.nombreProducto = nombreProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getLabProducto() {
        return labProducto;
    }

    public void setLabProducto(String labProducto) {
        this.labProducto = labProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
}
