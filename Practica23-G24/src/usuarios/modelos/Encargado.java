
package usuarios.modelos;

/**
 *
 * @author estudiante
 */
public class Encargado {
    private String mail;
    private String contraseña;
    private String nombre;
    private String apellido;
    
       public void mostrar(){
        System.out.println("El encargado: "+ mail +  "\n" + contraseña + "\n" + nombre + "\n" + apellido + "\n");
        
    } 

    public Encargado(String mail, String contraseña, String nombre, String apellido) {
        this.mail = mail;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
    }

}
