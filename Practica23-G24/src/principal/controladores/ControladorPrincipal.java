
package principal.controladores;

import java.time.LocalDateTime;
import java.util.ArrayList;
//import pedidos.modelos.Estado;
import pedidos.modelos.Pedido;
import pedidos.modelos.ProductoDelPedido;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;


/**
 *
 * @author root
 */
public class ControladorPrincipal  {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Encargado> encargados = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        
        Cliente unCliente1 = new Cliente("cliente1@bar.com", "claveCliente1", "NombreCliente1", "ApellidoCliente1");        
        Cliente unCliente2 = new Cliente("cliente2@bar.com", "claveCliente2", "NombreCliente2", "ApellidoCliente2");       
        Cliente unCliente3 = new Cliente("cliente3@bar.com", "claveCliente3", "NombreCliente3", "ApellidoCliente3");
        
        clientes.add(unCliente1);
        clientes.add(unCliente2);
        clientes.add(unCliente3);
        
        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : clientes) {
            c.mostrar();
            System.out.println();
        }
        System.out.println();        
        
        Empleado unEmpleado1 = new Empleado("empleado1@bar.com", "claveEmpleado1", "ApellidoEmpleado1", "NombreEmpleado1");        
        Empleado unEmpleado2 = new Empleado("empleado2@bar.com", "claveEmpleado2", "ApellidoEmpleado2", "NombreEmpleado2");        
        Empleado unEmpleado3 = new Empleado("empleado3@bar.com", "claveEmpleado3", "ApellidoEmpleado3", "NombreEmpleado3");
                
        empleados.add(unEmpleado1);
        empleados.add(unEmpleado2);
        empleados.add(unEmpleado3);
        
        System.out.println("Empleados");
        System.out.println("=========");
        for(Empleado e : empleados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();
        
        Encargado unEncargado1 = new Encargado("encargado1@bar.com", "claveEncargado1", "NombreEncargado1", "ApellidoEncargado1");
        Encargado unEncargado2 = new Encargado("encargado2@bar.com", "claveEncargado2", "NombreEncargado2", "ApellidoEncargado2");
        Encargado unEncargado3 = new Encargado("encargado3@bar.com", "claveEncargado3", "NombreEncargado3", "ApellidoEncargado3");

        encargados.add(unEncargado1);
        encargados.add(unEncargado2);
        encargados.add(unEncargado3);
        
        System.out.println("Encargados");
        System.out.println("==========");
        for(Encargado e : encargados) {
            e.mostrar();
            System.out.println();
        }
        System.out.println();
        
        Producto unProducto1 = new Producto(1, 33333f, "Producto1", Categoria.ENTRADA, Estado.DISPONIBLE);        
        Producto unProducto2 = new Producto(2, 44444f,  "Producto2", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE);
        Producto unProducto3 = new Producto(3, 55555f, "Producto3", Categoria.POSTRE, Estado.DISPONIBLE);
        
        productos.add(unProducto1);
        productos.add(unProducto2);
        productos.add(unProducto3);
        
        System.out.println("Productos");
        System.out.println("=========");
        for(Producto p : productos) {
            p.mostrar();
            System.out.println();
        }
        System.out.println();
        
        
        unCliente1.asignarCorreo("cliente10@bar.com");
        System.out.println("Clientes");
        System.out.println("========");
        for(Cliente c : clientes) {
            c.mostrar();
            System.out.println();
        }
        
        ArrayList<ProductoDelPedido> pdp1 = new ArrayList<>();
        ProductoDelPedido producto1pedido1 = new ProductoDelPedido(unProducto1, 1);
        ProductoDelPedido producto2pedido1 = new ProductoDelPedido(unProducto1, 2);
        ProductoDelPedido producto3pedido1 = new ProductoDelPedido(unProducto2, 1);
        
        if(!pdp1.contains(producto1pedido1))
            pdp1.add(producto1pedido1);
        if(!pdp1.contains(producto2pedido1))
            pdp1.add(producto2pedido1);
        if(!pdp1.contains(producto3pedido1))
            pdp1.add(producto3pedido1);
        
        ArrayList<ProductoDelPedido> pdp2 = new ArrayList<>();
        ProductoDelPedido producto1pedido2 = new ProductoDelPedido(unProducto1, 1121);
        ProductoDelPedido producto2pedido2 = new ProductoDelPedido(unProducto1, 232);
        ProductoDelPedido producto3pedido2 = new ProductoDelPedido(unProducto1, 132);
        
        if(!pdp2.contains(producto1pedido2))
            pdp2.add(producto1pedido2);
        if(!pdp2.contains(producto2pedido2))
            pdp2.add(producto2pedido2);
        if(!pdp2.contains(producto3pedido2))
            pdp2.add(producto3pedido2);   
        
           ArrayList<ProductoDelPedido> pdp3 = new ArrayList<>();
        ProductoDelPedido producto1pedido3 = new ProductoDelPedido(unProducto1, 1213);
        ProductoDelPedido producto2pedido3 = new ProductoDelPedido(unProducto3, 212312);
        ProductoDelPedido producto3pedido3 = new ProductoDelPedido(unProducto2, 1321283);
        
        if(!pdp3.contains(producto1pedido3))
            pdp3.add(producto1pedido3);
        if(!pdp3.contains(producto2pedido3))
            pdp3.add(producto2pedido3);
        if(!pdp3.contains(producto3pedido3))
            pdp3.add(producto3pedido3);
        
        Pedido unPedido1 = new Pedido(1, LocalDateTime.now(), pdp1, unCliente1); 
        Pedido unPedido2 = new Pedido(3, LocalDateTime.now(), pdp2, unCliente2);
        Pedido unPedido3 = new Pedido(3, LocalDateTime.now(), pdp3, unCliente3);
        
        
        if(!pedidos.contains(unPedido1))
            pedidos.add(unPedido1);
        if(!pedidos.contains(unPedido2))
            pedidos.add(unPedido2);
        if(!pedidos.contains(unPedido3))
            pedidos.add(unPedido3);
        
        
        System.out.println("Pedidos");
        System.out.println("=======");
        
        for(Pedido p : pedidos) {
            p.mostrar(p);
            System.out.println();
        }
        System.out.println();
        
    }   
 
    
}
