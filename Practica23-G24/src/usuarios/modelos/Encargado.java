
package usuarios.modelos;

/**
 *
 * @author Lucas y Ana
 */
public class Encargado extends Usuario {
    private String correo;
    private String clave;
    private String nombre;
    private String apellido;
    

    public Encargado(String correo, String clave, String apellido, String nombre) {
        super(correo, clave, apellido, nombre);
    }

//       public void mostrar(){
//        System.out.println("El encargado: "+ mail +  "\n" + contraseña + "\n" + nombre + "\n" + apellido + "\n");
//        
//    } 
}
