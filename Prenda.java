public class Prenda {
    private String marca;
    private String referencia;
    private double precio;
    private int cantidad;

    public Prenda() {
    }

    public Prenda(String marca, String referencia, double precio, int cantidad) {
        this.marca = marca;
        this.referencia = referencia;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    

    
}