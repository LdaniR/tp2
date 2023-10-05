package usuarios.modelos;

import java.util.ArrayList;
import pedidos.modelos.Pedido;

/**
 *
 * @author estudiante
 */
public class Cliente {


    private String mail;
    private String clave;
    private String nombre;
    private String apellido;
    private ArrayList<Pedido> pedidos;

    
    public Cliente(String mail, String clave, String nombre, String apellido) {
        this.mail = mail;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String mostrarNombre(){
        return "\n\tNombre: " + this.nombre;
    }
    
    public String mostrarApellido(){
        return "\n\tApellido: " + this.apellido;
    }
    
    
    public String verMail() {
        return mail;
    }

    public void asignarMail(String mail) {
        this.mail = mail;
    }

    public String verContraseña() {
        return clave;
    }

    public void asignarContraseña(String clave) {
        this.clave = clave;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verApellido() {
        return apellido;
    }

    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    
    public void mostrar(){
        System.out.println("El cliente: "+ mail +  "\n" + clave + "\n" + nombre + "\n" + apellido + "\n");
        
    }
}
