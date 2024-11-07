package Aplicacion.DAO;

import Aplicacion.DTO.ProductoDTO;
import Aplicacion.Entity.Producto;
import java.util.ArrayList;
import java.util.List;

public class CarritoDAO {
    private List<Producto> productos;

    public CarritoDAO() {
        this.productos = new ArrayList<>(); // Inicializamos la lista para simular una base de datos de productos en el carrito
    }

    // Método para agregar un producto al carrito
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        // Aquí agregarías la lógica para insertar el producto en la base de datos si fuera necesario
    }

    // Método para eliminar un producto del carrito
    public void eliminarProducto(int idProducto) {
        productos.removeIf(producto -> producto.getIdProduct() == idProducto);
        // Aquí agregarías la lógica para eliminar el producto de la base de datos
    }

    // Método para listar todos los productos en el carrito
    public List<ProductoDTO> listarProductos() {
        List<ProductoDTO> listaProductosDTO = new ArrayList<>();
        for (Producto producto : productos) {
            ProductoDTO productoDTO = new ProductoDTO(
                    //producto.getIdProduct(),
                    producto.getNombre(),
                    producto.getPrecio(),
                    producto.getStock()
            );
            listaProductosDTO.add(productoDTO);
        }
        return listaProductosDTO;
    }

    // Método para actualizar un producto en el carrito
    public void actualizarProducto(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getIdProduct() == producto.getIdProduct()) {
                productos.set(i, producto);
                // Aquí agregarías la lógica para actualizar el producto en la base de datos
                break;
            }
        }
    }

    // Método para obtener un producto por su ID
    public Producto obtenerProductoPorId(int idProducto) {
        for (Producto producto : productos) {
            if (producto.getIdProduct() == idProducto) {
                return producto;
            }
        }
        return null; // o lanzar una excepción si no se encuentra
    }
}
