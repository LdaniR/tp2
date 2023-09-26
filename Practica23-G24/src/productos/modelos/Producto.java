
package productos.modelos;

/**
 *
 * @author estudiante
 */
public class Producto {
    private int codigo;
    private float precio;
    private String descripcion;
    private String categoria;
    private String estado;

    public Producto(int codigo, float precio, String descripcion, String categoria, String estado) {
        this.codigo = codigo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.estado = estado;
    }
    
    @Override
    public String toString() {
    return "Producto{" + "descripcion=" + descripcion + '}';
    }
    
    public void mostrar(){
        System.out.println("El producto: "+ descripcion +  "\n" + estado + "\n" + precio + "\n" + categoria + "\n" + codigo + "\n" );
        
    }
    
}
