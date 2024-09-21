package pe.edu.upc.trabajogrupo2.dtos;

public class MarcaRegistradaDTO {

    private String marcaProducto;
    private Long totalRegistros;

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public Long getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(Long totalRegistros) {
        this.totalRegistros = totalRegistros;
    }
}
