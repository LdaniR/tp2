package usuarios.modelos;

import java.util.ArrayList;
import java.util.Objects;
import pedidos.modelos.Pedido;

/**
 *
 * @author estudiante
 */
public class Cliente extends Usuario {
    
    private ArrayList<Pedido> pedidos;

    public Cliente(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }
//    
//    public String mostrarNombre(){
//        return "\n\tNombre: " + this.nombre;
//    }
//    
//    public String mostrarApellido(){
//        return "\n\tApellido: " + this.apellido;
//    }
//    
//    
//    public String verCorreo() {
//        return correo;
//    }
//
//    public void asignarCorreo(String mail) {
//        this.correo = correo;
//    }
//
//    public String verContraseña() {
//        return clave;
//    }
//
//    public void asignarContraseña(String clave) {
//        this.clave = clave;
//    }
//
//    public String verNombre() {
//        return nombre;
//    }
//
//    public void asignarNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String verApellido() {
//        return apellido;
//    }
//
//    public void asignarApellido(String apellido) {
//        this.apellido = apellido;
//    }
//

    
        
        @Override
        
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
                return false;
            }
            final Cliente other = (Cliente) obj;
            return Objects.equals(verCorreo(), other.verCorreo());
        }
    
    
    
//    
//    public void mostrar(){
//        System.out.println("El cliente: "+ correo +  "\n" + clave + "\n" + nombre + "\n" + apellido + "\n");
        
//    }
}
