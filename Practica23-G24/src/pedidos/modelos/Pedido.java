/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedidos.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import usuarios.modelos.Cliente;


public class Pedido {
    private int numero;
    private LocalDateTime fechaYHora;
    private Estado estado;
    private Cliente cliente;
    private ArrayList<ProductoDelPedido> unProductoDelPedido;

    public Pedido(int numero, LocalDateTime fechaYHora, ArrayList<ProductoDelPedido> lista, Cliente cliente) {
        this.numero = numero;
        this.fechaYHora = fechaYHora;
        this.unProductoDelPedido = lista;
        this.cliente = cliente;
        
    }

    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", fechaYHora=" + fechaYHora + ", estado=" + estado + ", cliente=" + cliente + '}';
    }
    

    public Cliente verCliente() {
        return cliente;
    }

    public void asignarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int verNumero() {
        return numero;
    }

    public void asignarNumero(int numero) {
        this.numero = numero;
    }

    public Estado verEstado() {
        return estado;
    }

    public void asignarEstado(Estado estado) {
        this.estado = Estado.CREADO;
    }

    public void asignarFecha(LocalDate fecha){
        this.fechaYHora = this.fechaYHora;
    }
    
    public LocalDate verFecha() {
        LocalDate fecha = this.fechaYHora.toLocalDate();
        return fecha;
    }
    
    public void asignarHora(LocalTime hora){
        this.fechaYHora = this.fechaYHora;
    }
    
    public LocalTime verHora() {
        LocalTime hora = this.fechaYHora.toLocalTime();
        return hora;
    }

    public ArrayList<ProductoDelPedido> verUnProductoDelPedido() {
        return unProductoDelPedido;
    }

    public void asignarUnProductoDelPedido(ArrayList<ProductoDelPedido> unProductoDelPedido) {
        this.unProductoDelPedido = unProductoDelPedido;
    }
    
    
    
    public void mostrar(Pedido pedido){
    
        System.out.println("\nNumero: " + this.numero + "\nFecha: " + this.fechaYHora.toLocalDate() + "\t\t\t\tHora: " + this.fechaYHora.toLocalTime() + "\nCliente: " + this.cliente.verApellido() + ", " + this.cliente.verNombre() + "\nEstado: " + this.estado.CREADO);
        System.out.println("        Producto            Cantidad\n");
        System.out.println("        ============================\n");
        
        
    for (ProductoDelPedido p : unProductoDelPedido){
        System.out.println("        " + p.toString() + "      " + p.cantidad + "\n");
        
    }
    
    
    
    
    
}
}

