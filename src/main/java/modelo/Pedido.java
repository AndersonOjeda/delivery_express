package modelo;

import java.util.Objects;

/**
 * Clase que representa un pedido de Delivery Express.
 * Implementa buenas prácticas de POO: encapsulamiento, constructores,
 * getters/setters, toString, equals y hashCode.
 */
public class Pedido {

    // Atributos privados (encapsulamiento)
    private String cliente;
    private String producto;
    private double precio;
    private boolean urgente; // indica si el pedido es urgente

    /**
     * Constructor básico de Pedido.
     * @param cliente Nombre del cliente.
     * @param producto Nombre del producto.
     * @param precio Precio del pedido.
     */
    public Pedido(String cliente, String producto, double precio) {
        this.cliente = cliente;
        this.producto = producto;
        this.precio = precio;
        this.urgente = false;
    }

    /**
     * Constructor con atributo urgente.
     * @param cliente Nombre del cliente.
     * @param producto Nombre del producto.
     * @param precio Precio del pedido.
     * @param urgente Si el pedido es urgente.
     */
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

    /**
     * Representación en String del pedido.
     * Incluye etiqueta [URGENTE] si aplica.
     */
    @Override
    public String toString() {
        return cliente + " - " + producto + " ($" + precio + ")" + (urgente ? " [URGENTE]" : "");
    }

    /**
     * Método equals para comparar pedidos en HashSet.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pedido)) return false;
        Pedido pedido = (Pedido) o;
        return Double.compare(pedido.precio, precio) == 0 &&
                Objects.equals(cliente, pedido.cliente) &&
                Objects.equals(producto, pedido.producto);
    }

    /**
     * Método hashCode para HashSet.
     */
    @Override
    public int hashCode() {
        return Objects.hash(cliente, producto, precio);
    }
}
