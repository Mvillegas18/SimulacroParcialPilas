public class Repuestos {
    private String marca;
    private double precio;
    private int cantidad;
    private String referencia;


    public Repuestos() {}

    public Repuestos(String marca, double precio, int cantidad, String referencia) {
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
        this.referencia = referencia;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public Double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public String getReferencia(){
        return this.referencia;
    }

    public void marca(String referencia){
        this.referencia = referencia;
    }

}