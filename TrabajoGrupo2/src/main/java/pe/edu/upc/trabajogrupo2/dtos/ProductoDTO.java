package pe.edu.upc.trabajogrupo2.dtos;


public class ProductoDTO {
    private int idProducto;
    private String nombreProducto;
    private String marcaProducto;
    private String labProducto;

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
