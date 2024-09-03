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

    public Producto(int idProducto, String nombreProducto, String marcaProducto, String labProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.labProducto = labProducto;
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

}
