package Aplicacion.DTO;

public class ProductoDTO {
    private int idProduct;
    private String nombre;
    private double precio;
    private int cantidad;

    public ProductoDTO(int idProduct, String nombre, double precio, int cantidad) {
        this.idProduct = idProduct;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdProduct() {
        return this.idProduct;
    }

    public void setIdProduct(int idProducto) {
        this.idProduct = idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) { // Corregido
        this.cantidad = cantidad;
    }
}
