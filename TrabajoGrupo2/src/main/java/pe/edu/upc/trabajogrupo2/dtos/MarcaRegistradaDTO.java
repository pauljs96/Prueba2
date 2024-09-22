package pe.edu.upc.trabajogrupo2.dtos;

public class MarcaRegistradaDTO {

    private String marcaProducto;
    private int totalRegistros;

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public int getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(int totalRegistros) {
        this.totalRegistros = totalRegistros;
    }
}
