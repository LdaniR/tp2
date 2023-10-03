
package principal.controladores;

import java.util.ArrayList;
import productos.modelos.Categoria;
import productos.modelos.Estado;
import productos.modelos.Producto;
import usuarios.modelos.Cliente;
import usuarios.modelos.Empleado;
import usuarios.modelos.Encargado;

/**
 *
 * @author Mariana
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        /*
        Definir un ArrayList para cada una de las clases Cliente, 
        Empleado, Encargado y Producto  (realizar las importaciones correspondientes).*/
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        ArrayList<Encargado> listaEncargados = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        /*Instanciar 3 objetos de cada clase y guardarlos en su correspondiente ArrayList. */
        Empleado e1=new Empleado("empleado1@mail.com","clave1","Nombre1", "Apellido1");
        Empleado e2 = new Empleado("empleado2@mail.com","clave2","Nombre2","Apellido2");
        Empleado e3= new Empleado("empleado3@mail.com","clave3","Nombre3","Apellido3");
        
//        e1.apellido="Apellido1";
//        e1.nombre="Nombre1";
//        e1.mail="empleado1@mail.com";
//        e1.clave="clave1";
                     
//        e2.apellido="Apellido2";
//        e2.nombre="Nombre2";
//        e2.mail="empleado2@mail.com";
//        e2.clave="clave2";
        
//        e3.apellido="Apellido3";
//        e3.nombre="Nombre3";
//        e3.mail="empleado3@mail.com";
//        e3.clave="clave3";

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        
        System.out.println("#################### ");
        System.out.println("EMPLEADOS ");
        /*Recorrer cada ArrayList y mostrar su contenido por pantalla. */
        for (Empleado e: listaEmpleados)
            e.mostrar();
        
        /*Realizar algunas modificaciones a algunos de los objetos antes creados, */
        e1.asignarApellido("APELLIDOEmpleado1");
        //listaEmpleados.get(1).nombre="NOMBRE";
        listaEmpleados.get(1).asignarNombre("NOMBRE");
        
        /*y volver a recorrer los ArrayLists verificando que se hicieron los cambios. */
         for (Empleado e: listaEmpleados)
            e.mostrar();
         
        System.out.println("#################### ");
        System.out.println("PRODUCTOS");
        Producto p1 = new Producto(1,1250.0f,"Milanesa con puré", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE);
        Producto p2= new Producto(2,150.70f, "Empanadas", Categoria.PLATO_PRINCIPAL, Estado.DISPONIBLE);
        Producto p3 = new Producto(3,850.0f,"Flan con dulce",Categoria.POSTRE, Estado.NO_DISPONIBLE);
        
//        p1.codigo=1;
//        p1.descripcion="Milanesa con puré";
//        p1.precio=1250.0f;
//        p1.categoria="PLATO PRINCIPAL";
//        p1.estado="DISPONIBLE";
        
//        p2.codigo=2;
//        p2.descripcion="Empanadas";
//        p2.precio=150.70f;
//        p2.categoria="PLATO PRINCIPAL";
//        p2.estado="DISPONIBLE";
//        
//        p3.codigo=3;
//        p3.descripcion="Flan con dulce";
//        p3.precio=850.0f;
//        p3.categoria="POSTRE";
//        p3.estado="NO DISPONIBLE";

        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        
        for (Producto p: listaProductos)
            System.out.println(p);
           // p.mostrar();
         
        System.out.println("#################### ");
        System.out.println("ENCARGADOS");
        //implementar aqui
        
        System.out.println("#################### ");
        System.out.println("EMPLEADOS");
        //implementar aqui
        
//       PUNT0 10
        System.out.println("_______________Punto 10______________\n");

        Producto p4 = new Producto(4,850.0f,"helado",Categoria.POSTRE,Estado.NO_DISPONIBLE);
        Empleado e4= new Empleado("empleado4@mail.com","clave_4","Nombre_4","Apellido_4");
        Cliente c1 = new Cliente("mail1@gmail.com", "clave_1", "nombre_1","apellido_1");
        
        listaEmpleados.add(e4);
        listaClientes.add(c1);
        listaProductos.add(p4);
        
        for (Empleado e: listaEmpleados)
        e.mostrar();
         
        for(Cliente c: listaClientes)
        c.mostrar();
        
        for (Producto p: listaProductos)
        System.out.println(p);
    }
    
    
}
