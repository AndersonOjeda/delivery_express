package colecciones;

import modelo.Pedido;
import java.util.*;


public class Ejercicios {

    /**
     * Parte A: Listas.
     * Demuestra uso de ArrayList y LinkedList y manejo de pedidos urgentes.
     */
    public static void parteA() {
        System.out.println("=== Parte A: Listas ===");

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Ana", "Pizza", 45));
        pedidos.add(new Pedido("Luis", "Hamburguesa", 25));
        pedidos.add(new Pedido("Carla", "Sushi", 60));
        pedidos.add(new Pedido("Pedro", "Pizza", 40));
        pedidos.add(new Pedido("Maria", "Ensalada", 20));

        System.out.println("Pedidos iniciales: " + pedidos);

        // Insertar pedidos urgentes al inicio
        pedidos.add(0, new Pedido("Juan", "Tacos", 30, true));
        pedidos.add(0, new Pedido("Sofia", "Pizza", 50, true));

        System.out.println("Pedidos con urgentes (ArrayList): " + pedidos);

        // Repetir con LinkedList
        LinkedList<Pedido> pedidosLinked = new LinkedList<>(pedidos);
        pedidosLinked.addFirst(new Pedido("ClienteUrg1", "Arepa", 15, true));
        pedidosLinked.addFirst(new Pedido("ClienteUrg2", "Hot Dog", 18, true));

        System.out.println("Pedidos con urgentes (LinkedList): " + pedidosLinked);
        System.out.println("⚡ Para 1000 urgentes conviene LinkedList, porque insertar al inicio es más eficiente.");
    }

    /**
     * Parte B: Conjunto HashSet.
     * Muestra eliminación automática de duplicados.
     */
    public static void parteB() {
        System.out.println("\n=== Parte B: HashSet ===");
        Set<Pedido> setPedidos = new HashSet<>();

        setPedidos.add(new Pedido("Ana", "Pizza", 45));
        setPedidos.add(new Pedido("Luis", "Hamburguesa", 25));
        setPedidos.add(new Pedido("Carla", "Sushi", 60));
        setPedidos.add(new Pedido("Ana", "Pizza", 45)); // duplicado

        for (Pedido p : setPedidos) {
            System.out.println(p);
        }
        System.out.println("⚡ Los duplicados no aparecen porque HashSet no los permite.");
    }

    /**
     * Parte C: Mapas HashMap.
     * Indexa pedidos por cliente, imprime pedidos de un cliente y total gastado.
     */
    public static void parteC() {
        System.out.println("\n=== Parte C: HashMap ===");
        Map<String, List<Pedido>> pedidosPorCliente = new HashMap<>();

        pedidosPorCliente.put("Ana", Arrays.asList(
                new Pedido("Ana", "Pizza", 45),
                new Pedido("Ana", "Refresco", 10)
        ));
        pedidosPorCliente.put("Luis", Arrays.asList(
                new Pedido("Luis", "Hamburguesa", 25),
                new Pedido("Luis", "Papas", 15)
        ));
        pedidosPorCliente.put("Carla", Arrays.asList(
                new Pedido("Carla", "Sushi", 60),
                new Pedido("Carla", "Té verde", 12)
        ));

        // Pedidos de un cliente específico
        System.out.println("Pedidos de Carla: " + pedidosPorCliente.get("Carla"));

        // Total gastado por cada cliente
        for (String cliente : pedidosPorCliente.keySet()) {
            double total = pedidosPorCliente.get(cliente)
                    .stream()
                    .mapToDouble(Pedido::getPrecio)
                    .sum();
            System.out.println(cliente + " gastó $" + total);
        }
    }

    /**
     * Parte D: Genéricos.
     * Filtra pedidos usando método genérico.
     */
    public static void parteD() {
        System.out.println("\n=== Parte D: Genéricos ===");
        List<Pedido> pedidos = Arrays.asList(
                new Pedido("Ana", "Pizza", 45),
                new Pedido("Luis", "Hamburguesa", 25),
                new Pedido("Carla", "Sushi", 60),
                new Pedido("Pedro", "Pizza", 70)
        );

        // Filtrar solo pizzas
        List<Pedido> soloPizzas = Utilidades.filtrar(pedidos, p -> p.getProducto().equals("Pizza"));
        System.out.println("Pedidos de Pizza: " + soloPizzas);

        // Filtrar pedidos con precio mayor a $50
        List<Pedido> mayores50 = Utilidades.filtrar(pedidos, p -> p.getPrecio() > 50);
        System.out.println("Pedidos mayores a $50: " + mayores50);
    }
}
