package pe.edu.upc.trabajogrupo2.dtos;

import java.util.Date;

public class ProductoDTO {
    private int idProducto;
    private String nombreProducto;
    private String marcaProducto;
    private String labProducto;
    private Date fechaEmision;
    private Date fechaVenc;

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
