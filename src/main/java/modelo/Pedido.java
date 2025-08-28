package modelo;

import java.util.Objects;

// Clase base que podría ampliarse en el futuro
public class Pedido {
    private String cliente;
    private String producto;
    private double precio;
    private boolean urgente; // atributo adicional para POO

    // Constructor básico
    public Pedido(String cliente, String producto, double precio) {
        this.cliente = cliente;
        this.producto = producto;
        this.precio = precio;
        this.urgente = false;
    }

    // Constructor con urgencia
    public Pedido(String cliente, String producto, double precio, boolean urgente) {
        this(cliente, producto, precio);
        this.urgente = urgente;
    }

    // Getters y Setters
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public boolean isUrgente() { return urgente; }
    public void setUrgente(boolean urgente) { this.urgente = urgente; }

    // Representación del pedido
    @Override
    public String toString() {
        return cliente + " - " + producto + " ($" + precio + ")" + (urgente ? " [URGENTE]" : "");
    }

    // Para HashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;
        Pedido pedido = (Pedido) o;
        return Double.compare(pedido.precio, precio) == 0 &&
               Objects.equals(cliente, pedido.cliente) &&
               Objects.equals(producto, pedido.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, producto, precio);
    }
}
