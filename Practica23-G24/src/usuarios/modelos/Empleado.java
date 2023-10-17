
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Empleado extends Usuario {
    
    private String correo;
    private String clave;
    private String nombre;
    private String apellido;    

    public Empleado(String correo, String clave, String apellido, String nombre) {
   super(correo, clave, apellido, nombre);
    }

//    public String verMail() {
//        return mail;
//    }
//
//    public String verClave() {
//        return clave;
//    }
//
//    public String verNombre() {
//        return nombre;
//    }
//
//    public String verApellido() {
//        return apellido;
//    }
//
//    public void asignarMail(String mail) {
//        this.mail = mail;
//    }
//
//    public void asignarClave(String clave) {
//        this.clave = clave;
//    }
//
//    public void asignarNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public void asignarApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//   
//     public void mostrar(){
//        System.out.println("El empleado: "+ mail +  "\n" + clave + "\n" + nombre + "\n" + apellido + "\n");
//        
//    }
    
    
}
