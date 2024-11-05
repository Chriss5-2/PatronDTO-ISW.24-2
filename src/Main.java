import Aplicacion.DAO.ClienteDAO;
import Aplicacion.DAO.CarritoDAO;
import Aplicacion.DTO.ClienteDTO;
import Aplicacion.DTO.ProductoDTO;
import Aplicacion.Entity.Cliente;
import Aplicacion.Entity.Producto;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia del DAO de Cliente
        ClienteDAO clienteDAO = new ClienteDAO();

        // Crear algunos clientes para agregar a la lista
        Cliente cliente1 = new Cliente(1, "Juan", "Pérez", "Gómez", "Dirección 1", "123456789", "juan@example.com", new Date(), 101, "password123");
        Cliente cliente2 = new Cliente(2, "Ana", "Martínez", "López", "Dirección 2", "987654321", "ana@example.com", new Date(), 102, "password456");

        // Agregar clientes al DAO
        clienteDAO.agregarCliente(cliente1);
        clienteDAO.agregarCliente(cliente2);

        // Listar todos los clientes usando el DTO
        List<ClienteDTO> listaClientesDTO = clienteDAO.listarClientes();

        // Mostrar la información de los clientes en la consola
        System.out.println("Lista de Clientes:");
        for (ClienteDTO clienteDTO : listaClientesDTO) {
            System.out.println("ID: " + clienteDTO.getIdCliente() +
                    ", Nombre: " + clienteDTO.getNombre() +
                    ", Apellido Paterno: " + clienteDTO.getApellidoPaterno() +
                    ", Apellido Materno: " + clienteDTO.getApellidoMaterno() +
                    ", Email: " + clienteDTO.getEmail());
        }

        // Crear una instancia del DAO de Carrito
        CarritoDAO carritoDAO = new CarritoDAO();

        // Crear algunos productos para agregar al carrito
        Producto producto1 = new Producto(1, "Laptop", "Pisco 1",120.50, 10);
        Producto producto2 = new Producto(2, "Mouse", "Pisco 2", 25.99, 50);
        Producto producto3 = new Producto(3, "Teclado", "Pisco 3",45.75, 30);

        // Agregar productos al carrito
        carritoDAO.agregarProducto(producto1);
        carritoDAO.agregarProducto(producto2);
        carritoDAO.agregarProducto(producto3);

        // Listar todos los productos en el carrito usando el DTO
        List<ProductoDTO> listaProductosDTO = carritoDAO.listarProductos();

        // Mostrar la información de los productos en la consola
        System.out.println("\nLista de Productos en el Carrito:");
        for (ProductoDTO productoDTO : listaProductosDTO) {
            System.out.println("ID: " + productoDTO.getIdProduct() +
                    ", Nombre: " + productoDTO.getNombre() +
                    ", Precio: " + productoDTO.getPrecio() +
                    ", Cantidad: " + productoDTO.getCantidad());
        }
    }
}
