
package productos.modelos;

/**
 *
 * @author estudiante
 */
public class Producto {
    private int codigo;
    private float precio;
    private String descripcion;
    private Categoria categoria;
    private Estado estado;

    public Producto(int codigo, float precio, String descripcion, Categoria categoria, Estado estado) {
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
        System.out.println("El producto: "+ descripcion +  "\n" + estado.toString() + "\n" + precio + "\n" + categoria + "\n" + codigo + "\n" );
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
